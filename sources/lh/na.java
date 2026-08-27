package lh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class na implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ oa b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ na(oa oaVar, Runnable runnable, boolean z10) {
        this.b = oaVar;
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
                sb sbVar = this.b.a;
                u3 u3Var = sbVar.P0;
                u3Var.a.q(LocaleController.getString(this.d ? R.string.StoryHintSwipeToZoom : R.string.StoryHintPinchToZoom), false, true);
                u3Var.invalidate();
                sbVar.h(true, true);
                sbVar.d0(true);
                sbVar.E0.a(false, true);
                sbVar.F0.b(true, true);
                sbVar.i0(true, true);
                break;
        }
    }

    public /* synthetic */ na(oa oaVar, boolean z10, Runnable runnable) {
        this.b = oaVar;
        this.d = z10;
        this.c = runnable;
    }
}
