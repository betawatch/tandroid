package org.telegram.ui;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ne implements org.telegram.messenger.r10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 b;

    public /* synthetic */ ne(int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        this.a = i7;
        this.b = e2Var;
    }

    @Override // org.telegram.messenger.r10
    public final Object run() {
        org.telegram.ui.ActionBar.e2 e2Var;
        switch (this.a) {
            case 0:
                e2Var = (an) this.b;
                break;
            case 1:
                an anVar = (an) this.b;
                if (org.telegram.messenger.qc.e(65536) && org.telegram.ui.Components.fz0.c()) {
                    org.telegram.ui.Components.fz0 fz0Var = anVar.y0;
                    if (fz0Var == null || fz0Var.e) {
                        if (anVar.getParentActivity() != null && org.telegram.ui.Components.fz0.c() && anVar.A0 != null && anVar.m1 != null) {
                            org.telegram.ui.Components.fz0 fz0Var2 = anVar.y0;
                            if (fz0Var2 != null) {
                                org.telegram.messenger.g0.E2(fz0Var2);
                            }
                            org.telegram.ui.Components.fz0 fz0Var3 = new org.telegram.ui.Components.fz0(anVar.getParentActivity(), new u5(18, anVar, r2));
                            anVar.y0 = fz0Var3;
                            org.telegram.ui.Components.fz0[] fz0VarArr = {fz0Var3};
                            ol olVar = anVar.m1;
                            olVar.addView(fz0Var3, olVar.indexOfChild(anVar.A0) + 1, c8.ja.c(-1.0f, -1));
                        }
                    }
                    return anVar.y0;
                }
                return null;
            case 2:
                ((an) this.b).getClass();
                return Boolean.valueOf(org.telegram.ui.Components.fz0.c() && org.telegram.messenger.qc.e(65536));
            default:
                e2Var = (ProfileActivity) this.b;
                break;
        }
        return e2Var.getSimpleMenuOverlay();
    }
}
