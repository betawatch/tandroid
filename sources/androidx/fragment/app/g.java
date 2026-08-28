package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.rn0;
import org.telegram.ui.b41;
import org.telegram.ui.d41;
import org.telegram.ui.dd1;
import org.telegram.ui.fg0;
import org.telegram.ui.ho;
import org.telegram.ui.iv0;
import org.telegram.ui.j30;
import org.telegram.ui.o50;
import org.telegram.ui.qn;
import org.telegram.ui.y3;
import yf.t2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, int i9) {
        this.a = i9;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        b41 b41Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                super.onAnimationEnd(anim);
                hg.e0 e0Var = (hg.e0) this.d;
                e0Var.E.remove((ValueAnimator) this.c);
                hg.e0.a(e0Var, this.b);
                return;
            case 2:
                ((wb) this.d).n0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 3:
                y3 y3Var = (y3) this.d;
                y3Var.x = this.b ? 1.0f : 0.0f;
                if (!y3Var.n) {
                    y3Var.n();
                }
                y3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                y3Var.h();
                return;
            case 4:
                qn qnVar = (qn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = qnVar.x8;
                if (bitmap != null) {
                    qnVar.y8 = null;
                    qnVar.z8 = null;
                    bitmap.recycle();
                    qnVar.x8 = null;
                }
                t1 t1Var = (t1) this.c;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
                qnVar.ob(null);
                qnVar.I8 = null;
                qnVar.T0.invalidate();
                qnVar.t0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((ho) this.d).J.setVisibility(this.b ? 0 : 8);
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((View) arrayList.get(i9)).setTranslationY(0.0f);
                }
                return;
            case 6:
                ll0 ll0Var = (ll0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                ll0Var.r = f10;
                ll0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                ll0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ll0Var.r));
                ll0Var.y.setAlpha(ll0Var.r);
                ll0Var.s.invalidate();
                ll0Var.v.invalidate();
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
                o50 o50Var = (o50) this.d;
                j30 j30Var = o50Var.y2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                o50Var.d.getNotificationCenter().onAnimationFinish(o50Var.Z2);
                o50Var.Y2 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                o50Var.Z1 = f11;
                o50Var.W1.n = f11;
                if (z10) {
                    j30Var.setAlpha(1.0f);
                    j30Var.setScaleX(1.0f);
                    j30Var.setScaleY(1.0f);
                    j30Var.setTranslationX(0.0f);
                    j30Var.setTranslationY(0.0f);
                } else {
                    o50Var.S2.setAlpha(0);
                    o50Var.b1();
                    if (o50Var.a2.getParent() != null) {
                        viewGroup2 = ((f3) o50Var).containerView;
                        viewGroup2.removeView(o50Var.a2);
                    }
                    o50Var.a2 = null;
                    j30Var.setVisibility(8);
                    o50Var.b2 = false;
                    o50Var.U.X = true;
                    o50Var.X1.setVisibility(8);
                    if (o50Var.o0) {
                        o50Var.o0 = false;
                        o50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = o50Var.V2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                o50Var.S0();
                viewGroup = ((f3) o50Var).containerView;
                viewGroup.invalidate();
                o50Var.b.invalidate();
                o50Var.M.invalidate();
                return;
            case 9:
                cv0 cv0Var = (cv0) this.c;
                fg0 fg0Var = (fg0) this.d;
                if (fg0Var.F == 0 && this.b) {
                    fg0Var.v1(true, true);
                }
                cv0Var.setVisibility(8);
                cv0Var.g();
                cv0Var.setX(0.0f);
                return;
            case 10:
                iv0 iv0Var = (iv0) this.d;
                iv0Var.y = this.b ? 1.0f : 0.0f;
                iv0Var.c.invalidate();
                iv0Var.d.invalidate();
                iv0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                d41 d41Var = (d41) this.d;
                d41Var.s = this.b ? 1.0f : 0.0f;
                d41Var.b.invalidate();
                d41Var.c.invalidate();
                d41Var.e();
                TextView textView = d41Var.y;
                if (textView != null) {
                    textView.setAlpha(d41Var.s);
                }
                if (d41Var.O) {
                    d41Var.J.invalidate();
                }
                if (!d41Var.O && (b41Var = d41Var.J) != null && b41Var.getSeekBarWaveform() != null) {
                    rn0 seekBarWaveform = d41Var.J.getSeekBarWaveform();
                    seekBarWaveform.L = d41Var.s;
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
                dd1 dd1Var = (dd1) this.d;
                dd1Var.x = this.b ? 1.0f : 0.0f;
                dd1Var.b.invalidate();
                dd1Var.c.invalidate();
                dd1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                t2 t2Var = (t2) this.d;
                gh.m mVar = t2Var.c;
                float f12 = this.b ? 1.0f : 0.0f;
                t2Var.y = f12;
                mVar.setAlpha(f12);
                mVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                mVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ g(Object obj, boolean z10, Object obj2, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public g(ViewGroup viewGroup, boolean z10, u0 u0Var, h hVar) {
        this.a = 0;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
