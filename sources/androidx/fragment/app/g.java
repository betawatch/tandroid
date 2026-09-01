package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import eg.s3;
import eg.w3;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.Components.wv0;
import org.telegram.ui.d60;
import org.telegram.ui.og0;
import org.telegram.ui.p41;
import org.telegram.ui.po;
import org.telegram.ui.r41;
import org.telegram.ui.tv0;
import org.telegram.ui.ud1;
import org.telegram.ui.xn;
import org.telegram.ui.y3;
import org.telegram.ui.z30;
import qh.ca;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
        p41 p41Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                w3 w3Var = (w3) this.d;
                s3 s3Var = w3Var.c;
                float f10 = this.b ? 1.0f : 0.0f;
                w3Var.y = f10;
                s3Var.setAlpha(f10);
                s3Var.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, w3Var.y));
                s3Var.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, w3Var.y));
                w3Var.b.invalidate();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(anim);
                ng.d0 d0Var = (ng.d0) this.d;
                d0Var.E.remove((ValueAnimator) this.c);
                ng.d0.a(d0Var, this.b);
                return;
            case 3:
                y3 y3Var = (y3) this.d;
                y3Var.x = this.b ? 1.0f : 0.0f;
                if (!y3Var.n) {
                    y3Var.n();
                }
                y3Var.i();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                y3Var.h();
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
                jm0 jm0Var = (jm0) this.d;
                float f11 = this.b ? 1.0f : 0.0f;
                jm0Var.r = f11;
                jm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                jm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, jm0Var.r));
                jm0Var.y.setAlpha(jm0Var.r);
                jm0Var.s.invalidate();
                jm0Var.v.invalidate();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    AndroidUtilities.runOnUIThread(runnable3);
                    return;
                }
                return;
            case 7:
                org.telegram.ui.Components.voip.u uVar = (org.telegram.ui.Components.voip.u) this.d;
                org.telegram.ui.Components.voip.u uVar2 = (org.telegram.ui.Components.voip.u) this.c;
                uVar2.setScaleX(1.0f);
                uVar2.setScaleY(1.0f);
                uVar2.setAlpha(1.0f);
                if (this.b) {
                    uVar.x.removeView(uVar2);
                    uVar.e();
                }
                uVar2.setVisibility(8);
                return;
            case 8:
                d60 d60Var = (d60) this.d;
                z30 z30Var = d60Var.z2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                d60Var.d.getNotificationCenter().onAnimationFinish(d60Var.a3);
                d60Var.Z2 = false;
                boolean z4 = this.b;
                float f12 = z4 ? 1.0f : 0.0f;
                d60Var.a2 = f12;
                d60Var.X1.n = f12;
                if (z4) {
                    z30Var.setAlpha(1.0f);
                    z30Var.setScaleX(1.0f);
                    z30Var.setScaleY(1.0f);
                    z30Var.setTranslationX(0.0f);
                    z30Var.setTranslationY(0.0f);
                } else {
                    d60Var.T2.setAlpha(0);
                    d60Var.b1();
                    if (d60Var.b2.getParent() != null) {
                        viewGroup2 = ((h3) d60Var).containerView;
                        viewGroup2.removeView(d60Var.b2);
                    }
                    d60Var.b2 = null;
                    z30Var.setVisibility(8);
                    d60Var.c2 = false;
                    d60Var.V.X = true;
                    d60Var.Y1.setVisibility(8);
                    if (d60Var.p0) {
                        d60Var.p0 = false;
                        d60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = d60Var.W2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                d60Var.S0();
                viewGroup = ((h3) d60Var).containerView;
                viewGroup.invalidate();
                d60Var.b.invalidate();
                d60Var.N.invalidate();
                return;
            case 9:
                wv0 wv0Var = (wv0) this.c;
                og0 og0Var = (og0) this.d;
                if (og0Var.G == 0 && this.b) {
                    og0Var.v1(true, true);
                }
                wv0Var.setVisibility(8);
                wv0Var.g();
                wv0Var.setX(0.0f);
                return;
            case 10:
                tv0 tv0Var = (tv0) this.d;
                tv0Var.y = this.b ? 1.0f : 0.0f;
                tv0Var.c.invalidate();
                tv0Var.d.invalidate();
                tv0Var.e();
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 11:
                r41 r41Var = (r41) this.d;
                r41Var.s = this.b ? 1.0f : 0.0f;
                r41Var.b.invalidate();
                r41Var.c.invalidate();
                r41Var.e();
                TextView textView = r41Var.y;
                if (textView != null) {
                    textView.setAlpha(r41Var.s);
                }
                if (r41Var.P) {
                    r41Var.K.invalidate();
                }
                if (!r41Var.P && (p41Var = r41Var.K) != null && p41Var.getSeekBarWaveform() != null) {
                    no0 seekBarWaveform = r41Var.K.getSeekBarWaveform();
                    seekBarWaveform.L = r41Var.s;
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
                ud1 ud1Var = (ud1) this.d;
                ud1Var.x = this.b ? 1.0f : 0.0f;
                ud1Var.b.invalidate();
                ud1Var.c.invalidate();
                ud1Var.e();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    runnable6.run();
                    return;
                }
                return;
            default:
                ((ca) this.d).n0();
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
