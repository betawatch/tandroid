package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d5 implements te.d, m0 {
    public final /* synthetic */ f5 a;

    public /* synthetic */ d5(f5 f5Var) {
        this.a = f5Var;
    }

    @Override // te.d
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // te.d
    public /* synthetic */ boolean B(float f10) {
        return false;
    }

    @Override // te.d
    public void Y0() {
        f5 f5Var = this.a;
        f5Var.e();
        f5Var.a.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.m0
    public void i(int i7) {
        k kVar = this.a.a.V;
        if (kVar != null) {
            kVar.b(i7);
        }
    }

    @Override // te.d
    public /* synthetic */ void l(boolean z9) {
    }

    @Override // te.d
    public /* synthetic */ void D() {
    }

    @Override // te.d
    public /* synthetic */ void a() {
    }
}
