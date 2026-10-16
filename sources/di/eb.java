package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class eb implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ fb b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ eb(fb fbVar, Runnable runnable, boolean z10) {
        this.b = fbVar;
        this.c = runnable;
        this.d = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c, this.d);
                break;
            default:
                this.c.run();
                kc kcVar = this.b.a;
                a4 a4Var = kcVar.T0;
                a4Var.a.t(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                a4Var.invalidate();
                kcVar.g(true, true);
                kcVar.c0(true);
                kcVar.I0.a(false, true);
                kcVar.J0.b(true, true);
                kcVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ eb(fb fbVar, boolean z10, Runnable runnable) {
        this.b = fbVar;
        this.d = z10;
        this.c = runnable;
    }
}
