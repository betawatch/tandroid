package di;

import android.widget.FrameLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a8 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ a8(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                h8 h8Var = (h8) this.b;
                h8Var.d0 = f10;
                h8Var.f0 = f11;
                break;
            case 1:
                fi.o5 o5Var = (fi.o5) this.b;
                float f12 = f10 / 1000.0f;
                o5Var.c1 = f12;
                tg.j1 j1Var = o5Var.V0;
                j1Var.setAlpha(f12);
                j1Var.invalidate();
                o5Var.D0.invalidate();
                o5Var.U0.getTypefaceCell().setAlpha(1.0f - o5Var.c1);
                break;
            case 2:
                pg.j jVar = (pg.j) this.b;
                float f13 = f10 / 1000.0f;
                pg.h hVar = jVar.a;
                hVar.setPivotX(org.telegram.messenger.g0.L(28.0f));
                hVar.setPivotY(org.telegram.messenger.g0.L(28.0f));
                hVar.setScaleX(f13);
                hVar.setScaleY(f13);
                hVar.setAlpha(c8.j9.a(f13, 0.0f, 1.0f));
                jVar.invalidate();
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.b;
                float f14 = f10 / 1000.0f;
                g0Var.m1 = f14;
                tg.j1 j1Var2 = g0Var.e1;
                j1Var2.setAlpha(f14);
                j1Var2.invalidate();
                g0Var.M0.invalidate();
                g0Var.d1.getTypefaceCell().setAlpha(1.0f - g0Var.m1);
                break;
        }
    }
}
