package org.telegram.ui.Components;

import java.io.Serializable;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5 b;
    public final /* synthetic */ org.telegram.ui.df c;

    public /* synthetic */ j00(org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.df dfVar) {
        this.b = b5Var;
        this.c = dfVar;
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
                org.telegram.ui.ActionBar.n2 n2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    n2Var = (org.telegram.ui.ActionBar.n2) fragmentStack.get(size);
                    if (!(n2Var instanceof org.telegram.ui.gy) && !(n2Var instanceof org.telegram.ui.qg0)) {
                        if (z11) {
                            n2Var.finishFragment();
                            z11 = false;
                        } else {
                            n2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    org.telegram.ui.ActionBar.n2 n2Var3 = !(n2Var2 instanceof org.telegram.ui.qg0) ? ((org.telegram.ui.qg0) n2Var2).F : n2Var2;
                    z10 = n2Var3 instanceof org.telegram.ui.gy;
                    org.telegram.ui.df dfVar = this.c;
                    if (z10) {
                        dfVar.run(n2Var2);
                        break;
                    } else {
                        org.telegram.ui.gy gyVar = (org.telegram.ui.gy) n2Var3;
                        gyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yf((org.telegram.ui.ActionBar.n2) gyVar, (Serializable) num, (Object) dfVar, n2Var2, 18), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.n2 n2Var22 = n2Var;
                if (!(n2Var22 instanceof org.telegram.ui.qg0)) {
                }
                z10 = n2Var3 instanceof org.telegram.ui.gy;
                org.telegram.ui.df dfVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ j00(org.telegram.ui.df dfVar, org.telegram.ui.ActionBar.b5 b5Var) {
        this.c = dfVar;
        this.b = b5Var;
    }
}
