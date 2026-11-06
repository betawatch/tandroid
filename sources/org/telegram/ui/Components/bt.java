package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
