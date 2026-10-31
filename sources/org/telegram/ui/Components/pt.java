package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pt implements nh.m, org.telegram.ui.ActionBar.u1 {
    public final /* synthetic */ EditTextBoldCursor a;

    public /* synthetic */ pt(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        org.telegram.messenger.i0.v1(this.a);
    }

    @Override // nh.m
    public void m(nh.i iVar, float f7, float f10) {
        this.a.i(iVar, f7, f10);
    }
}
