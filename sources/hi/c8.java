package hi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ c8(l8 l8Var, int i7) {
        this.a = i7;
        this.b = l8Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 1;
        l8 l8Var = this.b;
        switch (i7) {
            case 0:
                q8 q8Var = l8Var.a0;
                q8Var.n1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = q8Var.v1;
                hashSet.clear();
                if (q8Var.F1 && q8Var.B1) {
                    q8Var.B1 = false;
                }
                x10 x10Var = q8Var.R1;
                if (x10Var != null) {
                    x10Var.a(q8Var.n1);
                }
                t8 t8Var = q8Var.S1;
                if (t8Var != null) {
                    t8Var.a(new HashSet(hashSet));
                }
                l8Var.h(true);
                break;
            case 1:
                q8 q8Var2 = l8Var.a0;
                int i11 = q8.Y1;
                q8Var2.O0(new o8(5, q8Var2.a, (ArrayList) obj), new fi.o3(q8Var2, i10), false);
                break;
            case 2:
                q8 q8Var3 = l8Var.a0;
                HashSet hashSet2 = q8Var3.v1;
                hashSet2.add(Integer.valueOf(((fi.i6) obj).a));
                l8Var.h(true);
                t8 t8Var2 = q8Var3.S1;
                if (t8Var2 != null) {
                    t8Var2.a(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    l8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                l8Var.J = str;
                l8Var.h(false);
                break;
        }
    }
}
