package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ y9 b;

    public /* synthetic */ n9(y9 y9Var, int i10) {
        this.a = i10;
        this.b = y9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                y9 y9Var = this.b;
                fa faVar = y9Var.W;
                faVar.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = faVar.v;
                hashSet.clear();
                if (faVar.K && faVar.G) {
                    faVar.G = false;
                }
                Utilities.Callback callback = faVar.W;
                if (callback != null) {
                    callback.run(faVar.c);
                }
                ia iaVar = faVar.X;
                if (iaVar != null) {
                    iaVar.run(new HashSet(hashSet));
                }
                y9Var.g(true);
                break;
            case 1:
                fa faVar2 = this.b.W;
                i10 = ((org.telegram.ui.ActionBar.e3) faVar2).currentAccount;
                faVar2.g1(new da(5, i10, (ArrayList) obj), new ai.r5(faVar2, 1), false);
                break;
            case 2:
                y9 y9Var2 = this.b;
                fa faVar3 = y9Var2.W;
                HashSet hashSet2 = faVar3.v;
                hashSet2.add(Integer.valueOf(((ai.e9) obj).a));
                y9Var2.g(true);
                ia iaVar2 = faVar3.X;
                if (iaVar2 != null) {
                    iaVar2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                y9 y9Var3 = this.b;
                if (str != null) {
                    y9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                y9Var3.I = str;
                y9Var3.g(false);
                break;
        }
    }
}
