package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.sb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Components.bx0;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.d41;
import org.telegram.ui.f41;
import org.telegram.ui.ig0;
import org.telegram.ui.kd1;
import org.telegram.ui.oo;
import org.telegram.ui.r30;
import org.telegram.ui.v3;
import org.telegram.ui.wn;
import org.telegram.ui.x50;
import org.telegram.ui.zv0;
import sg.u2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class l0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
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
        d41 d41Var;
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.d;
                if (o0Var.T == anim) {
                    o0Var.T = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            case 1:
                z0 z0Var = (z0) this.d;
                z0Var.h0();
                z0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
            case 2:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 3:
                super.onAnimationEnd(anim);
                bh.i0 i0Var = (bh.i0) this.d;
                i0Var.E.remove((ValueAnimator) this.c);
                bh.i0.a(i0Var, this.b);
                return;
            case 4:
                ((sb) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 5:
                v3 v3Var = (v3) this.d;
                v3Var.x = this.b ? 1.0f : 0.0f;
                if (!v3Var.n) {
                    v3Var.n();
                }
                v3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                v3Var.h();
                return;
            case 6:
                wn wnVar = (wn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = wnVar.R8;
                if (bitmap != null) {
                    wnVar.S8 = null;
                    wnVar.T8 = null;
                    bitmap.recycle();
                    wnVar.R8 = null;
                }
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
                wnVar.Db(null);
                wnVar.c9 = null;
                wnVar.j1.invalidate();
                wnVar.x0.invalidate();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                ((oo) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 8:
                in0 in0Var = (in0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                in0Var.r = f7;
                in0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                in0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, in0Var.r));
                in0Var.y.setAlpha(in0Var.r);
                in0Var.s.invalidate();
                in0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 9:
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
            case 10:
                x50 x50Var = (x50) this.d;
                r30 r30Var = x50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                x50Var.d.getNotificationCenter().onAnimationFinish(x50Var.d3);
                x50Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                x50Var.d2 = f10;
                x50Var.a2.n = f10;
                if (z10) {
                    r30Var.setAlpha(1.0f);
                    r30Var.setScaleX(1.0f);
                    r30Var.setScaleY(1.0f);
                    r30Var.setTranslationX(0.0f);
                    r30Var.setTranslationY(0.0f);
                } else {
                    x50Var.W2.setAlpha(0);
                    x50Var.b1();
                    if (x50Var.e2.getParent() != null) {
                        viewGroup2 = ((k3) x50Var).containerView;
                        viewGroup2.removeView(x50Var.e2);
                    }
                    x50Var.e2 = null;
                    r30Var.setVisibility(8);
                    x50Var.f2 = false;
                    x50Var.Y.X = true;
                    x50Var.b2.setVisibility(8);
                    if (x50Var.s0) {
                        x50Var.s0 = false;
                        x50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = x50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                x50Var.S0();
                viewGroup = ((k3) x50Var).containerView;
                viewGroup.invalidate();
                x50Var.b.invalidate();
                x50Var.Q.invalidate();
                return;
            case 11:
                bx0 bx0Var = (bx0) this.c;
                ig0 ig0Var = (ig0) this.d;
                if (ig0Var.J == 0 && this.b) {
                    ig0Var.A1(true, true);
                }
                bx0Var.setVisibility(8);
                bx0Var.g();
                bx0Var.setX(0.0f);
                return;
            case 12:
                zv0 zv0Var = (zv0) this.d;
                zv0Var.y = this.b ? 1.0f : 0.0f;
                zv0Var.c.invalidate();
                zv0Var.d.invalidate();
                zv0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                f41 f41Var = (f41) this.d;
                f41Var.s = this.b ? 1.0f : 0.0f;
                f41Var.b.invalidate();
                f41Var.c.invalidate();
                f41Var.e();
                TextView textView = f41Var.y;
                if (textView != null) {
                    textView.setAlpha(f41Var.s);
                }
                if (f41Var.S) {
                    f41Var.N.invalidate();
                }
                if (!f41Var.S && (d41Var = f41Var.N) != null && d41Var.getSeekBarWaveform() != null) {
                    qp0 seekBarWaveform = f41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = f41Var.s;
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 14:
                kd1 kd1Var = (kd1) this.d;
                kd1Var.x = this.b ? 1.0f : 0.0f;
                kd1Var.b.invalidate();
                kd1Var.c.invalidate();
                kd1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                u2 u2Var = (u2) this.d;
                bi.r rVar = u2Var.c;
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
        }
    }

    public /* synthetic */ l0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public l0(o0 o0Var, Runnable runnable) {
        this.a = 0;
        this.d = o0Var;
        this.c = runnable;
    }

    public l0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.a = 2;
        this.c = viewGroup;
        this.b = z10;
        this.d = gVar;
    }
}
