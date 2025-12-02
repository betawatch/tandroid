package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.GetCredentialResponse;
import androidx.credentials.exceptions.GetCredentialCancellationException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.exceptions.GetCredentialInterruptedException;
import androidx.credentials.exceptions.GetCredentialUnknownException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
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
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController {
    public static final Companion Companion = new Companion(null);
    public CredentialManagerCallback callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle resultData) {
                CancellationSignal cancellationSignal;
                boolean maybeReportErrorFromResultReceiver;
                Intrinsics.checkNotNullParameter(resultData, "resultData");
                CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController = CredentialProviderGetSignInIntentController.this;
                CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 credentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = CredentialProviderGetSignInIntentController.this.getExecutor();
                CredentialManagerCallback callback = CredentialProviderGetSignInIntentController.this.getCallback();
                cancellationSignal = CredentialProviderGetSignInIntentController.this.cancellationSignal;
                maybeReportErrorFromResultReceiver = credentialProviderGetSignInIntentController.maybeReportErrorFromResultReceiver(resultData, credentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1, executor, callback, cancellationSignal);
                if (maybeReportErrorFromResultReceiver) {
                    return;
                }
                CredentialProviderGetSignInIntentController.this.handleResponse$credentials_play_services_auth_release(resultData.getInt("ACTIVITY_REQUEST_CODE"), i, (Intent) resultData.getParcelable("RESULT_DATA"));
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
        try {
            Task signInIntent = Identity.getSignInClient(this.context).getSignInIntent(convertRequestToPlayServices(request));
            final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit invokePlayServices$lambda$4;
                    invokePlayServices$lambda$4 = CredentialProviderGetSignInIntentController.invokePlayServices$lambda$4(cancellationSignal, this, (PendingIntent) obj);
                    return invokePlayServices$lambda$4;
                }
            };
            signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    Function1.this.invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderGetSignInIntentController.invokePlayServices$lambda$8(CredentialProviderGetSignInIntentController.this, cancellationSignal, exc);
                }
            });
        } catch (GetCredentialUnsupportedException e) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$1;
                    invokePlayServices$lambda$1 = CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1(CredentialProviderGetSignInIntentController.this, e);
                    return invokePlayServices$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$1(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialUnsupportedException getCredentialUnsupportedException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$lambda$0(CredentialProviderGetSignInIntentController.this, getCredentialUnsupportedException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$lambda$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialUnsupportedException getCredentialUnsupportedException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialUnsupportedException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4(CancellationSignal cancellationSignal, final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, PendingIntent result) {
        Intrinsics.checkNotNullParameter(result, "result");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return Unit.INSTANCE;
        }
        Intent intent = new Intent(credentialProviderGetSignInIntentController.context, (Class<?>) HiddenActivity.class);
        credentialProviderGetSignInIntentController.generateHiddenActivityIntent(credentialProviderGetSignInIntentController.resultReceiver, intent, "SIGN_IN_INTENT");
        intent.putExtra("EXTRA_FLOW_PENDING_INTENT", result);
        try {
            credentialProviderGetSignInIntentController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invokePlayServices$lambda$4$lambda$3;
                    invokePlayServices$lambda$4$lambda$3 = CredentialProviderGetSignInIntentController.invokePlayServices$lambda$4$lambda$3(CredentialProviderGetSignInIntentController.this);
                    return invokePlayServices$lambda$4$lambda$3;
                }
            });
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$4$lambda$3(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda19
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$4$lambda$3$lambda$2(CredentialProviderGetSignInIntentController.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$lambda$3$lambda$2(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getCallback().onError(new GetCredentialUnknownException("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, CancellationSignal cancellationSignal, Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        final GetCredentialException fromGmsException = credentialProviderGetSignInIntentController.fromGmsException(e);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invokePlayServices$lambda$8$lambda$7;
                invokePlayServices$lambda$8$lambda$7 = CredentialProviderGetSignInIntentController.invokePlayServices$lambda$8$lambda$7(CredentialProviderGetSignInIntentController.this, fromGmsException);
                return invokePlayServices$lambda$8$lambda$7;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokePlayServices$lambda$8$lambda$7(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda18
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$8$lambda$7$lambda$6(CredentialProviderGetSignInIntentController.this, getCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$8$lambda$7$lambda$6(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialException);
    }

    private final GetCredentialException fromGmsException(Throwable th) {
        String str;
        if ((th instanceof ApiException) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((ApiException) th).getStatusCode()))) {
            str = "GET_INTERRUPTED";
        } else {
            str = "GET_NO_CREDENTIALS";
        }
        return CredentialProviderBaseController.Companion.getCredentialExceptionTypeToException$credentials_play_services_auth_release(str, "During get sign-in intent, failure response from one tap: " + th.getMessage());
    }

    public GetSignInIntentRequest convertRequestToPlayServices(GetCredentialRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (request.getCredentialOptions().size() != 1) {
            throw new GetCredentialUnsupportedException("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        Object obj = request.getCredentialOptions().get(0);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj);
        GetSignInIntentRequest.builder();
        throw null;
    }

    protected GetCredentialResponse convertResponseToCredentialManager(SignInCredential response) {
        GoogleIdTokenCredential googleIdTokenCredential;
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.getGoogleIdToken() != null) {
            googleIdTokenCredential = createGoogleIdCredential(response);
        } else {
            Log.w("GetSignInIntent", "Credential returned but no google Id found");
            googleIdTokenCredential = null;
        }
        if (googleIdTokenCredential == null) {
            throw new GetCredentialUnknownException("When attempting to convert get response, null credential found");
        }
        return new GetCredentialResponse(googleIdTokenCredential);
    }

    public final GoogleIdTokenCredential createGoogleIdCredential(SignInCredential response) {
        Intrinsics.checkNotNullParameter(response, "response");
        GoogleIdTokenCredential.Builder builder = new GoogleIdTokenCredential.Builder();
        String id = response.getId();
        Intrinsics.checkNotNullExpressionValue(id, "getId(...)");
        GoogleIdTokenCredential.Builder id2 = builder.setId(id);
        try {
            String googleIdToken = response.getGoogleIdToken();
            Intrinsics.checkNotNull(googleIdToken);
            id2.setIdToken(googleIdToken);
            if (response.getDisplayName() != null) {
                id2.setDisplayName(response.getDisplayName());
            }
            if (response.getGivenName() != null) {
                id2.setGivenName(response.getGivenName());
            }
            if (response.getFamilyName() != null) {
                id2.setFamilyName(response.getFamilyName());
            }
            if (response.getPhoneNumber() != null) {
                id2.setPhoneNumber(response.getPhoneNumber());
            }
            if (response.getProfilePictureUri() != null) {
                id2.setProfilePictureUri(response.getProfilePictureUri());
            }
            return id2.build();
        } catch (Exception unused) {
            throw new GetCredentialUnknownException("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final void handleResponse$credentials_play_services_auth_release(int i, int i2, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release()) {
            Log.w("GetSignInIntent", "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth_release() + " which  does not match what was given " + i);
            return;
        }
        CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
        if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth_release(i2, new Function2() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit handleResponse$lambda$9;
                handleResponse$lambda$9 = CredentialProviderGetSignInIntentController.handleResponse$lambda$9((CancellationSignal) obj, (Function0) obj2);
                return handleResponse$lambda$9;
            }
        }, new Function1() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit handleResponse$lambda$11;
                handleResponse$lambda$11 = CredentialProviderGetSignInIntentController.handleResponse$lambda$11(CredentialProviderGetSignInIntentController.this, (GetCredentialException) obj);
                return handleResponse$lambda$11;
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            SignInCredential signInCredentialFromIntent = Identity.getSignInClient(this.context).getSignInCredentialFromIntent(intent);
            Intrinsics.checkNotNullExpressionValue(signInCredentialFromIntent, "getSignInCredentialFromIntent(...)");
            final GetCredentialResponse convertResponseToCredentialManager = convertResponseToCredentialManager(signInCredentialFromIntent);
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$13;
                    handleResponse$lambda$13 = CredentialProviderGetSignInIntentController.handleResponse$lambda$13(CredentialProviderGetSignInIntentController.this, convertResponseToCredentialManager);
                    return handleResponse$lambda$13;
                }
            });
        } catch (GetCredentialException e) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$17;
                    handleResponse$lambda$17 = CredentialProviderGetSignInIntentController.handleResponse$lambda$17(CredentialProviderGetSignInIntentController.this, e);
                    return handleResponse$lambda$17;
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
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$15;
                    handleResponse$lambda$15 = CredentialProviderGetSignInIntentController.handleResponse$lambda$15(CredentialProviderGetSignInIntentController.this, ref$ObjectRef);
                    return handleResponse$lambda$15;
                }
            });
        } catch (Throwable th) {
            final GetCredentialUnknownException getCredentialUnknownException = new GetCredentialUnknownException(th.getMessage());
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(this.cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit handleResponse$lambda$19;
                    handleResponse$lambda$19 = CredentialProviderGetSignInIntentController.handleResponse$lambda$19(CredentialProviderGetSignInIntentController.this, getCredentialUnknownException);
                    return handleResponse$lambda$19;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$9(CancellationSignal cancellationSignal, Function0 f) {
        Intrinsics.checkNotNullParameter(f, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release(cancellationSignal, f);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$11(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialException e) {
        Intrinsics.checkNotNullParameter(e, "e");
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$11$lambda$10(CredentialProviderGetSignInIntentController.this, e);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$11$lambda$10(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$13(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialResponse getCredentialResponse) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$13$lambda$12(CredentialProviderGetSignInIntentController.this, getCredentialResponse);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$13$lambda$12(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialResponse getCredentialResponse) {
        credentialProviderGetSignInIntentController.getCallback().onResult(getCredentialResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$15(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final Ref$ObjectRef ref$ObjectRef) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$15$lambda$14(CredentialProviderGetSignInIntentController.this, ref$ObjectRef);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$15$lambda$14(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, Ref$ObjectRef ref$ObjectRef) {
        credentialProviderGetSignInIntentController.getCallback().onError(ref$ObjectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$17(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$17$lambda$16(CredentialProviderGetSignInIntentController.this, getCredentialException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$17$lambda$16(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialException getCredentialException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit handleResponse$lambda$19(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$19$lambda$18(CredentialProviderGetSignInIntentController.this, getCredentialUnknownException);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$19$lambda$18(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, GetCredentialUnknownException getCredentialUnknownException) {
        credentialProviderGetSignInIntentController.getCallback().onError(getCredentialUnknownException);
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
