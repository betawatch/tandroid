package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j00 b;

    public /* synthetic */ i00(j00 j00Var, int i10) {
        this.a = i10;
        this.b = j00Var;
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
                j00 j00Var = this.b;
                j00Var.b(j00Var.y);
                break;
        }
    }
}
