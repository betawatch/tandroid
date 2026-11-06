package org.telegram.ui.Components;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements xh.j, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ EditTextBoldCursor a;

    public /* synthetic */ bt(EditTextBoldCursor editTextBoldCursor) {
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
