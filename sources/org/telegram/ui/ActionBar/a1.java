package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.c8;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.md;
import org.telegram.ui.Components.th0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a1(Object obj, float f7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = f7;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        int i11 = 1;
        float f7 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                d1 d1Var = (d1) obj;
                d1Var.T = null;
                d1Var.a = f7;
                d1Var.invalidate();
                break;
            case 1:
                a4 a4Var = (a4) obj;
                a4Var.i = f7;
                b4 b4Var = a4Var.b;
                if (b4Var != null) {
                    b4Var.invalidate();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.s6 s6Var = (org.telegram.ui.Cells.s6) obj;
                s6Var.F = f7;
                s6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                c8 c8Var = (c8) obj;
                c8Var.v = f7;
                colorMatrix.setSaturation(f7);
                if (y6.I.q()) {
                    AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, (1.0f - c8Var.v) * (-0.3f));
                }
                c8Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                ba baVar = (ba) obj;
                baVar.g = f7;
                baVar.invalidateSelf();
                break;
            case 5:
                md mdVar = (md) obj;
                mdVar.e = null;
                if (f7 == 0.0f) {
                    Runnable runnable = mdVar.h;
                    mdVar.h = null;
                    super/*android.widget.PopupWindow*/.dismiss();
                    if (runnable != null) {
                        runnable.run();
                        break;
                    }
                }
                break;
            case 6:
                th0 th0Var = (th0) obj;
                th0Var.H.unlock();
                th0Var.b = f7;
                if (f7 <= 0.0f) {
                    th0Var.G = -1;
                }
                th0Var.c(true);
                th0Var.f = false;
                if (th0Var.O != null && Math.abs(f7 - 1.0f) < 0.01f) {
                    th0Var.O.run();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.y2 y2Var = (org.telegram.ui.Wallet.y2) obj;
                org.telegram.ui.Wallet.w5 w5Var = y2Var.r;
                w5Var.getClass();
                w5Var.setLayerType(0, null);
                if (f7 != 0.0f) {
                    if (!y2Var.R) {
                        ValueAnimator valueAnimator = y2Var.P;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(y2Var.Q, 1.0f);
                        y2Var.P = ofFloat;
                        ofFloat.setDuration(320L);
                        y2Var.P.setInterpolator(ds.g);
                        y2Var.P.addUpdateListener(new org.telegram.ui.Wallet.v2(y2Var, i11));
                        y2Var.P.start();
                        break;
                    }
                } else {
                    y2Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.m5 m5Var = (org.telegram.ui.Wallet.m5) obj;
                if (m5Var.m0 == animator) {
                    m5Var.m0 = null;
                    m5Var.I0(f7);
                    m5Var.p0.o(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                th0 th0Var = (th0) this.c;
                th0Var.f = true;
                th0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
