package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements q1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k9(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // q1.c
    public final void a(q1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                s9 s9Var = (s9) this.b;
                q1.g gVar2 = s9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.E = null;
                    break;
                }
                break;
            case 1:
                zk0 zk0Var = (zk0) this.b;
                if (gVar == zk0Var.c) {
                    zk0Var.c = null;
                    break;
                }
                break;
            default:
                ((zp0) this.b).E();
                break;
        }
    }
}
