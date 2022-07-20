package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.HmsClient;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.RequestManager;
import com.huawei.hms.common.internal.ResolveClientBean;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.common.internal.TaskApiCallWrapper;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.IAIDLInvoke;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hianalytics.b;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class HuaweiApi<TOption extends Api.ApiOptions> {
    private static final String TAG = "HuaweiApi";
    private String innerHmsPkg;
    private boolean isUseInnerHms;
    private WeakReference<Activity> mActivity;
    private String mAppID;
    private AbstractClientBuilder<?, TOption> mClientBuilder;
    private Context mContext;
    private String mHostAppid;
    private Context mHostContext;
    private int mKitSdkVersion;
    private TOption mOption;
    private SubAppInfo mSubAppInfo;
    private RequestManager requestManager;
    private int apiLevel = 1;
    private boolean isFirstReqSent = false;

    /* renamed from: com.huawei.hms.common.HuaweiApi$1 */
    /* loaded from: classes.dex */
    class AnonymousClass1 implements Runnable {
        final /* synthetic */ HuaweiApi val$api;
        final /* synthetic */ TaskCompletionSource val$taskCompletionSource;

        AnonymousClass1(HuaweiApi huaweiApi, TaskCompletionSource taskCompletionSource) {
            HuaweiApi.this = r1;
            this.val$api = huaweiApi;
            this.val$taskCompletionSource = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public void run() {
            HuaweiApi.this.innerDisconnect(this.val$api, this.val$taskCompletionSource);
        }
    }

    /* loaded from: classes.dex */
    public static class RequestHandler<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final HuaweiApi<OptionsT> mApi;
        private final AnyClient mClient;
        private ResolveClientBean mResolveClientBean;
        public final Queue<TaskApiCallbackWrapper> callbackWaitQueue = new LinkedList();
        private final Queue<TaskApiCallbackWrapper> callbackRunQueue = new LinkedList();
        private ConnectionResult mConnectionResult = null;

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$1 */
        /* loaded from: classes.dex */
        public class AnonymousClass1 implements AnyClient.CallBack {
            private AtomicBoolean isFirstRsp = new AtomicBoolean(true);
            final /* synthetic */ TaskApiCallWrapper val$req;

            AnonymousClass1(TaskApiCallWrapper taskApiCallWrapper) {
                RequestHandler.this = r1;
                this.val$req = taskApiCallWrapper;
            }

            @Override // com.huawei.hms.common.internal.AnyClient.CallBack
            public void onCallback(IMessageEntity iMessageEntity, String str) {
                if (!(iMessageEntity instanceof ResponseHeader)) {
                    HMSLog.e("HuaweiApi", "header is not instance of ResponseHeader");
                    return;
                }
                ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                if (responseHeader.getErrorCode() == 11) {
                    RequestHandler.this.disconnect();
                    HMSLog.i("HuaweiApi", "unbind service");
                }
                if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                    HMSLog.e("HuaweiApi", "Response has resolution: " + responseHeader.getResolution());
                }
                if (this.isFirstRsp.compareAndSet(true, false)) {
                    b.a(RequestHandler.this.mApi.getContext(), responseHeader, String.valueOf(RequestHandler.this.mApi.getKitSdkVersion()));
                }
                this.val$req.getTaskApiCall().onResponse(RequestHandler.this.mClient, responseHeader, str, this.val$req.getTaskCompletionSource());
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$2 */
        /* loaded from: classes.dex */
        public class AnonymousClass2 implements AnyClient.CallBack {
            final /* synthetic */ TaskApiCallbackWrapper val$callbackWrapper;
            final /* synthetic */ RequestHeader val$requestHeader;

            /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$2$1 */
            /* loaded from: classes.dex */
            class AnonymousClass1 implements Runnable {
                AnonymousClass1() {
                    AnonymousClass2.this = r1;
                }

                @Override // java.lang.Runnable
                public void run() {
                    RequestHandler.this.callbackRunQueue.remove(AnonymousClass2.this.val$callbackWrapper);
                }
            }

            AnonymousClass2(TaskApiCallbackWrapper taskApiCallbackWrapper, RequestHeader requestHeader) {
                RequestHandler.this = r1;
                this.val$callbackWrapper = taskApiCallbackWrapper;
                this.val$requestHeader = requestHeader;
            }

            @Override // com.huawei.hms.common.internal.AnyClient.CallBack
            public void onCallback(IMessageEntity iMessageEntity, String str) {
                AnyClient.CallBack callBack = this.val$callbackWrapper.getCallBack();
                if (callBack != null) {
                    callBack.onCallback(iMessageEntity, str);
                }
                RequestManager.removeReqByTransId(this.val$requestHeader.getTransactionId());
                RequestManager.getHandler().post(new AnonymousClass1());
            }
        }

        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$3 */
        /* loaded from: classes.dex */
        public class AnonymousClass3 implements Runnable {
            final /* synthetic */ ConnectionResult val$result;

            AnonymousClass3(ConnectionResult connectionResult) {
                RequestHandler.this = r1;
                this.val$result = connectionResult;
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestHandler.this.innerConnectionFailed(this.val$result);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$4 */
        /* loaded from: classes.dex */
        public class AnonymousClass4 implements Runnable {
            AnonymousClass4() {
                RequestHandler.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestHandler.this.innerConnected();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.huawei.hms.common.HuaweiApi$RequestHandler$5 */
        /* loaded from: classes.dex */
        public class AnonymousClass5 implements Runnable {
            AnonymousClass5() {
                RequestHandler.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                RequestHandler.this.innerConnectionSuspended();
            }
        }

        RequestHandler(HuaweiApi<OptionsT> huaweiApi) {
            this.mApi = huaweiApi;
            this.mClient = huaweiApi.getClient(RequestManager.getHandler().getLooper(), this);
        }

        private String errorReason(ConnectionResult connectionResult) {
            if (Util.isAvailableLibExist(this.mApi.getContext())) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode != -1) {
                    if (errorCode == 3) {
                        return "HuaWei Mobile Service is disabled";
                    }
                    if (errorCode != 8) {
                        if (errorCode != 10) {
                            if (errorCode == 13) {
                                return "update cancelled";
                            }
                            if (errorCode == 21) {
                                return "device is too old to be support";
                            }
                            switch (errorCode) {
                                case 25:
                                    return "failed to get update result";
                                case 26:
                                    return "update failed, because no activity incoming, can't pop update page";
                                case 27:
                                    return "there is already an update popup at the front desk, but it hasn't been clicked or it is not effective for a while";
                            }
                        }
                    }
                    return "internal error";
                }
                return "get update result, but has other error codes";
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 != -1) {
                if (errorCode2 != 8) {
                    return errorCode2 != 10 ? "unknown errorReason" : "application configuration error, please developer check configuration";
                }
                return "internal error";
            }
            return "get update result, but has other error codes";
        }

        private String getTransactionId(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.mApi.getAppID(), str2) : str;
        }

        public void innerConnected() {
            this.mConnectionResult = null;
            this.callbackRunQueue.clear();
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                postMessage(taskApiCallbackWrapper);
            }
            this.callbackWaitQueue.clear();
        }

        public void innerConnectionFailed(ConnectionResult connectionResult) {
            this.mConnectionResult = connectionResult;
            boolean z = true;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, 907135003, "Connection Failed:" + errorReason(connectionResult) + "(" + connectionResult.getErrorCode() + ")");
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                b.a(this.mApi.getContext(), responseHeader, String.valueOf(this.mApi.getKitSdkVersion()));
                if (this.mConnectionResult.getResolution() != null && z) {
                    responseHeader.setParcelable(this.mConnectionResult.getResolution());
                    z = false;
                    if (Util.isAvailableLibExist(this.mApi.getContext()) && this.mConnectionResult.getErrorCode() == 26) {
                        responseHeader.setResolution("hasContextResolution");
                    }
                }
                int errorCode = this.mConnectionResult.getErrorCode();
                if (errorCode == 30 || errorCode == 31) {
                    responseHeader.setErrorCode(errorCode);
                }
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
        }

        public void innerConnectionSuspended() {
            HMSLog.i("HuaweiApi", "wait queue size = " + this.callbackWaitQueue.size());
            HMSLog.i("HuaweiApi", "run queue size = " + this.callbackRunQueue.size());
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackWaitQueue) {
                sendConnectionSuspended(taskApiCallbackWrapper);
            }
            for (TaskApiCallbackWrapper taskApiCallbackWrapper2 : this.callbackRunQueue) {
                sendConnectionSuspended(taskApiCallbackWrapper2);
            }
            this.callbackWaitQueue.clear();
            this.callbackRunQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
        }

        private void sendConnectionSuspended(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
            ResponseHeader responseHeader = new ResponseHeader(1, 907135003, "Connection Suspended");
            responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
            apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
        }

        private TaskApiCallbackWrapper wrapperRequest(TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnonymousClass1(taskApiCallWrapper));
        }

        synchronized void connect(int i, TaskApiCallbackWrapper taskApiCallbackWrapper) {
            if (this.mClient.isConnected()) {
                HMSLog.d("HuaweiApi", "client is connected");
            } else if (this.mClient.isConnecting()) {
                HMSLog.d("HuaweiApi", "client is isConnecting");
            } else {
                if (this.mApi.getActivity() != null) {
                    if (this.mResolveClientBean == null) {
                        this.mResolveClientBean = new ResolveClientBean(this.mClient, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.mResolveClientBean)) {
                        HMSLog.i("HuaweiApi", "mResolveClientBean has already register, return!");
                        return;
                    }
                    BindResolveClients.getInstance().register(this.mResolveClientBean);
                }
                this.mClient.connect(i);
            }
        }

        void disconnect() {
            this.mClient.disconnect();
        }

        public AnyClient getClient() {
            return this.mClient;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.i("HuaweiApi", "onConnected");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            RequestManager.getHandler().post(new AnonymousClass4());
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            HMSLog.i("HuaweiApi", "onConnectionFailed");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            RequestManager.getHandler().post(new AnonymousClass3(connectionResult));
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            HMSLog.i("HuaweiApi", "onConnectionSuspended");
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            RequestManager.getHandler().post(new AnonymousClass5());
        }

        public void postMessage(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            RequestManager.addToConnectedReqMap(taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getTransactionId(), this);
            this.callbackRunQueue.add(taskApiCallbackWrapper);
            String uri = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getUri();
            String packageName = (((HuaweiApi) this.mApi).mHostContext == null ? this.mApi.getContext() : ((HuaweiApi) this.mApi).mHostContext).getPackageName();
            if (((HuaweiApi) this.mApi).mHostContext != null) {
                HuaweiApi<OptionsT> huaweiApi = this.mApi;
                huaweiApi.setHostAppId(((HuaweiApi) huaweiApi).mHostContext);
            }
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split("\\.")[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.mApi.getAppID() + "|" + this.mApi.getSubAppID());
            requestHeader.setPkgName(packageName);
            requestHeader.setSessionId(this.mClient.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall();
            requestHeader.setTransactionId(getTransactionId(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.mApi.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.mApi.getApiLevel(), taskApiCall.getApiLevel()));
            this.mClient.post(requestHeader, taskApiCall.getRequestJson(), new AnonymousClass2(taskApiCallbackWrapper, requestHeader));
        }

        void sendRequest(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i("HuaweiApi", "sendRequest");
            TaskApiCallbackWrapper wrapperRequest = wrapperRequest(taskApiCallWrapper);
            if (this.mClient.isConnected()) {
                HMSLog.i("HuaweiApi", "isConnected:true.");
                BinderAdapter adapter = ((BaseHmsClient) this.mClient).getAdapter();
                adapter.updateDelayTask();
                ((HmsClient) this.mClient).setService(IAIDLInvoke.Stub.asInterface(adapter.getServiceBinder()));
                postMessage(wrapperRequest);
                return;
            }
            HMSLog.i("HuaweiApi", "isConnected:false.");
            this.callbackWaitQueue.add(wrapperRequest);
            ConnectionResult connectionResult = this.mConnectionResult;
            if (connectionResult != null && connectionResult.getErrorCode() != 0) {
                HMSLog.i("HuaweiApi", "onConnectionFailed, ErrorCode:" + this.mConnectionResult.getErrorCode());
                onConnectionFailed(this.mConnectionResult);
                return;
            }
            RequestManager.addRequestToQueue(this);
            AnyClient anyClient = this.mClient;
            if (anyClient instanceof BaseHmsClient) {
                ((BaseHmsClient) anyClient).setInternalRequest(this);
            }
            connect(taskApiCallWrapper.getTaskApiCall().getMinApkVersion(), wrapperRequest);
        }
    }

    /* loaded from: classes.dex */
    public static class RequestRunnable<OptionsT extends Api.ApiOptions> implements Runnable {
        private final HuaweiApi<OptionsT> mApi;
        private final TaskApiCallWrapper mTaskApiCallWrapper;

        public RequestRunnable(HuaweiApi<OptionsT> huaweiApi, TaskApiCallWrapper taskApiCallWrapper) {
            this.mApi = huaweiApi;
            this.mTaskApiCallWrapper = taskApiCallWrapper;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0056 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void notifyCpException(RequestHandler requestHandler, Exception exc) {
            String str;
            AnyClient anyClient;
            TaskCompletionSource taskCompletionSource;
            ResponseHeader responseHeader;
            RuntimeException e;
            boolean z = true;
            TaskApiCall taskApiCall = null;
            try {
                anyClient = requestHandler.getClient();
            } catch (RuntimeException e2) {
                e = e2;
                anyClient = null;
            }
            try {
                responseHeader = new ResponseHeader(1, 907135001, exc.getMessage());
                try {
                    str = new JSONObject().toString();
                    try {
                        taskCompletionSource = this.mTaskApiCallWrapper.getTaskCompletionSource();
                        try {
                            taskApiCall = this.mTaskApiCallWrapper.getTaskApiCall();
                        } catch (RuntimeException e3) {
                            e = e3;
                            HMSLog.e("HuaweiApi", "<notifyCpException> " + e.getMessage());
                            if (anyClient != null) {
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    } catch (RuntimeException e4) {
                        e = e4;
                        taskCompletionSource = null;
                    }
                } catch (RuntimeException e5) {
                    e = e5;
                    str = null;
                    taskCompletionSource = null;
                }
            } catch (RuntimeException e6) {
                e = e6;
                str = null;
                responseHeader = null;
                taskCompletionSource = null;
                HMSLog.e("HuaweiApi", "<notifyCpException> " + e.getMessage());
                if (anyClient != null) {
                }
                z = false;
                if (z) {
                }
            }
            if (anyClient != null || responseHeader == null || str == null || taskCompletionSource == null || taskApiCall == null) {
                z = false;
            }
            if (z) {
                taskApiCall.onResponse(anyClient, responseHeader, str, taskCompletionSource);
            } else {
                HMSLog.e("HuaweiApi", "<notifyCpException> isNotify is false, Can not notify CP.");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            RequestHandler requestHandler = new RequestHandler(this.mApi);
            try {
                requestHandler.sendRequest(this.mTaskApiCallWrapper);
            } catch (RuntimeException e) {
                notifyCpException(requestHandler, e);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper mApiCallWrapper;
        private final AnyClient.CallBack mCallBack;

        TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.mApiCallWrapper = taskApiCallWrapper;
            this.mCallBack = callBack;
        }

        TaskApiCallWrapper getApiCallWrapper() {
            return this.mApiCallWrapper;
        }

        AnyClient.CallBack getCallBack() {
            return this.mCallBack;
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, null);
    }

    private void init(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        this.mContext = context.getApplicationContext();
        this.mOption = toption;
        this.mClientBuilder = abstractClientBuilder;
        setHostAppId(context);
        this.mSubAppInfo = new SubAppInfo("");
        this.mKitSdkVersion = i;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(this.mHostAppid)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
            } else {
                HMSLog.i("HuaweiApi", "subAppId is " + str);
                this.mSubAppInfo = new SubAppInfo(str);
            }
        }
        initBI(context);
    }

    private void initBI(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    public void innerDisconnect(HuaweiApi<?> huaweiApi, TaskCompletionSource<Boolean> taskCompletionSource) {
        HMSLog.i("HuaweiApi", "innerDisconnect.");
        try {
            huaweiApi.getClient(RequestManager.getHandler().getLooper(), null).disconnect();
            taskCompletionSource.setResult(Boolean.TRUE);
        } catch (Exception e) {
            HMSLog.w("HuaweiApi", "disconnect the binder failed for:" + e.getMessage());
        }
    }

    private <TResult, TClient extends AnyClient> Task<TResult> sendRequest(TaskApiCall<TClient, TResult> taskApiCall) {
        taskApiCall.getToken();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestManager.getHandler().post(new RequestRunnable(this, new TaskApiCallWrapper(taskApiCall, taskCompletionSource)));
        return taskCompletionSource.getTask();
    }

    public void setHostAppId(Context context) {
        String appId = Util.getAppId(context);
        this.mHostAppid = appId;
        this.mAppID = appId;
    }

    @Deprecated
    public Task<Boolean> disconnectService() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestManager.getInstance();
        RequestManager.getHandler().post(new AnonymousClass1(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    public <TResult, TClient extends AnyClient> Task<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.isFirstReqSent = true;
        if (taskApiCall == null) {
            HMSLog.e("HuaweiApi", "in doWrite:taskApiCall is null");
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(new ApiException(Status.FAILURE));
            return taskCompletionSource.getTask();
        }
        b.a(this.mContext, taskApiCall.getUri(), TextUtils.isEmpty(this.mSubAppInfo.getSubAppID()) ? this.mAppID : this.mSubAppInfo.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        if (this.requestManager == null) {
            this.requestManager = RequestManager.getInstance();
        }
        return sendRequest(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.apiLevel;
    }

    public String getAppID() {
        return this.mAppID;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.huawei.hms.common.internal.AnyClient] */
    public AnyClient getClient(Looper looper, RequestHandler requestHandler) {
        return this.mClientBuilder.buildClient(this.mContext, getClientSetting(), requestHandler, requestHandler);
    }

    protected ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.mContext.getPackageName(), this.mContext.getClass().getName(), getScopes(), this.mHostAppid, null, this.mSubAppInfo);
        if (!this.isUseInnerHms) {
            this.innerHmsPkg = HMSPackageManager.getInstance(this.mContext).getHMSPackageNameForMultiService();
            HMSLog.i("HuaweiApi", "No setInnerHms, hms pkg name is " + this.innerHmsPkg);
        }
        clientSettings.setInnerHmsPkg(this.innerHmsPkg);
        clientSettings.setUseInnerHms(this.isUseInnerHms);
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getKitSdkVersion() {
        return this.mKitSdkVersion;
    }

    public TOption getOption() {
        return this.mOption;
    }

    protected List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.mSubAppInfo.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setHostContext(Context context) {
        this.mHostContext = context;
    }

    public void setInnerHms() {
        this.innerHmsPkg = this.mContext.getPackageName();
        this.isUseInnerHms = true;
        HMSLog.i("HuaweiApi", "<setInnerHms> init inner hms pkg info:" + this.innerHmsPkg);
    }

    public void setKitSdkVersion(int i) {
        this.mKitSdkVersion = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (setSubAppInfo(new SubAppInfo(str))) {
            return;
        }
        throw new ApiException(Status.FAILURE);
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        HMSLog.i("HuaweiApi", "Enter setSubAppInfo");
        SubAppInfo subAppInfo2 = this.mSubAppInfo;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e("HuaweiApi", "subAppInfo is already set");
            return false;
        } else if (subAppInfo == null) {
            HMSLog.e("HuaweiApi", "subAppInfo is null");
            return false;
        } else {
            String subAppID = subAppInfo.getSubAppID();
            if (TextUtils.isEmpty(subAppID)) {
                HMSLog.e("HuaweiApi", "subAppId is empty");
                return false;
            } else if (subAppID.equals(this.mHostAppid)) {
                HMSLog.e("HuaweiApi", "subAppId is host appid");
                return false;
            } else if (this.isFirstReqSent) {
                HMSLog.e("HuaweiApi", "Client has sent request to Huawei Mobile Services, setting subAppId is not allowed");
                return false;
            } else {
                this.mSubAppInfo = new SubAppInfo(subAppInfo);
                return true;
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, "Null activity is not permitted.");
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, "Null context is not permitted.");
        init(context, api, toption, abstractClientBuilder, 0, null);
    }
}
