package fi;

import android.widget.FrameLayout;
import org.telegram.ui.w61;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t7 implements r1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ t7(int i7, FrameLayout frameLayout) {
        this.a = i7;
        this.b = frameLayout;
    }

    @Override // r1.d
    public final void a(r1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                a8 a8Var = (a8) this.b;
                a8Var.e0 = f10;
                a8Var.g0 = f11;
                break;
            case 1:
                hi.m5 m5Var = (hi.m5) this.b;
                float f12 = f10 / 1000.0f;
                m5Var.d1 = f12;
                tg.j1 j1Var = m5Var.W0;
                j1Var.setAlpha(f12);
                j1Var.invalidate();
                m5Var.E0.invalidate();
                m5Var.V0.getTypefaceCell().setAlpha(1.0f - m5Var.d1);
                break;
            case 2:
                pg.i iVar = (pg.i) this.b;
                float f13 = f10 / 1000.0f;
                w61 w61Var = iVar.a;
                w61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                w61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                w61Var.setScaleX(f13);
                w61Var.setScaleY(f13);
                w61Var.setAlpha(c8.i9.a(f13, 0.0f, 1.0f));
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
