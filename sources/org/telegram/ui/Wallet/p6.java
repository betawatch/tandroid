package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class p6 implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p6(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                u6.b((u6) this.b, z10, f10);
                break;
            default:
                m9 m9Var = (m9) this.b;
                m9Var.b0 = null;
                m9Var.c0 = 1.0f;
                m9Var.G0();
                break;
        }
    }
}
