package org.telegram.ui.Components;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class p8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ p8(y8 y8Var, int i7) {
        this.a = i7;
        this.b = y8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i7) {
        switch (this.a) {
            case 0:
                if (i7 == -1) {
                    y8.Z(this.b);
                    break;
                }
                break;
            default:
                y8 y8Var = this.b;
                if (i7 == -1) {
                    y8.Z(y8Var);
                }
                if (i7 == 1) {
                    y8Var.k0();
                    break;
                }
                break;
        }
    }
}
