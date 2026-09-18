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
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.bo;
import org.telegram.ui.f40;
import org.telegram.ui.i51;
import org.telegram.ui.k51;
import org.telegram.ui.k60;
import org.telegram.ui.me1;
import org.telegram.ui.ow0;
import org.telegram.ui.u3;
import org.telegram.ui.wo;
import org.telegram.ui.yg0;
import org.telegram.ui.zd;
import qg.v2;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                bo boVar = (bo) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = boVar.B8;
                if (bitmap != null) {
                    boVar.C8 = null;
                    boVar.D8 = null;
                    bitmap.recycle();
                    boVar.B8 = null;
                }
                t1 t1Var = (t1) this.c;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
                boVar.ob(null);
                boVar.M8 = null;
                boVar.X0.invalidate();
                boVar.x0.invalidate();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                ((wo) this.d).N.setVisibility(this.b ? 0 : 8);
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
                k60 k60Var = (k60) this.d;
                f40 f40Var = k60Var.C2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                k60Var.d.getNotificationCenter().onAnimationFinish(k60Var.d3);
                k60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                k60Var.d2 = f10;
                k60Var.a2.n = f10;
                if (z10) {
                    f40Var.setAlpha(1.0f);
                    f40Var.setScaleX(1.0f);
                    f40Var.setScaleY(1.0f);
                    f40Var.setTranslationX(0.0f);
                    f40Var.setTranslationY(0.0f);
                } else {
                    k60Var.W2.setAlpha(0);
                    k60Var.b1();
                    if (k60Var.e2.getParent() != null) {
                        viewGroup2 = ((g3) k60Var).containerView;
                        viewGroup2.removeView(k60Var.e2);
                    }
                    k60Var.e2 = null;
                    f40Var.setVisibility(8);
                    k60Var.f2 = false;
                    k60Var.Y.X = true;
                    k60Var.b2.setVisibility(8);
                    if (k60Var.s0) {
                        k60Var.s0 = false;
                        k60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = k60Var.Z2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                k60Var.S0();
                viewGroup = ((g3) k60Var).containerView;
                viewGroup.invalidate();
                k60Var.b.invalidate();
                k60Var.Q.invalidate();
                return;
            case 8:
                vv0 vv0Var = (vv0) this.c;
                yg0 yg0Var = (yg0) this.d;
                if (yg0Var.J == 0 && this.b) {
                    yg0Var.v1(true, true);
                }
                vv0Var.setVisibility(8);
                vv0Var.g();
                vv0Var.setX(0.0f);
                return;
            case 9:
                ow0 ow0Var = (ow0) this.d;
                ow0Var.y = this.b ? 1.0f : 0.0f;
                ow0Var.c.invalidate();
                ow0Var.d.invalidate();
                ow0Var.e();
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
                    jo0 seekBarWaveform = k51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = k51Var.s;
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
                v2 v2Var = (v2) this.d;
                zd zdVar = v2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                v2Var.y = f11;
                zdVar.setAlpha(f11);
                zdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                zdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
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
