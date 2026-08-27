package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class m8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ m8(v8 v8Var, int i10) {
        this.a = i10;
        this.b = v8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    v8.U(this.b);
                    break;
                }
                break;
            default:
                v8 v8Var = this.b;
                if (i10 == -1) {
                    v8.U(v8Var);
                }
                if (i10 == 1) {
                    v8Var.f0();
                    break;
                }
                break;
        }
    }
}
