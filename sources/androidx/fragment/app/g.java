package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bg.c4;
import bg.y3;
import java.util.ArrayList;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.d41;
import org.telegram.ui.f41;
import org.telegram.ui.fd1;
import org.telegram.ui.fg0;
import org.telegram.ui.iv0;
import org.telegram.ui.ko;
import org.telegram.ui.m30;
import org.telegram.ui.r50;
import org.telegram.ui.tn;
import org.telegram.ui.z3;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        d41 d41Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.j.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                c4 c4Var = (c4) this.d;
                y3 y3Var = c4Var.c;
                float f9 = this.b ? 1.0f : 0.0f;
                c4Var.y = f9;
                y3Var.setAlpha(f9);
                y3Var.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, c4Var.y));
                y3Var.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, c4Var.y));
                c4Var.b.invalidate();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                return;
            case 2:
                super.onAnimationEnd(anim);
                kg.d0 d0Var = (kg.d0) this.d;
                d0Var.E.remove((ValueAnimator) this.c);
                kg.d0.a(d0Var, this.b);
                return;
            case 3:
                ((gb) this.d).n0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 4:
                z3 z3Var = (z3) this.d;
                z3Var.x = this.b ? 1.0f : 0.0f;
                if (!z3Var.n) {
                    z3Var.n();
                }
                z3Var.i();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                z3Var.h();
                return;
            case 5:
                tn tnVar = (tn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = tnVar.x8;
                if (bitmap != null) {
                    tnVar.y8 = null;
                    tnVar.z8 = null;
                    bitmap.recycle();
                    tnVar.x8 = null;
                }
                s1 s1Var = (s1) this.c;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
                tnVar.ob(null);
                tnVar.I8 = null;
                tnVar.T0.invalidate();
                tnVar.t0.invalidate();
                return;
            case 6:
                ArrayList arrayList = (ArrayList) this.c;
                ((ko) this.d).J.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 7:
                yl0 yl0Var = (yl0) this.d;
                float f10 = this.b ? 1.0f : 0.0f;
                yl0Var.r = f10;
                yl0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
                yl0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, yl0Var.r));
                yl0Var.y.setAlpha(yl0Var.r);
                yl0Var.s.invalidate();
                yl0Var.v.invalidate();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    AndroidUtilities.runOnUIThread(runnable3);
                    return;
                }
                return;
            case 8:
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
            case 9:
                r50 r50Var = (r50) this.d;
                m30 m30Var = r50Var.y2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                r50Var.d.getNotificationCenter().onAnimationFinish(r50Var.Z2);
                r50Var.Y2 = false;
                boolean z10 = this.b;
                float f11 = z10 ? 1.0f : 0.0f;
                r50Var.Z1 = f11;
                r50Var.W1.n = f11;
                if (z10) {
                    m30Var.setAlpha(1.0f);
                    m30Var.setScaleX(1.0f);
                    m30Var.setScaleY(1.0f);
                    m30Var.setTranslationX(0.0f);
                    m30Var.setTranslationY(0.0f);
                } else {
                    r50Var.S2.setAlpha(0);
                    r50Var.b1();
                    if (r50Var.a2.getParent() != null) {
                        viewGroup2 = ((f3) r50Var).containerView;
                        viewGroup2.removeView(r50Var.a2);
                    }
                    r50Var.a2 = null;
                    m30Var.setVisibility(8);
                    r50Var.b2 = false;
                    r50Var.U.X = true;
                    r50Var.X1.setVisibility(8);
                    if (r50Var.o0) {
                        r50Var.o0 = false;
                        r50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = r50Var.V2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                r50Var.S0();
                viewGroup = ((f3) r50Var).containerView;
                viewGroup.invalidate();
                r50Var.b.invalidate();
                r50Var.M.invalidate();
                return;
            case 10:
                mv0 mv0Var = (mv0) this.c;
                fg0 fg0Var = (fg0) this.d;
                if (fg0Var.F == 0 && this.b) {
                    fg0Var.v1(true, true);
                }
                mv0Var.setVisibility(8);
                mv0Var.g();
                mv0Var.setX(0.0f);
                return;
            case 11:
                iv0 iv0Var = (iv0) this.d;
                iv0Var.y = this.b ? 1.0f : 0.0f;
                iv0Var.c.invalidate();
                iv0Var.d.invalidate();
                iv0Var.e();
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 12:
                f41 f41Var = (f41) this.d;
                f41Var.s = this.b ? 1.0f : 0.0f;
                f41Var.b.invalidate();
                f41Var.c.invalidate();
                f41Var.e();
                TextView textView = f41Var.y;
                if (textView != null) {
                    textView.setAlpha(f41Var.s);
                }
                if (f41Var.O) {
                    f41Var.J.invalidate();
                }
                if (!f41Var.O && (d41Var = f41Var.J) != null && d41Var.getSeekBarWaveform() != null) {
                    co0 seekBarWaveform = f41Var.J.getSeekBarWaveform();
                    seekBarWaveform.L = f41Var.s;
                    s1 s1Var2 = seekBarWaveform.n;
                    if (s1Var2 != null) {
                        s1Var2.invalidate();
                    }
                }
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                fd1 fd1Var = (fd1) this.d;
                fd1Var.x = this.b ? 1.0f : 0.0f;
                fd1Var.b.invalidate();
                fd1Var.c.invalidate();
                fd1Var.e();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    runnable6.run();
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
