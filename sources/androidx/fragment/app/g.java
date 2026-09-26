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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.vo0;
import org.telegram.ui.b51;
import org.telegram.ui.d60;
import org.telegram.ui.de1;
import org.telegram.ui.dw0;
import org.telegram.ui.qg0;
import org.telegram.ui.ro;
import org.telegram.ui.v3;
import org.telegram.ui.wn;
import org.telegram.ui.xd;
import org.telegram.ui.y30;
import org.telegram.ui.z41;
import qg.t2;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        z41 z41Var;
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
                wn wnVar = (wn) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = wnVar.B8;
                if (bitmap != null) {
                    wnVar.C8 = null;
                    wnVar.D8 = null;
                    bitmap.recycle();
                    wnVar.B8 = null;
                }
                u1 u1Var = (u1) this.c;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
                wnVar.ob(null);
                wnVar.M8 = null;
                wnVar.X0.invalidate();
                wnVar.x0.invalidate();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                ((ro) this.d).N.setVisibility(this.b ? 0 : 8);
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
                d60 d60Var = (d60) this.d;
                y30 y30Var = d60Var.C2;
                org.telegram.ui.Components.voip.u uVar3 = (org.telegram.ui.Components.voip.u) this.c;
                if (uVar3 != null) {
                    uVar3.f = false;
                }
                d60Var.d.getNotificationCenter().onAnimationFinish(d60Var.d3);
                d60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                d60Var.d2 = f10;
                d60Var.a2.n = f10;
                if (z10) {
                    y30Var.setAlpha(1.0f);
                    y30Var.setScaleX(1.0f);
                    y30Var.setScaleY(1.0f);
                    y30Var.setTranslationX(0.0f);
                    y30Var.setTranslationY(0.0f);
                } else {
                    d60Var.W2.setAlpha(0);
                    d60Var.b1();
                    if (d60Var.e2.getParent() != null) {
                        viewGroup2 = ((e3) d60Var).containerView;
                        viewGroup2.removeView(d60Var.e2);
                    }
                    d60Var.e2 = null;
                    y30Var.setVisibility(8);
                    d60Var.f2 = false;
                    d60Var.Y.X = true;
                    d60Var.b2.setVisibility(8);
                    if (d60Var.s0) {
                        d60Var.s0 = false;
                        d60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.u uVar4 = d60Var.Z2;
                    if (uVar4 != null) {
                        uVar4.a.setRoundCorners(0.0f);
                    }
                }
                d60Var.S0();
                viewGroup = ((e3) d60Var).containerView;
                viewGroup.invalidate();
                d60Var.b.invalidate();
                d60Var.Q.invalidate();
                return;
            case 8:
                fw0 fw0Var = (fw0) this.c;
                qg0 qg0Var = (qg0) this.d;
                if (qg0Var.J == 0 && this.b) {
                    qg0Var.v1(true, true);
                }
                fw0Var.setVisibility(8);
                fw0Var.g();
                fw0Var.setX(0.0f);
                return;
            case 9:
                dw0 dw0Var = (dw0) this.d;
                dw0Var.y = this.b ? 1.0f : 0.0f;
                dw0Var.c.invalidate();
                dw0Var.d.invalidate();
                dw0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 10:
                b51 b51Var = (b51) this.d;
                b51Var.s = this.b ? 1.0f : 0.0f;
                b51Var.b.invalidate();
                b51Var.c.invalidate();
                b51Var.e();
                TextView textView = b51Var.y;
                if (textView != null) {
                    textView.setAlpha(b51Var.s);
                }
                if (b51Var.S) {
                    b51Var.N.invalidate();
                }
                if (!b51Var.S && (z41Var = b51Var.N) != null && z41Var.getSeekBarWaveform() != null) {
                    vo0 seekBarWaveform = b51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = b51Var.s;
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
                t2 t2Var = (t2) this.d;
                xd xdVar = t2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                t2Var.y = f11;
                xdVar.setAlpha(f11);
                xdVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
                xdVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, t2Var.y));
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
