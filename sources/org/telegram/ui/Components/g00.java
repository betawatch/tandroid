package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g00 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.b5 b;
    public final /* synthetic */ org.telegram.ui.df c;

    public /* synthetic */ g00(org.telegram.ui.ActionBar.b5 b5Var, org.telegram.ui.df dfVar) {
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
                org.telegram.ui.ActionBar.o2 o2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                    if (!(o2Var instanceof org.telegram.ui.dy) && !(o2Var instanceof org.telegram.ui.ng0)) {
                        if (z11) {
                            o2Var.finishFragment();
                            z11 = false;
                        } else {
                            o2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var3 = !(o2Var2 instanceof org.telegram.ui.ng0) ? ((org.telegram.ui.ng0) o2Var2).F : o2Var2;
                    z10 = o2Var3 instanceof org.telegram.ui.dy;
                    org.telegram.ui.df dfVar = this.c;
                    if (z10) {
                        dfVar.run(o2Var2);
                        break;
                    } else {
                        org.telegram.ui.dy dyVar = (org.telegram.ui.dy) o2Var3;
                        dyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.k6(dyVar, num, dfVar, o2Var2, 22), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.o2 o2Var22 = o2Var;
                if (!(o2Var22 instanceof org.telegram.ui.ng0)) {
                }
                z10 = o2Var3 instanceof org.telegram.ui.dy;
                org.telegram.ui.df dfVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ g00(org.telegram.ui.df dfVar, org.telegram.ui.ActionBar.b5 b5Var) {
        this.c = dfVar;
        this.b = b5Var;
    }
}
