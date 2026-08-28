package kh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class qa implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ra b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ qa(ra raVar, Runnable runnable, boolean z10) {
        this.b = raVar;
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
                wb wbVar = this.b.a;
                v3 v3Var = wbVar.P0;
                v3Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                v3Var.invalidate();
                wbVar.h(true, true);
                wbVar.d0(true);
                wbVar.E0.a(false, true);
                wbVar.F0.b(true, true);
                wbVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ qa(ra raVar, boolean z10, Runnable runnable) {
        this.b = raVar;
        this.d = z10;
        this.c = runnable;
    }
}
