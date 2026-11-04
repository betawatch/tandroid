package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class me implements org.telegram.messenger.m10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;

    public /* synthetic */ me(int i3, org.telegram.ui.ActionBar.d2 d2Var) {
        this.a = i3;
        this.b = d2Var;
    }

    @Override // org.telegram.messenger.m10
    public final Object run() {
        org.telegram.ui.ActionBar.d2 d2Var;
        switch (this.a) {
            case 0:
                d2Var = (wm) this.b;
                break;
            case 1:
                wm wmVar = (wm) this.b;
                if (org.telegram.messenger.lc.e(65536) && org.telegram.ui.Components.cz0.c()) {
                    org.telegram.ui.Components.cz0 cz0Var = wmVar.y0;
                    if (cz0Var == null || cz0Var.e) {
                        if (wmVar.getParentActivity() != null && org.telegram.ui.Components.cz0.c() && wmVar.A0 != null && wmVar.m1 != null) {
                            org.telegram.ui.Components.cz0 cz0Var2 = wmVar.y0;
                            if (cz0Var2 != null) {
                                org.telegram.messenger.g0.E2(cz0Var2);
                            }
                            org.telegram.ui.Components.cz0 cz0Var3 = new org.telegram.ui.Components.cz0(wmVar.getParentActivity(), new sc(4, wmVar, r2));
                            wmVar.y0 = cz0Var3;
                            org.telegram.ui.Components.cz0[] cz0VarArr = {cz0Var3};
                            kl klVar = wmVar.m1;
                            klVar.addView(cz0Var3, klVar.indexOfChild(wmVar.A0) + 1, b8.mf.c(-1.0f, -1));
                        }
                    }
                    return wmVar.y0;
                }
                return null;
            case 2:
                ((wm) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.cz0.c() && org.telegram.messenger.lc.e(65536));
            default:
                d2Var = (ProfileActivity) this.b;
                break;
        }
        return d2Var.getSimpleMenuOverlay();
    }
}
