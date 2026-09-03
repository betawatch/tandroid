package org.telegram.ui.Components;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ ro0(zo0 zo0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = zo0Var;
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
                zo0 zo0Var = this.b;
                if (!z4) {
                    zo0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    zo0Var.getClass();
                    break;
                }
        }
    }
}
