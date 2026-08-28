package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8 b;

    public /* synthetic */ n8(w8 w8Var, int i9) {
        this.a = i9;
        this.b = w8Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i9) {
        switch (this.a) {
            case 0:
                if (i9 == -1) {
                    w8.T(this.b);
                    break;
                }
                break;
            default:
                w8 w8Var = this.b;
                if (i9 == -1) {
                    w8.T(w8Var);
                }
                if (i9 == 1) {
                    w8Var.e0();
                    break;
                }
                break;
        }
    }
}
