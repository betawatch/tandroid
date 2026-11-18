package di;

import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ TwoStepVerificationActivity c;

    public /* synthetic */ g(t tVar, TwoStepVerificationActivity twoStepVerificationActivity, int i7) {
        this.a = i7;
        this.b = tVar;
        this.c = twoStepVerificationActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                t tVar = this.b;
                tVar.i0.setLoading(false);
                tVar.presentFragment(this.c);
                break;
            default:
                t tVar2 = this.b;
                tVar2.b0.setLoading(false);
                tVar2.presentFragment(this.c);
                break;
        }
    }
}
