package nh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ba implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ca b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ ba(ca caVar, Runnable runnable, boolean z10) {
        this.b = caVar;
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
                gb gbVar = this.b.a;
                s3 s3Var = gbVar.P0;
                s3Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                s3Var.invalidate();
                gbVar.h(true, true);
                gbVar.d0(true);
                gbVar.E0.a(false, true);
                gbVar.F0.b(true, true);
                gbVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ ba(ca caVar, boolean z10, Runnable runnable) {
        this.b = caVar;
        this.d = z10;
        this.c = runnable;
    }
}
