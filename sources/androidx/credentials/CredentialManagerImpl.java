package androidx.credentials;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.CredentialManager;
import androidx.credentials.exceptions.CreateCredentialProviderConfigurationException;
import androidx.credentials.exceptions.CreateCredentialUnsupportedException;
import androidx.credentials.exceptions.GetCredentialProviderConfigurationException;
import androidx.credentials.internal.FormFactorHelper;
import java.util.concurrent.Executor;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class CredentialManagerImpl implements CredentialManager {
    public static final Companion Companion = new Companion(null);
    private final Context context;

    @Override // androidx.credentials.CredentialManager
    public /* synthetic */ Object createCredential(Context context, CreateCredentialRequest createCredentialRequest, Continuation continuation) {
        Object createCredential$suspendImpl;
        createCredential$suspendImpl = CredentialManager.-CC.createCredential$suspendImpl(this, context, createCredentialRequest, continuation);
        return createCredential$suspendImpl;
    }

    public CredentialManagerImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void getCredentialAsync(Context context, GetCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(context), request, false, 2, null);
        if (bestAvailableProvider$default == null) {
            callback.onError(new GetCredentialProviderConfigurationException("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else {
            bestAvailableProvider$default.onGetCredential(context, request, cancellationSignal, executor, callback);
        }
    }

    @Override // androidx.credentials.CredentialManager
    public void createCredentialAsync(Context context, CreateCredentialRequest request, CancellationSignal cancellationSignal, Executor executor, CredentialManagerCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(callback, "callback");
        CredentialProvider bestAvailableProvider$default = CredentialProviderFactory.getBestAvailableProvider$default(new CredentialProviderFactory(this.context), request, false, 2, null);
        if (bestAvailableProvider$default == null) {
            callback.onError(new CreateCredentialProviderConfigurationException("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
        } else if (FormFactorHelper.isWear(context)) {
            callback.onError(new CreateCredentialUnsupportedException("createCredential is not supported on this device"));
        } else {
            bestAvailableProvider$default.onCreateCredential(context, request, cancellationSignal, executor, callback);
        }
    }
}
