package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kz implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.q4 b;
    public final /* synthetic */ ei c;

    public /* synthetic */ kz(org.telegram.ui.ActionBar.q4 q4Var, ei eiVar) {
        this.b = q4Var;
        this.c = eiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    @Override // org.telegram.messenger.u10
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
                org.telegram.ui.ActionBar.d2 d2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    d2Var = (org.telegram.ui.ActionBar.d2) fragmentStack.get(size);
                    if (!(d2Var instanceof org.telegram.ui.uw) && !(d2Var instanceof org.telegram.ui.ee0)) {
                        if (z11) {
                            d2Var.finishFragment();
                            z11 = false;
                        } else {
                            d2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    org.telegram.ui.ActionBar.d2 d2Var3 = !(d2Var2 instanceof org.telegram.ui.ee0) ? ((org.telegram.ui.ee0) d2Var2).K : d2Var2;
                    z10 = d2Var3 instanceof org.telegram.ui.uw;
                    ei eiVar = this.c;
                    if (z10) {
                        eiVar.a(d2Var2);
                        break;
                    } else {
                        org.telegram.ui.uw uwVar = (org.telegram.ui.uw) d2Var3;
                        uwVar.W3();
                        org.telegram.messenger.g0.i3(new o4.b1(uwVar, num, eiVar, d2Var2, 28), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.d2 d2Var22 = d2Var;
                if (!(d2Var22 instanceof org.telegram.ui.ee0)) {
                }
                z10 = d2Var3 instanceof org.telegram.ui.uw;
                ei eiVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ kz(ei eiVar, org.telegram.ui.ActionBar.q4 q4Var) {
        this.c = eiVar;
        this.b = q4Var;
    }
}
