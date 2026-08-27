package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ xn0(fo0 fo0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = fo0Var;
        this.c = jVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                fo0 fo0Var = this.b;
                if (!z10) {
                    fo0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    fo0Var.getClass();
                    break;
                }
        }
    }
}
