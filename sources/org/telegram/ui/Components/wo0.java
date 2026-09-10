package org.telegram.ui.Components;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class wo0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ fp0 b;
    public final /* synthetic */ o1.k c;

    public /* synthetic */ wo0(fp0 fp0Var, o1.k kVar, int i10) {
        this.a = i10;
        this.b = fp0Var;
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
                fp0 fp0Var = this.b;
                if (!z10) {
                    fp0Var.z.remove(this.c);
                    hVar.c();
                    break;
                } else {
                    fp0Var.getClass();
                    break;
                }
        }
    }
}
