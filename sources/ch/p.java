package ch;

import c8.ha;
import org.telegram.messenger.id;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                cn cnVar = rVar.a;
                if (rVar.b == null) {
                    q qVar = new q((cnVar.getUserConfig().e() > cnVar.a() ? 1 : (cnVar.getUserConfig().e() == cnVar.a() ? 0 : -1)) == 0 ? 3 : 0, cnVar.getCurrentAccount(), rVar.getContext(), rVar.a, cnVar.getResourceProvider());
                    qVar.m1 = 1.0f;
                    qVar.setWillNotDraw(false);
                    rVar.b = qVar;
                    int L = org.telegram.messenger.g0.L(4.0f) + (id.a0 ? 0 : i10);
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!id.a0) {
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
                    rVar.b.p(rVar.e, cnVar.p8, true);
                    rVar.b.r(false);
                    break;
                }
        }
    }
}
