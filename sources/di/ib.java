package di;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
