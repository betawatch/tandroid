package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ x9 b;

    public /* synthetic */ p9(x9 x9Var, int i10) {
        this.a = i10;
        this.b = x9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                x9 x9Var = this.b;
                x9Var.y = f10 / 500.0f;
                x9Var.fragmentView.invalidate();
                break;
            default:
                x9 x9Var2 = this.b;
                x9Var2.X = x9Var2.J ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                x9Var2.fragmentView.invalidate();
                break;
        }
    }
}
