package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xh0 b;

    public /* synthetic */ uh0(xh0 xh0Var, int i10) {
        this.a = i10;
        this.b = xh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
