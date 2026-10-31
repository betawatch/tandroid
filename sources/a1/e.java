package a1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0.h b;

    public /* synthetic */ e(v0.h hVar, int i10) {
        this.a = i10;
        this.b = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.onResult(null);
                break;
            case 1:
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$5$lambda$4(this.b);
                break;
            case 2:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$3$lambda$2(this.b);
                break;
            case 3:
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$lambda$0(this.b);
                break;
            case 4:
                this.b.onResult(null);
                break;
            case 5:
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$7$lambda$6(this.b);
                break;
            case 6:
                this.b.onResult(null);
                break;
            case 7:
                this.b.g(new w0.h(2, "No provider data returned."));
                break;
            case 8:
                this.b.g(new w0.c(2, (CharSequence) null));
                break;
            case 9:
                this.b.g(new w0.c(2, (CharSequence) null));
                break;
            default:
                this.b.g(new w0.h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
        }
    }
}
