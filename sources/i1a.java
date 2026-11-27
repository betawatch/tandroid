// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class i1a extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i1a(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 1:
                ((tba) obj).n = null;
                break;
            case 2:
                ((eja) obj).R1 = null;
                break;
            case 12:
                o7c o7cVar = (o7c) obj;
                AnimatorSet animatorSet = o7cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    o7cVar.J = null;
                    break;
                }
                break;
            case 13:
                jac jacVar = (jac) obj;
                AnimatorSet animatorSet2 = jacVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jacVar.n1 = null;
                    break;
                }
                break;
            case 14:
                xbc xbcVar = (xbc) obj;
                AnimatorSet animatorSet3 = xbcVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    xbcVar.s1 = null;
                    break;
                }
                break;
            case 16:
                dvc dvcVar = (dvc) obj;
                AnimatorSet animatorSet4 = dvcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    dvcVar.f = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        vb5 vb5Var;
        Drawable[] drawableArr;
        Drawable drawable;
        float f;
        byte b = this.a;
        byte b2 = 1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                j1a j1aVar = (j1a) obj;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j1aVar.w;
                float f2 = z ? 1.0f : 0.0f;
                j1aVar.M = f2;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f2);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(k43.g.getInterpolation(j1aVar.M));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i = 0; i < itemsCount; i++) {
                    float s = hl.s(j1aVar.M, i, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i).setTranslationY((1.0f - s) * hl.L(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.M.getChildAt(i).setAlpha(s);
                }
                j1aVar.O = null;
                break;
            case 1:
                tba tbaVar = (tba) obj;
                if (tbaVar.n != null && (vb5Var = tbaVar.r) != null) {
                    if (!z) {
                        vb5Var.setVisibility(4);
                    }
                    tbaVar.n = null;
                    break;
                }
                break;
            case 2:
                eja ejaVar = (eja) obj;
                if (ejaVar.R1 != null) {
                    ejaVar.R1 = null;
                    if (!z) {
                        ejaVar.E0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 3:
                jja jjaVar = (jja) obj;
                ValueAnimator valueAnimator = jjaVar.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    jjaVar.C0 = z ? 1.0f : 0.0f;
                    jjaVar.B0 = null;
                    break;
                }
                break;
            case 4:
                p9b p9bVar = (p9b) obj;
                if (z) {
                    p9bVar.setVisibility(8);
                }
                p9bVar.c = null;
                break;
            case 5:
                rbb rbbVar = (rbb) obj;
                if (!z) {
                    rbbVar.W0.setVisibility(8);
                }
                rbbVar.g2 = null;
                break;
            case 6:
                lcb lcbVar = (lcb) obj;
                lcbVar.J0.e();
                lcbVar.f0 = z ? lcbVar.x.c : 0.0f;
                o68 currentPeerView = lcbVar.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                lcbVar.w.invalidate();
                lcbVar.v1 = null;
                break;
            case 7:
                super.onAnimationEnd(animator);
                zqb zqbVar = (zqb) obj;
                zqbVar.N = z ? 1.0f : 0.0f;
                zqbVar.invalidate();
                break;
            case 8:
                ((ktb) obj).E = z ? 1.0f : 0.0f;
                break;
            case 9:
                l1c l1cVar = (l1c) obj;
                long j = l1cVar.f;
                if (l1cVar.e0 == animator) {
                    l1cVar.V = z ? 1.0f : 0.0f;
                    l1cVar.m();
                    l1cVar.W = false;
                    ImageView imageView = l1cVar.I;
                    boolean z2 = l1cVar.T;
                    int i2 = R.drawable.menu_sidebar_top;
                    imageView.setImageResource(z2 ? R.drawable.menu_sidebar_top : R.drawable.menu_sidebar_bottom);
                    ImageView imageView2 = l1cVar.H;
                    if (!l1cVar.T) {
                        i2 = R.drawable.menu_sidebar_left;
                    }
                    imageView2.setImageResource(i2);
                    l1cVar.e0 = null;
                    uc7.s1(l1cVar.e).X3.edit().putBoolean(qu6.n(j, "topicssidetabs"), l1cVar.U).putBoolean(qu6.n(j, "topicssidetabsb"), l1cVar.T).apply();
                    Boolean bool = l1cVar.d0;
                    if (bool != null && z != bool.booleanValue()) {
                        boolean booleanValue = l1cVar.d0.booleanValue();
                        l1cVar.d0 = null;
                        l1cVar.a(booleanValue);
                    }
                    hl.c3(new azb(this, b2));
                    break;
                }
                break;
            case 10:
                g1c g1cVar = (g1c) obj;
                g1cVar.G = z ? 1.0f : 0.0f;
                g1cVar.h();
                break;
            case 11:
                k1c k1cVar = (k1c) obj;
                k1cVar.V = z ? 1.0f : 0.0f;
                k1cVar.h();
                k1cVar.g();
                break;
            case 12:
                o7c o7cVar = (o7c) obj;
                AnimatorSet animatorSet = o7cVar.J;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (z) {
                        o7cVar.e.setVisibility(4);
                        break;
                    } else {
                        o7cVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 13:
                jac jacVar = (jac) obj;
                AnimatorSet animatorSet2 = jacVar.n1;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!z) {
                        jacVar.o1.setVisibility(4);
                    }
                    jacVar.n1 = null;
                    break;
                }
                break;
            case 14:
                xbc xbcVar = (xbc) obj;
                AnimatorSet animatorSet3 = xbcVar.s1;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!z) {
                        xbcVar.r1.setVisibility(4);
                    }
                    xbcVar.s1 = null;
                    break;
                }
                break;
            case 15:
                kmc kmcVar = (kmc) obj;
                kmcVar.w = null;
                if (z) {
                    TextView[] textViewArr = kmcVar.h;
                    TextView textView = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView;
                    textView.setVisibility(8);
                }
                if (!kmcVar.H && (drawable = (drawableArr = kmcVar.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                kmcVar.H = false;
                if (!kmcVar.P) {
                    kmcVar.n = kmcVar.r;
                }
                kmcVar.s = 0.0f;
                kmcVar.invalidate();
                break;
            case 16:
                dvc dvcVar = (dvc) obj;
                AnimatorSet animatorSet4 = dvcVar.f;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    dvcVar.f = null;
                    if (!z) {
                        dvcVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 17:
                dxc dxcVar = (dxc) obj;
                xs0 xs0Var = dxcVar.W;
                if (!dxcVar.U) {
                    xs0Var.setVisibility(8);
                    xs0Var.setText("");
                }
                f = z ? 1.0f : 0.0f;
                dxcVar.V = f;
                xs0Var.setAlpha(f);
                dxcVar.invalidate();
                if (dxcVar.U) {
                    xs0Var.requestFocus();
                    hl.E3(xs0Var);
                    break;
                } else {
                    xs0Var.clearFocus();
                    hl.t1(xs0Var);
                    break;
                }
            default:
                xt xtVar = (xt) obj;
                xs0 xs0Var2 = xtVar.c0;
                if (!xtVar.a0) {
                    xs0Var2.setVisibility(8);
                }
                f = z ? 1.0f : 0.0f;
                xtVar.b0 = f;
                xs0Var2.setAlpha(f);
                xtVar.j(xtVar.b0);
                xtVar.S.setTranslationX(hl.L(56.0f) * xtVar.b0);
                xtVar.P.setTranslationX(hl.L(112.0f) * xtVar.b0);
                xtVar.invalidate();
                break;
        }
    }
}
