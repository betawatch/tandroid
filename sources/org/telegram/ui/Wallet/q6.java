package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q6 implements r1.c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q6(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        switch (this.a) {
            case 0:
                v6.b((v6) this.b, z9, f10);
                break;
            default:
                m9 m9Var = (m9) this.b;
                m9Var.a0 = null;
                m9Var.b0 = 1.0f;
                m9Var.G0();
                break;
        }
    }
}
