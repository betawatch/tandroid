package gi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ki.u4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.nt0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.qq;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class p2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p2(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        long cameraFlipElapsedMs;
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.c;
                d3Var.P.setColor(this.b);
                d3Var.B();
                d3Var.e.invalidate();
                org.telegram.ui.f3 f3Var = d3Var.U0;
                if (f3Var != null) {
                    f3Var.b(AndroidUtilities.computePerceivedBrightness(d3Var.P.getColor()) <= 0.721f, false);
                    d3Var.U0.setBackgroundColor(d3Var.P.getColor());
                }
                d3Var.G();
                break;
            case 1:
                f4 f4Var = (f4) this.c;
                v2 v2Var = f4Var.n;
                if (v2Var.getWebView() != null) {
                    v2Var.getWebView().setScrollY(this.b);
                }
                if (animator == f4Var.r) {
                    f4Var.r = null;
                    break;
                }
                break;
            case 2:
                u4 u4Var = (u4) this.c;
                u4Var.W = this.b;
                u4Var.a0 = 0.0f;
                u4Var.requestLayout();
                u4Var.invalidate();
                break;
            case 3:
                org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) this.c;
                if (!d4Var.c()) {
                    d4Var.b(this.b);
                }
                d4Var.d0 = null;
                break;
            case 4:
                ((p6) this.c).u(this.b);
                break;
            case 5:
                ((e8) this.c).a[this.b].setVisibility(8);
                break;
            case 6:
                ((aq) this.c).a[this.b].animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(bs.g).setStartDelay(0L).setDuration(100L).start();
                break;
            case 7:
                jy jyVar = (jy) this.c;
                sg.q0 q0Var = jyVar.h;
                int i10 = this.b;
                q0Var.setVisibility(i10 == 1 ? 0 : 8);
                jyVar.e.setVisibility(i10 == 2 ? 0 : 8);
                jyVar.f.setVisibility(i10 == 3 ? 0 : 8);
                break;
            case 8:
                l60 l60Var = (l60) this.c;
                if (this.b == l60Var.s0) {
                    l60Var.x.setRotationY(0.0f);
                    l60Var.q0 = true;
                    l60Var.b0 = null;
                    StringBuilder sb2 = new StringBuilder("RoundVideo camera flip visual animation completed: elapsedMs=");
                    cameraFlipElapsedMs = l60Var.getCameraFlipElapsedMs();
                    sb2.append(cameraFlipElapsedMs);
                    FileLog.d(sb2.toString());
                    l60.l(l60Var);
                    break;
                }
                break;
            case 9:
                ei0 ei0Var = (ei0) this.c;
                ei0Var.H = null;
                ei0Var.P.d1.delete(this.b);
                break;
            case 10:
                qq qqVar = (qq) this.c;
                ((nl0) qqVar.d).b.remove(this.b);
                nl0 nl0Var = (nl0) qqVar.d;
                nl0Var.d = true;
                nl0Var.a.invalidate();
                break;
            case 11:
                nt0 nt0Var = (nt0) this.c;
                nt0Var.e.O1.remove(this.b);
                nt0Var.a.invalidate();
                break;
            default:
                org.telegram.ui.Components.voip.b1 b1Var = (org.telegram.ui.Components.voip.b1) this.c;
                b1Var.x = -1;
                b1Var.v = this.b;
                b1Var.s = 0.0f;
                b1Var.U = null;
                b1Var.e();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 7:
                jy jyVar = (jy) this.c;
                jyVar.h.setVisibility(0);
                jyVar.e.setVisibility(0);
                jyVar.f.setVisibility(0);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
