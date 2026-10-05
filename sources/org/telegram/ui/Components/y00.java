package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.c5 b;
    public final /* synthetic */ org.telegram.ui.qc c;

    public /* synthetic */ y00(org.telegram.ui.ActionBar.c5 c5Var, org.telegram.ui.qc qcVar) {
        this.b = c5Var;
        this.c = qcVar;
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
                    if (!(n2Var instanceof org.telegram.ui.uy) && !(n2Var instanceof org.telegram.ui.ch0)) {
                        if (z11) {
                            n2Var.finishFragment();
                            z11 = false;
                        } else {
                            n2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    org.telegram.ui.ActionBar.n2 n2Var3 = !(n2Var2 instanceof org.telegram.ui.ch0) ? ((org.telegram.ui.ch0) n2Var2).J : n2Var2;
                    z10 = n2Var3 instanceof org.telegram.ui.uy;
                    org.telegram.ui.qc qcVar = this.c;
                    if (z10) {
                        qcVar.run(n2Var2);
                        break;
                    } else {
                        org.telegram.ui.uy uyVar = (org.telegram.ui.uy) n2Var3;
                        uyVar.T3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(uyVar, num, qcVar, n2Var2, 23), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.n2 n2Var22 = n2Var;
                if (!(n2Var22 instanceof org.telegram.ui.ch0)) {
                }
                z10 = n2Var3 instanceof org.telegram.ui.uy;
                org.telegram.ui.qc qcVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ y00(org.telegram.ui.qc qcVar, org.telegram.ui.ActionBar.c5 c5Var) {
        this.c = qcVar;
        this.b = c5Var;
    }
}
