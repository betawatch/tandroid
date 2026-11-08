package a1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import w0.h;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0.g b;

    public /* synthetic */ b(v0.g gVar, int i7) {
        this.a = i7;
        this.b = gVar;
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
                this.b.a(new h(2, "No provider data returned."));
                break;
            case 8:
                this.b.a(new w0.c(2, (CharSequence) null));
                break;
            case 9:
                this.b.a(new w0.c(2, (CharSequence) null));
                break;
            default:
                this.b.a(new h(2, "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context."));
                break;
        }
    }
}
