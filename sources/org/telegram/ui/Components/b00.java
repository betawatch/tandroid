package org.telegram.ui.Components;

import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class b00 implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ org.telegram.ui.ActionBar.z4 b;
    public final /* synthetic */ vg c;

    public /* synthetic */ b00(org.telegram.ui.ActionBar.z4 z4Var, vg vgVar) {
        this.b = z4Var;
        this.c = vgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003e  */
    @Override // org.telegram.messenger.q20
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
                org.telegram.ui.ActionBar.k2 k2Var = null;
                for (int size = fragmentStack.size() - 1; size >= 0; size--) {
                    k2Var = (org.telegram.ui.ActionBar.k2) fragmentStack.get(size);
                    if (!(k2Var instanceof org.telegram.ui.ay) && !(k2Var instanceof org.telegram.ui.pf0)) {
                        if (z11) {
                            k2Var.finishFragment();
                            z11 = false;
                        } else {
                            k2Var.removeSelfFromStack();
                        }
                    }
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    org.telegram.ui.ActionBar.k2 k2Var3 = !(k2Var2 instanceof org.telegram.ui.pf0) ? ((org.telegram.ui.pf0) k2Var2).J : k2Var2;
                    z10 = k2Var3 instanceof org.telegram.ui.ay;
                    vg vgVar = this.c;
                    if (z10) {
                        vgVar.a(k2Var2);
                        break;
                    } else {
                        org.telegram.ui.ay ayVar = (org.telegram.ui.ay) k2Var3;
                        ayVar.V3();
                        org.telegram.messenger.i0.h3(new org.telegram.ui.fp(ayVar, num, vgVar, k2Var2, 12), 80L);
                        break;
                    }
                }
                org.telegram.ui.ActionBar.k2 k2Var22 = k2Var;
                if (!(k2Var22 instanceof org.telegram.ui.pf0)) {
                }
                z10 = k2Var3 instanceof org.telegram.ui.ay;
                vg vgVar2 = this.c;
                if (z10) {
                }
                break;
        }
    }

    public /* synthetic */ b00(vg vgVar, org.telegram.ui.ActionBar.z4 z4Var) {
        this.c = vgVar;
        this.b = z4Var;
    }
}
