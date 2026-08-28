package org.telegram.ui.Components;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i80 b;
    public final /* synthetic */ m80 c;

    public /* synthetic */ h80(i80 i80Var, m80 m80Var, int i9) {
        this.a = i9;
        this.b = i80Var;
        this.c = m80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
