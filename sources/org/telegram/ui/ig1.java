package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ig1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg1 b;

    public /* synthetic */ ig1(jg1 jg1Var, int i10) {
        this.a = i10;
        this.b = jg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.d71 d71Var = this.b.a;
                if (d71Var != null) {
                    d71Var.Z2.N(true);
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.d71 d71Var2 = this.b.a;
                if (d71Var2 != null) {
                    d71Var2.Z2.N(true);
                    break;
                }
                break;
        }
    }
}
