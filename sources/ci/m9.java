package ci;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ m9(x9 x9Var, int i10) {
        this.a = i10;
        this.b = x9Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                x9 x9Var = this.b;
                ea eaVar = x9Var.W;
                eaVar.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = eaVar.v;
                hashSet.clear();
                if (eaVar.K && eaVar.G) {
                    eaVar.G = false;
                }
                Utilities.Callback callback = eaVar.W;
                if (callback != null) {
                    callback.run(eaVar.c);
                }
                ha haVar = eaVar.X;
                if (haVar != null) {
                    haVar.run(new HashSet(hashSet));
                }
                x9Var.g(true);
                break;
            case 1:
                ea eaVar2 = this.b.W;
                i10 = ((org.telegram.ui.ActionBar.f3) eaVar2).currentAccount;
                eaVar2.g1(new ca(5, i10, (ArrayList) obj), new ai.r5(eaVar2, 1), false);
                break;
            case 2:
                x9 x9Var2 = this.b;
                ea eaVar3 = x9Var2.W;
                HashSet hashSet2 = eaVar3.v;
                hashSet2.add(Integer.valueOf(((ai.e9) obj).a));
                x9Var2.g(true);
                ha haVar2 = eaVar3.X;
                if (haVar2 != null) {
                    haVar2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                x9 x9Var3 = this.b;
                if (str != null) {
                    x9Var3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                x9Var3.I = str;
                x9Var3.g(false);
                break;
        }
    }
}
