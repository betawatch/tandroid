package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5 b;
    public final /* synthetic */ org.telegram.ui.oc c;

    public /* synthetic */ w00(org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.oc ocVar) {
        this.b = b5Var;
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
                org.telegram.ui.ActionBar.m2 m2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    m2Var = (org.telegram.ui.ActionBar.m2) fragmentStack.get(size);
                    if (!(m2Var instanceof org.telegram.ui.qy) && !(m2Var instanceof org.telegram.ui.yg0)) {
                        if (z11) {
                            m2Var.finishFragment();
                            z11 = false;
                        } else {
                            m2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                    org.telegram.ui.ActionBar.m2 m2Var3 = !(m2Var2 instanceof org.telegram.ui.yg0) ? ((org.telegram.ui.yg0) m2Var2).J : m2Var2;
                    z10 = m2Var3 instanceof org.telegram.ui.qy;
                    org.telegram.ui.oc ocVar = this.c;
                    if (z10) {
                        ocVar.run(m2Var2);
                        break;
                    } else {
                        org.telegram.ui.qy qyVar = (org.telegram.ui.qy) m2Var3;
                        qyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(qyVar, num, ocVar, m2Var2, 23), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.m2 m2Var22 = m2Var;
                if (!(m2Var22 instanceof org.telegram.ui.yg0)) {
                }
                z10 = m2Var3 instanceof org.telegram.ui.qy;
                org.telegram.ui.oc ocVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ w00(org.telegram.ui.oc ocVar, org.telegram.ui.ActionBar.b5 b5Var) {
        this.c = ocVar;
        this.b = b5Var;
    }
}
