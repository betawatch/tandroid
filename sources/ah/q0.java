package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import di.kc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.ah0;
import org.telegram.ui.ee;
import org.telegram.ui.fo;
import org.telegram.ui.h40;
import org.telegram.ui.n60;
import org.telegram.ui.p51;
import org.telegram.ui.r51;
import org.telegram.ui.re1;
import org.telegram.ui.rw0;
import org.telegram.ui.x3;
import org.telegram.ui.zo;
import rg.v2;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        p51 p51Var;
        switch (this.a) {
            case 0:
                super.onAnimationEnd(anim);
                t0 t0Var = (t0) this.d;
                t0Var.E.remove((ValueAnimator) this.c);
                t0.a(t0Var, this.b);
                return;
            case 1:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 2:
                ((kc) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 3:
                x3 x3Var = (x3) this.d;
                x3Var.x = this.b ? 1.0f : 0.0f;
                if (!x3Var.n) {
                    x3Var.n();
                }
                x3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                x3Var.h();
                return;
            case 4:
                fo foVar = (fo) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = foVar.B8;
                if (bitmap != null) {
                    foVar.C8 = null;
                    foVar.D8 = null;
                    bitmap.recycle();
                    foVar.B8 = null;
                }
                u1 u1Var = (u1) this.c;
                if (u1Var != null) {
                    u1Var.invalidate();
                }
                foVar.sb(null);
                foVar.M8 = null;
                foVar.X0.invalidate();
                foVar.x0.invalidate();
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.c;
                ((zo) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 6:
                cn0 cn0Var = (cn0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                cn0Var.r = f7;
                cn0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                cn0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, cn0Var.r));
                cn0Var.y.setAlpha(cn0Var.r);
                cn0Var.s.invalidate();
                cn0Var.v.invalidate();
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
                n60 n60Var = (n60) this.d;
                h40 h40Var = n60Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                n60Var.d.getNotificationCenter().onAnimationFinish(n60Var.d3);
                n60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                n60Var.d2 = f10;
                n60Var.a2.n = f10;
                if (z10) {
                    h40Var.setAlpha(1.0f);
                    h40Var.setScaleX(1.0f);
                    h40Var.setScaleY(1.0f);
                    h40Var.setTranslationX(0.0f);
                    h40Var.setTranslationY(0.0f);
                } else {
                    n60Var.W2.setAlpha(0);
                    n60Var.c1();
                    if (n60Var.e2.getParent() != null) {
                        viewGroup2 = ((e3) n60Var).containerView;
                        viewGroup2.removeView(n60Var.e2);
                    }
                    n60Var.e2 = null;
                    h40Var.setVisibility(8);
                    n60Var.f2 = false;
                    n60Var.Y.X = true;
                    n60Var.b2.setVisibility(8);
                    if (n60Var.s0) {
                        n60Var.s0 = false;
                        n60Var.P0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = n60Var.Z2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                n60Var.T0();
                viewGroup = ((e3) n60Var).containerView;
                viewGroup.invalidate();
                n60Var.b.invalidate();
                n60Var.Q.invalidate();
                return;
            case 9:
                tw0 tw0Var = (tw0) this.c;
                ah0 ah0Var = (ah0) this.d;
                if (ah0Var.J == 0 && this.b) {
                    ah0Var.v1(true, true);
                }
                tw0Var.setVisibility(8);
                tw0Var.g();
                tw0Var.setX(0.0f);
                return;
            case 10:
                rw0 rw0Var = (rw0) this.d;
                rw0Var.y = this.b ? 1.0f : 0.0f;
                rw0Var.c.invalidate();
                rw0Var.d.invalidate();
                rw0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 11:
                r51 r51Var = (r51) this.d;
                r51Var.s = this.b ? 1.0f : 0.0f;
                r51Var.b.invalidate();
                r51Var.c.invalidate();
                r51Var.e();
                TextView textView = r51Var.y;
                if (textView != null) {
                    textView.setAlpha(r51Var.s);
                }
                if (r51Var.S) {
                    r51Var.N.invalidate();
                }
                if (!r51Var.S && (p51Var = r51Var.N) != null && p51Var.getSeekBarWaveform() != null) {
                    jp0 seekBarWaveform = r51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = r51Var.s;
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
            case 12:
                re1 re1Var = (re1) this.d;
                re1Var.x = this.b ? 1.0f : 0.0f;
                re1Var.b.invalidate();
                re1Var.c.invalidate();
                re1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                v2 v2Var = (v2) this.d;
                ee eeVar = v2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                v2Var.y = f11;
                eeVar.setAlpha(f11);
                eeVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                eeVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                v2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ q0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public q0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.a = 1;
        this.c = viewGroup;
        this.b = z10;
        this.d = gVar;
    }
}
