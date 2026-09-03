package ag;

import android.widget.FrameLayout;
import eg.c1;
import eg.o2;
import oh.a8;
import org.telegram.messenger.AndroidUtilities;
import qh.a5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ c(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                float f12 = f10 / 1000.0f;
                l lVar = oVar.a;
                lVar.setPivotX(AndroidUtilities.dp(28.0f));
                lVar.setPivotY(AndroidUtilities.dp(28.0f));
                lVar.setScaleX(f12);
                lVar.setScaleY(f12);
                lVar.setAlpha(k7.o.a(f12, 0.0f, 1.0f));
                oVar.invalidate();
                break;
            case 1:
                c1 c1Var = (c1) this.b;
                float f13 = f10 / 1000.0f;
                c1Var.A1 = f13;
                o2 o2Var = c1Var.s1;
                o2Var.setAlpha(f13);
                o2Var.invalidate();
                c1Var.a1.invalidate();
                c1Var.r1.getTypefaceCell().setAlpha(1.0f - c1Var.A1);
                break;
            case 2:
                a8 a8Var = (a8) this.b;
                a8Var.a0 = f10;
                a8Var.c0 = f11;
                break;
            default:
                a5 a5Var = (a5) this.b;
                float f14 = f10 / 1000.0f;
                a5Var.q1 = f14;
                o2 o2Var2 = a5Var.j1;
                o2Var2.setAlpha(f14);
                o2Var2.invalidate();
                a5Var.R0.invalidate();
                a5Var.i1.getTypefaceCell().setAlpha(1.0f - a5Var.q1);
                break;
        }
    }
}
