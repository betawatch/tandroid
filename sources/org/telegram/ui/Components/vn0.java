package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vn0 implements o1.f {
    public final /* synthetic */ int a;
    public final /* synthetic */ do0 b;
    public final /* synthetic */ o1.j c;

    public /* synthetic */ vn0(do0 do0Var, o1.j jVar, int i10) {
        this.a = i10;
        this.b = do0Var;
        this.c = jVar;
    }

    @Override // o1.f
    public final void a(o1.j jVar, boolean z10, float f7, float f10) {
        switch (this.a) {
            case 0:
                if (!z10) {
                    this.b.z.remove(this.c);
                    jVar.d();
                    break;
                }
                break;
            default:
                do0 do0Var = this.b;
                if (!z10) {
                    do0Var.z.remove(this.c);
                    jVar.d();
                    break;
                } else {
                    do0Var.getClass();
                    break;
                }
        }
    }
}
