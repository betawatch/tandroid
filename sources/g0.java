// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.o;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                h0 h0Var = (h0) obj;
                h0Var.O = null;
                h0Var.M = h0Var.N;
                h0Var.requestLayout();
                break;
            case 1:
                s1 s1Var = (s1) obj;
                ((eo8) s1Var).f0.e.c.r = false;
                FrameLayout frameLayout = s1Var.K;
                if (frameLayout.getBackground() == null) {
                    frameLayout.setBackground(s1Var.L);
                    break;
                }
                break;
            case 2:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.N = null;
                actionBarOverlayLayout.w = false;
                break;
            case 3:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                actionBarPopupWindow$ActionBarPopupWindowLayout.n = false;
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    View childAt = actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i);
                    if (!(childAt instanceof j8)) {
                        childAt.setTranslationY(0.0f);
                        childAt.setAlpha(childAt.isEnabled() ? 1.0f : 0.5f);
                    }
                }
                break;
            case 4:
                ((gu2) obj).run();
                break;
            case 5:
                gb gbVar = (gb) obj;
                if (!gbVar.e) {
                    gbVar.j();
                    break;
                }
                break;
            case 6:
                HashMap hashMap = gl.l0;
                if (hashMap != null) {
                    hashMap.remove((Window) obj);
                    break;
                }
                break;
            case 7:
                qm qmVar = (qm) obj;
                qmVar.d = null;
                qmVar.b.clear();
                break;
            case 8:
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) obj;
                animatedPhoneNumberEditText.S1 = null;
                animatedPhoneNumberEditText.Q1.clear();
                break;
            case 9:
                super.onAnimationEnd(animator);
                gn gnVar = (gn) obj;
                gnVar.b();
                gnVar.o = null;
                gnVar.j = 0.0f;
                gnVar.m = 0.0f;
                gnVar.l = 0.0f;
                gnVar.k = 0.0f;
                gnVar.r = 0.0f;
                gnVar.q = 0.0f;
                gnVar.invalidateSelf();
                Runnable runnable = gnVar.c0;
                if (runnable != null) {
                    runnable.run();
                }
                gnVar.t = null;
                CharSequence charSequence = gnVar.u;
                if (charSequence != null) {
                    gnVar.t(charSequence, true, gnVar.v);
                    gnVar.u = null;
                    gnVar.v = false;
                    break;
                } else {
                    b1 b1Var = gnVar.J;
                    if (b1Var != null) {
                        b1Var.run();
                        break;
                    }
                }
                break;
            case 10:
                es esVar = (es) obj;
                Button button = esVar.n;
                ls8 ls8Var = esVar.f;
                if (button == ls8Var) {
                    esVar.e.setVisibility(4);
                    break;
                } else {
                    ls8Var.setVisibility(4);
                    break;
                }
            case 11:
                super.onAnimationEnd(animator);
                dt dtVar = (dt) obj;
                if (dtVar != null) {
                    dtVar.run();
                    break;
                }
                break;
            case 12:
                o oVar = (o) obj;
                Runnable runnable2 = oVar.b0;
                if (runnable2 != null) {
                    runnable2.run();
                    oVar.b0 = null;
                    break;
                }
                break;
            case 13:
                sw swVar = (sw) obj;
                swVar.x = 1.0f;
                swVar.A();
                swVar.s();
                swVar.r();
                swVar.a.e();
                break;
            case 14:
                be0 be0Var = (be0) obj;
                be0Var.setVisibility(8);
                be0Var.setImageDrawable(null);
                be0Var.setAlpha(1.0f);
                break;
            case 15:
                mb0 mb0Var = (mb0) ((ya0) obj).m1;
                mb0Var.f = false;
                mb0Var.e.setVisibility(8);
                break;
            case 16:
                ((qb0) obj).setVisibility(8);
                break;
            case 17:
                tb0 tb0Var = (tb0) obj;
                tb0Var.c = false;
                tb0Var.invalidate();
                break;
            case 18:
                gc0 gc0Var = (gc0) obj;
                if (gc0Var.f != null) {
                    gc0Var.e = 1.0f;
                    gc0Var.k();
                    if (gc0Var.g) {
                        gc0Var.g = false;
                        Runnable runnable3 = gc0Var.j;
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                    }
                    gc0Var.d();
                }
                gc0Var.f = null;
                break;
            case 19:
                super.onAnimationEnd(animator);
                nf0 nf0Var = (nf0) obj;
                if (!nf0Var.j1) {
                    nf0Var.v0 = false;
                    nf0Var.u0.setVisibility(8);
                    nf0Var.invalidate();
                }
                nf0Var.g0 = false;
                break;
            case 20:
                mm0 mm0Var = (mm0) obj;
                mm0Var.b = 1.0f;
                mm0Var.invalidate();
                break;
            case 21:
                ((lo0) obj).i0.setVisibility(8);
                break;
            case 22:
                super.onAnimationEnd(animator);
                ((wo0) obj).x = null;
                break;
            case 23:
                ap0 ap0Var = (ap0) obj;
                ap0Var.setVisibility(8);
                ap0Var.a = null;
                break;
            case 24:
                ((hv0) obj).s.setVisibility(8);
                break;
            case 25:
                ((ow0) obj).F.setVisibility(8);
                break;
            case 26:
                qx0 qx0Var = (qx0) obj;
                if (qx0Var.G == animator) {
                    qx0Var.H = qx0Var.I;
                    Iterator it = qx0Var.J.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    break;
                }
                break;
            case 27:
                yx0 yx0Var = (yx0) obj;
                qx0 qx0Var2 = yx0Var.a;
                if (qx0Var2 != null) {
                    qx0Var2.b = true;
                    qx0Var2.invalidate();
                }
                yx0Var.W = yx0Var.V ? 1.0f : 0.0f;
                yx0Var.invalidate();
                if (!yx0Var.V) {
                    yx0Var.S.clear();
                    break;
                }
                break;
            case 28:
            default:
                super.onAnimationEnd(animator);
                break;
            case 29:
                ((da1) obj).w = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ((eo8) ((s1) obj)).f0.e.c.r = true;
                break;
            case 16:
                ((qb0) obj).setVisibility(0);
                break;
            case 28:
                b81 b81Var = (b81) obj;
                for (int i = 0; i < b81Var.b.getChildCount(); i++) {
                    y71 y71Var = (y71) b81Var.b.getChildAt(i);
                    int i2 = b81Var.Q;
                    int i3 = b81Var.R;
                    int i4 = y71.E;
                    y71Var.c(i2, i3);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
