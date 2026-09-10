package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class iw0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ iw0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                ((k91) this.c).r = null;
                break;
            case 6:
            default:
                super.onAnimationCancel(animator);
                break;
            case 7:
                mh1 mh1Var = (mh1) this.c;
                AnimatorSet animatorSet = mh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mh1Var.I = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Cells.y3 y3Var;
        zh.t0 t0Var;
        switch (this.a) {
            case 0:
                ((ow0) this.c).E = this.b ? 1.0f : 0.0f;
                break;
            case 1:
                i11 i11Var = (i11) this.c;
                if (i11Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = i11Var.n.U0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = i11Var.n;
                    if (profileActivity.N0) {
                        profileActivity.S0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = i11Var.n;
                    if (profileActivity2.L0) {
                        profileActivity2.Q0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = i11Var.n;
                    if (profileActivity3.M0) {
                        profileActivity3.R0.setVisibility(8);
                    }
                } else {
                    i11Var.setVisibility(8);
                }
                i11Var.n.l5(false);
                break;
            case 2:
                m21 m21Var = (m21) this.c;
                if (this.b) {
                    m21Var.c.setVisibility(8);
                    break;
                } else {
                    m21Var.f.setVisibility(8);
                    break;
                }
            case 3:
                n51 n51Var = (n51) this.c;
                n51Var.v = this.b ? 1.0f : 0.0f;
                if (n51Var.S) {
                    n51Var.N.invalidate();
                    break;
                }
                break;
            case 4:
                h71 h71Var = (h71) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h71Var.v;
                float f7 = this.b ? 1.0f : 0.0f;
                h71Var.L = f7;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f7);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(org.telegram.ui.Components.wr.g.getInterpolation(h71Var.L));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i10 = 0; i10 < itemsCount; i10++) {
                    float cascade = AndroidUtilities.cascade(h71Var.L, i10, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.L.getChildAt(i10).setAlpha(cascade);
                }
                h71Var.N = null;
                break;
            case 5:
                k91 k91Var = (k91) this.c;
                if (k91Var.r != null && (y3Var = k91Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    k91Var.r = null;
                    break;
                }
                break;
            case 6:
                ((pe1) this.c).y = this.b ? 1.0f : 0.0f;
                break;
            case 7:
                mh1 mh1Var = (mh1) this.c;
                AnimatorSet animatorSet = mh1Var.I;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (this.b) {
                        mh1Var.e.setVisibility(4);
                        break;
                    } else {
                        mh1Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) this.c;
                ei.o oVar = v1Var.V;
                if (!v1Var.T) {
                    oVar.setVisibility(8);
                    oVar.setText("");
                }
                float f10 = this.b ? 1.0f : 0.0f;
                v1Var.U = f10;
                oVar.setAlpha(f10);
                v1Var.invalidate();
                if (v1Var.T) {
                    oVar.requestFocus();
                    AndroidUtilities.showKeyboard(oVar);
                    break;
                } else {
                    oVar.clearFocus();
                    AndroidUtilities.hideKeyboard(oVar);
                    break;
                }
            case 9:
                l0 l0Var = (l0) this.c;
                ei.o oVar2 = l0Var.b0;
                if (!l0Var.W) {
                    oVar2.setVisibility(8);
                }
                float f11 = this.b ? 1.0f : 0.0f;
                l0Var.a0 = f11;
                oVar2.setAlpha(f11);
                l0Var.j(l0Var.a0);
                l0Var.R.setTranslationX(AndroidUtilities.dp(56.0f) * l0Var.a0);
                l0Var.O.setTranslationX(AndroidUtilities.dp(112.0f) * l0Var.a0);
                l0Var.invalidate();
                break;
            case 10:
                pg.y1 y1Var = (pg.y1) this.c;
                ((og.n) y1Var).y.n.d();
                if (this.b) {
                    y1Var.w.accept(Integer.valueOf(y1Var.s));
                }
                if (y1Var.getParent() != null) {
                    ((ViewGroup) y1Var.getParent()).removeView(y1Var);
                    break;
                }
                break;
            case 11:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.c;
                if (this.b) {
                    limitPreviewView.j0 = false;
                }
                Runnable runnable = limitPreviewView.k0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.k0.run();
                    break;
                }
                break;
            case 12:
                qg.s0 s0Var = (qg.s0) this.c;
                s0Var.M = this.b ? 1.0f : 0.0f;
                s0Var.d.invalidate();
                qg.r0 r0Var = s0Var.e;
                if (r0Var != null) {
                    r0Var.invalidate();
                    break;
                }
                break;
            case 13:
                yg.c0 c0Var = (yg.c0) this.c;
                org.telegram.ui.Components.pk0 pk0Var = c0Var.n;
                c0Var.k();
                c0Var.l();
                boolean z10 = this.b;
                yg.c0.a(c0Var, z10);
                c0Var.m.invalidateOutline();
                c0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    c0Var.k = true;
                    c0Var.a.invalidate();
                }
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(c0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    pk0Var.setImportantForAccessibility(0);
                    pk0Var.setSkipDraw(false);
                    c0Var.f();
                    Runtime.getRuntime().gc();
                    int i11 = c0Var.y;
                    pk0Var.setCustomEmojiReactionsBackground((i11 == 4 || i11 == 5) ? false : true);
                }
                c0Var.C = false;
                break;
            case 14:
                zh.l lVar = (zh.l) this.c;
                lVar.d0 = this.b ? 1.0f : 0.0f;
                lVar.b();
                break;
            case 15:
                zh.o1 o1Var = (zh.o1) this.c;
                zp0 zp0Var = o1Var.c;
                boolean z11 = this.b;
                zp0Var.setAlpha(z11 ? 0.0f : 1.0f);
                o1Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                o1Var.invalidate();
                break;
            case 16:
                zh.x0 x0Var = (zh.x0) this.c;
                x0Var.b.removeViewImmediate(x0Var.d);
                x0Var.f.b();
                if (this.b && (t0Var = x0Var.v) != null && t0Var != zh.t0.W) {
                    t0Var.e();
                }
                x0Var.v = null;
                x0Var.s = true;
                x0Var.G = null;
                x0Var.E = false;
                break;
            default:
                zh.u7 u7Var = (zh.u7) this.c;
                u7Var.J0.unlock();
                u7Var.e0 = this.b ? u7Var.w.c : 0.0f;
                zh.a3 currentPeerView = u7Var.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                u7Var.v.invalidate();
                u7Var.v1 = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                i11 i11Var = (i11) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = i11Var.n.U0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = i11Var.n;
                if (profileActivity.N0) {
                    profileActivity.S0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = i11Var.n;
                if (profileActivity2.L0) {
                    profileActivity2.Q0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = i11Var.n;
                if (profileActivity3.M0) {
                    profileActivity3.R0.setVisibility(0);
                }
                i11Var.setVisibility(0);
                i11Var.n.l5(false);
                break;
            case 2:
                m21 m21Var = (m21) this.c;
                if (!this.b) {
                    m21Var.c.setAlpha(0.0f);
                    m21Var.c.setVisibility(0);
                    break;
                } else {
                    m21Var.f.setAlpha(0.0f);
                    m21Var.f.setVisibility(0);
                    break;
                }
            case 14:
                super.onAnimationStart(animator);
                try {
                    ((zh.l) this.c).performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
