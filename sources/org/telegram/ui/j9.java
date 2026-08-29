package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j9 implements o1.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ r9 b;

    public /* synthetic */ j9(r9 r9Var, int i10) {
        this.a = i10;
        this.b = r9Var;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.a) {
            case 0:
                r9 r9Var = this.b;
                r9Var.y = f9 / 500.0f;
                r9Var.fragmentView.invalidate();
                break;
            default:
                r9 r9Var2 = this.b;
                r9Var2.W = r9Var2.I ? f9 / 500.0f : 1.0f - (f9 / 500.0f);
                r9Var2.fragmentView.invalidate();
                break;
        }
    }
}
