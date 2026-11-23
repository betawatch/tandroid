package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ pn0 b;
    public final /* synthetic */ r1.g c;

    public /* synthetic */ hn0(pn0 pn0Var, r1.g gVar, int i7) {
        this.a = i7;
        this.b = pn0Var;
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
                pn0 pn0Var = this.b;
                if (!z10) {
                    pn0Var.z.remove(this.c);
                    gVar.d();
                    break;
                } else {
                    pn0Var.getClass();
                    break;
                }
        }
    }
}
