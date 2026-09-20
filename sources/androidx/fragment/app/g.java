package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.oc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.d40;
import org.telegram.ui.i60;
import org.telegram.ui.j51;
import org.telegram.ui.l51;
import org.telegram.ui.me1;
import org.telegram.ui.mw0;
import org.telegram.ui.u3;
import org.telegram.ui.uo;
import org.telegram.ui.yd;
import org.telegram.ui.yg0;
import org.telegram.ui.zn;
import qg.t2;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
        j51 j51Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                ((oc) this.d).n0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 2:
                u3 u3Var = (u3) this.d;
                u3Var.x = this.b ? 1.0f : 0.0f;
                if (!u3Var.n) {
                    u3Var.n();
                }
                u3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                u3Var.h();
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
                znVar.ob(null);
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
                mm0 mm0Var = (mm0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                mm0Var.r = f7;
                mm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                mm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, mm0Var.r));
                mm0Var.y.setAlpha(mm0Var.r);
                mm0Var.s.invalidate();
                mm0Var.v.invalidate();
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
                i60 i60Var = (i60) this.d;
                d40 d40Var = i60Var.C2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                i60Var.d.getNotificationCenter().onAnimationFinish(i60Var.d3);
                i60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                i60Var.d2 = f10;
                i60Var.a2.n = f10;
                if (z10) {
                    d40Var.setAlpha(1.0f);
                    d40Var.setScaleX(1.0f);
                    d40Var.setScaleY(1.0f);
                    d40Var.setTranslationX(0.0f);
                    d40Var.setTranslationY(0.0f);
                } else {
                    i60Var.W2.setAlpha(0);
                    i60Var.b1();
                    if (i60Var.e2.getParent() != null) {
                        viewGroup2 = ((f3) i60Var).containerView;
                        viewGroup2.removeView(i60Var.e2);
                    }
                    i60Var.e2 = null;
                    d40Var.setVisibility(8);
                    i60Var.f2 = false;
                    i60Var.Y.X = true;
                    i60Var.b2.setVisibility(8);
                    if (i60Var.s0) {
                        i60Var.s0 = false;
                        i60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = i60Var.Z2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                i60Var.S0();
                viewGroup = ((f3) i60Var).containerView;
                viewGroup.invalidate();
                i60Var.b.invalidate();
                i60Var.Q.invalidate();
                return;
            case 8:
                fw0 fw0Var = (fw0) this.c;
                yg0 yg0Var = (yg0) this.d;
                if (yg0Var.J == 0 && this.b) {
                    yg0Var.v1(true, true);
                }
                fw0Var.setVisibility(8);
                fw0Var.g();
                fw0Var.setX(0.0f);
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
                l51 l51Var = (l51) this.d;
                l51Var.s = this.b ? 1.0f : 0.0f;
                l51Var.b.invalidate();
                l51Var.c.invalidate();
                l51Var.e();
                TextView textView = l51Var.y;
                if (textView != null) {
                    textView.setAlpha(l51Var.s);
                }
                if (l51Var.S) {
                    l51Var.N.invalidate();
                }
                if (!l51Var.S && (j51Var = l51Var.N) != null && j51Var.getSeekBarWaveform() != null) {
                    vo0 seekBarWaveform = l51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = l51Var.s;
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
                t2 t2Var = (t2) this.d;
                yd ydVar = t2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                t2Var.y = f11;
                ydVar.setAlpha(f11);
                ydVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                ydVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(anim);
                zg.b0 b0Var = (zg.b0) this.d;
                b0Var.E.remove((ValueAnimator) this.c);
                zg.b0.a(b0Var, this.b);
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
