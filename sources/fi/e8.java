package fi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e8 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ n8 b;

    public /* synthetic */ e8(n8 n8Var, int i7) {
        this.a = i7;
        this.b = n8Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 1;
        n8 n8Var = this.b;
        switch (i7) {
            case 0:
                s8 s8Var = n8Var.W;
                s8Var.j1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = s8Var.r1;
                hashSet.clear();
                if (s8Var.B1 && s8Var.x1) {
                    s8Var.x1 = false;
                }
                c20 c20Var = s8Var.N1;
                if (c20Var != null) {
                    c20Var.a(s8Var.j1);
                }
                v8 v8Var = s8Var.O1;
                if (v8Var != null) {
                    v8Var.a(new HashSet(hashSet));
                }
                n8Var.h(true);
                break;
            case 1:
                s8 s8Var2 = n8Var.W;
                int i11 = s8.U1;
                s8Var2.N0(new q8(5, s8Var2.a, (ArrayList) obj), new di.w3(s8Var2, i10), false);
                break;
            case 2:
                s8 s8Var3 = n8Var.W;
                HashSet hashSet2 = s8Var3.r1;
                hashSet2.add(Integer.valueOf(((di.r6) obj).a));
                n8Var.h(true);
                v8 v8Var2 = s8Var3.O1;
                if (v8Var2 != null) {
                    v8Var2.a(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    n8Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                n8Var.I = str;
                n8Var.h(false);
                break;
        }
    }
}
