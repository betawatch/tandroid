package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                oc ocVar = this.b.a;
                c4 c4Var = ocVar.T0;
                c4Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                c4Var.invalidate();
                ocVar.h(true, true);
                ocVar.d0(true);
                ocVar.I0.a(false, true);
                ocVar.J0.b(true, true);
                ocVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ ib(jb jbVar, boolean z10, Runnable runnable) {
        this.b = jbVar;
        this.d = z10;
        this.c = runnable;
    }
}
