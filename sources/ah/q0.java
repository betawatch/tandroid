package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ei.vb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.b41;
import org.telegram.ui.ed1;
import org.telegram.ui.ig0;
import org.telegram.ui.ko;
import org.telegram.ui.n30;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
import org.telegram.ui.uv0;
import org.telegram.ui.w3;
import org.telegram.ui.z31;
import rg.u2;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        z31 z31Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(anim);
                t0 t0Var = (t0) this.d;
                t0Var.E.remove((ValueAnimator) this.c);
                t0.a(t0Var, this.b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 2:
                ((vb) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 3:
                w3 w3Var = (w3) this.d;
                w3Var.x = this.b ? 1.0f : 0.0f;
                if (!w3Var.n) {
                    w3Var.n();
                }
                w3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                w3Var.h();
                return;
            case 4:
                sn snVar = (sn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = snVar.N8;
                if (bitmap != null) {
                    snVar.O8 = null;
                    snVar.P8 = null;
                    bitmap.recycle();
                    snVar.N8 = null;
                }
                t1 t1Var = (t1) this.c;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
                snVar.ub(null);
                snVar.Y8 = null;
                snVar.j1.invalidate();
                snVar.x0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((ko) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 6:
                cn0 cn0Var = (cn0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                cn0Var.r = f7;
                cn0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                cn0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, cn0Var.r));
                cn0Var.y.setAlpha(cn0Var.r);
                cn0Var.s.invalidate();
                cn0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.t tVar = (org.telegram.ui.Components.voip.t) this.d;
                org.telegram.ui.Components.voip.t tVar2 = (org.telegram.ui.Components.voip.t) this.c;
                tVar2.setScaleX(1.0f);
                tVar2.setScaleY(1.0f);
                tVar2.setAlpha(1.0f);
                if (this.b) {
                    tVar.x.removeView(tVar2);
                    tVar.e();
                }
                tVar2.setVisibility(8);
                return;
            case 8:
                u50 u50Var = (u50) this.d;
                n30 n30Var = u50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                u50Var.d.getNotificationCenter().onAnimationFinish(u50Var.d3);
                u50Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                u50Var.d2 = f10;
                u50Var.a2.n = f10;
                if (z10) {
                    n30Var.setAlpha(1.0f);
                    n30Var.setScaleX(1.0f);
                    n30Var.setScaleY(1.0f);
                    n30Var.setTranslationX(0.0f);
                    n30Var.setTranslationY(0.0f);
                } else {
                    u50Var.W2.setAlpha(0);
                    u50Var.b1();
                    if (u50Var.e2.getParent() != null) {
                        viewGroup2 = ((h3) u50Var).containerView;
                        viewGroup2.removeView(u50Var.e2);
                    }
                    u50Var.e2 = null;
                    n30Var.setVisibility(8);
                    u50Var.f2 = false;
                    u50Var.Y.X = true;
                    u50Var.b2.setVisibility(8);
                    if (u50Var.s0) {
                        u50Var.s0 = false;
                        u50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = u50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                u50Var.S0();
                viewGroup = ((h3) u50Var).containerView;
                viewGroup.invalidate();
                u50Var.b.invalidate();
                u50Var.Q.invalidate();
                return;
            case 9:
                tw0 tw0Var = (tw0) this.c;
                ig0 ig0Var = (ig0) this.d;
                if (ig0Var.J == 0 && this.b) {
                    ig0Var.z1(true, true);
                }
                tw0Var.setVisibility(8);
                tw0Var.g();
                tw0Var.setX(0.0f);
                return;
            case 10:
                uv0 uv0Var = (uv0) this.d;
                uv0Var.y = this.b ? 1.0f : 0.0f;
                uv0Var.c.invalidate();
                uv0Var.d.invalidate();
                uv0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                b41 b41Var = (b41) this.d;
                b41Var.s = this.b ? 1.0f : 0.0f;
                b41Var.b.invalidate();
                b41Var.c.invalidate();
                b41Var.e();
                TextView textView = b41Var.y;
                if (textView != null) {
                    textView.setAlpha(b41Var.s);
                }
                if (b41Var.S) {
                    b41Var.N.invalidate();
                }
                if (!b41Var.S && (z31Var = b41Var.N) != null && z31Var.getSeekBarWaveform() != null) {
                    kp0 seekBarWaveform = b41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = b41Var.s;
                    t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                ed1 ed1Var = (ed1) this.d;
                ed1Var.x = this.b ? 1.0f : 0.0f;
                ed1Var.b.invalidate();
                ed1Var.c.invalidate();
                ed1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 13:
                u2 u2Var = (u2) this.d;
                ai.r rVar = u2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                u2Var.y = f11;
                rVar.setAlpha(f11);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                u2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            case 14:
                zh.b0 b0Var = (zh.b0) this.d;
                if (b0Var.T == anim) {
                    b0Var.T = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            default:
                zh.n0 n0Var = (zh.n0) this.d;
                n0Var.g0();
                n0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
        }
    }

    public /* synthetic */ q0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public q0(zh.b0 b0Var, Runnable runnable) {
        this.a = 14;
        this.d = b0Var;
        this.c = runnable;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.u0 u0Var, androidx.fragment.app.h hVar) {
        this.a = 1;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
