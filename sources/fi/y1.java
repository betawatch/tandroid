package fi;

import hi.na;
import hi.sa;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.qv;
import org.telegram.ui.x21;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class y1 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0145  */
    @Override // org.telegram.messenger.w10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        qv qvVar;
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.ActionBar.o4 parentLayout;
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.b;
                sa saVar = (sa) this.c;
                Long l10 = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l11 = (Long) obj4;
                i9 i9Var = b4Var.t0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    a4 a4Var = b4Var.w2;
                    if (a4Var == null || ((h9) a4Var.c) != null) {
                        h9 h9Var = (h9) a4Var.c;
                        h9Var.firstFrameRendered = false;
                        a4Var.a = false;
                        h9Var.setOnReadyListener(new a2(0, currentTimeMillis, runnable));
                        ((z8) b4Var.A1).g(false);
                        fh0 fh0Var = b4Var.j0;
                        if (fh0Var != null) {
                            fh0Var.setAnimation(b4Var.h1.u);
                        }
                        if (b4Var.B2 > 0 && l10.longValue() > b4Var.B2 - 1400) {
                            l10 = 0L;
                        }
                        b4Var.R0(l10.longValue(), true);
                        b4Var.E3 = false;
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        if (bool.booleanValue()) {
                            b4Var.d1(false);
                            break;
                        }
                    } else {
                        ((z8) b4Var.A1).g(false);
                        b4Var.setActive(true);
                        b4Var.E3 = false;
                        b4Var.S0 = new ai.z0(1, runnable);
                        if (bool.booleanValue()) {
                            b4Var.d1(false);
                        }
                        org.telegram.messenger.g0.i3(runnable, 400L);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.e2 e2Var2 = i9Var.f;
                    if (e2Var2 != null && (parentLayout = e2Var2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            org.telegram.ui.ActionBar.e2 e2Var3 = (org.telegram.ui.ActionBar.e2) fragmentStack.get(size);
                            if (e2Var3 instanceof yw) {
                                yw ywVar = (yw) e2Var3;
                                ywVar.W3();
                                qvVar = ywVar.F0;
                                r3 = qvVar != null ? qvVar.e(l11.longValue()) : null;
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    ((ActionBarLayout) parentLayout).d0((org.telegram.ui.ActionBar.e2) arrayList.get(i7), false);
                                }
                                e2Var = i9Var.f;
                                if (e2Var != null) {
                                    e2Var.clearSheets();
                                }
                                i9Var.B();
                                b4Var.E3 = false;
                                if (qvVar != null || !qvVar.k(l11.longValue())) {
                                    saVar.X(na.c(r3));
                                    org.telegram.messenger.g0.i3(runnable, 400L);
                                    break;
                                } else {
                                    qvVar.c0.add(new ai.b(r3, qvVar, l11, saVar, runnable, 10));
                                    break;
                                }
                            } else {
                                arrayList.add(e2Var3);
                            }
                        }
                    }
                    qvVar = null;
                    e2Var = i9Var.f;
                    if (e2Var != null) {
                    }
                    i9Var.B();
                    b4Var.E3 = false;
                    if (qvVar != null) {
                    }
                    saVar.X(na.c(r3));
                    org.telegram.messenger.g0.i3(runnable, 400L);
                }
                break;
            case 1:
                ks0 ks0Var = (ks0) this.b;
                org.telegram.ui.f0 f0Var = (org.telegram.ui.f0) this.c;
                ArrayList arrayList2 = (ArrayList) obj;
                int i10 = ks0Var.d;
                np.s1(i10).Y3((ArrayList) obj2, true);
                np.s1(i10).S3((ArrayList) obj3, true);
                org.telegram.ui.Components.g5.g(i10).d((ArrayList) obj4);
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    gj gjVar = (gj) arrayList2.get(i11);
                    if (gjVar.z2() && gjVar.k.reactions != null) {
                        gjVar.S2 = true;
                    }
                    gjVar.K5(ks0Var.x, true);
                    ks0Var.n.add(gjVar);
                }
                ks0Var.G(true);
                org.telegram.messenger.g0.i3(f0Var, 540L);
                break;
            default:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.b;
                org.telegram.ui.Wallet.h8 h8Var = (org.telegram.ui.Wallet.h8) this.c;
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
                    l0Var.c.p(m10.i(l0Var.a).e(), bArr, i0Var, new x21(l0Var, g0Var, h8Var));
                    break;
                } else {
                    org.telegram.ui.Wallet.l0.j("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    h8Var.a(null, str);
                    break;
                }
        }
    }
}
