package bi;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class ta implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ kb b;

    public /* synthetic */ ta(kb kbVar, int i10) {
        this.a = i10;
        this.b = kbVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        switch (this.a) {
            case 0:
                kb kbVar = this.b;
                rb rbVar = kbVar.W;
                rbVar.c = (TLRPC.InputPeer) obj;
                HashSet hashSet = rbVar.v;
                hashSet.clear();
                if (rbVar.K && rbVar.G) {
                    rbVar.G = false;
                }
                Utilities.Callback callback = rbVar.W;
                if (callback != null) {
                    callback.run(rbVar.c);
                }
                ub ubVar = rbVar.X;
                if (ubVar != null) {
                    ubVar.run(new HashSet(hashSet));
                }
                kbVar.g(true);
                break;
            case 1:
                rb rbVar2 = this.b.W;
                i10 = ((org.telegram.ui.ActionBar.h3) rbVar2).currentAccount;
                rbVar2.g1(new pb(5, i10, (ArrayList) obj), new ra(rbVar2, 0), false);
                break;
            case 2:
                kb kbVar2 = this.b;
                rb rbVar3 = kbVar2.W;
                HashSet hashSet2 = rbVar3.v;
                hashSet2.add(Integer.valueOf(((zh.b5) obj).a));
                kbVar2.g(true);
                ub ubVar2 = rbVar3.X;
                if (ubVar2 != null) {
                    ubVar2.run(new HashSet(hashSet2));
                    break;
                }
                break;
            default:
                String str = (String) obj;
                kb kbVar3 = this.b;
                if (str != null) {
                    kbVar3.getClass();
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
                kbVar3.I = str;
                kbVar3.g(false);
                break;
        }
    }
}
