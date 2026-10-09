package ci;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                this.b.g(this.c, this.d);
                break;
            default:
                this.c.run();
                lc lcVar = this.b.a;
                a4 a4Var = lcVar.T0;
                a4Var.a.t(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                a4Var.invalidate();
                lcVar.g(true, true);
                lcVar.c0(true);
                lcVar.I0.a(false, true);
                lcVar.J0.b(true, true);
                lcVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ fb(gb gbVar, boolean z10, Runnable runnable) {
        this.b = gbVar;
        this.d = z10;
        this.c = runnable;
    }
}
