package fi;

import hi.oa;
import hi.ta;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.cx;
import org.telegram.ui.p51;
import org.telegram.ui.tv;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    @Override // org.telegram.messenger.u10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        tv tvVar;
        org.telegram.ui.ActionBar.h2 h2Var;
        org.telegram.ui.ActionBar.s4 parentLayout;
        switch (this.a) {
            case 0:
                z3 z3Var = (z3) this.b;
                ta taVar = (ta) this.c;
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
                        ph0 ph0Var = z3Var.j0;
                        if (ph0Var != null) {
                            ph0Var.setAnimation(z3Var.h1.u);
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
                        z3Var.S0 = new ai.z0(1, runnable);
                        if (bool.booleanValue()) {
                            z3Var.d1(false);
                        }
                        org.telegram.messenger.g0.h3(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.h2 h2Var2 = f9Var.f;
                    if (h2Var2 != null && (parentLayout = h2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.h2 h2Var3 = (org.telegram.ui.ActionBar.h2) fragmentStack.get(size);
                            if (h2Var3 instanceof cx) {
                                cx cxVar = (cx) h2Var3;
                                cxVar.W3();
                                tvVar = cxVar.F0;
                                r3 = tvVar != null ? tvVar.e(l11.longValue()) : null;
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.h2) arrayList.get(i7), false);
                                }
                                h2Var = f9Var.f;
                                if (h2Var != null) {
                                    h2Var.clearSheets();
                                }
                                f9Var.B();
                                z3Var.E3 = false;
                                if (tvVar != null || !tvVar.k(l11.longValue())) {
                                    taVar.X(oa.c(r3));
                                    org.telegram.messenger.g0.h3(runnable, 400L);
                                    break;
                                } else {
                                    tvVar.c0.add(new ai.b(r3, tvVar, l11, taVar, runnable, 11));
                                    break;
                                }
                            } else {
                                arrayList.add(h2Var3);
                            }
                        }
                    }
                    tvVar = null;
                    h2Var = f9Var.f;
                    if (h2Var != null) {
                    }
                    f9Var.B();
                    z3Var.E3 = false;
                    if (tvVar != null) {
                    }
                    taVar.X(oa.c(r3));
                    org.telegram.messenger.g0.h3(runnable, 400L);
                }
                break;
            case 1:
                ss0 ss0Var = (ss0) this.b;
                org.telegram.ui.b0 b0Var = (org.telegram.ui.b0) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i10 = ss0Var.d;
                mp.u1(i10).f4((ArrayList) obj2, true);
                mp.u1(i10).Z3((ArrayList) obj3, true);
                org.telegram.ui.Components.o5.g(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    fj fjVar = (fj) arrayList2.get(i11);
                    if (fjVar.z2() && fjVar.k.reactions != null) {
                        fjVar.S2 = true;
                    }
                    fjVar.K5(ss0Var.x, true);
                    ss0Var.n.add(fjVar);
                }
                ss0Var.G(true);
                org.telegram.messenger.g0.h3(b0Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.u0 u0Var = (org.telegram.ui.Wallet.u0) this.b;
                org.telegram.ui.Wallet.y8 y8Var = (org.telegram.ui.Wallet.y8) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.r0 r0Var = (org.telegram.ui.Wallet.r0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && r0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.u0.P("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.o0 o0Var = new org.telegram.ui.Wallet.o0();
                    o0Var.c = bArr;
                    o0Var.b = r0Var.b();
                    o0Var.a = sendtransfer;
                    u0Var.c.q(j10.i(u0Var.a).e(), bArr, r0Var, new p51(u0Var, o0Var, y8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.u0.n("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    y8Var.a(null, str);
                    break;
                }
        }
    }
}
