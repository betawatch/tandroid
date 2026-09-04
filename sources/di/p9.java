package di;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class p9 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ba b;

    public /* synthetic */ p9(ba baVar, int i10) {
        this.a = i10;
        this.b = baVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                ba baVar = this.b;
                ia iaVar = baVar.W;
                iaVar.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = iaVar.v;
                hashSet.clear();
                if (iaVar.K && iaVar.G) {
                    iaVar.G = false;
                }
                Utilities.Callback callback = iaVar.W;
                if (callback != null) {
                    callback.run(iaVar.c);
                }
                la laVar = iaVar.X;
                if (laVar != null) {
                    laVar.run(new HashSet(hashSet));
                }
                baVar.g(true);
                break;
            case 1:
                ia iaVar2 = this.b.W;
                i10 = ((org.telegram.ui.ActionBar.f3) iaVar2).currentAccount;
                iaVar2.g1(new ga(5, i10, (ArrayList) obj), new bi.b5(iaVar2, 1), false);
                break;
            case 2:
                ba baVar2 = this.b;
                ia iaVar3 = baVar2.W;
                HashSet hashSet2 = iaVar3.v;
                hashSet2.add(Integer.valueOf(((bi.m8) obj).a));
                baVar2.g(true);
                la laVar2 = iaVar3.X;
                if (laVar2 != null) {
                    laVar2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                ba baVar3 = this.b;
                if (str != null) {
                    baVar3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                baVar3.I = str;
                baVar3.g(false);
                break;
        }
    }
}
