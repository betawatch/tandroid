package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ pz(n00 n00Var, int i9) {
        this.a = i9;
        this.b = n00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                n00.U(this.b);
                break;
            default:
                n00.V(this.b);
                break;
        }
    }
}
