package org.telegram.ui.Components;

import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class c10 implements Utilities.Callback {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.f5 b;
    public final /* synthetic */ org.telegram.ui.pf c;

    public /* synthetic */ c10(org.telegram.ui.ActionBar.f5 f5Var, org.telegram.ui.pf pfVar) {
        this.b = f5Var;
        this.c = pfVar;
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
                org.telegram.ui.ActionBar.p2 p2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    p2Var = (org.telegram.ui.ActionBar.p2) fragmentStack.get(size);
                    if (!(p2Var instanceof org.telegram.ui.wy) && !(p2Var instanceof org.telegram.ui.fh0)) {
                        if (z11) {
                            p2Var.finishFragment();
                            z11 = false;
                        } else {
                            p2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                    org.telegram.ui.ActionBar.p2 p2Var3 = !(p2Var2 instanceof org.telegram.ui.fh0) ? ((org.telegram.ui.fh0) p2Var2).J : p2Var2;
                    z10 = p2Var3 instanceof org.telegram.ui.wy;
                    org.telegram.ui.pf pfVar = this.c;
                    if (z10) {
                        pfVar.run(p2Var2);
                        break;
                    } else {
                        org.telegram.ui.wy wyVar = (org.telegram.ui.wy) p2Var3;
                        wyVar.K3();
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.da(wyVar, num, pfVar, p2Var2, 19), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.p2 p2Var22 = p2Var;
                if (!(p2Var22 instanceof org.telegram.ui.fh0)) {
                }
                z10 = p2Var3 instanceof org.telegram.ui.wy;
                org.telegram.ui.pf pfVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ c10(org.telegram.ui.pf pfVar, org.telegram.ui.ActionBar.f5 f5Var) {
        this.c = pfVar;
        this.b = f5Var;
    }
}
