package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ot implements xh.j, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ EditTextBoldCursor a;

    public /* synthetic */ ot(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // xh.j
    public void a(xh.f fVar, float f10, float f11) {
        this.a.i(fVar, f10, f11);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        org.telegram.messenger.g0.v1(this.a);
    }
}
