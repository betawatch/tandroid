package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import fi.sb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.a41;
import org.telegram.ui.c41;
import org.telegram.ui.gg0;
import org.telegram.ui.id1;
import org.telegram.ui.mo;
import org.telegram.ui.p30;
import org.telegram.ui.un;
import org.telegram.ui.v3;
import org.telegram.ui.v50;
import org.telegram.ui.xv0;
import sg.v2;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class l0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l0(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                this.b = true;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator anim) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        a41 a41Var;
        switch (this.a) {
            case 0:
                o0 o0Var = (o0) this.d;
                if (o0Var.T == anim) {
                    o0Var.T = null;
                }
                if (this.b) {
                    return;
                }
                ((Runnable) this.c).run();
                return;
            case 1:
                z0 z0Var = (z0) this.d;
                z0Var.h0();
                z0Var.d.setReveal(this.b ? 1.0f : 0.0f);
                ((Runnable) this.c).run();
                return;
            case 2:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 3:
                super.onAnimationEnd(anim);
                bh.i0 i0Var = (bh.i0) this.d;
                i0Var.E.remove((ValueAnimator) this.c);
                bh.i0.a(i0Var, this.b);
                return;
            case 4:
                ((sb) this.d).m0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 5:
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
            case 6:
                un unVar = (un) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = unVar.N8;
                if (bitmap != null) {
                    unVar.O8 = null;
                    unVar.P8 = null;
                    bitmap.recycle();
                    unVar.N8 = null;
                }
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                if (s1Var != null) {
                    s1Var.invalidate();
                }
                unVar.zb(null);
                unVar.Y8 = null;
                unVar.j1.invalidate();
                unVar.x0.invalidate();
                return;
            case 7:
                ArrayList arrayList = (ArrayList) this.c;
                ((mo) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 8:
                hn0 hn0Var = (hn0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                hn0Var.r = f7;
                hn0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                hn0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, hn0Var.r));
                hn0Var.y.setAlpha(hn0Var.r);
                hn0Var.s.invalidate();
                hn0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 9:
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
            case 10:
                v50 v50Var = (v50) this.d;
                p30 p30Var = v50Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                v50Var.d.getNotificationCenter().onAnimationFinish(v50Var.d3);
                v50Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                v50Var.d2 = f10;
                v50Var.a2.n = f10;
                if (z10) {
                    p30Var.setAlpha(1.0f);
                    p30Var.setScaleX(1.0f);
                    p30Var.setScaleY(1.0f);
                    p30Var.setTranslationX(0.0f);
                    p30Var.setTranslationY(0.0f);
                } else {
                    v50Var.W2.setAlpha(0);
                    v50Var.b1();
                    if (v50Var.e2.getParent() != null) {
                        viewGroup2 = ((k3) v50Var).containerView;
                        viewGroup2.removeView(v50Var.e2);
                    }
                    v50Var.e2 = null;
                    p30Var.setVisibility(8);
                    v50Var.f2 = false;
                    v50Var.Y.X = true;
                    v50Var.b2.setVisibility(8);
                    if (v50Var.s0) {
                        v50Var.s0 = false;
                        v50Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = v50Var.Z2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                v50Var.S0();
                viewGroup = ((k3) v50Var).containerView;
                viewGroup.invalidate();
                v50Var.b.invalidate();
                v50Var.Q.invalidate();
                return;
            case 11:
                ax0 ax0Var = (ax0) this.c;
                gg0 gg0Var = (gg0) this.d;
                if (gg0Var.J == 0 && this.b) {
                    gg0Var.A1(true, true);
                }
                ax0Var.setVisibility(8);
                ax0Var.g();
                ax0Var.setX(0.0f);
                return;
            case 12:
                xv0 xv0Var = (xv0) this.d;
                xv0Var.y = this.b ? 1.0f : 0.0f;
                xv0Var.c.invalidate();
                xv0Var.d.invalidate();
                xv0Var.e();
                Runnable runnable3 = (Runnable) this.c;
                if (runnable3 != null) {
                    runnable3.run();
                    return;
                }
                return;
            case 13:
                c41 c41Var = (c41) this.d;
                c41Var.s = this.b ? 1.0f : 0.0f;
                c41Var.b.invalidate();
                c41Var.c.invalidate();
                c41Var.e();
                TextView textView = c41Var.y;
                if (textView != null) {
                    textView.setAlpha(c41Var.s);
                }
                if (c41Var.S) {
                    c41Var.N.invalidate();
                }
                if (!c41Var.S && (a41Var = c41Var.N) != null && a41Var.getSeekBarWaveform() != null) {
                    pp0 seekBarWaveform = c41Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = c41Var.s;
                    org.telegram.ui.Cells.s1 s1Var2 = seekBarWaveform.n;
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
            case 14:
                id1 id1Var = (id1) this.d;
                id1Var.x = this.b ? 1.0f : 0.0f;
                id1Var.b.invalidate();
                id1Var.c.invalidate();
                id1Var.e();
                Runnable runnable5 = (Runnable) this.c;
                if (runnable5 != null) {
                    runnable5.run();
                    return;
                }
                return;
            default:
                v2 v2Var = (v2) this.d;
                bi.r rVar = v2Var.c;
                float f11 = this.b ? 1.0f : 0.0f;
                v2Var.y = f11;
                rVar.setAlpha(f11);
                rVar.setScaleX(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                rVar.setScaleY(AndroidUtilities.lerp(0.9f, 1.0f, v2Var.y));
                v2Var.b.invalidate();
                Runnable runnable6 = (Runnable) this.c;
                if (runnable6 != null) {
                    AndroidUtilities.runOnUIThread(runnable6);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ l0(Object obj, boolean z10, Object obj2, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = z10;
        this.c = obj2;
    }

    public l0(o0 o0Var, Runnable runnable) {
        this.a = 0;
        this.d = o0Var;
        this.c = runnable;
    }

    public l0(ViewGroup viewGroup, boolean z10, androidx.fragment.app.t0 t0Var, androidx.fragment.app.g gVar) {
        this.a = 2;
        this.c = viewGroup;
        this.b = z10;
        this.d = gVar;
    }
}
