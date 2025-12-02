package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.Credential;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.PasswordCredential;
import androidx.credentials.PublicKeyCredential;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.identity.googleid.GoogleIdTokenCredential;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController {
    public static final Companion Companion = new Companion(null);
    public CredentialManagerCallback callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle resultData) {
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = CredentialProviderBeginSignInController.this;
                CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = CredentialProviderBeginSignInController.this.getExecutor();
                CredentialManagerCallback callback = CredentialProviderBeginSignInController.this.getCallback();
                cancellationSignal = CredentialProviderBeginSignInController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderBeginSignInController.maybeReportErrorFromResultReceiver(resultData, credentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderBeginSignInController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) resultData.getParcelable("RESULT_DATA"));
            }
        };
    }

    public final CredentialManagerCallback getCallback() {
        CredentialManagerCallback credentialManagerCallback = this.callback;
        if (credentialManagerCallback != null) {
            return credentialManagerCallback;
        }
        Intrinsics.throwUninitializedPropertyAccessException("callback");
        return null;
    }

    public final void setCallback(CredentialManagerCallback credentialManagerCallback) {
        Intrinsics.checkNotNullParameter(credentialManagerCallback, "<set-?>");
        this.callback = credentialManagerCallback;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("executor");
        return null;
    }

    public final void setExecutor(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(GetCredentialRequest request, CredentialManagerCallback callback, Executor executor, final CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        Task beginSignIn = Identity.getSignInClient(this.context).beginSignIn(convertRequestToPlayServices(request));
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invokePlayServices$lambda$2;
                invokePlayServices$lambda$2 = CredentialProviderBeginSignInController.invokePlayServices$lambda$2(cancellationSignal, this, (BeginSignInResult) obj);
                return invokePlayServices$lambda$2;
            }
        };
        beginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda1
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$6(CredentialProviderBeginSignInController.this, cancellationSignal, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final CredentialProviderBeginSignInController credentialProviderBeginSignInController, BeginSignInResult beginSignInResult) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.INSTANCE;
        }
        Intent intent = new Intent(credentialProviderBeginSignInController.context, (Class<?>) HiddenActivity.class);
        credentialProviderBeginSignInController.generateHiddenActivityIntent(credentialProviderBeginSignInController.resultReceiver, intent, "BEGIN_SIGN_IN");
        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", beginSignInResult.getPendingIntent());
        try {
            credentialProviderBeginSignInController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$2$lambda$1;
                    invokePlayServices$lambda$2$lambda$1 = CredentialProviderBeginSignInController.invokePlayServices$lambda$2$lambda$1(CredentialProviderBeginSignInController.this);
                    return invokePlayServices$lambda$2$lambda$1;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$2$lambda$1(final CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda16
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2$lambda$1$lambda$0(CredentialProviderBeginSignInController.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$lambda$1$lambda$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getCallback().onError(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, CancellationSignal cancellationSignal, Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        final GetCredentialException fromGmsException = credentialProviderBeginSignInController.fromGmsException(e);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokePlayServices$lambda$6$lambda$5;
                invokePlayServices$lambda$6$lambda$5 = CredentialProviderBeginSignInController.invokePlayServices$lambda$6$lambda$5(CredentialProviderBeginSignInController.this, fromGmsException);
                return invokePlayServices$lambda$6$lambda$5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$6$lambda$5(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda17
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$6$lambda$5$lambda$4(CredentialProviderBeginSignInController.this, getCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$6$lambda$5$lambda$4(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getCallback().onError(getCredentialException);
    }

    private final GetCredentialException fromGmsException(Throwable th) {
        String str;
        if ((th instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) th).getStatusCode()))) {
            str = "GET_INTERRUPTED";
        } else {
            str = "GET_NO_CREDENTIALS";
        }
        return CredentialProviderBaseController.Companion.getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, "During begin sign in, failure response from one tap: " + th.getMessage());
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            Log.w("BeginSignIn", "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " which  does not match what was given " + i);
            return;
        }
        CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
        if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth_release(i2, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit handleResponse$lambda$7;
                handleResponse$lambda$7 = CredentialProviderBeginSignInController.handleResponse$lambda$7((CancellationSignal) obj, (Function0) obj2);
                return handleResponse$lambda$7;
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit handleResponse$lambda$9;
                handleResponse$lambda$9 = CredentialProviderBeginSignInController.handleResponse$lambda$9(CredentialProviderBeginSignInController.this, (GetCredentialException) obj);
                return handleResponse$lambda$9;
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(intent);
            Intrinsics.checkNotNullExpressionValue(signInCredentialFromIntent, "getSignInCredentialFromIntent(...)");
            final GetCredentialResponse convertResponseToCredentialManager = convertResponseToCredentialManager(signInCredentialFromIntent);
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$11;
                    handleResponse$lambda$11 = CredentialProviderBeginSignInController.handleResponse$lambda$11(CredentialProviderBeginSignInController.this, convertResponseToCredentialManager);
                    return handleResponse$lambda$11;
                }
            });
        } catch (GetCredentialException e) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$15;
                    handleResponse$lambda$15 = CredentialProviderBeginSignInController.handleResponse$lambda$15(CredentialProviderBeginSignInController.this, e);
                    return handleResponse$lambda$15;
                }
            });
        } catch (ApiException e2) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            ref$ObjectRef.element = new GetCredentialUnknownException(e2.getMessage());
            if (e2.getStatusCode() == 16) {
                ref$ObjectRef.element = new GetCredentialCancellationException(e2.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e2.getStatusCode()))) {
                ref$ObjectRef.element = new GetCredentialInterruptedException(e2.getMessage());
            }
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$13;
                    handleResponse$lambda$13 = CredentialProviderBeginSignInController.handleResponse$lambda$13(CredentialProviderBeginSignInController.this, ref$ObjectRef);
                    return handleResponse$lambda$13;
                }
            });
        } catch (Throwable th) {
            final GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th.getMessage());
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$17;
                    handleResponse$lambda$17 = CredentialProviderBeginSignInController.handleResponse$lambda$17(CredentialProviderBeginSignInController.this, getCredentialUnknownException);
                    return handleResponse$lambda$17;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$7(CancellationSignal cancellationSignal, Function0 f) {
        Intrinsics.checkNotNullParameter(f, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$9(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final GetCredentialException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$9$lambda$8(CredentialProviderBeginSignInController.this, e);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$9$lambda$8(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getCallback().onError(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$11(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final GetCredentialResponse getCredentialResponse) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$11$lambda$10(CredentialProviderBeginSignInController.this, getCredentialResponse);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$11$lambda$10(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialResponse getCredentialResponse) {
        credentialProviderBeginSignInController.getCallback().onResult(getCredentialResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final Ref$ObjectRef ref$ObjectRef) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$13$lambda$12(CredentialProviderBeginSignInController.this, ref$ObjectRef);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$13$lambda$12(CredentialProviderBeginSignInController credentialProviderBeginSignInController, Ref$ObjectRef ref$ObjectRef) {
        credentialProviderBeginSignInController.getCallback().onError(ref$ObjectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$15(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$15$lambda$14(CredentialProviderBeginSignInController.this, getCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$15$lambda$14(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialException getCredentialException) {
        credentialProviderBeginSignInController.getCallback().onError(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$17(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$17$lambda$16(CredentialProviderBeginSignInController.this, getCredentialUnknownException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$17$lambda$16(CredentialProviderBeginSignInController credentialProviderBeginSignInController, GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderBeginSignInController.getCallback().onError(getCredentialUnknownException);
    }

    public BeginSignInRequest convertRequestToPlayServices(GetCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth_release(request, this.context);
    }

    public GetCredentialResponse convertResponseToCredentialManager(SignInCredential response) {
        Credential credential;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getPassword() != null) {
            String id = response.getId();
            Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
            String password = response.getPassword();
            Intrinsics.checkNotNull(password);
            credential = new PasswordCredential(id, password);
        } else if (response.getGoogleIdToken() != null) {
            credential = createGoogleIdCredential(response);
        } else if (response.getPublicKeyCredential() != null) {
            credential = new PublicKeyCredential(PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(response));
        } else {
            Log.w("BeginSignIn", "Credential returned but no google Id or password or passkey found");
            credential = null;
        }
        if (credential == null) {
            throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
        }
        return new GetCredentialResponse(credential);
    }

    private final GoogleIdTokenCredential createGoogleIdCredential(SignInCredential signInCredential) {
        GoogleIdTokenCredential.Builder builder = new GoogleIdTokenCredential.Builder();
        String id = signInCredential.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        GoogleIdTokenCredential.Builder id2 = builder.setId(id);
        String googleIdToken = signInCredential.getGoogleIdToken();
        Intrinsics.checkNotNull(googleIdToken);
        GoogleIdTokenCredential.Builder idToken = id2.setIdToken(googleIdToken);
        if (signInCredential.getDisplayName() != null) {
            idToken.setDisplayName(signInCredential.getDisplayName());
        }
        if (signInCredential.getGivenName() != null) {
            idToken.setGivenName(signInCredential.getGivenName());
        }
        if (signInCredential.getFamilyName() != null) {
            idToken.setFamilyName(signInCredential.getFamilyName());
        }
        if (signInCredential.getPhoneNumber() != null) {
            idToken.setPhoneNumber(signInCredential.getPhoneNumber());
        }
        if (signInCredential.getProfilePictureUri() != null) {
            idToken.setProfilePictureUri(signInCredential.getProfilePictureUri());
        }
        return idToken.build();
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
