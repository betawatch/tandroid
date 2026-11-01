package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m9 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                u9 u9Var = (u9) this.b;
                o1.j jVar2 = u9Var.D;
                if (jVar2 != null) {
                    jVar2.d();
                    u9Var.D = null;
                    break;
                }
                break;
            case 1:
                mm0 mm0Var = (mm0) this.b;
                if (jVar == mm0Var.c) {
                    mm0Var.c = null;
                    break;
                }
                break;
            default:
                ((sr0) this.b).E();
                break;
        }
    }
}
