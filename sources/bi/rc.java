package bi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class rc implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ sc b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ rc(sc scVar, Runnable runnable, boolean z10) {
        this.b = scVar;
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
                ce ceVar = this.b.a;
                u4 u4Var = ceVar.T0;
                u4Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                u4Var.invalidate();
                ceVar.h(true, true);
                ceVar.d0(true);
                ceVar.I0.a(false, true);
                ceVar.J0.b(true, true);
                ceVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ rc(sc scVar, boolean z10, Runnable runnable) {
        this.b = scVar;
        this.d = z10;
        this.c = runnable;
    }
}
