package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;

    public /* synthetic */ pe(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.a = i7;
        this.b = f2Var;
    }

    @Override // org.telegram.messenger.u10
    public final Object run() {
        org.telegram.ui.ActionBar.f2 f2Var;
        switch (this.a) {
            case 0:
                f2Var = (an) this.b;
                break;
            case 1:
                an anVar = (an) this.b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.dz0.c()) {
                    org.telegram.ui.Components.dz0 dz0Var = anVar.x0;
                    if (dz0Var == null || dz0Var.e) {
                        if (anVar.getParentActivity() != null && org.telegram.ui.Components.dz0.c() && anVar.z0 != null && anVar.l1 != null) {
                            org.telegram.ui.Components.dz0 dz0Var2 = anVar.x0;
                            if (dz0Var2 != null) {
                                org.telegram.messenger.g0.E2(dz0Var2);
                            }
                            org.telegram.ui.Components.dz0 dz0Var3 = new org.telegram.ui.Components.dz0(anVar.getParentActivity(), new org.telegram.ui.ActionBar.p(29, anVar, r2));
                            anVar.x0 = dz0Var3;
                            org.telegram.ui.Components.dz0[] dz0VarArr = {dz0Var3};
                            ol olVar = anVar.l1;
                            olVar.addView(dz0Var3, olVar.indexOfChild(anVar.z0) + 1, c8.ha.c(-1.0f, -1));
                        }
                    }
                    return anVar.x0;
                }
                return null;
            case 2:
                ((an) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.dz0.c() && org.telegram.messenger.sc.e(65536));
            default:
                f2Var = (ProfileActivity) this.b;
                break;
        }
        return f2Var.getSimpleMenuOverlay();
    }
}
