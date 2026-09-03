package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.f5 b;
    public final /* synthetic */ xk c;

    public /* synthetic */ w00(org.telegram.ui.ActionBar.f5 f5Var, xk xkVar) {
        this.b = f5Var;
        this.c = xkVar;
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
                    if (!(p2Var instanceof org.telegram.ui.py) && !(p2Var instanceof org.telegram.ui.wg0)) {
                        if (z10) {
                            p2Var.finishFragment();
                            z10 = false;
                        } else {
                            p2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var3 = !(p2Var2 instanceof org.telegram.ui.wg0) ? ((org.telegram.ui.wg0) p2Var2).G : p2Var2;
                    z4 = p2Var3 instanceof org.telegram.ui.py;
                    xk xkVar = this.c;
                    if (z4) {
                        xkVar.run(p2Var2);
                        break;
                    } else {
                        org.telegram.ui.py pyVar = (org.telegram.ui.py) p2Var3;
                        pyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.ih(pyVar, num, xkVar, p2Var2, 14), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.p2 p2Var22 = p2Var;
                if (!(p2Var22 instanceof org.telegram.ui.wg0)) {
                }
                z4 = p2Var3 instanceof org.telegram.ui.py;
                xk xkVar2 = this.c;
                if (z4) {
                }
                break;
        }
    }

    public /* synthetic */ w00(xk xkVar, org.telegram.ui.ActionBar.f5 f5Var) {
        this.c = xkVar;
        this.b = f5Var;
    }
}
