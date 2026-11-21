package ch;

import c8.ma;
import org.telegram.messenger.gd;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s b;

    public /* synthetic */ q(s sVar, int i7) {
        this.a = i7;
        this.b = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c(true);
                break;
            default:
                s sVar = this.b;
                sVar.e = sVar.b();
                int i7 = sVar.f;
                int i10 = sVar.h;
                bn bnVar = sVar.a;
                if (sVar.b == null) {
                    r rVar = new r((bnVar.getUserConfig().e() > bnVar.a() ? 1 : (bnVar.getUserConfig().e() == bnVar.a() ? 0 : -1)) == 0 ? 3 : 0, bnVar.getCurrentAccount(), sVar.getContext(), sVar.a, bnVar.getResourceProvider());
                    rVar.n1 = 1.0f;
                    rVar.setWillNotDraw(false);
                    sVar.b = rVar;
                    int L = org.telegram.messenger.g0.L(4.0f) + (gd.a0 ? 0 : i10);
                    int L2 = org.telegram.messenger.g0.L(4.0f);
                    int L3 = org.telegram.messenger.g0.L(4.0f);
                    if (!gd.a0) {
                        i10 = 0;
                    }
                    rVar.setPadding(L, L2, L3 + i10, org.telegram.messenger.g0.L(i7));
                    sVar.b.setDelegate(new ob.c(sVar, 10));
                    sVar.b.setClipChildren(false);
                    sVar.b.setClipToPadding(false);
                    sVar.addView(sVar.b, ma.e(-2, i7 + 70, 5));
                }
                sVar.c(false);
                if (!sVar.b.isEnabled()) {
                    sVar.y = false;
                    sVar.b.setTransitionProgress(1.0f);
                    break;
                } else {
                    sVar.y = true;
                    sVar.b.p(sVar.e, bnVar.r8, true);
                    sVar.b.r(false);
                    break;
                }
        }
    }
}
