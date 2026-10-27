package fi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ g9 b;

    public /* synthetic */ x8(g9 g9Var, int i10) {
        this.a = i10;
        this.b = g9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                g9 g9Var = this.b;
                n9 n9Var = g9Var.W;
                n9Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = n9Var.v;
                hashSet.clear();
                if (n9Var.K && n9Var.G) {
                    n9Var.G = false;
                }
                Utilities.Callback callback = n9Var.W;
                if (callback != null) {
                    callback.run(n9Var.c);
                }
                q9 q9Var = n9Var.X;
                if (q9Var != null) {
                    q9Var.run(new HashSet(hashSet));
                }
                g9Var.g(true);
                break;
            case 1:
                n9 n9Var2 = this.b.W;
                i10 = ((org.telegram.ui.ActionBar.k3) n9Var2).currentAccount;
                n9Var2.h1(new l9(5, i10, (ArrayList) obj), new di.e4(n9Var2, 1), false);
                break;
            case 2:
                g9 g9Var2 = this.b;
                n9 n9Var3 = g9Var2.W;
                HashSet hashSet2 = n9Var3.v;
                hashSet2.add(Integer.valueOf(((di.a7) obj).a));
                g9Var2.g(true);
                q9 q9Var2 = n9Var3.X;
                if (q9Var2 != null) {
                    q9Var2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                g9 g9Var3 = this.b;
                if (str != null) {
                    g9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                g9Var3.I = str;
                g9Var3.g(false);
                break;
        }
    }
}
