package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                this.b.f(this.c, this.d);
                break;
            default:
                this.c.run();
                kc kcVar = this.b.a;
                b4 b4Var = kcVar.T0;
                b4Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                b4Var.invalidate();
                kcVar.h(true, true);
                kcVar.d0(true);
                kcVar.I0.a(false, true);
                kcVar.J0.b(true, true);
                kcVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ eb(fb fbVar, boolean z10, Runnable runnable) {
        this.b = fbVar;
        this.d = z10;
        this.c = runnable;
    }
}
