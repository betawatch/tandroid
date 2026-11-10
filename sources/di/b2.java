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
import org.telegram.ui.Components.ks0;
import org.telegram.ui.sv;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        sv svVar;
        org.telegram.ui.ActionBar.f2 f2Var;
        org.telegram.ui.ActionBar.r4 parentLayout;
        switch (this.a) {
            case 0:
                j4 j4Var = (j4) this.b;
                va vaVar = (va) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                q9 q9Var = j4Var.s0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    i4 i4Var = j4Var.v2;
                    if (i4Var == null || ((p9) i4Var.c) != null) {
                        p9 p9Var = (p9) i4Var.c;
                        p9Var.firstFrameRendered = false;
                        i4Var.a = false;
                        p9Var.setOnReadyListener(new e2(0, currentTimeMillis, runnable));
                        ((h9) j4Var.z1).g(false);
                        ch0 ch0Var = j4Var.i0;
                        if (ch0Var != null) {
                            ch0Var.setAnimation(j4Var.g1.u);
                        }
                        if (j4Var.A2 > 0 && l10.longValue() > j4Var.A2 - 1400) {
                            l10 = 0L;
                        }
                        j4Var.R0(l10.longValue(), true);
                        j4Var.D3 = false;
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        if (bool.booleanValue()) {
                            j4Var.d1(false);
                            break;
                        }
                    } else {
                        ((h9) j4Var.z1).g(false);
                        j4Var.setActive(true);
                        j4Var.D3 = false;
                        j4Var.R0 = new d2(0, runnable);
                        if (bool.booleanValue()) {
                            j4Var.d1(false);
                        }
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.f2 f2Var2 = q9Var.f;
                    if (f2Var2 != null && (parentLayout = f2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) fragmentStack.get(size);
                            if (f2Var3 instanceof zw) {
                                zw zwVar = (zw) f2Var3;
                                zwVar.W3();
                                svVar = zwVar.E0;
                                r3 = svVar != null ? svVar.e(l11.longValue()) : null;
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.f2) arrayList.get(i7), false);
                                }
                                f2Var = q9Var.f;
                                if (f2Var != null) {
                                    f2Var.clearSheets();
                                }
                                q9Var.B();
                                j4Var.D3 = false;
                                if (svVar != null || !svVar.k(l11.longValue())) {
                                    vaVar.X(qa.c(r3));
                                    org.telegram.messenger.g0.i3(runnable, 400L);
                                    break;
                                } else {
                                    svVar.b0.add(new bi.u0(r3, svVar, l11, vaVar, runnable, 8));
                                    break;
                                }
                            } else {
                                arrayList.add(f2Var3);
                            }
                        }
                    }
                    svVar = null;
                    f2Var = q9Var.f;
                    if (f2Var != null) {
                    }
                    q9Var.B();
                    j4Var.D3 = false;
                    if (svVar != null) {
                    }
                    vaVar.X(qa.c(r3));
                    org.telegram.messenger.g0.i3(runnable, 400L);
                }
                break;
            case 1:
                ks0 ks0Var = (ks0) this.b;
                org.telegram.ui.q8 q8Var = (org.telegram.ui.q8) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i10 = ks0Var.d;
                qp.s1(i10).Y3((ArrayList) obj2, true);
                qp.s1(i10).S3((ArrayList) obj3, true);
                org.telegram.ui.Components.h5.g(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    ij ijVar = (ij) arrayList2.get(i11);
                    if (ijVar.z2() && ijVar.k.reactions != null) {
                        ijVar.Q2 = true;
                    }
                    ijVar.K5(ks0Var.x, true);
                    ks0Var.n.add(ijVar);
                }
                ks0Var.G(true);
                org.telegram.messenger.g0.i3(q8Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.c;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && i0Var != null && bArr != null) {
                    org.telegram.ui.Wallet.l0.H("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    org.telegram.ui.Wallet.g0 g0Var = new org.telegram.ui.Wallet.g0();
                    g0Var.c = bArr;
                    g0Var.b = i0Var.b();
                    g0Var.a = sendtransfer;
                    l0Var.c.p(p10.i(l0Var.a).e(), bArr, i0Var, new org.telegram.ui.Wallet.s(l0Var, g0Var, i8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.l0.j("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    i8Var.a(null, str);
                    break;
                }
        }
    }
}
