package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.e5 b;
    public final /* synthetic */ org.telegram.ui.pf c;

    public /* synthetic */ v00(org.telegram.ui.ActionBar.e5 e5Var, org.telegram.ui.pf pfVar) {
        this.b = e5Var;
        this.c = pfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    @Override // org.telegram.messenger.Utilities.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                this.c.run(this.b.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = this.b.getFragmentStack();
                boolean z11 = true;
                org.telegram.ui.ActionBar.o2 o2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                    if (!(o2Var instanceof org.telegram.ui.wy) && !(o2Var instanceof org.telegram.ui.gh0)) {
                        if (z11) {
                            o2Var.finishFragment();
                            z11 = false;
                        } else {
                            o2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var3 = !(o2Var2 instanceof org.telegram.ui.gh0) ? ((org.telegram.ui.gh0) o2Var2).J : o2Var2;
                    z10 = o2Var3 instanceof org.telegram.ui.wy;
                    org.telegram.ui.pf pfVar = this.c;
                    if (z10) {
                        pfVar.run(o2Var2);
                        break;
                    } else {
                        org.telegram.ui.wy wyVar = (org.telegram.ui.wy) o2Var3;
                        wyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.o5(wyVar, num, pfVar, o2Var2, 23), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.o2 o2Var22 = o2Var;
                if (!(o2Var22 instanceof org.telegram.ui.gh0)) {
                }
                z10 = o2Var3 instanceof org.telegram.ui.wy;
                org.telegram.ui.pf pfVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ v00(org.telegram.ui.pf pfVar, org.telegram.ui.ActionBar.e5 e5Var) {
        this.c = pfVar;
        this.b = e5Var;
    }
}
