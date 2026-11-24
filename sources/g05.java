// default package

import java.util.ArrayList;
import java.util.List;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class g05 implements m8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g05(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e2  */
    @Override // m8c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        uf3 uf3Var;
        oh3 oh3Var;
        d dVar;
        ui5 parentLayout;
        byte b = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                c cVar = (c) obj6;
                poc pocVar = (poc) obj5;
                TL_wallet.sendTransfer sendtransfer = (TL_wallet.sendTransfer) obj;
                y05 y05Var = (y05) obj2;
                byte[] bArr = (byte[]) obj3;
                String str = (String) obj4;
                if (sendtransfer != null && y05Var != null && bArr != null) {
                    c.O("prepare disable backup: transfer ready, initing storage with new secret phrase!");
                    v05 v05Var = new v05();
                    v05Var.c = bArr;
                    v05Var.b = y05Var.b();
                    v05Var.a = sendtransfer;
                    cVar.c.q(y6c.h(cVar.a).e(), bArr, y05Var, new pz1(cVar, v05Var, pocVar));
                    break;
                } else {
                    c.m("prepare disable backup, failed to prepare transfer: ".concat(str == null ? "NULL_ERROR" : str));
                    if (str == null) {
                        str = "NULL_ERROR";
                    }
                    pocVar.a(null, str);
                    break;
                }
            case 1:
                y28 y28Var = (y28) obj6;
                t7b t7bVar = (t7b) obj5;
                Long l = (Long) obj;
                Runnable runnable = (Runnable) obj2;
                Boolean bool = (Boolean) obj3;
                Long l2 = (Long) obj4;
                m8b m8bVar = y28Var.z0;
                if (!bool.booleanValue()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    c30 c30Var = y28Var.C2;
                    if (c30Var == null || ((l8b) c30Var.c) != null) {
                        l8b l8bVar = (l8b) c30Var.c;
                        l8bVar.firstFrameRendered = false;
                        c30Var.a = false;
                        l8bVar.setOnReadyListener(new k18(runnable, currentTimeMillis, null == true ? 1 : 0));
                        ((d8b) y28Var.G1).g(false);
                        ry8 ry8Var = y28Var.p0;
                        if (ry8Var != null) {
                            ry8Var.setAnimation(y28Var.n1.u);
                        }
                        if (y28Var.H2 > 0 && l.longValue() > y28Var.H2 - 1400) {
                            l = 0L;
                        }
                        y28Var.O0(l.longValue(), true);
                        y28Var.J3 = false;
                        gl.e3(runnable, 400L);
                        if (bool.booleanValue()) {
                            y28Var.c1(false);
                            break;
                        }
                    } else {
                        ((d8b) y28Var.G1).g(false);
                        y28Var.setActive(true);
                        y28Var.J3 = false;
                        y28Var.Y0 = new ks2(runnable, (byte) 4);
                        if (bool.booleanValue()) {
                            y28Var.c1(false);
                        }
                        gl.e3(runnable, 400L);
                        break;
                    }
                } else {
                    d dVar2 = m8bVar.f;
                    if (dVar2 != null && (parentLayout = dVar2.getParentLayout()) != null) {
                        List fragmentStack = parentLayout.getFragmentStack();
                        ArrayList arrayList = new ArrayList();
                        for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                            d dVar3 = (d) fragmentStack.get(size);
                            if (dVar3 instanceof cj3) {
                                cj3 cj3Var = (cj3) dVar3;
                                cj3Var.e3();
                                oh3 oh3Var2 = cj3Var.F0;
                                uf3 e = oh3Var2 != null ? oh3Var2.e(l2.longValue()) : null;
                                for (int i = 0; i < arrayList.size(); i++) {
                                    ((ActionBarLayout) parentLayout).c0((d) arrayList.get(i), false);
                                }
                                uf3Var = e;
                                oh3Var = oh3Var2;
                                dVar = m8bVar.f;
                                if (dVar != null) {
                                    dVar.clearSheets();
                                }
                                m8bVar.y();
                                y28Var.J3 = false;
                                if (oh3Var != null || !oh3Var.k(l2.longValue())) {
                                    t7bVar.X(o7b.c(uf3Var));
                                    gl.e3(runnable, 400L);
                                    break;
                                } else {
                                    oh3Var.c0.add(new ex7((Object) uf3Var, (Object) oh3Var, (Object) l2, (Object) t7bVar, (Object) runnable, (byte) 3));
                                    break;
                                }
                            } else {
                                arrayList.add(dVar3);
                            }
                        }
                    }
                    uf3Var = null;
                    oh3Var = null;
                    dVar = m8bVar.f;
                    if (dVar != null) {
                    }
                    m8bVar.y();
                    y28Var.J3 = false;
                    if (oh3Var != null) {
                    }
                    t7bVar.X(o7b.c(uf3Var));
                    gl.e3(runnable, 400L);
                }
                break;
            default:
                zea zeaVar = (zea) obj6;
                t79 t79Var = (t79) obj5;
                ArrayList arrayList2 = (ArrayList) obj;
                int i2 = zeaVar.d;
                na7.q1(i2).a4((ArrayList) obj2, true);
                na7.q1(i2).U3((ArrayList) obj3, true);
                vl.g(i2).d((ArrayList) obj4);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    k27 k27Var = (k27) arrayList2.get(i3);
                    if (k27Var.z2() && k27Var.k.reactions != null) {
                        k27Var.S2 = true;
                    }
                    k27Var.J5(zeaVar.x, true);
                    zeaVar.n.add(k27Var);
                }
                zeaVar.G(true);
                gl.e3(t79Var, 540L);
                break;
        }
    }
}
