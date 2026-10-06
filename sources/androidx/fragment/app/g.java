package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ci.kc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.a51;
import org.telegram.ui.c51;
import org.telegram.ui.d40;
import org.telegram.ui.ee1;
import org.telegram.ui.gw0;
import org.telegram.ui.h60;
import org.telegram.ui.to;
import org.telegram.ui.ug0;
import org.telegram.ui.v3;
import org.telegram.ui.yn;
import org.telegram.ui.zd;
import qg.t2;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        a51 a51Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                ((kc) this.d).n0();
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
                yn ynVar = (yn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = ynVar.z8;
                if (bitmap != null) {
                    ynVar.A8 = null;
                    ynVar.B8 = null;
                    bitmap.recycle();
                    ynVar.z8 = null;
                }
                u1 u1Var = (u1) this.c;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
                ynVar.nb(null);
                ynVar.K8 = null;
                ynVar.V0.invalidate();
                ynVar.v0.invalidate();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                ((to) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 5:
                sm0 sm0Var = (sm0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                sm0Var.r = f7;
                sm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                sm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, sm0Var.r));
                sm0Var.y.setAlpha(sm0Var.r);
                sm0Var.s.invalidate();
                sm0Var.v.invalidate();
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
                h60 h60Var = (h60) this.d;
                d40 d40Var = h60Var.C2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                h60Var.d.getNotificationCenter().onAnimationFinish(h60Var.d3);
                h60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                h60Var.d2 = f10;
                h60Var.a2.n = f10;
                if (z10) {
                    d40Var.setAlpha(1.0f);
                    d40Var.setScaleX(1.0f);
                    d40Var.setScaleY(1.0f);
                    d40Var.setTranslationX(0.0f);
                    d40Var.setTranslationY(0.0f);
                } else {
                    h60Var.W2.setAlpha(0);
                    h60Var.b1();
                    if (h60Var.e2.getParent() != null) {
                        viewGroup2 = ((f3) h60Var).containerView;
                        viewGroup2.removeView(h60Var.e2);
                    }
                    h60Var.e2 = null;
                    d40Var.setVisibility(8);
                    h60Var.f2 = false;
                    h60Var.Y.X = true;
                    h60Var.b2.setVisibility(8);
                    if (h60Var.s0) {
                        h60Var.s0 = false;
                        h60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = h60Var.Z2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                h60Var.S0();
                viewGroup = ((f3) h60Var).containerView;
                viewGroup.invalidate();
                h60Var.b.invalidate();
                h60Var.Q.invalidate();
                return;
            case 8:
                rw0 rw0Var = (rw0) this.c;
                ug0 ug0Var = (ug0) this.d;
                if (ug0Var.J == 0 && this.b) {
                    ug0Var.v1(true, true);
                }
                rw0Var.setVisibility(8);
                rw0Var.g();
                rw0Var.setX(0.0f);
                return;
            case 9:
                gw0 gw0Var = (gw0) this.d;
                gw0Var.y = this.b ? 1.0f : 0.0f;
                gw0Var.c.invalidate();
                gw0Var.d.invalidate();
                gw0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 10:
                c51 c51Var = (c51) this.d;
                c51Var.s = this.b ? 1.0f : 0.0f;
                c51Var.b.invalidate();
                c51Var.c.invalidate();
                c51Var.e();
                TextView textView = c51Var.y;
                if (textView != null) {
                    textView.setAlpha(c51Var.s);
                }
                if (c51Var.S) {
                    c51Var.N.invalidate();
                }
                if (!c51Var.S && (a51Var = c51Var.N) != null && a51Var.getSeekBarWaveform() != null) {
                    cp0 seekBarWaveform = c51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = c51Var.s;
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
                ee1 ee1Var = (ee1) this.d;
                ee1Var.x = this.b ? 1.0f : 0.0f;
                ee1Var.b.invalidate();
                ee1Var.c.invalidate();
                ee1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 12:
                t2 t2Var = (t2) this.d;
                zd zdVar = t2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                t2Var.y = f11;
                zdVar.setAlpha(f11);
                zdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                zdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                t2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(anim);
                zg.z zVar = (zg.z) this.d;
                zVar.E.remove((ValueAnimator) this.c);
                zg.z.a(zVar, this.b);
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
