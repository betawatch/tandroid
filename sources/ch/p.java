package ch;

import c8.ha;
import org.telegram.messenger.hd;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;

    public /* synthetic */ p(r rVar, int i7) {
        this.a = i7;
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
                int i7 = rVar.f;
                int i10 = rVar.h;
                an anVar = rVar.a;
                if (rVar.b == null) {
                    q qVar = new q((anVar.getUserConfig().e() > anVar.a() ? 1 : (anVar.getUserConfig().e() == anVar.a() ? 0 : -1)) == 0 ? 3 : 0, anVar.getCurrentAccount(), rVar.getContext(), rVar.a, anVar.getResourceProvider());
                    qVar.m1 = 1.0f;
                    qVar.setWillNotDraw(false);
                    rVar.b = qVar;
                    int L = org.telegram.messenger.g0.L(4.0f) + (hd.a0 ? 0 : i10);
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!hd.a0) {
                        i10 = 0;
                    }
                    qVar.setPadding(L, L2, L3 + i10, org.telegram.messenger.g0.L(i7));
                    rVar.b.setDelegate(new d6.i(rVar, 13));
                    rVar.b.setClipChildren(false);
                    rVar.b.setClipToPadding(false);
                    rVar.addView(rVar.b, ha.e(-2, i7 + 70, 5));
                }
                rVar.c(false);
                if (!rVar.b.isEnabled()) {
                    rVar.y = false;
                    rVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    rVar.y = true;
                    rVar.b.p(rVar.e, anVar.p8, true);
                    rVar.b.r(false);
                    break;
                }
        }
    }
}
