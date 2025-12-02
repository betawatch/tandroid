package androidx.credentials;

import android.content.Context;
import android.credentials.CreateCredentialException;
import android.credentials.CreateCredentialRequest;
import android.credentials.CredentialOption;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import androidx.credentials.CreateCredentialResponse;
import androidx.credentials.Credential;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialUnsupportedException;
import androidx.credentials.internal.ConversionUtilsKt;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CredentialProviderFrameworkImpl implements CredentialProvider {
    private static final Companion Companion = new Companion(null);
    private final android.credentials.CredentialManager credentialManager;

    public CredentialProviderFrameworkImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.credentialManager = CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline8.m(context.getSystemService("credential"));
    }

    @Override // androidx.credentials.CredentialProvider
    public void onGetCredential(Context context, GetCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isCredmanDisabled(new Function0() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda25
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onGetCredential$lambda$2;
                onGetCredential$lambda$2 = CredentialProviderFrameworkImpl.onGetCredential$lambda$2(CredentialManagerCallback.this);
                return onGetCredential$lambda$2;
            }
        })) {
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onGetCredential$outcome$2
            @Override // android.os.OutcomeReceiver
            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(CredentialProviderFrameworkImpl$onGetCredential$outcome$2$$ExternalSyntheticApiModelOutline0.m(th));
            }

            @Override // android.os.OutcomeReceiver
            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(CredentialProviderFrameworkImpl$onGetCredential$outcome$2$$ExternalSyntheticApiModelOutline1.m(obj));
            }

            public void onResult(android.credentials.GetCredentialResponse response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Log.i("CredManProvService", "GetCredentialResponse returned from framework");
                CredentialManagerCallback.this.onResult(this.convertGetResponseToJetpackClass$credentials_release(response));
            }

            public void onError(GetCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
                CredentialManagerCallback.this.onError(this.convertToJetpackGetException$credentials_release(error));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.getCredential(context, convertGetRequestToFrameworkClass(request), cancellationSignal, executor, (OutcomeReceiver<android.credentials.GetCredentialResponse, GetCredentialException>) CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline6.m(outcomeReceiver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onGetCredential$lambda$2(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new GetCredentialUnsupportedException("Your device doesn't support credential manager"));
        return Unit.INSTANCE;
    }

    private final boolean isCredmanDisabled(Function0 function0) {
        if (this.credentialManager != null) {
            return false;
        }
        function0.invoke();
        return true;
    }

    @Override // androidx.credentials.CredentialProvider
    public void onCreateCredential(Context context, final CreateCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, final CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isCredmanDisabled(new Function0() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$$ExternalSyntheticLambda26
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit onCreateCredential$lambda$3;
                onCreateCredential$lambda$3 = CredentialProviderFrameworkImpl.onCreateCredential$lambda$3(CredentialManagerCallback.this);
                return onCreateCredential$lambda$3;
            }
        })) {
            return;
        }
        OutcomeReceiver outcomeReceiver = new OutcomeReceiver() { // from class: androidx.credentials.CredentialProviderFrameworkImpl$onCreateCredential$outcome$1
            @Override // android.os.OutcomeReceiver
            public /* bridge */ /* synthetic */ void onError(Throwable th) {
                onError(CredentialProviderFrameworkImpl$onCreateCredential$outcome$1$$ExternalSyntheticApiModelOutline0.m(th));
            }

            @Override // android.os.OutcomeReceiver
            public /* bridge */ /* synthetic */ void onResult(Object obj) {
                onResult(CredentialProviderFrameworkImpl$onCreateCredential$outcome$1$$ExternalSyntheticApiModelOutline1.m(obj));
            }

            public void onResult(android.credentials.CreateCredentialResponse response) {
                Bundle data;
                Intrinsics.checkNotNullParameter(response, "response");
                Log.i("CredManProvService", "Create Result returned from framework: ");
                CredentialManagerCallback credentialManagerCallback = CredentialManagerCallback.this;
                CreateCredentialResponse.Companion companion = CreateCredentialResponse.Companion;
                String type = request.getType();
                data = response.getData();
                Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
                credentialManagerCallback.onResult(companion.createFrom(type, data));
            }

            public void onError(CreateCredentialException error) {
                Intrinsics.checkNotNullParameter(error, "error");
                Log.i("CredManProvService", "CreateCredentialResponse error returned from framework");
                CredentialManagerCallback.this.onError(this.convertToJetpackCreateException$credentials_release(error));
            }
        };
        android.credentials.CredentialManager credentialManager = this.credentialManager;
        Intrinsics.checkNotNull(credentialManager);
        credentialManager.createCredential(context, convertCreateRequestToFrameworkClass(request, context), cancellationSignal, executor, CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline6.m(outcomeReceiver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreateCredential$lambda$3(CredentialManagerCallback credentialManagerCallback) {
        credentialManagerCallback.onError(new CreateCredentialUnsupportedException("Your device doesn't support credential manager"));
        return Unit.INSTANCE;
    }

    private final android.credentials.CreateCredentialRequest convertCreateRequestToFrameworkClass(CreateCredentialRequest createCredentialRequest, Context context) {
        CreateCredentialRequest.Builder isSystemProviderRequired;
        CreateCredentialRequest.Builder alwaysSendAppInfoToProvider;
        android.credentials.CreateCredentialRequest build;
        CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline5.m();
        isSystemProviderRequired = CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline4.m(createCredentialRequest.getType(), ConversionUtilsKt.getFinalCreateCredentialData(createCredentialRequest, context), createCredentialRequest.getCandidateQueryData()).setIsSystemProviderRequired(createCredentialRequest.isSystemProviderRequired());
        alwaysSendAppInfoToProvider = isSystemProviderRequired.setAlwaysSendAppInfoToProvider(true);
        Intrinsics.checkNotNullExpressionValue(alwaysSendAppInfoToProvider, "setAlwaysSendAppInfoToProvider(...)");
        setOriginForCreateRequest(createCredentialRequest, alwaysSendAppInfoToProvider);
        build = alwaysSendAppInfoToProvider.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void setOriginForCreateRequest(CreateCredentialRequest createCredentialRequest, CreateCredentialRequest.Builder builder) {
        if (createCredentialRequest.getOrigin() != null) {
            builder.setOrigin(createCredentialRequest.getOrigin());
        }
    }

    private final android.credentials.GetCredentialRequest convertGetRequestToFrameworkClass(GetCredentialRequest getCredentialRequest) {
        android.credentials.GetCredentialRequest build;
        CredentialOption.Builder isSystemProviderRequired;
        CredentialOption.Builder allowedProviders;
        android.credentials.CredentialOption build2;
        CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline2.m();
        GetCredentialRequest.Builder m = CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline0.m(GetCredentialRequest.Companion.getRequestMetadataBundle(getCredentialRequest));
        for (CredentialOption credentialOption : getCredentialRequest.getCredentialOptions()) {
            CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline3.m();
            isSystemProviderRequired = CredentialProviderFrameworkImpl$$ExternalSyntheticApiModelOutline1.m(credentialOption.getType(), credentialOption.getRequestData(), credentialOption.getCandidateQueryData()).setIsSystemProviderRequired(credentialOption.isSystemProviderRequired());
            allowedProviders = isSystemProviderRequired.setAllowedProviders(credentialOption.getAllowedProviders());
            build2 = allowedProviders.build();
            m.addCredentialOption(build2);
        }
        setOriginForGetRequest(getCredentialRequest, m);
        build = m.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final void setOriginForGetRequest(GetCredentialRequest getCredentialRequest, GetCredentialRequest.Builder builder) {
        if (getCredentialRequest.getOrigin() != null) {
            builder.setOrigin(getCredentialRequest.getOrigin());
        }
    }

    public final androidx.credentials.exceptions.GetCredentialException convertToJetpackGetException$credentials_release(GetCredentialException error) {
        String type;
        String message;
        Intrinsics.checkNotNullParameter(error, "error");
        type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        message = error.getMessage();
        return ConversionUtilsKt.toJetpackGetException(type, message);
    }

    public final androidx.credentials.exceptions.CreateCredentialException convertToJetpackCreateException$credentials_release(CreateCredentialException error) {
        String type;
        String message;
        Intrinsics.checkNotNullParameter(error, "error");
        type = error.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        message = error.getMessage();
        return ConversionUtilsKt.toJetpackCreateException(type, message);
    }

    public final GetCredentialResponse convertGetResponseToJetpackClass$credentials_release(android.credentials.GetCredentialResponse response) {
        android.credentials.Credential credential;
        String type;
        Bundle data;
        Intrinsics.checkNotNullParameter(response, "response");
        credential = response.getCredential();
        Intrinsics.checkNotNullExpressionValue(credential, "getCredential(...)");
        Credential.Companion companion = Credential.Companion;
        type = credential.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        data = credential.getData();
        Intrinsics.checkNotNullExpressionValue(data, "getData(...)");
        return new GetCredentialResponse(companion.createFrom(type, data));
    }

    @Override // androidx.credentials.CredentialProvider
    public boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.credentialManager != null;
    }

    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }
}
