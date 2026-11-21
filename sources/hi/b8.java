package hi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b8 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ b8(k8 k8Var, int i7) {
        this.a = i7;
        this.b = k8Var;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 1;
        k8 k8Var = this.b;
        switch (i7) {
            case 0:
                p8 p8Var = k8Var.a0;
                p8Var.n1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = p8Var.v1;
                hashSet.clear();
                if (p8Var.F1 && p8Var.B1) {
                    p8Var.B1 = false;
                }
                x10 x10Var = p8Var.R1;
                if (x10Var != null) {
                    x10Var.a(p8Var.n1);
                }
                s8 s8Var = p8Var.S1;
                if (s8Var != null) {
                    s8Var.a(new HashSet(hashSet));
                }
                k8Var.h(true);
                break;
            case 1:
                p8 p8Var2 = k8Var.a0;
                int i11 = p8.Y1;
                p8Var2.O0(new n8(5, p8Var2.a, (ArrayList) obj), new fi.o3(p8Var2, i10), false);
                break;
            case 2:
                p8 p8Var3 = k8Var.a0;
                HashSet hashSet2 = p8Var3.v1;
                hashSet2.add(Integer.valueOf(((fi.i6) obj).a));
                k8Var.h(true);
                s8 s8Var2 = p8Var3.S1;
                if (s8Var2 != null) {
                    s8Var2.a(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    k8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                k8Var.J = str;
                k8Var.h(false);
                break;
        }
    }
}
