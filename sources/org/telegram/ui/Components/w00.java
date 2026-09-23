package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class w00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.c5 b;
    public final /* synthetic */ org.telegram.ui.oc c;

    public /* synthetic */ w00(org.telegram.ui.ActionBar.c5 c5Var, org.telegram.ui.oc ocVar) {
        this.b = c5Var;
        this.c = ocVar;
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
                    if (!(n2Var instanceof org.telegram.ui.ry) && !(n2Var instanceof org.telegram.ui.zg0)) {
                        if (z11) {
                            n2Var.finishFragment();
                            z11 = false;
                        } else {
                            n2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    org.telegram.ui.ActionBar.n2 n2Var3 = !(n2Var2 instanceof org.telegram.ui.zg0) ? ((org.telegram.ui.zg0) n2Var2).J : n2Var2;
                    z10 = n2Var3 instanceof org.telegram.ui.ry;
                    org.telegram.ui.oc ocVar = this.c;
                    if (z10) {
                        ocVar.run(n2Var2);
                        break;
                    } else {
                        org.telegram.ui.ry ryVar = (org.telegram.ui.ry) n2Var3;
                        ryVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(ryVar, num, ocVar, n2Var2, 23), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.n2 n2Var22 = n2Var;
                if (!(n2Var22 instanceof org.telegram.ui.zg0)) {
                }
                z10 = n2Var3 instanceof org.telegram.ui.ry;
                org.telegram.ui.oc ocVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ w00(org.telegram.ui.oc ocVar, org.telegram.ui.ActionBar.c5 c5Var) {
        this.c = ocVar;
        this.b = c5Var;
    }
}
