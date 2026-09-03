package a1;

import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import v0.i;
import w0.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i b;

    public /* synthetic */ b(i iVar, int i10) {
        this.a = i10;
        this.b = iVar;
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
                this.b.onError(new h("No provider data returned.", 2));
                break;
            case 8:
                this.b.onError(new w0.c((CharSequence) null, 2));
                break;
            case 9:
                this.b.onError(new w0.c((CharSequence) null, 2));
                break;
            default:
                this.b.onError(new h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                break;
        }
    }
}
