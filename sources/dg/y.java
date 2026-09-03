package dg;

import android.widget.FrameLayout;
import nh.a8;
import org.telegram.messenger.AndroidUtilities;
import ph.c5;
import ph.z4;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y implements o1.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;

    public /* synthetic */ y(int i10, FrameLayout frameLayout) {
        this.a = i10;
        this.b = frameLayout;
    }

    @Override // o1.g
    public final void a(o1.h hVar, float f10, float f11) {
        switch (this.a) {
            case 0:
                e1 e1Var = (e1) this.b;
                float f12 = f10 / 1000.0f;
                e1Var.A1 = f12;
                q2 q2Var = e1Var.s1;
                q2Var.setAlpha(f12);
                q2Var.invalidate();
                e1Var.a1.invalidate();
                e1Var.r1.getTypefaceCell().setAlpha(1.0f - e1Var.A1);
                break;
            case 1:
                a8 a8Var = (a8) this.b;
                a8Var.a0 = f10;
                a8Var.c0 = f11;
                break;
            case 2:
                c5 c5Var = (c5) this.b;
                float f13 = f10 / 1000.0f;
                c5Var.q1 = f13;
                q2 q2Var2 = c5Var.j1;
                q2Var2.setAlpha(f13);
                q2Var2.invalidate();
                c5Var.R0.invalidate();
                c5Var.i1.getTypefaceCell().setAlpha(1.0f - c5Var.q1);
                break;
            default:
                zf.h hVar2 = (zf.h) this.b;
                float f14 = f10 / 1000.0f;
                z4 z4Var = hVar2.a;
                z4Var.setPivotX(AndroidUtilities.dp(28.0f));
                z4Var.setPivotY(AndroidUtilities.dp(28.0f));
                z4Var.setScaleX(f14);
                z4Var.setScaleY(f14);
                z4Var.setAlpha(k7.n.a(f14, 0.0f, 1.0f));
                hVar2.invalidate();
                break;
        }
    }
}
