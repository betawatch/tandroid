package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d10 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.d5 b;
    public final /* synthetic */ qy c;

    public /* synthetic */ d10(org.telegram.ui.ActionBar.d5 d5Var, qy qyVar) {
        this.b = d5Var;
        this.c = qyVar;
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
                    if (!(n2Var instanceof org.telegram.ui.ey) && !(n2Var instanceof org.telegram.ui.pg0)) {
                        if (z11) {
                            n2Var.finishFragment();
                            z11 = false;
                        } else {
                            n2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                    org.telegram.ui.ActionBar.n2 n2Var3 = !(n2Var2 instanceof org.telegram.ui.pg0) ? ((org.telegram.ui.pg0) n2Var2).J : n2Var2;
                    z10 = n2Var3 instanceof org.telegram.ui.ey;
                    qy qyVar = this.c;
                    if (z10) {
                        qyVar.run(n2Var2);
                        break;
                    } else {
                        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) n2Var3;
                        eyVar.I3();
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(eyVar, num, qyVar, n2Var2, 27), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.n2 n2Var22 = n2Var;
                if (!(n2Var22 instanceof org.telegram.ui.pg0)) {
                }
                z10 = n2Var3 instanceof org.telegram.ui.ey;
                qy qyVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ d10(qy qyVar, org.telegram.ui.ActionBar.d5 d5Var) {
        this.c = qyVar;
        this.b = d5Var;
    }
}
