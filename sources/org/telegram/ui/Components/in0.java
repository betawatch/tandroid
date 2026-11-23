package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn0 b;
    public final /* synthetic */ r1.g c;

    public /* synthetic */ in0(qn0 qn0Var, r1.g gVar, int i7) {
        this.a = i7;
        this.b = qn0Var;
        this.c = gVar;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    gVar.d();
                    break;
                }
                break;
            default:
                qn0 qn0Var = this.b;
                if (!z10) {
                    qn0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    qn0Var.getClass();
                    break;
                }
        }
    }
}
