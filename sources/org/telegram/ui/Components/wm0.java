package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wm0 implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ en0 b;
    public final /* synthetic */ q1.g c;

    public /* synthetic */ wm0(en0 en0Var, q1.g gVar, int i3) {
        this.a = i3;
        this.b = en0Var;
        this.c = gVar;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    gVar.d();
                    break;
                }
                break;
            default:
                en0 en0Var = this.b;
                if (!z10) {
                    en0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    en0Var.getClass();
                    break;
                }
        }
    }
}
