package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f10 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 b;
    public final /* synthetic */ oy c;

    public /* synthetic */ f10(org.telegram.ui.ActionBar.j5 j5Var, oy oyVar) {
        this.b = j5Var;
        this.c = oyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
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
                org.telegram.ui.ActionBar.r2 r2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    r2Var = (org.telegram.ui.ActionBar.r2) fragmentStack.get(size);
                    if (!(r2Var instanceof org.telegram.ui.ey) && !(r2Var instanceof org.telegram.ui.rg0)) {
                        if (z11) {
                            r2Var.finishFragment();
                            z11 = false;
                        } else {
                            r2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.r2 r2Var2 = r2Var;
                    org.telegram.ui.ActionBar.r2 r2Var3 = !(r2Var2 instanceof org.telegram.ui.rg0) ? ((org.telegram.ui.rg0) r2Var2).I : r2Var2;
                    z10 = r2Var3 instanceof org.telegram.ui.ey;
                    oy oyVar = this.c;
                    if (z10) {
                        oyVar.run(r2Var2);
                        break;
                    } else {
                        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) r2Var3;
                        eyVar.S3();
                        AndroidUtilities.runOnUIThread(new e10(eyVar, num, oyVar, r2Var2, 0), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.r2 r2Var22 = r2Var;
                if (!(r2Var22 instanceof org.telegram.ui.rg0)) {
                }
                z10 = r2Var3 instanceof org.telegram.ui.ey;
                oy oyVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ f10(oy oyVar, org.telegram.ui.ActionBar.j5 j5Var) {
        this.c = oyVar;
        this.b = j5Var;
    }
}
