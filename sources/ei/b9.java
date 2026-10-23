package ei;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9 b;

    public /* synthetic */ b9(k9 k9Var, int i10) {
        this.a = i10;
        this.b = k9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                k9 k9Var = this.b;
                r9 r9Var = k9Var.W;
                r9Var.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = r9Var.v;
                hashSet.clear();
                if (r9Var.K && r9Var.G) {
                    r9Var.G = false;
                }
                Utilities.Callback callback = r9Var.W;
                if (callback != null) {
                    callback.run(r9Var.c);
                }
                u9 u9Var = r9Var.X;
                if (u9Var != null) {
                    u9Var.run(new HashSet(hashSet));
                }
                k9Var.g(true);
                break;
            case 1:
                r9 r9Var2 = this.b.W;
                i10 = ((org.telegram.ui.ActionBar.h3) r9Var2).currentAccount;
                r9Var2.h1(new p9(5, i10, (ArrayList) obj), new ci.d4(r9Var2, 1), false);
                break;
            case 2:
                k9 k9Var2 = this.b;
                r9 r9Var3 = k9Var2.W;
                HashSet hashSet2 = r9Var3.v;
                hashSet2.add(Integer.valueOf(((ci.a7) obj).a));
                k9Var2.g(true);
                u9 u9Var2 = r9Var3.X;
                if (u9Var2 != null) {
                    u9Var2.run(new HashSet(hashSet2));
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
                k9Var3.I = str;
                k9Var3.g(false);
                break;
        }
    }
}
