package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import bi.ce;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.e40;
import org.telegram.ui.eo;
import org.telegram.ui.j60;
import org.telegram.ui.l51;
import org.telegram.ui.n51;
import org.telegram.ui.ow0;
import org.telegram.ui.pe1;
import org.telegram.ui.w3;
import org.telegram.ui.xg0;
import org.telegram.ui.yo;
import org.telegram.ui.zd;
import pg.t2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        l51 l51Var;
        switch (this.a) {
            case 0:
                kotlin.jvm.internal.i.e(anim, "anim");
                ((ViewGroup) this.c).endViewTransition(null);
                if (!this.b) {
                    throw null;
                }
                throw null;
            case 1:
                ((ce) this.d).n0();
                if (this.b) {
                    return;
                }
                ((View) this.c).setVisibility(8);
                return;
            case 2:
                w3 w3Var = (w3) this.d;
                w3Var.x = this.b ? 1.0f : 0.0f;
                if (!w3Var.n) {
                    w3Var.n();
                }
                w3Var.i();
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                w3Var.h();
                return;
            case 3:
                eo eoVar = (eo) this.d;
                if (this.b) {
                    return;
                }
                Bitmap bitmap = eoVar.B8;
                if (bitmap != null) {
                    eoVar.C8 = null;
                    eoVar.D8 = null;
                    bitmap.recycle();
                    eoVar.B8 = null;
                }
                t1 t1Var = (t1) this.c;
                if (t1Var != null) {
                    t1Var.invalidate();
                }
                eoVar.ob(null);
                eoVar.M8 = null;
                eoVar.X0.invalidate();
                eoVar.x0.invalidate();
                return;
            case 4:
                ArrayList arrayList = (ArrayList) this.c;
                ((yo) this.d).N.setVisibility(this.b ? 0 : 8);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((View) arrayList.get(i10)).setTranslationY(0.0f);
                }
                return;
            case 5:
                km0 km0Var = (km0) this.d;
                float f7 = this.b ? 1.0f : 0.0f;
                km0Var.r = f7;
                km0Var.y.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
                km0Var.y.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, km0Var.r));
                km0Var.y.setAlpha(km0Var.r);
                km0Var.s.invalidate();
                km0Var.v.invalidate();
                Runnable runnable2 = (Runnable) this.c;
                if (runnable2 != null) {
                    AndroidUtilities.runOnUIThread(runnable2);
                    return;
                }
                return;
            case 6:
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
            case 7:
                j60 j60Var = (j60) this.d;
                e40 e40Var = j60Var.C2;
                org.telegram.ui.Components.voip.t tVar3 = (org.telegram.ui.Components.voip.t) this.c;
                if (tVar3 != null) {
                    tVar3.f = false;
                }
                j60Var.d.getNotificationCenter().onAnimationFinish(j60Var.d3);
                j60Var.c3 = false;
                boolean z10 = this.b;
                float f10 = z10 ? 1.0f : 0.0f;
                j60Var.d2 = f10;
                j60Var.a2.n = f10;
                if (z10) {
                    e40Var.setAlpha(1.0f);
                    e40Var.setScaleX(1.0f);
                    e40Var.setScaleY(1.0f);
                    e40Var.setTranslationX(0.0f);
                    e40Var.setTranslationY(0.0f);
                } else {
                    j60Var.W2.setAlpha(0);
                    j60Var.b1();
                    if (j60Var.e2.getParent() != null) {
                        viewGroup2 = ((h3) j60Var).containerView;
                        viewGroup2.removeView(j60Var.e2);
                    }
                    j60Var.e2 = null;
                    e40Var.setVisibility(8);
                    j60Var.f2 = false;
                    j60Var.Y.X = true;
                    j60Var.b2.setVisibility(8);
                    if (j60Var.s0) {
                        j60Var.s0 = false;
                        j60Var.O0(true);
                    }
                    org.telegram.ui.Components.voip.t tVar4 = j60Var.Z2;
                    if (tVar4 != null) {
                        tVar4.a.setRoundCorners(0.0f);
                    }
                }
                j60Var.S0();
                viewGroup = ((h3) j60Var).containerView;
                viewGroup.invalidate();
                j60Var.b.invalidate();
                j60Var.Q.invalidate();
                return;
            case 8:
                fw0 fw0Var = (fw0) this.c;
                xg0 xg0Var = (xg0) this.d;
                if (xg0Var.J == 0 && this.b) {
                    xg0Var.v1(true, true);
                }
                fw0Var.setVisibility(8);
                fw0Var.g();
                fw0Var.setX(0.0f);
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
                n51 n51Var = (n51) this.d;
                n51Var.s = this.b ? 1.0f : 0.0f;
                n51Var.b.invalidate();
                n51Var.c.invalidate();
                n51Var.e();
                TextView textView = n51Var.y;
                if (textView != null) {
                    textView.setAlpha(n51Var.s);
                }
                if (n51Var.S) {
                    n51Var.N.invalidate();
                }
                if (!n51Var.S && (l51Var = n51Var.N) != null && l51Var.getSeekBarWaveform() != null) {
                    ro0 seekBarWaveform = n51Var.N.getSeekBarWaveform();
                    seekBarWaveform.L = n51Var.s;
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
                pe1 pe1Var = (pe1) this.d;
                pe1Var.x = this.b ? 1.0f : 0.0f;
                pe1Var.b.invalidate();
                pe1Var.c.invalidate();
                pe1Var.e();
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
                yg.c0 c0Var = (yg.c0) this.d;
                c0Var.E.remove((ValueAnimator) this.c);
                yg.c0.a(c0Var, this.b);
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
