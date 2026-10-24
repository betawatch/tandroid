package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g6 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ m6 b;

    public /* synthetic */ g6(m6 m6Var, int i10) {
        this.a = i10;
        this.b = m6Var;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f7, float f10) {
        switch (this.a) {
            case 0:
                m6 m6Var = this.b;
                m6Var.c.setScaleX(f7);
                m6Var.c.setScaleY(f7);
                break;
            default:
                this.b.P = f10;
                break;
        }
    }
}
