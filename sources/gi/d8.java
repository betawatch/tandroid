package gi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d8 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ d8(o8 o8Var, int i3) {
        this.a = i3;
        this.b = o8Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        int i3 = this.a;
        int i10 = 1;
        o8 o8Var = this.b;
        switch (i3) {
            case 0:
                t8 t8Var = o8Var.a0;
                t8Var.k1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = t8Var.s1;
                hashSet.clear();
                if (t8Var.C1 && t8Var.y1) {
                    t8Var.y1 = false;
                }
                u10 u10Var = t8Var.O1;
                if (u10Var != null) {
                    u10Var.a(t8Var.k1);
                }
                w8 w8Var = t8Var.P1;
                if (w8Var != null) {
                    w8Var.a(new HashSet(hashSet));
                }
                o8Var.h(true);
                break;
            case 1:
                t8 t8Var2 = o8Var.a0;
                int i11 = t8.V1;
                t8Var2.N0(new r8(5, t8Var2.a, (ArrayList) obj), new ei.y3(t8Var2, i10), false);
                break;
            case 2:
                t8 t8Var3 = o8Var.a0;
                HashSet hashSet2 = t8Var3.s1;
                hashSet2.add(Integer.valueOf(((ei.s6) obj).a));
                o8Var.h(true);
                w8 w8Var2 = t8Var3.P1;
                if (w8Var2 != null) {
                    w8Var2.a(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    o8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                o8Var.J = str;
                o8Var.h(false);
                break;
        }
    }
}
