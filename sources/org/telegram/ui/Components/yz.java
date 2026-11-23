package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yz implements org.telegram.messenger.w10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.r4 b;
    public final /* synthetic */ ph c;

    public /* synthetic */ yz(org.telegram.ui.ActionBar.r4 r4Var, ph phVar) {
        this.b = r4Var;
        this.c = phVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    @Override // org.telegram.messenger.w10
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        boolean z10;
        switch (this.a) {
            case 0:
                this.c.a(this.b.getLastFragment());
                break;
            default:
                Integer num = (Integer) obj;
                List fragmentStack = this.b.getFragmentStack();
                boolean z11 = true;
                org.telegram.ui.ActionBar.g2 g2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    g2Var = (org.telegram.ui.ActionBar.g2) fragmentStack.get(size);
                    if (!(g2Var instanceof org.telegram.ui.bx) && !(g2Var instanceof org.telegram.ui.le0)) {
                        if (z11) {
                            g2Var.finishFragment();
                            z11 = false;
                        } else {
                            g2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.g2 g2Var2 = g2Var;
                    org.telegram.ui.ActionBar.g2 g2Var3 = !(g2Var2 instanceof org.telegram.ui.le0) ? ((org.telegram.ui.le0) g2Var2).K : g2Var2;
                    z10 = g2Var3 instanceof org.telegram.ui.bx;
                    ph phVar = this.c;
                    if (z10) {
                        phVar.a(g2Var2);
                        break;
                    } else {
                        org.telegram.ui.bx bxVar = (org.telegram.ui.bx) g2Var3;
                        bxVar.W3();
                        org.telegram.messenger.g0.h3(new xz(bxVar, num, phVar, g2Var2, 0), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.g2 g2Var22 = g2Var;
                if (!(g2Var22 instanceof org.telegram.ui.le0)) {
                }
                z10 = g2Var3 instanceof org.telegram.ui.bx;
                ph phVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ yz(ph phVar, org.telegram.ui.ActionBar.r4 r4Var) {
        this.c = phVar;
        this.b = r4Var;
    }
}
