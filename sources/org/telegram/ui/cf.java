package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cf implements org.telegram.messenger.i20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ cf(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.messenger.i20
    public final Object run() {
        org.telegram.ui.ActionBar.k2 k2Var;
        switch (this.a) {
            case 0:
                k2Var = (un) this.b;
                break;
            case 1:
                un unVar = (un) this.b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.h01.c()) {
                    org.telegram.ui.Components.h01 h01Var = unVar.x0;
                    if (h01Var == null || h01Var.e) {
                        if (unVar.getParentActivity() != null && org.telegram.ui.Components.h01.c() && unVar.z0 != null && unVar.l1 != null) {
                            org.telegram.ui.Components.h01 h01Var2 = unVar.x0;
                            if (h01Var2 != null) {
                                org.telegram.messenger.i0.E2(h01Var2);
                            }
                            org.telegram.ui.Components.h01 h01Var3 = new org.telegram.ui.Components.h01(unVar.getParentActivity(), new h0(23, unVar, r2));
                            unVar.x0 = h01Var3;
                            org.telegram.ui.Components.h01[] h01VarArr = {h01Var3};
                            km kmVar = unVar.l1;
                            kmVar.addView(h01Var3, kmVar.indexOfChild(unVar.z0) + 1, w7.b6.c(-1.0f, -1));
                        }
                    }
                    return unVar.x0;
                }
                return null;
            case 2:
                ((un) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.h01.c() && org.telegram.messenger.sc.e(65536));
            default:
                k2Var = (ProfileActivity) this.b;
                break;
        }
        return k2Var.getSimpleMenuOverlay();
    }
}
