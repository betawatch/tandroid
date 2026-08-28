package gh;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ d(r rVar, TwoStepVerificationActivity twoStepVerificationActivity, int i9) {
        this.a = i9;
        this.b = rVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                r rVar = this.b;
                rVar.U.setLoading(false);
                rVar.presentFragment(this.c);
                break;
            default:
                r rVar2 = this.b;
                rVar2.N.setLoading(false);
                rVar2.presentFragment(this.c);
                break;
        }
    }
}
