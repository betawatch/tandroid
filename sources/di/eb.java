package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
