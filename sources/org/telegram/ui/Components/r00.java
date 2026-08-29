package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5 b;
    public final /* synthetic */ org.telegram.ui.tm c;

    public /* synthetic */ r00(org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.tm tmVar) {
        this.b = b5Var;
        this.c = tmVar;
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
                    if (!(o2Var instanceof org.telegram.ui.fy) && !(o2Var instanceof org.telegram.ui.ng0)) {
                        if (z11) {
                            o2Var.finishFragment();
                            z11 = false;
                        } else {
                            o2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var3 = !(o2Var2 instanceof org.telegram.ui.ng0) ? ((org.telegram.ui.ng0) o2Var2).F : o2Var2;
                    z10 = o2Var3 instanceof org.telegram.ui.fy;
                    org.telegram.ui.tm tmVar = this.c;
                    if (z10) {
                        tmVar.run(o2Var2);
                        break;
                    } else {
                        org.telegram.ui.fy fyVar = (org.telegram.ui.fy) o2Var3;
                        fyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.gg(fyVar, num, tmVar, o2Var2, 16), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.o2 o2Var22 = o2Var;
                if (!(o2Var22 instanceof org.telegram.ui.ng0)) {
                }
                z10 = o2Var3 instanceof org.telegram.ui.fy;
                org.telegram.ui.tm tmVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ r00(org.telegram.ui.tm tmVar, org.telegram.ui.ActionBar.b5 b5Var) {
        this.c = tmVar;
        this.b = b5Var;
    }
}
