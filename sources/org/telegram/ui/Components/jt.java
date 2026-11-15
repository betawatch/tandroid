package org.telegram.ui.Components;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
