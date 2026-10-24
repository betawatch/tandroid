package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d10 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 b;
    public final /* synthetic */ qy c;

    public /* synthetic */ d10(org.telegram.ui.ActionBar.h5 h5Var, qy qyVar) {
        this.b = h5Var;
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
                org.telegram.ui.ActionBar.o2 o2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    o2Var = (org.telegram.ui.ActionBar.o2) fragmentStack.get(size);
                    if (!(o2Var instanceof org.telegram.ui.ey) && !(o2Var instanceof org.telegram.ui.rg0)) {
                        if (z11) {
                            o2Var.finishFragment();
                            z11 = false;
                        } else {
                            o2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                    org.telegram.ui.ActionBar.o2 o2Var3 = !(o2Var2 instanceof org.telegram.ui.rg0) ? ((org.telegram.ui.rg0) o2Var2).J : o2Var2;
                    z10 = o2Var3 instanceof org.telegram.ui.ey;
                    qy qyVar = this.c;
                    if (z10) {
                        qyVar.run(o2Var2);
                        break;
                    } else {
                        org.telegram.ui.ey eyVar = (org.telegram.ui.ey) o2Var3;
                        eyVar.I3();
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(eyVar, num, qyVar, o2Var2, 27), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.o2 o2Var22 = o2Var;
                if (!(o2Var22 instanceof org.telegram.ui.rg0)) {
                }
                z10 = o2Var3 instanceof org.telegram.ui.ey;
                qy qyVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ d10(qy qyVar, org.telegram.ui.ActionBar.h5 h5Var) {
        this.c = qyVar;
        this.b = h5Var;
    }
}
