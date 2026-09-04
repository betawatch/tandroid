package org.telegram.ui.Components;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class no0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ vo0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ no0(vo0 vo0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = vo0Var;
        this.c = kVar;
    }

    @Override // o1.f
    public final void a(o1.h hVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    hVar.c();
                    break;
                }
                break;
            default:
                vo0 vo0Var = this.b;
                if (!z10) {
                    vo0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    vo0Var.getClass();
                    break;
                }
        }
    }
}
