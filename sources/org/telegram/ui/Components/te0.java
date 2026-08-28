package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class te0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze0 b;

    public /* synthetic */ te0(ze0 ze0Var, int i9) {
        this.a = i9;
        this.b = ze0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.e();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
