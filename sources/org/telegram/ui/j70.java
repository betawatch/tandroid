package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j70 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q70 b;

    public /* synthetic */ j70(q70 q70Var, int i9) {
        this.a = i9;
        this.b = q70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q70 q70Var = this.b;
                q70Var.h.postOnAnimation(new j70(q70Var, 1));
                break;
            default:
                this.b.X();
                break;
        }
    }
}
