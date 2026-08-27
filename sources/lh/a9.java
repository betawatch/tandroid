package lh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ a9(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                k9 k9Var = this.b;
                q9 q9Var = k9Var.S;
                q9Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = q9Var.v;
                hashSet.clear();
                if (q9Var.G && q9Var.C) {
                    q9Var.C = false;
                }
                Utilities.Callback callback = q9Var.S;
                if (callback != null) {
                    callback.run(q9Var.c);
                }
                t9 t9Var = q9Var.T;
                if (t9Var != null) {
                    t9Var.run(new HashSet(hashSet));
                }
                k9Var.g(true);
                break;
            case 1:
                q9 q9Var2 = this.b.S;
                i10 = ((org.telegram.ui.ActionBar.e3) q9Var2).currentAccount;
                q9Var2.g1(new o9(5, i10, (ArrayList) obj), new jh.u3(q9Var2, 1), false);
                break;
            case 2:
                k9 k9Var2 = this.b;
                q9 q9Var3 = k9Var2.S;
                HashSet hashSet2 = q9Var3.v;
                hashSet2.add(Integer.valueOf(((jh.k6) obj).a));
                k9Var2.g(true);
                t9 t9Var2 = q9Var3.T;
                if (t9Var2 != null) {
                    t9Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                k9 k9Var3 = this.b;
                if (str != null) {
                    k9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                k9Var3.E = str;
                k9Var3.g(false);
                break;
        }
    }
}
