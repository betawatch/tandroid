package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class ib implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ jb b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ib(jb jbVar, Runnable runnable, boolean z10) {
        this.b = jbVar;
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
                pc pcVar = this.b.a;
                c4 c4Var = pcVar.T0;
                c4Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                c4Var.invalidate();
                pcVar.h(true, true);
                pcVar.d0(true);
                pcVar.I0.a(false, true);
                pcVar.J0.b(true, true);
                pcVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ ib(jb jbVar, boolean z10, Runnable runnable) {
        this.b = jbVar;
        this.d = z10;
        this.c = runnable;
    }
}
