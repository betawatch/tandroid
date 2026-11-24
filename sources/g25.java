// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class g25 implements nac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g25(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    @Override // nac
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        hh3 hh3Var;
        aj3 aj3Var;
        d dVar;
        tk5 parentLayout;
        byte b = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                c cVar = (c) obj6;
                rqc rqcVar = (rqc) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                y25 y25Var = (y25) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && y25Var != null && bArr != null) {
                    c.O("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    v25 v25Var = new v25();
                    v25Var.c = bArr;
                    v25Var.b = y25Var.b();
                    v25Var.a = sendtransfer;
                    cVar.c.q(z8c.h(cVar.a).e(), bArr, y25Var, new qy1(cVar, v25Var, rqcVar));
                    break;
                } else {
                    c.m("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    rqcVar.a(null, str);
                    break;
                }
            case 1:
                a58 a58Var = (a58) obj6;
                v9b v9bVar = (v9b) obj5;
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l2 = (Long) obj4;
                oab oabVar = a58Var.z0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    c40 c40Var = a58Var.C2;
                    if (c40Var == null || ((nab) c40Var.c) != null) {
                        nab nabVar = (nab) c40Var.c;
                        nabVar.firstFrameRendered = false;
                        c40Var.a = false;
                        nabVar.setOnReadyListener(new m38(runnable, currentTimeMillis, null == true ? 1 : 0));
                        ((fab) a58Var.G1).g(false);
                        s09 s09Var = a58Var.p0;
                        if (s09Var != null) {
                            s09Var.setAnimation(a58Var.n1.u);
                        }
                        if (a58Var.H2 > 0 && l.longValue() > a58Var.H2 - 1400) {
                            l = 0L;
                        }
                        a58Var.O0(l.longValue(), true);
                        a58Var.J3 = false;
                        gm.d3(runnable, 400L);
                        if (bool.booleanValue()) {
                            a58Var.c1(false);
                            break;
                        }
                    } else {
                        ((fab) a58Var.G1).g(false);
                        a58Var.setActive(true);
                        a58Var.J3 = false;
                        a58Var.Y0 = new vt2(runnable, (byte) 4);
                        if (bool.booleanValue()) {
                            a58Var.c1(false);
                        }
                        gm.d3(runnable, 400L);
                        break;
                    }
                } else {
                    d dVar2 = oabVar.f;
                    if (dVar2 != null && (parentLayout = dVar2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            d dVar3 = (d) fragmentStack.get(size);
                            if (dVar3 instanceof nk3) {
                                nk3 nk3Var = (nk3) dVar3;
                                nk3Var.g3();
                                aj3 aj3Var2 = nk3Var.F0;
                                hh3 e = aj3Var2 != null ? aj3Var2.e(l2.longValue()) : null;
                                for (int i = 0; i < arrayList.size(); i++) {
                                    ((ActionBarLayout) parentLayout).c0((d) arrayList.get(i), false);
                                }
                                hh3Var = e;
                                aj3Var = aj3Var2;
                                dVar = oabVar.f;
                                if (dVar != null) {
                                    dVar.clearSheets();
                                }
                                oabVar.z();
                                a58Var.J3 = false;
                                if (aj3Var != null || !aj3Var.k(l2.longValue())) {
                                    v9bVar.X(q9b.c(hh3Var));
                                    gm.d3(runnable, 400L);
                                    break;
                                } else {
                                    aj3Var.c0.add(new hz7((Object) hh3Var, (Object) aj3Var, (Object) l2, (Object) v9bVar, (Object) runnable, (byte) 3));
                                    break;
                                }
                            } else {
                                arrayList.add(dVar3);
                            }
                        }
                    }
                    hh3Var = null;
                    aj3Var = null;
                    dVar = oabVar.f;
                    if (dVar != null) {
                    }
                    oabVar.z();
                    a58Var.J3 = false;
                    if (aj3Var != null) {
                    }
                    v9bVar.X(q9b.c(hh3Var));
                    gm.d3(runnable, 400L);
                }
                break;
            default:
                zga zgaVar = (zga) obj6;
                v99 v99Var = (v99) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                int i2 = zgaVar.d;
                oc7.r1(i2).d4((ArrayList) obj2, true);
                oc7.r1(i2).X3((ArrayList) obj3, true);
                vm.g(i2).d((ArrayList) obj4);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    k47 k47Var = (k47) arrayList2.get(i3);
                    if (k47Var.z2() && k47Var.k.reactions != null) {
                        k47Var.S2 = true;
                    }
                    k47Var.J5(zgaVar.x, true);
                    zgaVar.n.add(k47Var);
                }
                zgaVar.G(true);
                gm.d3(v99Var, 540L);
                break;
        }
    }
}
