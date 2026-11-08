package di;

import fi.qa;
import fi.va;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.pv;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b2 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b2(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    @Override // org.telegram.messenger.z10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        pv pvVar;
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.ActionBar.q4 parentLayout;
        switch (this.a) {
            case 0:
                i4 i4Var = (i4) this.b;
                va vaVar = (va) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                p9 p9Var = i4Var.s0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    h4 h4Var = i4Var.v2;
                    if (h4Var == null || ((o9) h4Var.c) != null) {
                        o9 o9Var = (o9) h4Var.c;
                        o9Var.firstFrameRendered = false;
                        h4Var.a = false;
                        o9Var.setOnReadyListener(new e2(0, currentTimeMillis, runnable));
                        ((g9) i4Var.z1).g(false);
                        ch0 ch0Var = i4Var.i0;
                        if (ch0Var != null) {
                            ch0Var.setAnimation(i4Var.g1.u);
                        }
                        if (i4Var.A2 > 0 && l10.longValue() > i4Var.A2 - 1400) {
                            l10 = 0L;
                        }
                        i4Var.R0(l10.longValue(), true);
                        i4Var.D3 = false;
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        if (bool.booleanValue()) {
                            i4Var.d1(false);
                            break;
                        }
                    } else {
                        ((g9) i4Var.z1).g(false);
                        i4Var.setActive(true);
                        i4Var.D3 = false;
                        i4Var.R0 = new d2(0, runnable);
                        if (bool.booleanValue()) {
                            i4Var.d1(false);
                        }
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.f2 f2Var2 = p9Var.f;
                    if (f2Var2 != null && (parentLayout = f2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) fragmentStack.get(size);
                            if (f2Var3 instanceof ww) {
                                ww wwVar = (ww) f2Var3;
                                wwVar.W3();
                                pvVar = wwVar.E0;
                                r3 = pvVar != null ? pvVar.e(l11.longValue()) : null;
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.f2) arrayList.get(i7), false);
                                }
                                f2Var = p9Var.f;
                                if (f2Var != null) {
                                    f2Var.clearSheets();
                                }
                                p9Var.B();
                                i4Var.D3 = false;
                                if (pvVar != null || !pvVar.k(l11.longValue())) {
                                    vaVar.X(qa.c(r3));
                                    org.telegram.messenger.g0.i3(runnable, 400L);
                                    break;
                                } else {
                                    pvVar.b0.add(new bi.u0(r3, pvVar, l11, vaVar, runnable, 8));
                                    break;
                                }
                            } else {
                                arrayList.add(f2Var3);
                            }
                        }
                    }
                    pvVar = null;
                    f2Var = p9Var.f;
                    if (f2Var != null) {
                    }
                    p9Var.B();
                    i4Var.D3 = false;
                    if (pvVar != null) {
                    }
                    vaVar.X(qa.c(r3));
                    org.telegram.messenger.g0.i3(runnable, 400L);
                }
                break;
            case 1:
                js0 js0Var = (js0) this.b;
                org.telegram.ui.q8 q8Var = (org.telegram.ui.q8) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i10 = js0Var.d;
                qp.s1(i10).Y3((ArrayList) obj2, true);
                qp.s1(i10).S3((ArrayList) obj3, true);
                org.telegram.ui.Components.i5.g(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ij ijVar = (ij) arrayList2.get(i11);
                    if (ijVar.A2() && ijVar.k.reactions != null) {
                        ijVar.Q2 = true;
                    }
                    ijVar.L5(js0Var.x, true);
                    js0Var.n.add(ijVar);
                }
                js0Var.G(true);
                org.telegram.messenger.g0.i3(q8Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.b;
                org.telegram.ui.Wallet.g8 g8Var = (org.telegram.ui.Wallet.g8) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && j0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.m0.H("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.h0 h0Var = new org.telegram.ui.Wallet.h0();
                    h0Var.c = bArr;
                    h0Var.b = j0Var.b();
                    h0Var.a = sendtransfer;
                    m0Var.c.p(p10.i(m0Var.a).e(), bArr, j0Var, new org.telegram.ui.Wallet.t(m0Var, h0Var, g8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.m0.j("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    g8Var.a(null, str);
                    break;
                }
        }
    }
}
