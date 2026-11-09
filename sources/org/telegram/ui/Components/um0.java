package org.telegram.ui.Components;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class um0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;
    public final /* synthetic */ r1.g c;

    public /* synthetic */ um0(cn0 cn0Var, r1.g gVar, int i7) {
        this.a = i7;
        this.b = cn0Var;
        this.c = gVar;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z9) {
                    this.b.z.remove(this.c);
                    gVar.d();
                    break;
                }
                break;
            default:
                cn0 cn0Var = this.b;
                if (!z9) {
                    cn0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    cn0Var.getClass();
                    break;
                }
        }
    }
}
