// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class k25 implements mcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k25(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    @Override // mcc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        og3 og3Var;
        ii3 ii3Var;
        e eVar;
        wk5 parentLayout;
        byte b = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                c cVar = (c) obj6;
                ctc ctcVar = (ctc) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                c35 c35Var = (c35) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && c35Var != null && bArr != null) {
                    c.P("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    z25 z25Var = new z25();
                    z25Var.c = bArr;
                    z25Var.b = c35Var.b();
                    z25Var.a = sendtransfer;
                    cVar.c.q(yac.h(cVar.a).e(), bArr, c35Var, new rx1(cVar, z25Var, ctcVar));
                    break;
                } else {
                    c.m("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    ctcVar.a(null, str);
                    break;
                }
            case 1:
                o68 o68Var = (o68) obj6;
                rbb rbbVar = (rbb) obj5;
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l2 = (Long) obj4;
                lcb lcbVar = o68Var.t0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    d30 d30Var = o68Var.w2;
                    if (d30Var == null || ((kcb) d30Var.c) != null) {
                        kcb kcbVar = (kcb) d30Var.c;
                        kcbVar.firstFrameRendered = false;
                        d30Var.a = false;
                        kcbVar.setOnReadyListener(new z48(runnable, currentTimeMillis, null == true ? 1 : 0));
                        ((ccb) o68Var.A1).g(false);
                        e29 e29Var = o68Var.j0;
                        if (e29Var != null) {
                            e29Var.setAnimation(o68Var.h1.u);
                        }
                        if (o68Var.B2 > 0 && l.longValue() > o68Var.B2 - 1400) {
                            l = 0L;
                        }
                        o68Var.O0(l.longValue(), true);
                        o68Var.D3 = false;
                        hl.d3(runnable, 400L);
                        if (bool.booleanValue()) {
                            o68Var.c1(false);
                            break;
                        }
                    } else {
                        ((ccb) o68Var.A1).g(false);
                        o68Var.setActive(true);
                        o68Var.D3 = false;
                        o68Var.S0 = new dt2(runnable, (byte) 5);
                        if (bool.booleanValue()) {
                            o68Var.c1(false);
                        }
                        hl.d3(runnable, 400L);
                        break;
                    }
                } else {
                    e eVar2 = lcbVar.f;
                    if (eVar2 != null && (parentLayout = eVar2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            e eVar3 = (e) fragmentStack.get(size);
                            if (eVar3 instanceof uj3) {
                                uj3 uj3Var = (uj3) eVar3;
                                uj3Var.g3();
                                ii3 ii3Var2 = uj3Var.F0;
                                og3 e = ii3Var2 != null ? ii3Var2.e(l2.longValue()) : null;
                                for (int i = 0; i < arrayList.size(); i++) {
                                    ((ActionBarLayout) parentLayout).c0((e) arrayList.get(i), false);
                                }
                                og3Var = e;
                                ii3Var = ii3Var2;
                                eVar = lcbVar.f;
                                if (eVar != null) {
                                    eVar.clearSheets();
                                }
                                lcbVar.y();
                                o68Var.D3 = false;
                                if (ii3Var != null || !ii3Var.k(l2.longValue())) {
                                    rbbVar.X(mbb.c(og3Var));
                                    hl.d3(runnable, 400L);
                                    break;
                                } else {
                                    ii3Var.c0.add(new cp7((Object) og3Var, (Object) ii3Var, (Object) l2, (Object) rbbVar, (Object) runnable, (byte) 5));
                                    break;
                                }
                            } else {
                                arrayList.add(eVar3);
                            }
                        }
                    }
                    og3Var = null;
                    ii3Var = null;
                    eVar = lcbVar.f;
                    if (eVar != null) {
                    }
                    lcbVar.y();
                    o68Var.D3 = false;
                    if (ii3Var != null) {
                    }
                    rbbVar.X(mbb.c(og3Var));
                    hl.d3(runnable, 400L);
                }
                break;
            default:
                qia qiaVar = (qia) obj6;
                a39 a39Var = (a39) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                int i2 = qiaVar.d;
                uc7.s1(i2).j4((ArrayList) obj2, true);
                uc7.s1(i2).c4((ArrayList) obj3, true);
                wl.g(i2).d((ArrayList) obj4);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    r47 r47Var = (r47) arrayList2.get(i3);
                    if (r47Var.z2() && r47Var.k.reactions != null) {
                        r47Var.S2 = true;
                    }
                    r47Var.J5(qiaVar.x, true);
                    qiaVar.n.add(r47Var);
                }
                qiaVar.G(true);
                hl.d3(a39Var, 540L);
                break;
        }
    }
}
