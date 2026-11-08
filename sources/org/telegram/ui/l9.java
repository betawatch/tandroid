package org.telegram.ui;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l9 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                s9 s9Var = (s9) this.b;
                r1.g gVar2 = s9Var.D;
                if (gVar2 != null) {
                    gVar2.d();
                    s9Var.D = null;
                    break;
                }
                break;
            case 1:
                dl0 dl0Var = (dl0) this.b;
                if (gVar == dl0Var.c) {
                    dl0Var.c = null;
                    break;
                }
                break;
            default:
                ((iq0) this.b).E();
                break;
        }
    }
}
