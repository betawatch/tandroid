package fi;

import android.widget.FrameLayout;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class q7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ q7(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                x7 x7Var = (x7) this.b;
                x7Var.e0 = f10;
                x7Var.g0 = f11;
                break;
            case 1:
                hi.l5 l5Var = (hi.l5) this.b;
                float f12 = f10 / 1000.0f;
                l5Var.d1 = f12;
                tg.j1 j1Var = l5Var.W0;
                j1Var.setAlpha(f12);
                j1Var.invalidate();
                l5Var.E0.invalidate();
                l5Var.V0.getTypefaceCell().setAlpha(1.0f - l5Var.d1);
                break;
            case 2:
                pg.i iVar = (pg.i) this.b;
                float f13 = f10 / 1000.0f;
                y61 y61Var = iVar.a;
                y61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                y61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                y61Var.setScaleX(f13);
                y61Var.setScaleY(f13);
                y61Var.setAlpha(c8.l9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                tg.g0 g0Var = (tg.g0) this.b;
                float f14 = f10 / 1000.0f;
                g0Var.n1 = f14;
                tg.j1 j1Var2 = g0Var.f1;
                j1Var2.setAlpha(f14);
                j1Var2.invalidate();
                g0Var.N0.invalidate();
                g0Var.e1.getTypefaceCell().setAlpha(1.0f - g0Var.n1);
                break;
        }
    }
}
