package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.e5 b;
    public final /* synthetic */ vk c;

    public /* synthetic */ v00(org.telegram.ui.ActionBar.e5 e5Var, vk vkVar) {
        this.b = e5Var;
        this.c = vkVar;
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
        boolean z4;
        switch (this.a) {
            case 0:
                this.c.run(this.b.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = this.b.getFragmentStack();
                boolean z10 = true;
                org.telegram.ui.ActionBar.p2 p2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                    if (!(p2Var instanceof org.telegram.ui.oy) && !(p2Var instanceof org.telegram.ui.vg0)) {
                        if (z10) {
                            p2Var.finishFragment();
                            z10 = false;
                        } else {
                            p2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var3 = !(p2Var2 instanceof org.telegram.ui.vg0) ? ((org.telegram.ui.vg0) p2Var2).G : p2Var2;
                    z4 = p2Var3 instanceof org.telegram.ui.oy;
                    vk vkVar = this.c;
                    if (z4) {
                        vkVar.run(p2Var2);
                        break;
                    } else {
                        org.telegram.ui.oy oyVar = (org.telegram.ui.oy) p2Var3;
                        oyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ih(oyVar, num, vkVar, p2Var2, 14), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.p2 p2Var22 = p2Var;
                if (!(p2Var22 instanceof org.telegram.ui.vg0)) {
                }
                z4 = p2Var3 instanceof org.telegram.ui.oy;
                vk vkVar2 = this.c;
                if (z4) {
                }
                break;
        }
    }

    public /* synthetic */ v00(vk vkVar, org.telegram.ui.ActionBar.e5 e5Var) {
        this.c = vkVar;
        this.b = e5Var;
    }
}
