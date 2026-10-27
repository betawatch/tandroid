package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class la implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ma b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ la(ma maVar, Runnable runnable, boolean z10) {
        this.b = maVar;
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
                sb sbVar = this.b.a;
                t3 t3Var = sbVar.T0;
                t3Var.a.t(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                t3Var.invalidate();
                sbVar.g(true, true);
                sbVar.c0(true);
                sbVar.I0.a(false, true);
                sbVar.J0.b(true, true);
                sbVar.h0(true, true);
                break;
        }
    }

    public /* synthetic */ la(ma maVar, boolean z10, Runnable runnable) {
        this.b = maVar;
        this.d = z10;
        this.c = runnable;
    }
}
