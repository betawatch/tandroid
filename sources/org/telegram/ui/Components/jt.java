package org.telegram.ui.Components;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class jt implements xh.j, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ EditTextBoldCursor a;

    public /* synthetic */ jt(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        org.telegram.messenger.g0.v1(this.a);
    }

    @Override // xh.j
    public void j(xh.f fVar, float f10, float f11) {
        this.a.i(fVar, f10, f11);
    }
}
