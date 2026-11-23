package hi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w8 implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f9 b;

    public /* synthetic */ w8(f9 f9Var, int i7) {
        this.a = i7;
        this.b = f9Var;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        int i7 = this.a;
        int i10 = 1;
        f9 f9Var = this.b;
        switch (i7) {
            case 0:
                k9 k9Var = f9Var.a0;
                k9Var.n1 = (TLRPC.InputPeer) obj;
                HashSet hashSet = k9Var.v1;
                hashSet.clear();
                if (k9Var.F1 && k9Var.B1) {
                    k9Var.B1 = false;
                }
                w10 w10Var = k9Var.R1;
                if (w10Var != null) {
                    w10Var.a(k9Var.n1);
                }
                n9 n9Var = k9Var.S1;
                if (n9Var != null) {
                    n9Var.a(new HashSet(hashSet));
                }
                f9Var.h(true);
                break;
            case 1:
                k9 k9Var2 = f9Var.a0;
                int i11 = k9.Y1;
                k9Var2.O0(new i9(5, k9Var2.a, (ArrayList) obj), new fi.o3(k9Var2, i10), false);
                break;
            case 2:
                k9 k9Var3 = f9Var.a0;
                HashSet hashSet2 = k9Var3.v1;
                hashSet2.add(Integer.valueOf(((fi.i6) obj).a));
                f9Var.h(true);
                n9 n9Var2 = k9Var3.S1;
                if (n9Var2 != null) {
                    n9Var2.a(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                if (str != null) {
                    f9Var.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                f9Var.J = str;
                f9Var.h(false);
                break;
        }
    }
}
