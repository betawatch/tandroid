package org.telegram.ui.Components;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class so0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ so0(ap0 ap0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = ap0Var;
        this.c = jVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z4, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z4) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                ap0 ap0Var = this.b;
                if (!z4) {
                    ap0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    ap0Var.getClass();
                    break;
                }
        }
    }
}
