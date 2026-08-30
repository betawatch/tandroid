package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import dg.u3;
import dg.y3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.c60;
import org.telegram.ui.n41;
import org.telegram.ui.ng0;
import org.telegram.ui.p41;
import org.telegram.ui.po;
import org.telegram.ui.rd1;
import org.telegram.ui.rv0;
import org.telegram.ui.xn;
import org.telegram.ui.y30;
import ph.da;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        n41 n41Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                y3 y3Var = (y3) this.d;
                u3 u3Var = y3Var.c;
                float f10 = this.b ? 1.0f : 0.0f;
                y3Var.y = f10;
                u3Var.setAlpha(f10);
                u3Var.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, y3Var.y));
                u3Var.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, y3Var.y));
                y3Var.b.invalidate();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(anim);
                mg.d0 d0Var = (mg.d0) this.d;
                d0Var.E.remove((ValueAnimator) this.c);
                mg.d0.a(d0Var, this.b);
                return;
            case 3:
                org.telegram.ui.y3 y3Var2 = (org.telegram.ui.y3) this.d;
                y3Var2.x = this.b ? 1.0f : 0.0f;
                if (!y3Var2.n) {
                    y3Var2.n();
                }
                y3Var2.i();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                y3Var2.h();
                return;
            case 4:
                xn xnVar = (xn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = xnVar.y8;
                if (bitmap != null) {
                    xnVar.z8 = null;
                    xnVar.A8 = null;
                    bitmap.recycle();
                    xnVar.y8 = null;
                }
                t1 t1Var = (t1) this.c;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
                xnVar.ob(null);
                xnVar.J8 = null;
                xnVar.U0.invalidate();
                xnVar.u0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((po) this.d).K.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 6:
                im0 im0Var = (im0) this.d;
                float f11 = this.b ? 1.0f : 0.0f;
                im0Var.r = f11;
                im0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                im0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, im0Var.r));
                im0Var.y.setAlpha(im0Var.r);
                im0Var.s.invalidate();
                im0Var.v.invalidate();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    AndroidUtilities.runOnUIThread(runnable3);
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
                c60 c60Var = (c60) this.d;
                y30 y30Var = c60Var.z2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                c60Var.d.getNotificationCenter().onAnimationFinish(c60Var.a3);
                c60Var.Z2 = false;
                boolean z4 = this.b;
                float f12 = z4 ? 1.0f : 0.0f;
                c60Var.a2 = f12;
                c60Var.X1.n = f12;
                if (z4) {
                    y30Var.setAlpha(1.0f);
                    y30Var.setScaleX(1.0f);
                    y30Var.setScaleY(1.0f);
                    y30Var.setTranslationX(0.0f);
                    y30Var.setTranslationY(0.0f);
                } else {
                    c60Var.T2.setAlpha(0);
                    c60Var.b1();
                    if (c60Var.b2.getParent() != null) {
                        viewGroup2 = ((g3) c60Var).containerView;
                        viewGroup2.removeView(c60Var.b2);
                    }
                    c60Var.b2 = null;
                    y30Var.setVisibility(8);
                    c60Var.c2 = false;
                    c60Var.V.X = true;
                    c60Var.Y1.setVisibility(8);
                    if (c60Var.p0) {
                        c60Var.p0 = false;
                        c60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = c60Var.W2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                c60Var.S0();
                viewGroup = ((g3) c60Var).containerView;
                viewGroup.invalidate();
                c60Var.b.invalidate();
                c60Var.N.invalidate();
                return;
            case 9:
                vv0 vv0Var = (vv0) this.c;
                ng0 ng0Var = (ng0) this.d;
                if (ng0Var.G == 0 && this.b) {
                    ng0Var.v1(true, true);
                }
                vv0Var.setVisibility(8);
                vv0Var.g();
                vv0Var.setX(0.0f);
                return;
            case 10:
                rv0 rv0Var = (rv0) this.d;
                rv0Var.y = this.b ? 1.0f : 0.0f;
                rv0Var.c.invalidate();
                rv0Var.d.invalidate();
                rv0Var.e();
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 11:
                p41 p41Var = (p41) this.d;
                p41Var.s = this.b ? 1.0f : 0.0f;
                p41Var.b.invalidate();
                p41Var.c.invalidate();
                p41Var.e();
                TextView textView = p41Var.y;
                if (textView != null) {
                    textView.setAlpha(p41Var.s);
                }
                if (p41Var.P) {
                    p41Var.K.invalidate();
                }
                if (!p41Var.P && (n41Var = p41Var.K) != null && n41Var.getSeekBarWaveform() != null) {
                    mo0 seekBarWaveform = p41Var.K.getSeekBarWaveform();
                    seekBarWaveform.L = p41Var.s;
                    t1 t1Var2 = seekBarWaveform.n;
                    if (t1Var2 != null) {
                        t1Var2.invalidate();
                    }
                }
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 12:
                rd1 rd1Var = (rd1) this.d;
                rd1Var.x = this.b ? 1.0f : 0.0f;
                rd1Var.b.invalidate();
                rd1Var.c.invalidate();
                rd1Var.e();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    runnable6.run();
                    return;
                }
                return;
            default:
                ((da) this.d).n0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
        }
    }

    public /* synthetic */ g(Object obj, boolean z4, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z4;
        this.c = obj2;
    }

    public g(ViewGroup viewGroup, boolean z4, u0 u0Var, h hVar) {
        this.a = 0;
        this.c = viewGroup;
        this.b = z4;
        this.d = hVar;
    }
}
