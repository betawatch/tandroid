package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.ClearCredentialStateRequest;
import androidx.credentials.CreateCredentialRequest;
import androidx.credentials.CreatePublicKeyCredentialRequest;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.CredentialOption;
import androidx.credentials.CredentialProvider;
import androidx.credentials.GetCredentialRequest;
import androidx.credentials.PrepareGetCredentialResponse$PendingGetCredentialHandle;
import androidx.credentials.SignalCredentialStateRequest;
import androidx.credentials.exceptions.ClearCredentialProviderConfigurationException;
import androidx.credentials.exceptions.ClearCredentialUnknownException;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.google.android.gms.auth.api.identity.Identity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.identitycredentials.ClearCredentialStateResponse;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements CredentialProvider {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private GoogleApiAvailability googleApiAvailability;

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    public /* bridge */ /* synthetic */ void onGetCredential(Context context, PrepareGetCredentialResponse$PendingGetCredentialHandle prepareGetCredentialResponse$PendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        CredentialProvider.-CC.$default$onGetCredential(this, context, prepareGetCredentialResponse$PendingGetCredentialHandle, cancellationSignal, executor, credentialManagerCallback);
    }

    public /* bridge */ /* synthetic */ void onPrepareCredential(GetCredentialRequest getCredentialRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback) {
        CredentialProvider.-CC.$default$onPrepareCredential(this, getCredentialRequest, cancellationSignal, executor, credentialManagerCallback);
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Intrinsics.checkNotNullExpressionValue(googleApiAvailability, "getInstance(...)");
        this.googleApiAvailability = googleApiAvailability;
    }

    public final GoogleApiAvailability getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    public final void setGoogleApiAvailability(GoogleApiAvailability googleApiAvailability) {
        Intrinsics.checkNotNullParameter(googleApiAvailability, "<set-?>");
        this.googleApiAvailability = googleApiAvailability;
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, GetCredentialRequest request, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth_release(request)) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit onGetCredential$lambda$1;
                        onGetCredential$lambda$1 = CredentialProviderPlayServicesImpl.onGetCredential$lambda$1(executor, callback);
                        return onGetCredential$lambda$1;
                    }
                });
                return;
            } else {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth_release(request)) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit onGetCredential$lambda$3;
                        onGetCredential$lambda$3 = CredentialProviderPlayServicesImpl.onGetCredential$lambda$3(executor, callback);
                        return onGetCredential$lambda$3;
                    }
                });
                return;
            } else {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new GetCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth_release(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$1(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(CredentialManagerCallback.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$lambda$0(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$3(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(CredentialManagerCallback.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$3$lambda$2(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(Context context, CreateCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            return;
        }
        if (request instanceof CreatePublicKeyCredentialRequest) {
            if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePublicKeyCredentialRequest createPublicKeyCredentialRequest = (CreatePublicKeyCredentialRequest) request;
                if (!createPublicKeyCredentialRequest.isConditional()) {
                    CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices(createPublicKeyCredentialRequest, callback, executor, cancellationSignal);
                    return;
                }
            }
            CreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices((CreatePublicKeyCredentialRequest) request, callback, executor, cancellationSignal);
            return;
        }
        throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateCredential$lambda$5(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(CredentialManagerCallback.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$5$lambda$4(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    public final boolean isAvailableOnDevice(int i) {
        int isGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i);
        boolean z = isGooglePlayServicesAvailable == 0;
        if (!z) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new ConnectionResult(isGooglePlayServicesAvailable));
        }
        return z;
    }

    private final int isGooglePlayServicesAvailable(Context context, int i) {
        return this.googleApiAvailability.isGooglePlayServicesAvailable(context, i);
    }

    public void onClearCredential(ClearCredentialStateRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!Companion.cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$7(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(CredentialManagerCallback.this);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$7$lambda$6(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new ClearCredentialProviderConfigurationException("clearCredentialStateAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Boolean bool) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onClearCredential$lambda$10$lambda$9;
                onClearCredential$lambda$10$lambda$9 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$10$lambda$9(executor, credentialManagerCallback);
                return onClearCredential$lambda$10$lambda$9;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$10$lambda$9(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                CredentialManagerCallback.this.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Log.w(TAG, "Clearing restore credential failed", e);
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = new ClearCredentialUnknownException("Clear restore credential failed for unknown reason.");
        if ((e instanceof ApiException) && ((ApiException) e).getStatusCode() == 40201) {
            ref$ObjectRef.element = new ClearCredentialUnknownException("The restore credential internal service had a failure.");
        }
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onClearCredential$lambda$14$lambda$13;
                onClearCredential$lambda$14$lambda$13 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13(executor, credentialManagerCallback, ref$ObjectRef);
                return onClearCredential$lambda$14$lambda$13;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$14$lambda$13(Executor executor, final CredentialManagerCallback credentialManagerCallback, final Ref$ObjectRef ref$ObjectRef) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda15
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$14$lambda$13$lambda$12(CredentialManagerCallback.this, ref$ObjectRef);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$14$lambda$13$lambda$12(CredentialManagerCallback credentialManagerCallback, Ref$ObjectRef ref$ObjectRef) {
        credentialManagerCallback.onError(ref$ObjectRef.element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, ClearCredentialStateResponse clearCredentialStateResponse) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onClearCredential$lambda$17$lambda$16;
                onClearCredential$lambda$17$lambda$16 = CredentialProviderPlayServicesImpl.onClearCredential$lambda$17$lambda$16(executor, credentialManagerCallback);
                return onClearCredential$lambda$17$lambda$16;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onClearCredential$lambda$17$lambda$16(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                CredentialManagerCallback.this.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$19(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, ClearCredentialStateRequest clearCredentialStateRequest, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback credentialManagerCallback, Exception it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(clearCredentialStateRequest, cancellationSignal, executor, credentialManagerCallback);
    }

    public void onSignalCredentialState(SignalCredentialStateRequest request, Executor executor, CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProviderController.invokePlayServices$default(SignalCredentialStateController.Companion.getInstance(this.context), request, callback, executor, null, 8, null);
    }

    private final void runFallbackClearCredFlow(ClearCredentialStateRequest clearCredentialStateRequest, final CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Task signOut = Identity.getSignInClient(this.context).signOut();
        final Function1 function1 = new Function1() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit runFallbackClearCredFlow$lambda$22;
                runFallbackClearCredFlow$lambda$22 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22(cancellationSignal, executor, credentialManagerCallback, (Void) obj);
                return runFallbackClearCredFlow$lambda$22;
            }
        };
        signOut.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda17
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                Function1.this.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda18
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl.this, cancellationSignal, executor, credentialManagerCallback, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22(CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, Void r4) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit runFallbackClearCredFlow$lambda$22$lambda$21;
                runFallbackClearCredFlow$lambda$22$lambda$21 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$22$lambda$21(executor, credentialManagerCallback);
                return runFallbackClearCredFlow$lambda$22$lambda$21;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$22$lambda$21(Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                CredentialManagerCallback.this.onResult(null);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, final Executor executor, final CredentialManagerCallback credentialManagerCallback, final Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth_release(cancellationSignal, new Function0() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25;
                runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25 = CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(e, executor, credentialManagerCallback);
                return runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25(final Exception exc, Executor executor, final CredentialManagerCallback credentialManagerCallback) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.CredentialProviderPlayServicesImpl$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(CredentialManagerCallback.this, exc);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$27$lambda$26$lambda$25$lambda$24(CredentialManagerCallback credentialManagerCallback, Exception exc) {
        credentialManagerCallback.onError(new ClearCredentialUnknownException(exc.getMessage()));
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth_release(CancellationSignal cancellationSignal, Function0 callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth_release(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth_release(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth_release(GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            for (CredentialOption credentialOption : request.getCredentialOptions()) {
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth_release(GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            for (CredentialOption credentialOption : request.getCredentialOptions()) {
            }
            return false;
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth_release(GetCredentialRequest request) {
            Intrinsics.checkNotNullParameter(request, "request");
            for (CredentialOption credentialOption : request.getCredentialOptions()) {
            }
            return false;
        }
    }
}
