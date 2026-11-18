package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.if0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Wallet.x6;
import org.telegram.ui.rf;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class t0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ t0(Object obj, float f10, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = f10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        int i10 = 0;
        float f10 = this.b;
        Object obj = this.c;
        switch (i7) {
            case 0:
                w0 w0Var = (w0) obj;
                w0Var.U = null;
                w0Var.a = f10;
                w0Var.invalidate();
                break;
            case 1:
                m3 m3Var = (m3) obj;
                m3Var.i = f10;
                n3 n3Var = m3Var.b;
                if (n3Var != null) {
                    n3Var.invalidate();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) obj;
                m6Var.G = f10;
                m6Var.invalidate();
                break;
            case 3:
                ColorMatrix colorMatrix = new ColorMatrix();
                t7 t7Var = (t7) obj;
                t7Var.w = f10;
                colorMatrix.setSaturation(f10);
                if (n6.I.q()) {
                    org.telegram.messenger.g0.h(colorMatrix, (1.0f - t7Var.w) * (-0.3f));
                }
                t7Var.d.setEmojiColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 4:
                s9 s9Var = (s9) obj;
                s9Var.g = f10;
                s9Var.invalidateSelf();
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.B6 = null;
                chatActivityEnterView.C6 = false;
                if (!chatActivityEnterView.M2) {
                    gf gfVar = chatActivityEnterView.F0;
                    if (gfVar != null) {
                        gfVar.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    ai.n0 n0Var = chatActivityEnterView.j1;
                    if (n0Var != null) {
                        n0Var.j();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf(this, f10, 3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(lr.g);
                    ofFloat.start();
                    break;
                }
                break;
            case 6:
                if0 if0Var = (if0) obj;
                if0Var.I.e();
                if0Var.b = f10;
                if (f10 <= 0.0f) {
                    if0Var.H = -1;
                }
                if0Var.c(true);
                if0Var.f = false;
                if (if0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    if0Var.Q.run();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.w3 w3Var = (org.telegram.ui.Wallet.w3) obj;
                x6 x6Var = w3Var.r;
                x6Var.getClass();
                x6Var.setLayerType(0, null);
                if (f10 != 0.0f) {
                    if (!w3Var.S) {
                        ValueAnimator valueAnimator = w3Var.Q;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(w3Var.R, 1.0f);
                        w3Var.Q = ofFloat2;
                        ofFloat2.setDuration(320L);
                        w3Var.Q.setInterpolator(lr.g);
                        w3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.p3(w3Var, i10));
                        w3Var.Q.start();
                        break;
                    }
                } else {
                    w3Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.n6 n6Var = (org.telegram.ui.Wallet.n6) obj;
                if (n6Var.n0 == animator) {
                    n6Var.n0 = null;
                    n6Var.R0(f10);
                    n6Var.s0.j(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                if0 if0Var = (if0) this.c;
                if0Var.f = true;
                if0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
