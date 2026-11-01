package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
