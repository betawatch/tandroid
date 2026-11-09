package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                f2Var = (cn) this.b;
                break;
            case 1:
                cn cnVar = (cn) this.b;
                if (org.telegram.messenger.sc.e(65536) && org.telegram.ui.Components.ez0.c()) {
                    org.telegram.ui.Components.ez0 ez0Var = cnVar.x0;
                    if (ez0Var == null || ez0Var.e) {
                        if (cnVar.getParentActivity() != null && org.telegram.ui.Components.ez0.c() && cnVar.z0 != null && cnVar.l1 != null) {
                            org.telegram.ui.Components.ez0 ez0Var2 = cnVar.x0;
                            if (ez0Var2 != null) {
                                org.telegram.messenger.g0.E2(ez0Var2);
                            }
                            org.telegram.ui.Components.ez0 ez0Var3 = new org.telegram.ui.Components.ez0(cnVar.getParentActivity(), new org.telegram.ui.ActionBar.p(29, cnVar, r2));
                            cnVar.x0 = ez0Var3;
                            org.telegram.ui.Components.ez0[] ez0VarArr = {ez0Var3};
                            ql qlVar = cnVar.l1;
                            qlVar.addView(ez0Var3, qlVar.indexOfChild(cnVar.z0) + 1, c8.ha.c(-1.0f, -1));
                        }
                    }
                    return cnVar.x0;
                }
                return null;
            case 2:
                ((cn) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.ez0.c() && org.telegram.messenger.sc.e(65536));
            default:
                f2Var = (ProfileActivity) this.b;
                break;
        }
        return f2Var.getSimpleMenuOverlay();
    }
}
