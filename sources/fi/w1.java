package fi;

import hi.ib;
import hi.nb;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.us0;
import org.telegram.ui.a31;
import org.telegram.ui.bx;
import org.telegram.ui.sv;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements t10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    @Override // org.telegram.messenger.t10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        sv svVar;
        org.telegram.ui.ActionBar.g2 g2Var;
        org.telegram.ui.ActionBar.r4 parentLayout;
        switch (this.a) {
            case 0:
                z3 z3Var = (z3) this.b;
                nb nbVar = (nb) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                f9 f9Var = z3Var.t0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    y3 y3Var = z3Var.w2;
                    if (y3Var == null || ((e9) y3Var.c) != null) {
                        e9 e9Var = (e9) y3Var.c;
                        e9Var.firstFrameRendered = false;
                        y3Var.a = false;
                        e9Var.setOnReadyListener(new y1(0, currentTimeMillis, runnable));
                        ((w8) z3Var.A1).g(false);
                        qh0 qh0Var = z3Var.j0;
                        if (qh0Var != null) {
                            qh0Var.setAnimation(z3Var.h1.u);
                        }
                        if (z3Var.B2 > 0 && l10.longValue() > z3Var.B2 - 1400) {
                            l10 = 0L;
                        }
                        z3Var.R0(l10.longValue(), true);
                        z3Var.E3 = false;
                        org.telegram.messenger.g0.h3(runnable, 400L);
                        if (bool.booleanValue()) {
                            z3Var.d1(false);
                            break;
                        }
                    } else {
                        ((w8) z3Var.A1).g(false);
                        z3Var.setActive(true);
                        z3Var.E3 = false;
                        z3Var.S0 = new ai.w0(1, runnable);
                        if (bool.booleanValue()) {
                            z3Var.d1(false);
                        }
                        org.telegram.messenger.g0.h3(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.g2 g2Var2 = f9Var.f;
                    if (g2Var2 != null && (parentLayout = g2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.g2 g2Var3 = (org.telegram.ui.ActionBar.g2) fragmentStack.get(size);
                            if (g2Var3 instanceof bx) {
                                bx bxVar = (bx) g2Var3;
                                bxVar.W3();
                                svVar = bxVar.F0;
                                r3 = svVar != null ? svVar.e(l11.longValue()) : null;
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.g2) arrayList.get(i7), false);
                                }
                                g2Var = f9Var.f;
                                if (g2Var != null) {
                                    g2Var.clearSheets();
                                }
                                f9Var.B();
                                z3Var.E3 = false;
                                if (svVar != null || !svVar.k(l11.longValue())) {
                                    nbVar.X(ib.c(r3));
                                    org.telegram.messenger.g0.h3(runnable, 400L);
                                    break;
                                } else {
                                    svVar.c0.add(new bi.s1(r3, svVar, l11, nbVar, runnable, 10));
                                    break;
                                }
                            } else {
                                arrayList.add(g2Var3);
                            }
                        }
                    }
                    svVar = null;
                    g2Var = f9Var.f;
                    if (g2Var != null) {
                    }
                    f9Var.B();
                    z3Var.E3 = false;
                    if (svVar != null) {
                    }
                    nbVar.X(ib.c(r3));
                    org.telegram.messenger.g0.h3(runnable, 400L);
                }
                break;
            case 1:
                us0 us0Var = (us0) this.b;
                org.telegram.ui.f0 f0Var = (org.telegram.ui.f0) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i10 = us0Var.d;
                mp.u1(i10).f4((ArrayList) obj2, true);
                mp.u1(i10).Z3((ArrayList) obj3, true);
                org.telegram.ui.Components.o5.g(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    fj fjVar = (fj) arrayList2.get(i11);
                    if (fjVar.z2() && fjVar.k.reactions != null) {
                        fjVar.S2 = true;
                    }
                    fjVar.K5(us0Var.x, true);
                    us0Var.n.add(fjVar);
                }
                us0Var.G(true);
                org.telegram.messenger.g0.h3(f0Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.v0 v0Var = (org.telegram.ui.Wallet.v0) this.b;
                org.telegram.ui.Wallet.z8 z8Var = (org.telegram.ui.Wallet.z8) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.s0 s0Var = (org.telegram.ui.Wallet.s0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && s0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.v0.P("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.p0 p0Var = new org.telegram.ui.Wallet.p0();
                    p0Var.c = bArr;
                    p0Var.b = s0Var.b();
                    p0Var.a = sendtransfer;
                    v0Var.c.q(i10.i(v0Var.a).e(), bArr, s0Var, new a31(v0Var, p0Var, z8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.v0.n("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    z8Var.a(null, str);
                    break;
                }
        }
    }
}
