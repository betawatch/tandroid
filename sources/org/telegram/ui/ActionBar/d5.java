package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements te.d, l0 {
    public final /* synthetic */ f5 a;

    public /* synthetic */ d5(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // te.d
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean H(float f10) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void h(int i7) {
        j jVar = this.a.a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override // te.d
    public void y1() {
        f5 f5Var = this.a;
        f5Var.e();
        f5Var.a.invalidate();
    }

    @Override // te.d
    public /* synthetic */ void E(boolean z10) {
    }

    @Override // te.d
    public /* synthetic */ void K() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }
}
