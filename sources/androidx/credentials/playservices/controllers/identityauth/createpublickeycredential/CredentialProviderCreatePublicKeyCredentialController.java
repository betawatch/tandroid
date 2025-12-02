package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialResponse;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.CreateCredentialUnknownException;
import androidx.credentials.exceptions.domerrors.EncodingError;
import androidx.credentials.exceptions.domerrors.UnknownError;
import androidx.credentials.exceptions.publickeycredential.CreatePublicKeyCredentialDomException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.fido.Fido;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
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
import org.json.JSONException;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController {
    public static final Companion Companion = new Companion(null);
    private CredentialManagerCallback callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle resultData) {
                Executor executor;
                Executor executor2;
                CredentialManagerCallback credentialManagerCallback;
                CredentialManagerCallback credentialManagerCallback2;
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = CredentialProviderCreatePublicKeyCredentialController.this;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                executor = CredentialProviderCreatePublicKeyCredentialController.this.executor;
                if (executor == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("executor");
                    executor2 = null;
                } else {
                    executor2 = executor;
                }
                credentialManagerCallback = CredentialProviderCreatePublicKeyCredentialController.this.callback;
                if (credentialManagerCallback == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("callback");
                    credentialManagerCallback2 = null;
                } else {
                    credentialManagerCallback2 = credentialManagerCallback;
                }
                cancellationSignal = CredentialProviderCreatePublicKeyCredentialController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor2, credentialManagerCallback2, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderCreatePublicKeyCredentialController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) resultData.getParcelable("RESULT_DATA"));
            }
        };
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(CreatePublicKeyCredentialRequest request, CredentialManagerCallback callback, Executor executor, final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        try {
            PublicKeyCredentialCreationOptions convertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            Task registerPendingIntent = Fido.getFido2ApiClient(this.context).getRegisterPendingIntent(convertRequestToPlayServices);
            final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invokePlayServices$lambda$6;
                    invokePlayServices$lambda$6 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6(cancellationSignal, this, (PendingIntent) obj);
                    return invokePlayServices$lambda$6;
                }
            };
            registerPendingIntent.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda10
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    Function1.this.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda11
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$10(CredentialProviderCreatePublicKeyCredentialController.this, cancellationSignal, exc);
                }
            });
        } catch (JSONException e) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$1;
                    invokePlayServices$lambda$1 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1(CredentialProviderCreatePublicKeyCredentialController.this, e);
                    return invokePlayServices$lambda$1;
                }
            });
        } catch (Throwable th) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$3;
                    invokePlayServices$lambda$3 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$3(CredentialProviderCreatePublicKeyCredentialController.this, th);
                    return invokePlayServices$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$1(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1$lambda$0(CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$lambda$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$3(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final Throwable th) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$3$lambda$2(CredentialProviderCreatePublicKeyCredentialController.this, th);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$3$lambda$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException(th.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$6(CancellationSignal cancellationSignal, final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, PendingIntent result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.INSTANCE;
        }
        Intent intent = new Intent(credentialProviderCreatePublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePublicKeyCredentialController.generateHiddenActivityIntent(credentialProviderCreatePublicKeyCredentialController.resultReceiver, intent, "CREATE_PUBLIC_KEY_CREDENTIAL");
        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
        try {
            credentialProviderCreatePublicKeyCredentialController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$6$lambda$5;
                    invokePlayServices$lambda$6$lambda$5 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6$lambda$5(CredentialProviderCreatePublicKeyCredentialController.this);
                    return invokePlayServices$lambda$6$lambda$5;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$6$lambda$5(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda21
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$6$lambda$5$lambda$4(CredentialProviderCreatePublicKeyCredentialController.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6$lambda$5$lambda$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreateCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$10(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CancellationSignal cancellationSignal, Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        final CreateCredentialException fromIntentRequestException = credentialProviderCreatePublicKeyCredentialController.fromIntentRequestException(e);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokePlayServices$lambda$10$lambda$9;
                invokePlayServices$lambda$10$lambda$9 = CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$10$lambda$9(CredentialProviderCreatePublicKeyCredentialController.this, fromIntentRequestException);
                return invokePlayServices$lambda$10$lambda$9;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$10$lambda$9(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final CreateCredentialException createCredentialException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda22
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$10$lambda$9$lambda$8(CredentialProviderCreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$10$lambda$9$lambda$8(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    private final CreateCredentialException fromIntentRequestException(Throwable th) {
        String str;
        if ((th instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) th).getStatusCode()))) {
            str = "CREATE_INTERRUPTED";
        } else {
            str = "CREATE_UNKNOWN";
        }
        return CredentialProviderBaseController.Companion.createCredentialExceptionTypeToException$credentials_play_services_auth_release(str, "During create public key credential, fido registration failure: " + th.getMessage());
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            Log.w("CreatePublicKey", "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " does not match what was given " + i);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i2, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit handleResponse$lambda$11;
                handleResponse$lambda$11 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$11((CancellationSignal) obj, (Function0) obj2);
                return handleResponse$lambda$11;
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit handleResponse$lambda$13;
                handleResponse$lambda$13 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$13(CredentialProviderCreatePublicKeyCredentialController.this, (CreateCredentialException) obj);
                return handleResponse$lambda$13;
            }
        }, this.cancellationSignal)) {
            return;
        }
        Executor executor = null;
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(this.cancellationSignal)) {
                return;
            }
            Executor executor2 = this.executor;
            if (executor2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("executor");
            } else {
                executor = executor2;
            }
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$14(CredentialProviderCreatePublicKeyCredentialController.this);
                }
            });
            return;
        }
        PublicKeyCredential deserializeFromBytes = PublicKeyCredential.deserializeFromBytes(byteArrayExtra);
        Intrinsics.checkNotNullExpressionValue(deserializeFromBytes, "deserializeFromBytes(...)");
        final CreateCredentialException publicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(deserializeFromBytes);
        if (publicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$16;
                    handleResponse$lambda$16 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$16(CredentialProviderCreatePublicKeyCredentialController.this, publicKeyCredentialResponseContainsError);
                    return handleResponse$lambda$16;
                }
            });
            return;
        }
        try {
            final CreateCredentialResponse convertResponseToCredentialManager = convertResponseToCredentialManager(deserializeFromBytes);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$18;
                    handleResponse$lambda$18 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$18(CredentialProviderCreatePublicKeyCredentialController.this, convertResponseToCredentialManager);
                    return handleResponse$lambda$18;
                }
            });
        } catch (JSONException e) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$20;
                    handleResponse$lambda$20 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$20(CredentialProviderCreatePublicKeyCredentialController.this, e);
                    return handleResponse$lambda$20;
                }
            });
        } catch (Throwable th) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$22;
                    handleResponse$lambda$22 = CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$22(CredentialProviderCreatePublicKeyCredentialController.this, th);
                    return handleResponse$lambda$22;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$11(CancellationSignal cancellationSignal, Function0 f) {
        Intrinsics.checkNotNullParameter(f, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final CreateCredentialException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$13$lambda$12(CredentialProviderCreatePublicKeyCredentialController.this, e);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$13$lambda$12(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$14(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreatePublicKeyCredentialDomException(new UnknownError(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$16(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final CreateCredentialException createCredentialException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$16$lambda$15(CredentialProviderCreatePublicKeyCredentialController.this, createCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$16$lambda$15(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialException createCredentialException) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(createCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$18(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final CreateCredentialResponse createCredentialResponse) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$18$lambda$17(CredentialProviderCreatePublicKeyCredentialController.this, createCredentialResponse);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$18$lambda$17(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CreateCredentialResponse createCredentialResponse) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onResult(createCredentialResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$20(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$20$lambda$19(CredentialProviderCreatePublicKeyCredentialController.this, jSONException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$20$lambda$19(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreatePublicKeyCredentialDomException(new EncodingError(), jSONException.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$22(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final Throwable th) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            executor = null;
        }
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$22$lambda$21(CredentialProviderCreatePublicKeyCredentialController.this, th);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$22$lambda$21(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th) {
        CredentialManagerCallback credentialManagerCallback = credentialProviderCreatePublicKeyCredentialController.callback;
        if (credentialManagerCallback == null) {
            Intrinsics.throwUninitializedPropertyAccessException("callback");
            credentialManagerCallback = null;
        }
        credentialManagerCallback.onError(new CreatePublicKeyCredentialDomException(new UnknownError(), th.getMessage()));
    }

    public PublicKeyCredentialCreationOptions convertRequestToPlayServices(CreatePublicKeyCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return PublicKeyCredentialControllerUtility.Companion.convert(request, this.context);
    }

    public CreateCredentialResponse convertResponseToCredentialManager(PublicKeyCredential response) {
        Intrinsics.checkNotNullParameter(response, "response");
        try {
            String json = response.toJson();
            Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
            return new CreatePublicKeyCredentialResponse(json);
        } catch (Throwable th) {
            throw new CreateCredentialUnknownException("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
        }
    }

    private final CreatePublicKeyCredentialDomException JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        if (message != null && message.length() > 0) {
            return new CreatePublicKeyCredentialDomException(new EncodingError(), message);
        }
        return new CreatePublicKeyCredentialDomException(new EncodingError(), "Unknown error");
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }
    }
}
