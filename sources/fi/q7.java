package fi;

import android.widget.FrameLayout;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                hi.v5 v5Var = (hi.v5) this.b;
                float f12 = f10 / 1000.0f;
                v5Var.d1 = f12;
                tg.o1 o1Var = v5Var.W0;
                o1Var.setAlpha(f12);
                o1Var.invalidate();
                v5Var.E0.invalidate();
                v5Var.V0.getTypefaceCell().setAlpha(1.0f - v5Var.d1);
                break;
            case 2:
                pg.i iVar = (pg.i) this.b;
                float f13 = f10 / 1000.0f;
                w61 w61Var = iVar.a;
                w61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                w61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                w61Var.setScaleX(f13);
                w61Var.setScaleY(f13);
                w61Var.setAlpha(c8.m9.a(f13, 0.0f, 1.0f));
                iVar.invalidate();
                break;
            default:
                tg.l0 l0Var = (tg.l0) this.b;
                float f14 = f10 / 1000.0f;
                l0Var.n1 = f14;
                tg.o1 o1Var2 = l0Var.f1;
                o1Var2.setAlpha(f14);
                o1Var2.invalidate();
                l0Var.N0.invalidate();
                l0Var.e1.getTypefaceCell().setAlpha(1.0f - l0Var.n1);
                break;
        }
    }
}
