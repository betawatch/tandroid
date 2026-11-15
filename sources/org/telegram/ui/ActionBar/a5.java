package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class a5 implements te.d, l0 {
    public final /* synthetic */ c5 a;

    public /* synthetic */ a5(c5 c5Var) {
        this.a = c5Var;
    }

    @Override // te.d
    public void b0() {
        c5 c5Var = this.a;
        c5Var.e();
        c5Var.a.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.l0
    public void g(int i7) {
        j jVar = this.a.a.W;
        if (jVar != null) {
            jVar.b(i7);
        }
    }

    @Override // te.d
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean s(float f10) {
        return false;
    }

    @Override // te.d
    public /* synthetic */ void n(boolean z10) {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }

    @Override // te.d
    public /* synthetic */ void v() {
    }
}
