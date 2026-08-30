package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l61 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l61(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                ((o81) this.c).r = null;
                break;
            case 3:
                og1 og1Var = (og1) this.c;
                AnimatorSet animatorSet = og1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    og1Var.F = null;
                    break;
                }
                break;
            case 15:
                ((sh.n) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Cells.y3 y3Var;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                m61 m61Var = (m61) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = m61Var.v;
                float f10 = this.b ? 1.0f : 0.0f;
                m61Var.I = f10;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f10);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.nr.g.getInterpolation(m61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(m61Var.I, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i10).setAlpha(cascade);
                }
                m61Var.K = null;
                break;
            case 1:
                o81 o81Var = (o81) this.c;
                if (o81Var.r != null && (y3Var = o81Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    o81Var.r = null;
                    break;
                }
                break;
            case 2:
                ((rd1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 3:
                og1 og1Var = (og1) this.c;
                AnimatorSet animatorSet = og1Var.F;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (this.b) {
                        og1Var.e.setVisibility(4);
                        break;
                    } else {
                        og1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 4:
                org.telegram.ui.web.s1 s1Var = (org.telegram.ui.web.s1) this.c;
                lh.n nVar = s1Var.S;
                if (!s1Var.Q) {
                    nVar.setVisibility(8);
                    nVar.setText("");
                }
                float f11 = this.b ? 1.0f : 0.0f;
                s1Var.R = f11;
                nVar.setAlpha(f11);
                s1Var.invalidate();
                if (s1Var.Q) {
                    nVar.requestFocus();
                    AndroidUtilities.showKeyboard(nVar);
                    break;
                } else {
                    nVar.clearFocus();
                    AndroidUtilities.hideKeyboard(nVar);
                    break;
                }
            case 5:
                m0 m0Var = (m0) this.c;
                lh.n nVar2 = m0Var.V;
                if (!m0Var.T) {
                    nVar2.setVisibility(8);
                }
                float f12 = this.b ? 1.0f : 0.0f;
                m0Var.U = f12;
                nVar2.setAlpha(f12);
                m0Var.j(m0Var.U);
                m0Var.O.setTranslationX(AndroidUtilities.dp(56.0f) * m0Var.U);
                m0Var.L.setTranslationX(AndroidUtilities.dp(112.0f) * m0Var.U);
                m0Var.invalidate();
                break;
            case 6:
                ph.d dVar = (ph.d) this.c;
                dVar.J = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 7:
                ph.k kVar = (ph.k) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    kVar.r.setVisibility(8);
                    org.telegram.ui.Components.zh zhVar = kVar.J;
                    if (zhVar != null) {
                        zhVar.setVisibility(8);
                    }
                }
                if (z4) {
                    kVar.f.getEditText().setAllowDrawCursor(true);
                }
                kVar.c(z4);
                break;
            case 8:
                ph.u uVar = (ph.u) this.c;
                k3 k3Var = uVar.a;
                boolean z10 = this.b;
                uVar.d = z10 ? 1.0f : 0.0f;
                k3Var.invalidate();
                k3Var.setVisibility(z10 ? 0 : 8);
                break;
            case 9:
                if (!this.b) {
                    ((ph.a3) this.c).F.setVisibility(8);
                    break;
                }
                break;
            case 10:
                if (!this.b) {
                    ((ph.r3) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 11:
                ph.c5 c5Var = (ph.c5) this.c;
                if (!this.b) {
                    c5Var.W1.setVisibility(8);
                    c5Var.W1.n();
                    break;
                }
                break;
            case 12:
                ph.x7 x7Var = (ph.x7) this.c;
                if (this.b) {
                    x7Var.setVisibility(8);
                }
                x7Var.c = null;
                break;
            case 13:
                ph.da daVar = (ph.da) this.c;
                if (!this.b) {
                    daVar.S0.setVisibility(8);
                }
                daVar.c2 = null;
                break;
            case 14:
                rh.q2 q2Var = (rh.q2) this.c;
                q2Var.K0 = this.b ? 1.0f : 0.0f;
                q2Var.h();
                break;
            case 15:
                sh.n nVar3 = (sh.n) this.c;
                if (nVar3.w != null && (radialProgressView = nVar3.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        nVar3.s.setVisibility(4);
                    }
                    nVar3.w = null;
                    break;
                }
                break;
            case 16:
                tf.x0 x0Var = (tf.x0) this.c;
                boolean z11 = this.b;
                x0Var.e = z11 ? 1.0f : 0.0f;
                x0Var.invalidate();
                int i11 = 0;
                while (i11 < 2) {
                    x0Var.c[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.c[i11].setVisibility((i11 == 1) == z11 ? 0 : 8);
                    x0Var.c[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    x0Var.d[i11].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), x0Var.e));
                    x0Var.d[i11].setVisibility((i11 == 1) == z11 ? 0 : 8);
                    x0Var.d[i11].setAlpha(AndroidUtilities.lerp(i11 == 0 ? 1.0f : 0.0f, i11 == 1 ? 1.0f : 0.0f, x0Var.e));
                    i11++;
                }
                break;
            default:
                if (this.b) {
                    ((yf.n) this.c).e(false, false, true, false);
                    break;
                }
                break;
        }
    }
}
