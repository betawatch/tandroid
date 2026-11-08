package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ct implements xh.j, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ EditTextBoldCursor a;

    public /* synthetic */ ct(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.g0.v1(this.a);
    }

    @Override // xh.j
    public void m(xh.f fVar, float f10, float f11) {
        this.a.i(fVar, f10, f11);
    }
}
