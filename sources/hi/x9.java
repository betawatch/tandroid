package hi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class x9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x9(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
        switch (this.a) {
            case 0:
                nb nbVar = (nb) this.c;
                if (!z10) {
                    nbVar.N0.setTranslationY(this.b);
                    nbVar.N0.L = false;
                    nbVar.p2 = null;
                    nbVar.q2 = null;
                    break;
                }
                break;
            default:
                ki.s3 s3Var = (ki.s3) this.c;
                s3Var.w = null;
                float f12 = this.b;
                if (!z10) {
                    s3Var.f = f12;
                    s3Var.c();
                    break;
                } else {
                    s3Var.h = f12;
                    break;
                }
        }
    }
}
