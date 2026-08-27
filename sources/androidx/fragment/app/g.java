package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.a41;
import org.telegram.ui.c41;
import org.telegram.ui.dd1;
import org.telegram.ui.ig0;
import org.telegram.ui.jo;
import org.telegram.ui.jv0;
import org.telegram.ui.m30;
import org.telegram.ui.rn;
import org.telegram.ui.s50;
import org.telegram.ui.z3;
import zf.t2;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        a41 a41Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                super.onAnimationEnd(anim);
                ig.d0 d0Var = (ig.d0) this.d;
                d0Var.E.remove((ValueAnimator) this.c);
                ig.d0.a(d0Var, this.b);
                return;
            case 2:
                ((sb) this.d).n0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 3:
                z3 z3Var = (z3) this.d;
                z3Var.x = this.b ? 1.0f : 0.0f;
                if (!z3Var.n) {
                    z3Var.n();
                }
                z3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                z3Var.h();
                return;
            case 4:
                rn rnVar = (rn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = rnVar.x8;
                if (bitmap != null) {
                    rnVar.y8 = null;
                    rnVar.z8 = null;
                    bitmap.recycle();
                    rnVar.x8 = null;
                }
                s1 s1Var = (s1) this.c;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
                rnVar.ob(null);
                rnVar.I8 = null;
                rnVar.T0.invalidate();
                rnVar.t0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((jo) this.d).J.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 6:
                ol0 ol0Var = (ol0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                ol0Var.r = f10;
                ol0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                ol0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, ol0Var.r));
                ol0Var.y.setAlpha(ol0Var.r);
                ol0Var.s.invalidate();
                ol0Var.v.invalidate();
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
                s50 s50Var = (s50) this.d;
                m30 m30Var = s50Var.y2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                s50Var.d.getNotificationCenter().onAnimationFinish(s50Var.Z2);
                s50Var.Y2 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                s50Var.Z1 = f11;
                s50Var.W1.n = f11;
                if (z10) {
                    m30Var.setAlpha(1.0f);
                    m30Var.setScaleX(1.0f);
                    m30Var.setScaleY(1.0f);
                    m30Var.setTranslationX(0.0f);
                    m30Var.setTranslationY(0.0f);
                } else {
                    s50Var.S2.setAlpha(0);
                    s50Var.b1();
                    if (s50Var.a2.getParent() != null) {
                        viewGroup2 = ((e3) s50Var).containerView;
                        viewGroup2.removeView(s50Var.a2);
                    }
                    s50Var.a2 = null;
                    m30Var.setVisibility(8);
                    s50Var.b2 = false;
                    s50Var.U.X = true;
                    s50Var.X1.setVisibility(8);
                    if (s50Var.o0) {
                        s50Var.o0 = false;
                        s50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = s50Var.V2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                s50Var.S0();
                viewGroup = ((e3) s50Var).containerView;
                viewGroup.invalidate();
                s50Var.b.invalidate();
                s50Var.M.invalidate();
                return;
            case 9:
                ev0 ev0Var = (ev0) this.c;
                ig0 ig0Var = (ig0) this.d;
                if (ig0Var.F == 0 && this.b) {
                    ig0Var.v1(true, true);
                }
                ev0Var.setVisibility(8);
                ev0Var.g();
                ev0Var.setX(0.0f);
                return;
            case 10:
                jv0 jv0Var = (jv0) this.d;
                jv0Var.y = this.b ? 1.0f : 0.0f;
                jv0Var.c.invalidate();
                jv0Var.d.invalidate();
                jv0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                c41 c41Var = (c41) this.d;
                c41Var.s = this.b ? 1.0f : 0.0f;
                c41Var.b.invalidate();
                c41Var.c.invalidate();
                c41Var.e();
                TextView textView = c41Var.y;
                if (textView != null) {
                    textView.setAlpha(c41Var.s);
                }
                if (c41Var.O) {
                    c41Var.J.invalidate();
                }
                if (!c41Var.O && (a41Var = c41Var.J) != null && a41Var.getSeekBarWaveform() != null) {
                    sn0 seekBarWaveform = c41Var.J.getSeekBarWaveform();
                    seekBarWaveform.L = c41Var.s;
                    s1 s1Var2 = seekBarWaveform.n;
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
                hh.m mVar = t2Var.c;
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

    public /* synthetic */ g(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
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
