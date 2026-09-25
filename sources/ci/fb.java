package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class fb implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ gb b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ fb(gb gbVar, Runnable runnable, boolean z10) {
        this.b = gbVar;
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
                lc lcVar = this.b.a;
                b4 b4Var = lcVar.T0;
                b4Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                b4Var.invalidate();
                lcVar.h(true, true);
                lcVar.d0(true);
                lcVar.I0.a(false, true);
                lcVar.J0.b(true, true);
                lcVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ fb(gb gbVar, boolean z10, Runnable runnable) {
        this.b = gbVar;
        this.d = z10;
        this.c = runnable;
    }
}
