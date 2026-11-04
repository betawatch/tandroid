package dh;

import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ p(r rVar, int i3) {
        this.a = i3;
        this.b = rVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                r rVar = this.b;
                rVar.e = rVar.b();
                int i3 = rVar.f;
                int i10 = rVar.h;
                wm wmVar = rVar.a;
                if (rVar.b == null) {
                    q qVar = new q((wmVar.getUserConfig().e() > wmVar.a() ? 1 : (wmVar.getUserConfig().e() == wmVar.a() ? 0 : -1)) == 0 ? 3 : 0, wmVar.getCurrentAccount(), rVar.getContext(), rVar.a, wmVar.getResourceProvider());
                    qVar.n1 = 1.0f;
                    qVar.setWillNotDraw(false);
                    rVar.b = qVar;
                    int L = org.telegram.messenger.g0.L(4.0f) + (bd.a0 ? 0 : i10);
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!bd.a0) {
                        i10 = 0;
                    }
                    qVar.setPadding(L, L2, L3 + i10, org.telegram.messenger.g0.L(i3));
                    rVar.b.setDelegate(new android.support.v4.media.c(rVar, 16));
                    rVar.b.setClipChildren(false);
                    rVar.b.setClipToPadding(false);
                    rVar.addView(rVar.b, mf.e(-2, i3 + 70, 5));
                }
                rVar.c(false);
                if (!rVar.b.isEnabled()) {
                    rVar.y = false;
                    rVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    rVar.y = true;
                    rVar.b.p(rVar.e, wmVar.q8, true);
                    rVar.b.r(false);
                    break;
                }
        }
    }
}
