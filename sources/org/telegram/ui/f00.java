package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g00 b;

    public /* synthetic */ f00(g00 g00Var, int i9) {
        this.a = i9;
        this.b = g00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                g00 g00Var = this.b;
                g00Var.b(g00Var.y);
                break;
        }
    }
}
