package kh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n9 b;

    public /* synthetic */ d9(n9 n9Var, int i9) {
        this.a = i9;
        this.b = n9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i9;
        switch (this.a) {
            case 0:
                n9 n9Var = this.b;
                t9 t9Var = n9Var.S;
                t9Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = t9Var.v;
                hashSet.clear();
                if (t9Var.G && t9Var.C) {
                    t9Var.C = false;
                }
                Utilities.Callback callback = t9Var.S;
                if (callback != null) {
                    callback.run(t9Var.c);
                }
                w9 w9Var = t9Var.T;
                if (w9Var != null) {
                    w9Var.run(new HashSet(hashSet));
                }
                n9Var.g(true);
                break;
            case 1:
                t9 t9Var2 = this.b.S;
                i9 = ((org.telegram.ui.ActionBar.f3) t9Var2).currentAccount;
                t9Var2.g1(new r9(5, i9, (ArrayList) obj), new ih.y3(t9Var2, 1), false);
                break;
            case 2:
                n9 n9Var2 = this.b;
                t9 t9Var3 = n9Var2.S;
                HashSet hashSet2 = t9Var3.v;
                hashSet2.add(Integer.valueOf(((ih.o6) obj).a));
                n9Var2.g(true);
                w9 w9Var2 = t9Var3.T;
                if (w9Var2 != null) {
                    w9Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                n9 n9Var3 = this.b;
                if (str != null) {
                    n9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                n9Var3.E = str;
                n9Var3.g(false);
                break;
        }
    }
}
