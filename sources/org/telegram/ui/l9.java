package org.telegram.ui;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                t9 t9Var = (t9) this.b;
                r1.g gVar2 = t9Var.E;
                if (gVar2 != null) {
                    gVar2.d();
                    t9Var.E = null;
                    break;
                }
                break;
            case 1:
                gl0 gl0Var = (gl0) this.b;
                if (gVar == gl0Var.c) {
                    gl0Var.c = null;
                    break;
                }
                break;
            default:
                ((hq0) this.b).E();
                break;
        }
    }
}
