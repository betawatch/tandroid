package org.telegram.ui.Components;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ho0 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ ho0(po0 po0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = po0Var;
        this.c = kVar;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    iVar.c();
                    break;
                }
                break;
            default:
                po0 po0Var = this.b;
                if (!z10) {
                    po0Var.z.remove(this.c);
                    iVar.c();
                    break;
                } else {
                    po0Var.getClass();
                    break;
                }
        }
    }
}
