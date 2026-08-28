package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ s9 b;

    public /* synthetic */ k9(s9 s9Var, int i9) {
        this.a = i9;
        this.b = s9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                s9 s9Var = this.b;
                s9Var.y = f10 / 500.0f;
                s9Var.fragmentView.invalidate();
                break;
            default:
                s9 s9Var2 = this.b;
                s9Var2.W = s9Var2.I ? f10 / 500.0f : 1.0f - (f10 / 500.0f);
                s9Var2.fragmentView.invalidate();
                break;
        }
    }
}
