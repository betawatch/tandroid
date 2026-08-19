package com.microsoft.appcenter.http;

import com.microsoft.appcenter.http.HttpClient;
import java.util.Map;

/* loaded from: classes3.dex */
abstract class HttpClientCallDecorator implements Runnable, ServiceCall, ServiceCallback {
    private final HttpClient.CallTemplate mCallTemplate;
    private final HttpClient mDecoratedApi;
    private final Map mHeaders;
    private final String mMethod;
    ServiceCall mServiceCall;
    final ServiceCallback mServiceCallback;
    private final String mUrl;

    HttpClientCallDecorator(HttpClient httpClient, String str, String str2, Map map, HttpClient.CallTemplate callTemplate, ServiceCallback serviceCallback) {
        this.mDecoratedApi = httpClient;
        this.mUrl = str;
        this.mMethod = str2;
        this.mHeaders = map;
        this.mCallTemplate = callTemplate;
        this.mServiceCallback = serviceCallback;
    }

    @Override // com.microsoft.appcenter.http.ServiceCall
    public synchronized void cancel() {
        this.mServiceCall.cancel();
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        try {
            try {
                this.mServiceCall = this.mDecoratedApi.callAsync(this.mUrl, this.mMethod, this.mHeaders, this.mCallTemplate, this);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // com.microsoft.appcenter.http.ServiceCallback
    public void onCallSucceeded(HttpResponse httpResponse) {
        this.mServiceCallback.onCallSucceeded(httpResponse);
    }

    @Override // com.microsoft.appcenter.http.ServiceCallback
    public void onCallFailed(Exception exc) {
        this.mServiceCallback.onCallFailed(exc);
    }
}
