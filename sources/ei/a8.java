package ei;

import android.widget.FrameLayout;
import b8.be;
import org.telegram.ui.n61;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a8 implements q1.d {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ a8(int i3, FrameLayout frameLayout) {
        this.a = i3;
        this.b = frameLayout;
    }

    @Override // q1.d
    public final void a(q1.g gVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                h8 h8Var = (h8) this.b;
                h8Var.e0 = f10;
                h8Var.g0 = f11;
                break;
            case 1:
                gi.m5 m5Var = (gi.m5) this.b;
                float f12 = f10 / 1000.0f;
                m5Var.d1 = f12;
                ug.i1 i1Var = m5Var.W0;
                i1Var.setAlpha(f12);
                i1Var.invalidate();
                m5Var.E0.invalidate();
                m5Var.V0.getTypefaceCell().setAlpha(1.0f - m5Var.d1);
                break;
            case 2:
                qg.h hVar = (qg.h) this.b;
                float f13 = f10 / 1000.0f;
                n61 n61Var = hVar.a;
                n61Var.setPivotX(org.telegram.messenger.g0.L(28.0f));
                n61Var.setPivotY(org.telegram.messenger.g0.L(28.0f));
                n61Var.setScaleX(f13);
                n61Var.setScaleY(f13);
                n61Var.setAlpha(be.a(f13, 0.0f, 1.0f));
                hVar.invalidate();
                break;
            default:
                ug.f0 f0Var = (ug.f0) this.b;
                float f14 = f10 / 1000.0f;
                f0Var.n1 = f14;
                ug.i1 i1Var2 = f0Var.f1;
                i1Var2.setAlpha(f14);
                i1Var2.invalidate();
                f0Var.N0.invalidate();
                f0Var.e1.getTypefaceCell().setAlpha(1.0f - f0Var.n1);
                break;
        }
    }
}
