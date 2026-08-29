package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.g
    public final void a(o1.i iVar, boolean z10, float f9, float f10) {
        switch (this.a) {
            case 0:
                r9 r9Var = (r9) this.b;
                o1.k kVar = r9Var.x;
                if (kVar != null) {
                    kVar.c();
                    r9Var.x = null;
                    break;
                }
                break;
            case 1:
                xn0 xn0Var = (xn0) this.b;
                if (iVar == xn0Var.c) {
                    xn0Var.c = null;
                    break;
                }
                break;
            default:
                ((kt0) this.b).D();
                break;
        }
    }
}
