package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class at implements yh.j, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ EditTextBoldCursor a;

    public /* synthetic */ at(EditTextBoldCursor editTextBoldCursor) {
        this.a = editTextBoldCursor;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        org.telegram.messenger.g0.v1(this.a);
    }

    @Override // yh.j
    public void l(yh.f fVar, float f10, float f11) {
        this.a.i(fVar, f10, f11);
    }
}
