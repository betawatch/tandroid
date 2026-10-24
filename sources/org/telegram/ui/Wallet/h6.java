package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h6 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                m6.b((m6) this.b, z10, f7);
                break;
            default:
                j9 j9Var = (j9) this.b;
                j9Var.Z = null;
                j9Var.a0 = 1.0f;
                j9Var.B0();
                break;
        }
    }
}
