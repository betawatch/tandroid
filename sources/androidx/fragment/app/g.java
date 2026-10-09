package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.lc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.gn0;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.b40;
import org.telegram.ui.g60;
import org.telegram.ui.i51;
import org.telegram.ui.k51;
import org.telegram.ui.me1;
import org.telegram.ui.mw0;
import org.telegram.ui.uo;
import org.telegram.ui.v3;
import org.telegram.ui.wg0;
import org.telegram.ui.yd;
import org.telegram.ui.zn;
import qg.u2;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        i51 i51Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                ((lc) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 2:
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
            case 3:
                zn znVar = (zn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = znVar.B8;
                if (bitmap != null) {
                    znVar.C8 = null;
                    znVar.D8 = null;
                    bitmap.recycle();
                    znVar.B8 = null;
                }
                u1 u1Var = (u1) this.c;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
                znVar.sb(null);
                znVar.M8 = null;
                znVar.X0.invalidate();
                znVar.x0.invalidate();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                ((uo) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 5:
                gn0 gn0Var = (gn0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                gn0Var.r = f7;
                gn0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                gn0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, gn0Var.r));
                gn0Var.y.setAlpha(gn0Var.r);
                gn0Var.s.invalidate();
                gn0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 6:
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
            case 7:
                g60 g60Var = (g60) this.d;
                b40 b40Var = g60Var.C2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                g60Var.d.getNotificationCenter().onAnimationFinish(g60Var.d3);
                g60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                g60Var.d2 = f10;
                g60Var.a2.n = f10;
                if (z10) {
                    b40Var.setAlpha(1.0f);
                    b40Var.setScaleX(1.0f);
                    b40Var.setScaleY(1.0f);
                    b40Var.setTranslationX(0.0f);
                    b40Var.setTranslationY(0.0f);
                } else {
                    g60Var.W2.setAlpha(0);
                    g60Var.c1();
                    if (g60Var.e2.getParent() != null) {
                        viewGroup2 = ((f3) g60Var).containerView;
                        viewGroup2.removeView(g60Var.e2);
                    }
                    g60Var.e2 = null;
                    b40Var.setVisibility(8);
                    g60Var.f2 = false;
                    g60Var.Y.X = true;
                    g60Var.b2.setVisibility(8);
                    if (g60Var.s0) {
                        g60Var.s0 = false;
                        g60Var.P0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = g60Var.Z2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                g60Var.T0();
                viewGroup = ((f3) g60Var).containerView;
                viewGroup.invalidate();
                g60Var.b.invalidate();
                g60Var.Q.invalidate();
                return;
            case 8:
                xw0 xw0Var = (xw0) this.c;
                wg0 wg0Var = (wg0) this.d;
                if (wg0Var.J == 0 && this.b) {
                    wg0Var.v1(true, true);
                }
                xw0Var.setVisibility(8);
                xw0Var.g();
                xw0Var.setX(0.0f);
                return;
            case 9:
                mw0 mw0Var = (mw0) this.d;
                mw0Var.y = this.b ? 1.0f : 0.0f;
                mw0Var.c.invalidate();
                mw0Var.d.invalidate();
                mw0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 10:
                k51 k51Var = (k51) this.d;
                k51Var.s = this.b ? 1.0f : 0.0f;
                k51Var.b.invalidate();
                k51Var.c.invalidate();
                k51Var.e();
                TextView textView = k51Var.y;
                if (textView != null) {
                    textView.setAlpha(k51Var.s);
                }
                if (k51Var.S) {
                    k51Var.N.invalidate();
                }
                if (!k51Var.S && (i51Var = k51Var.N) != null && i51Var.getSeekBarWaveform() != null) {
                    np0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = k51Var.s;
                    u1 u1Var2 = seekBarWaveform.n;
                    if (u1Var2 != null) {
                        u1Var2.invalidate();
                    }
                }
                Runnable runnable4 = (Runnable) this.c;
                if (runnable4 != null) {
                    runnable4.run();
                    return;
                }
                return;
            case 11:
                me1 me1Var = (me1) this.d;
                me1Var.x = this.b ? 1.0f : 0.0f;
                me1Var.b.invalidate();
                me1Var.c.invalidate();
                me1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 12:
                u2 u2Var = (u2) this.d;
                yd ydVar = u2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                u2Var.y = f11;
                ydVar.setAlpha(f11);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, u2Var.y));
                u2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(anim);
                zg.a0 a0Var = (zg.a0) this.d;
                a0Var.E.remove((ValueAnimator) this.c);
                zg.a0.a(a0Var, this.b);
                return;
        }
    }

    public /* synthetic */ g(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public g(ViewGroup viewGroup, boolean z10, v0 v0Var, h hVar) {
        this.a = 0;
        this.c = viewGroup;
        this.b = z10;
        this.d = hVar;
    }
}
