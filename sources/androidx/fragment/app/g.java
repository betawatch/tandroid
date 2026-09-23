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
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.a40;
import org.telegram.ui.a51;
import org.telegram.ui.de1;
import org.telegram.ui.f60;
import org.telegram.ui.fw0;
import org.telegram.ui.rg0;
import org.telegram.ui.so;
import org.telegram.ui.v3;
import org.telegram.ui.xd;
import org.telegram.ui.xn;
import org.telegram.ui.y41;
import qg.v2;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        y41 y41Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                ((lc) this.d).n0();
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
                xn xnVar = (xn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = xnVar.B8;
                if (bitmap != null) {
                    xnVar.C8 = null;
                    xnVar.D8 = null;
                    bitmap.recycle();
                    xnVar.B8 = null;
                }
                t1 t1Var = (t1) this.c;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
                xnVar.ob(null);
                xnVar.M8 = null;
                xnVar.X0.invalidate();
                xnVar.x0.invalidate();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                ((so) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 5:
                bm0 bm0Var = (bm0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                bm0Var.r = f7;
                bm0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                bm0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, bm0Var.r));
                bm0Var.y.setAlpha(bm0Var.r);
                bm0Var.s.invalidate();
                bm0Var.v.invalidate();
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
                f60 f60Var = (f60) this.d;
                a40 a40Var = f60Var.C2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                f60Var.d.getNotificationCenter().onAnimationFinish(f60Var.d3);
                f60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                f60Var.d2 = f10;
                f60Var.a2.n = f10;
                if (z10) {
                    a40Var.setAlpha(1.0f);
                    a40Var.setScaleX(1.0f);
                    a40Var.setScaleY(1.0f);
                    a40Var.setTranslationX(0.0f);
                    a40Var.setTranslationY(0.0f);
                } else {
                    f60Var.W2.setAlpha(0);
                    f60Var.b1();
                    if (f60Var.e2.getParent() != null) {
                        viewGroup2 = ((f3) f60Var).containerView;
                        viewGroup2.removeView(f60Var.e2);
                    }
                    f60Var.e2 = null;
                    a40Var.setVisibility(8);
                    f60Var.f2 = false;
                    f60Var.Y.X = true;
                    f60Var.b2.setVisibility(8);
                    if (f60Var.s0) {
                        f60Var.s0 = false;
                        f60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = f60Var.Z2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                f60Var.S0();
                viewGroup = ((f3) f60Var).containerView;
                viewGroup.invalidate();
                f60Var.b.invalidate();
                f60Var.Q.invalidate();
                return;
            case 8:
                uv0 uv0Var = (uv0) this.c;
                rg0 rg0Var = (rg0) this.d;
                if (rg0Var.J == 0 && this.b) {
                    rg0Var.v1(true, true);
                }
                uv0Var.setVisibility(8);
                uv0Var.g();
                uv0Var.setX(0.0f);
                return;
            case 9:
                fw0 fw0Var = (fw0) this.d;
                fw0Var.y = this.b ? 1.0f : 0.0f;
                fw0Var.c.invalidate();
                fw0Var.d.invalidate();
                fw0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 10:
                a51 a51Var = (a51) this.d;
                a51Var.s = this.b ? 1.0f : 0.0f;
                a51Var.b.invalidate();
                a51Var.c.invalidate();
                a51Var.e();
                TextView textView = a51Var.y;
                if (textView != null) {
                    textView.setAlpha(a51Var.s);
                }
                if (a51Var.S) {
                    a51Var.N.invalidate();
                }
                if (!a51Var.S && (y41Var = a51Var.N) != null && y41Var.getSeekBarWaveform() != null) {
                    io0 seekBarWaveform = a51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = a51Var.s;
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
            case 11:
                de1 de1Var = (de1) this.d;
                de1Var.x = this.b ? 1.0f : 0.0f;
                de1Var.b.invalidate();
                de1Var.c.invalidate();
                de1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            case 12:
                v2 v2Var = (v2) this.d;
                xd xdVar = v2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                v2Var.y = f11;
                xdVar.setAlpha(f11);
                xdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                xdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                v2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
            default:
                super.onAnimationEnd(anim);
                zg.c0 c0Var = (zg.c0) this.d;
                c0Var.E.remove((ValueAnimator) this.c);
                zg.c0.a(c0Var, this.b);
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
