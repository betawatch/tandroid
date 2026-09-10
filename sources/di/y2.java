package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.d8;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.dr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class y2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                n3 n3Var = (n3) this.c;
                n3Var.P.setColor(this.b);
                n3Var.A();
                n3Var.e.invalidate();
                org.telegram.ui.e3 e3Var = n3Var.U0;
                if (e3Var != null) {
                    e3Var.b(AndroidUtilities.computePerceivedBrightness(n3Var.P.getColor()) <= 0.721f, false);
                    n3Var.U0.setBackgroundColor(n3Var.P.getColor());
                }
                n3Var.F();
                break;
            case 1:
                u4 u4Var = (u4) this.c;
                n4 n4Var = u4Var.n;
                if (n4Var.getWebView() != null) {
                    n4Var.getWebView().setScrollY(this.b);
                }
                if (animator == u4Var.r) {
                    u4Var.r = null;
                    break;
                }
                break;
            case 2:
                hi.x4 x4Var = (hi.x4) this.c;
                x4Var.W = this.b;
                x4Var.a0 = 0.0f;
                x4Var.requestLayout();
                x4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.c;
                if (!d4Var.c()) {
                    d4Var.b(this.b);
                }
                d4Var.d0 = null;
                break;
            case 4:
                ((n6) this.c).r(this.b);
                break;
            case 5:
                ((d8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((wp) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(wr.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                iy iyVar = (iy) this.c;
                qg.s0 s0Var = iyVar.h;
                int i10 = this.b;
                s0Var.setVisibility(i10 == 1 ? 0 : 8);
                iyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                iyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                sh0 sh0Var = (sh0) this.c;
                sh0Var.H = null;
                sh0Var.P.d1.delete(this.b);
                break;
            case 9:
                dr drVar = (dr) this.c;
                ((zk0) drVar.d).b.remove(this.b);
                zk0 zk0Var = (zk0) drVar.d;
                zk0Var.d = true;
                zk0Var.a.invalidate();
                break;
            case 10:
                ct0 ct0Var = (ct0) this.c;
                ct0Var.e.O1.remove(this.b);
                ct0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.c1 c1Var = (org.telegram.ui.Components.voip.c1) this.c;
                c1Var.x = -1;
                c1Var.v = this.b;
                c1Var.s = 0.0f;
                c1Var.U = null;
                c1Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                iy iyVar = (iy) this.c;
                iyVar.h.setVisibility(0);
                iyVar.e.setVisibility(0);
                iyVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
