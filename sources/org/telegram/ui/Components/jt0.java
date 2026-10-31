package org.telegram.ui.Components;

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt0 implements org.telegram.messenger.n20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jt0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // org.telegram.messenger.n20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        org.telegram.ui.uw uwVar;
        org.telegram.ui.ActionBar.k2 k2Var;
        org.telegram.ui.ActionBar.z4 parentLayout;
        switch (this.a) {
            case 0:
                lt0 lt0Var = (lt0) this.b;
                ji0 ji0Var = (ji0) this.c;
                ArrayList arrayList = (ArrayList) obj;
                int i10 = lt0Var.d;
                org.telegram.messenger.vp.r1(i10).V3((ArrayList) obj2, true);
                org.telegram.messenger.vp.r1(i10).P3((ArrayList) obj3, true);
                f5.g(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i11);
                    if (jjVar.z2() && jjVar.k.reactions != null) {
                        jjVar.N2 = true;
                    }
                    jjVar.J5(lt0Var.x, true);
                    lt0Var.n.add(jjVar);
                }
                lt0Var.G(true);
                org.telegram.messenger.i0.h3(ji0Var, 540L);
                break;
            case 1:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.b;
                org.telegram.ui.Wallet.m8 m8Var = (org.telegram.ui.Wallet.m8) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && h0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.k0.H("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.f0 f0Var = new org.telegram.ui.Wallet.f0();
                    f0Var.c = bArr;
                    f0Var.b = h0Var.b();
                    f0Var.a = sendtransfer;
                    k0Var.c.p(org.telegram.messenger.d20.i(k0Var.a).e(), bArr, h0Var, new org.telegram.ui.f11(k0Var, f0Var, m8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.k0.j("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    m8Var.a(null, str);
                    break;
                }
            default:
                th.z2 z2Var = (th.z2) this.b;
                vh.o8 o8Var = (vh.o8) this.c;
                Long l4 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l10 = (Long) obj4;
                th.o7 o7Var = z2Var.s0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    k2.t0 t0Var = z2Var.v2;
                    if (t0Var == null || ((th.n7) t0Var.c) != null) {
                        th.n7 n7Var = (th.n7) t0Var.c;
                        n7Var.firstFrameRendered = false;
                        t0Var.b = false;
                        n7Var.setOnReadyListener(new th.o1(0, currentTimeMillis, runnable));
                        ((th.f7) z2Var.z1).g(false);
                        ei0 ei0Var = z2Var.i0;
                        if (ei0Var != null) {
                            ei0Var.setAnimation(z2Var.g1.u);
                        }
                        if (z2Var.A2 > 0 && l4.longValue() > z2Var.A2 - 1400) {
                            l4 = 0L;
                        }
                        z2Var.R0(l4.longValue(), true);
                        z2Var.D3 = false;
                        org.telegram.messenger.i0.h3(runnable, 400L);
                        if (bool.booleanValue()) {
                            z2Var.d1(false);
                            break;
                        }
                    } else {
                        ((th.f7) z2Var.z1).g(false);
                        z2Var.setActive(true);
                        z2Var.D3 = false;
                        z2Var.R0 = new lg.b(2, runnable);
                        if (bool.booleanValue()) {
                            z2Var.d1(false);
                        }
                        org.telegram.messenger.i0.h3(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.k2 k2Var2 = o7Var.f;
                    if (k2Var2 != null && (parentLayout = k2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList2 = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) fragmentStack.get(size);
                            if (k2Var3 instanceof org.telegram.ui.ay) {
                                org.telegram.ui.ay ayVar = (org.telegram.ui.ay) k2Var3;
                                ayVar.V3();
                                uwVar = ayVar.E0;
                                r3 = uwVar != null ? uwVar.e(l10.longValue()) : null;
                                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                                    ((ActionBarLayout) parentLayout).c0((org.telegram.ui.ActionBar.k2) arrayList2.get(i12), false);
                                }
                                k2Var = o7Var.f;
                                if (k2Var != null) {
                                    k2Var.clearSheets();
                                }
                                o7Var.J();
                                z2Var.D3 = false;
                                if (uwVar != null || !uwVar.k(l10.longValue())) {
                                    o8Var.X(vh.j8.c(r3));
                                    org.telegram.messenger.i0.h3(runnable, 400L);
                                    break;
                                } else {
                                    uwVar.b0.add(new rh.r4(r3, uwVar, l10, o8Var, runnable, 7));
                                    break;
                                }
                            } else {
                                arrayList2.add(k2Var3);
                            }
                        }
                    }
                    uwVar = null;
                    k2Var = o7Var.f;
                    if (k2Var != null) {
                    }
                    o7Var.J();
                    z2Var.D3 = false;
                    if (uwVar != null) {
                    }
                    o8Var.X(vh.j8.c(r3));
                    org.telegram.messenger.i0.h3(runnable, 400L);
                }
                break;
        }
    }
}
