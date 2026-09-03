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
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.a4;
import org.telegram.ui.a40;
import org.telegram.ui.e60;
import org.telegram.ui.pg0;
import org.telegram.ui.ro;
import org.telegram.ui.u41;
import org.telegram.ui.w41;
import org.telegram.ui.yd1;
import org.telegram.ui.yv0;
import org.telegram.ui.zn;
import ph.da;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
        u41 u41Var;
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
                a4 a4Var = (a4) this.d;
                a4Var.x = this.b ? 1.0f : 0.0f;
                if (!a4Var.n) {
                    a4Var.n();
                }
                a4Var.i();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    runnable2.run();
                }
                a4Var.h();
                return;
            case 4:
                zn znVar = (zn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = znVar.y8;
                if (bitmap != null) {
                    znVar.z8 = null;
                    znVar.A8 = null;
                    bitmap.recycle();
                    znVar.y8 = null;
                }
                s1 s1Var = (s1) this.c;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
                znVar.ob(null);
                znVar.J8 = null;
                znVar.U0.invalidate();
                znVar.u0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((ro) this.d).K.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 6:
                hm0 hm0Var = (hm0) this.d;
                float f11 = this.b ? 1.0f : 0.0f;
                hm0Var.r = f11;
                hm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                hm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, hm0Var.r));
                hm0Var.y.setAlpha(hm0Var.r);
                hm0Var.s.invalidate();
                hm0Var.v.invalidate();
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
                e60 e60Var = (e60) this.d;
                a40 a40Var = e60Var.z2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                e60Var.d.getNotificationCenter().onAnimationFinish(e60Var.a3);
                e60Var.Z2 = false;
                boolean z4 = this.b;
                float f12 = z4 ? 1.0f : 0.0f;
                e60Var.a2 = f12;
                e60Var.X1.n = f12;
                if (z4) {
                    a40Var.setAlpha(1.0f);
                    a40Var.setScaleX(1.0f);
                    a40Var.setScaleY(1.0f);
                    a40Var.setTranslationX(0.0f);
                    a40Var.setTranslationY(0.0f);
                } else {
                    e60Var.T2.setAlpha(0);
                    e60Var.b1();
                    if (e60Var.b2.getParent() != null) {
                        viewGroup2 = ((g3) e60Var).containerView;
                        viewGroup2.removeView(e60Var.b2);
                    }
                    e60Var.b2 = null;
                    a40Var.setVisibility(8);
                    e60Var.c2 = false;
                    e60Var.V.X = true;
                    e60Var.Y1.setVisibility(8);
                    if (e60Var.p0) {
                        e60Var.p0 = false;
                        e60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = e60Var.W2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                e60Var.S0();
                viewGroup = ((g3) e60Var).containerView;
                viewGroup.invalidate();
                e60Var.b.invalidate();
                e60Var.N.invalidate();
                return;
            case 9:
                vv0 vv0Var = (vv0) this.c;
                pg0 pg0Var = (pg0) this.d;
                if (pg0Var.G == 0 && this.b) {
                    pg0Var.v1(true, true);
                }
                vv0Var.setVisibility(8);
                vv0Var.g();
                vv0Var.setX(0.0f);
                return;
            case 10:
                yv0 yv0Var = (yv0) this.d;
                yv0Var.y = this.b ? 1.0f : 0.0f;
                yv0Var.c.invalidate();
                yv0Var.d.invalidate();
                yv0Var.e();
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 11:
                w41 w41Var = (w41) this.d;
                w41Var.s = this.b ? 1.0f : 0.0f;
                w41Var.b.invalidate();
                w41Var.c.invalidate();
                w41Var.e();
                TextView textView = w41Var.y;
                if (textView != null) {
                    textView.setAlpha(w41Var.s);
                }
                if (w41Var.P) {
                    w41Var.K.invalidate();
                }
                if (!w41Var.P && (u41Var = w41Var.K) != null && u41Var.getSeekBarWaveform() != null) {
                    lo0 seekBarWaveform = w41Var.K.getSeekBarWaveform();
                    seekBarWaveform.L = w41Var.s;
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
            case 12:
                yd1 yd1Var = (yd1) this.d;
                yd1Var.x = this.b ? 1.0f : 0.0f;
                yd1Var.b.invalidate();
                yd1Var.c.invalidate();
                yd1Var.e();
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
