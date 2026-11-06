package org.telegram.ui.Components;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
