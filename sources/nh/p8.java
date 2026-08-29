package nh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ p8(y8 y8Var, int i10) {
        this.a = i10;
        this.b = y8Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                y8 y8Var = this.b;
                e9 e9Var = y8Var.S;
                e9Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = e9Var.v;
                hashSet.clear();
                if (e9Var.G && e9Var.C) {
                    e9Var.C = false;
                }
                Utilities.Callback callback = e9Var.S;
                if (callback != null) {
                    callback.run(e9Var.c);
                }
                h9 h9Var = e9Var.T;
                if (h9Var != null) {
                    h9Var.run(new HashSet(hashSet));
                }
                y8Var.g(true);
                break;
            case 1:
                e9 e9Var2 = this.b.S;
                i10 = ((org.telegram.ui.ActionBar.f3) e9Var2).currentAccount;
                e9Var2.g1(new c9(5, i10, (ArrayList) obj), new lh.t3(e9Var2, 1), false);
                break;
            case 2:
                y8 y8Var2 = this.b;
                e9 e9Var3 = y8Var2.S;
                HashSet hashSet2 = e9Var3.v;
                hashSet2.add(Integer.valueOf(((lh.l6) obj).a));
                y8Var2.g(true);
                h9 h9Var2 = e9Var3.T;
                if (h9Var2 != null) {
                    h9Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                y8 y8Var3 = this.b;
                if (str != null) {
                    y8Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                y8Var3.E = str;
                y8Var3.g(false);
                break;
        }
    }
}
