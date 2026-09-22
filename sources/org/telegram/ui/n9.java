package org.telegram.ui;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class n9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ v9 b;

    public /* synthetic */ n9(v9 v9Var, int i10) {
        this.a = i10;
        this.b = v9Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                v9 v9Var = this.b;
                v9Var.y = f7 / 500.0f;
                v9Var.fragmentView.invalidate();
                break;
            default:
                v9 v9Var2 = this.b;
                v9Var2.a0 = v9Var2.M ? f7 / 500.0f : 1.0f - (f7 / 500.0f);
                v9Var2.fragmentView.invalidate();
                break;
        }
    }
}
