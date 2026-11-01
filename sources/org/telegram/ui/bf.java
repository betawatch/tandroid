package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bf implements org.telegram.messenger.j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;

    public /* synthetic */ bf(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.a = i10;
        this.b = k2Var;
    }

    @Override // org.telegram.messenger.j20
    public final Object run() {
        org.telegram.ui.ActionBar.k2 k2Var;
        switch (this.a) {
            case 0:
                k2Var = (un) this.b;
                break;
            case 1:
                un unVar = (un) this.b;
                if (org.telegram.messenger.tc.e(65536) && org.telegram.ui.Components.i01.c()) {
                    org.telegram.ui.Components.i01 i01Var = unVar.x0;
                    if (i01Var == null || i01Var.e) {
                        if (unVar.getParentActivity() != null && org.telegram.ui.Components.i01.c() && unVar.z0 != null && unVar.l1 != null) {
                            org.telegram.ui.Components.i01 i01Var2 = unVar.x0;
                            if (i01Var2 != null) {
                                org.telegram.messenger.i0.E2(i01Var2);
                            }
                            org.telegram.ui.Components.i01 i01Var3 = new org.telegram.ui.Components.i01(unVar.getParentActivity(), new h0(23, unVar, r2));
                            unVar.x0 = i01Var3;
                            org.telegram.ui.Components.i01[] i01VarArr = {i01Var3};
                            km kmVar = unVar.l1;
                            kmVar.addView(i01Var3, kmVar.indexOfChild(unVar.z0) + 1, w7.b6.c(-1.0f, -1));
                        }
                    }
                    return unVar.x0;
                }
                return null;
            case 2:
                ((un) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.i01.c() && org.telegram.messenger.tc.e(65536));
            default:
                k2Var = (ProfileActivity) this.b;
                break;
        }
        return k2Var.getSimpleMenuOverlay();
    }
}
