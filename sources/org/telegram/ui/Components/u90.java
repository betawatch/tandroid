package org.telegram.ui.Components;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class u90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v90 b;
    public final /* synthetic */ z90 c;

    public /* synthetic */ u90(v90 v90Var, z90 z90Var, int i10) {
        this.a = i10;
        this.b = v90Var;
        this.c = z90Var;
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
