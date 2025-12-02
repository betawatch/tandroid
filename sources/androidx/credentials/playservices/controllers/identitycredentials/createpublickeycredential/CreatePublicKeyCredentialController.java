package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.core.os.BundleCompat;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialCancellationException;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialInterruptedException;
import androidx.credentials.exceptions.CreateCredentialNoCreateOptionException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.provider.PendingIntentHandler;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.identitycredentials.CreateCredentialHandle;
import com.google.android.gms.identitycredentials.CreateCredentialRequest;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;
import com.google.android.gms.identitycredentials.IdentityCredentialManager;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Companion(null);
    private CredentialManagerCallback callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1] */
    public CreatePublicKeyCredentialController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle resultData) {
                Executor executor;
                Executor executor2;
                CredentialManagerCallback credentialManagerCallback;
                CredentialManagerCallback credentialManagerCallback2;
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CreatePublicKeyCredentialController createPublicKeyCredentialController = CreatePublicKeyCredentialController.this;
                CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                executor = CreatePublicKeyCredentialController.this.executor;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                credentialManagerCallback = CreatePublicKeyCredentialController.this.callback;
                if (credentialManagerCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    credentialManagerCallback2 = null;
                } else {
                    credentialManagerCallback2 = credentialManagerCallback;
                }
                cancellationSignal = CreatePublicKeyCredentialController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = createPublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor2, credentialManagerCallback2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) BundleCompat.getParcelable(resultData, "RESULT_DATA", Intent.class));
            }
        };
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(CreatePublicKeyCredentialRequest request, final CredentialManagerCallback callback, final Executor executor, final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task createCredential = IdentityCredentialManager.Companion.getClient(this.context).createCredential(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invokePlayServices$lambda$8;
                invokePlayServices$lambda$8 = CreatePublicKeyCredentialController.invokePlayServices$lambda$8(cancellationSignal, this, executor, callback, (CreateCredentialHandle) obj);
                return invokePlayServices$lambda$8;
            }
        };
        createCredential.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda6
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda7
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$12(cancellationSignal, this, executor, callback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8(CancellationSignal cancellationSignal, final CreatePublicKeyCredentialController createPublicKeyCredentialController, final Executor executor, final CredentialManagerCallback credentialManagerCallback, CreateCredentialHandle createCredentialHandle) {
        PendingIntent pendingIntent = createCredentialHandle.getPendingIntent();
        CreateCredentialResponse createCredentialResponse = createCredentialHandle.getCreateCredentialResponse();
        if (pendingIntent == null && createCredentialResponse == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$8$lambda$1;
                    invokePlayServices$lambda$8$lambda$1 = CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$1(executor, credentialManagerCallback);
                    return invokePlayServices$lambda$8$lambda$1;
                }
            });
            return Unit.INSTANCE;
        }
        if (pendingIntent != null) {
            Intent intent = new Intent(createPublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
            createPublicKeyCredentialController.generateHiddenActivityIntent(createPublicKeyCredentialController.resultReceiver, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
            intent.putExtra("EXTRA_FLOW_PENDING_INTENT", pendingIntent);
            try {
                createPublicKeyCredentialController.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invokePlayServices$lambda$8$lambda$3;
                        invokePlayServices$lambda$8$lambda$3 = CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$3(CreatePublicKeyCredentialController.this);
                        return invokePlayServices$lambda$8$lambda$3;
                    }
                });
            }
        }
        if (createCredentialResponse != null) {
            final androidx.credentials.CreateCredentialResponse convertResponseToCredentialManager = createPublicKeyCredentialController.convertResponseToCredentialManager(createCredentialResponse);
            if (convertResponseToCredentialManager instanceof CreatePublicKeyCredentialResponse) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invokePlayServices$lambda$8$lambda$5;
                        invokePlayServices$lambda$8$lambda$5 = CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$5(executor, credentialManagerCallback, convertResponseToCredentialManager);
                        return invokePlayServices$lambda$8$lambda$5;
                    }
                });
                return Unit.INSTANCE;
            }
        }
        if (pendingIntent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$8$lambda$7;
                    invokePlayServices$lambda$8$lambda$7 = CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$7(executor, credentialManagerCallback);
                    return invokePlayServices$lambda$8$lambda$7;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$1(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$1$lambda$0(CredentialManagerCallback.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$1$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$3(final CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda20
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$3$lambda$2(CreatePublicKeyCredentialController.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$3$lambda$2(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        CredentialManagerCallback credentialManagerCallback = createPublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$5(Executor executor, final CredentialManagerCallback credentialManagerCallback, final androidx.credentials.CreateCredentialResponse createCredentialResponse) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                CredentialManagerCallback.this.onResult(createCredentialResponse);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$8$lambda$7$lambda$6(CredentialManagerCallback.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$7$lambda$6(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnknownException(null, 1, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$12(CancellationSignal cancellationSignal, final CreatePublicKeyCredentialController createPublicKeyCredentialController, final Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokePlayServices$lambda$12$lambda$11;
                invokePlayServices$lambda$12$lambda$11 = CreatePublicKeyCredentialController.invokePlayServices$lambda$12$lambda$11(CreatePublicKeyCredentialController.this, e, executor, credentialManagerCallback);
                return invokePlayServices$lambda$12$lambda$11;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$12$lambda$11(CreatePublicKeyCredentialController createPublicKeyCredentialController, Exception exc, Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Intrinsics.checkNotNull(exc);
        final CreateCredentialException fromGmsException = createPublicKeyCredentialController.fromGmsException(exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                CredentialManagerCallback.this.onError(fromGmsException);
            }
        });
        return Unit.INSTANCE;
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            Log.w("CreatePublicKey", "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " does not match what was given " + i);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i2, new Function2() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit handleResponse$lambda$13;
                handleResponse$lambda$13 = CreatePublicKeyCredentialController.handleResponse$lambda$13((CancellationSignal) obj, (Function0) obj2);
                return handleResponse$lambda$13;
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit handleResponse$lambda$15;
                handleResponse$lambda$15 = CreatePublicKeyCredentialController.handleResponse$lambda$15(CreatePublicKeyCredentialController.this, (CreateCredentialException) obj);
                return handleResponse$lambda$15;
            }
        }, this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$17;
                    handleResponse$lambda$17 = CreatePublicKeyCredentialController.handleResponse$lambda$17(CreatePublicKeyCredentialController.this);
                    return handleResponse$lambda$17;
                }
            });
            return;
        }
        PendingIntentHandler.Companion companion2 = PendingIntentHandler.Companion;
        final androidx.credentials.CreateCredentialResponse retrieveCreateCredentialResponse = companion2.retrieveCreateCredentialResponse("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", intent);
        if (retrieveCreateCredentialResponse != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$19;
                    handleResponse$lambda$19 = CreatePublicKeyCredentialController.handleResponse$lambda$19(CreatePublicKeyCredentialController.this, retrieveCreateCredentialResponse);
                    return handleResponse$lambda$19;
                }
            });
        } else {
            final CreateCredentialException retrieveCreateCredentialException = companion2.retrieveCreateCredentialException(intent);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$21;
                    handleResponse$lambda$21 = CreatePublicKeyCredentialController.handleResponse$lambda$21(CreatePublicKeyCredentialController.this, retrieveCreateCredentialException);
                    return handleResponse$lambda$21;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(CancellationSignal cancellationSignal, Function0 f) {
        Intrinsics.checkNotNullParameter(f, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$15(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final CreateCredentialException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$15$lambda$14(CreatePublicKeyCredentialController.this, e);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$15$lambda$14(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback credentialManagerCallback = createPublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$17(final CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$17$lambda$16(CreatePublicKeyCredentialController.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$17$lambda$16(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        CredentialManagerCallback credentialManagerCallback = createPublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException("No provider data returned."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$19(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final androidx.credentials.CreateCredentialResponse createCredentialResponse) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$19$lambda$18(CreatePublicKeyCredentialController.this, createCredentialResponse);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$19$lambda$18(CreatePublicKeyCredentialController createPublicKeyCredentialController, androidx.credentials.CreateCredentialResponse createCredentialResponse) {
        CredentialManagerCallback credentialManagerCallback = createPublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onResult(createCredentialResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$21(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final CreateCredentialException createCredentialException) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.handleResponse$lambda$21$lambda$20(CreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$21$lambda$20(CreatePublicKeyCredentialController createPublicKeyCredentialController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback credentialManagerCallback = createPublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        if (createCredentialException == null) {
            createCredentialException = new CreateCredentialUnknownException("No provider data returned");
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    public final CreateCredentialException fromGmsException(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof ApiException) {
            int statusCode = ((ApiException) e).getStatusCode();
            if (statusCode == 16) {
                return new CreateCredentialCancellationException(e.getMessage());
            }
            if (statusCode == 17) {
                return new CreateCredentialUnsupportedException("API is not supported: " + e.getMessage());
            }
            if (statusCode == 8) {
                return new CreateCredentialNoCreateOptionException(e.getMessage());
            }
            if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(statusCode))) {
                return new CreateCredentialInterruptedException(e.getMessage());
            }
            return new CreateCredentialUnknownException("Conditional create failed, failure: " + e.getMessage());
        }
        if (e instanceof UnsupportedApiCallException) {
            return new CreateCredentialUnsupportedException("API is unsupported");
        }
        return new CreateCredentialUnknownException("Conditional create failed, failure: " + e);
    }

    public CreateCredentialRequest convertRequestToPlayServices(CreatePublicKeyCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return new CreateCredentialRequest(request.getType(), request.getCredentialData(), request.getCandidateQueryData(), request.getOrigin(), request.getRequestJson(), null);
    }

    protected androidx.credentials.CreateCredentialResponse convertResponseToCredentialManager(CreateCredentialResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return androidx.credentials.CreateCredentialResponse.Companion.createFrom(response.getType(), response.getData());
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CreatePublicKeyCredentialController getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CreatePublicKeyCredentialController(context);
        }
    }
}
