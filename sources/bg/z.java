package bg;

import android.widget.FrameLayout;
import lh.a8;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z implements o1.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ z(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.h
    public final void a(o1.i iVar, float f9, float f10) {
        switch (this.a) {
            case 0:
                g1 g1Var = (g1) this.b;
                float f11 = f9 / 1000.0f;
                g1Var.z1 = f11;
                t2 t2Var = g1Var.r1;
                t2Var.setAlpha(f11);
                t2Var.invalidate();
                g1Var.Z0.invalidate();
                g1Var.q1.getTypefaceCell().setAlpha(1.0f - g1Var.z1);
                break;
            case 1:
                a8 a8Var = (a8) this.b;
                a8Var.W = f9;
                a8Var.b0 = f10;
                break;
            case 2:
                t5 t5Var = (t5) this.b;
                float f12 = f9 / 1000.0f;
                t5Var.p1 = f12;
                t2 t2Var2 = t5Var.i1;
                t2Var2.setAlpha(f12);
                t2Var2.invalidate();
                t5Var.Q0.invalidate();
                t5Var.h1.getTypefaceCell().setAlpha(1.0f - t5Var.p1);
                break;
            default:
                xf.j jVar = (xf.j) this.b;
                float f13 = f9 / 1000.0f;
                rf.d dVar = jVar.a;
                dVar.setPivotX(AndroidUtilities.dp(28.0f));
                dVar.setPivotY(AndroidUtilities.dp(28.0f));
                dVar.setScaleX(f13);
                dVar.setScaleY(f13);
                dVar.setAlpha(i7.w.a(f13, 0.0f, 1.0f));
                jVar.invalidate();
                break;
        }
    }
}
