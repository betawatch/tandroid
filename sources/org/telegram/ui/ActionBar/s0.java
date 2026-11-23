package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.hf;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.r9;
import org.telegram.ui.Wallet.y6;
import org.telegram.ui.rf;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class s0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s0(Object obj, float f10, int i7) {
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
                v0 v0Var = (v0) obj;
                v0Var.U = null;
                v0Var.a = f10;
                v0Var.invalidate();
                break;
            case 1:
                l3 l3Var = (l3) obj;
                l3Var.i = f10;
                m3 m3Var = l3Var.b;
                if (m3Var != null) {
                    m3Var.invalidate();
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
                r9 r9Var = (r9) obj;
                r9Var.g = f10;
                r9Var.invalidateSelf();
                break;
            case 5:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                chatActivityEnterView.D6 = null;
                chatActivityEnterView.E6 = false;
                if (!chatActivityEnterView.O2) {
                    hf hfVar = chatActivityEnterView.F0;
                    if (hfVar != null) {
                        hfVar.setText("");
                        chatActivityEnterView.F0.setAlpha(1.0f);
                    }
                    ai.l0 l0Var = chatActivityEnterView.j1;
                    if (l0Var != null) {
                        l0Var.j();
                    }
                    chatActivityEnterView.R0.invalidate();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    ofFloat.addUpdateListener(new rf(this, f10, 3));
                    ofFloat.setDuration(200L);
                    ofFloat.setInterpolator(kr.g);
                    ofFloat.start();
                    break;
                }
                break;
            case 6:
                jf0 jf0Var = (jf0) obj;
                jf0Var.I.e();
                jf0Var.b = f10;
                if (f10 <= 0.0f) {
                    jf0Var.H = -1;
                }
                jf0Var.c(true);
                jf0Var.f = false;
                if (jf0Var.Q != null && Math.abs(f10 - 1.0f) < 0.01f) {
                    jf0Var.Q.run();
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Wallet.x3 x3Var = (org.telegram.ui.Wallet.x3) obj;
                y6 y6Var = x3Var.r;
                y6Var.getClass();
                y6Var.setLayerType(0, null);
                if (f10 != 0.0f) {
                    if (!x3Var.S) {
                        ValueAnimator valueAnimator = x3Var.Q;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(x3Var.R, 1.0f);
                        x3Var.Q = ofFloat2;
                        ofFloat2.setDuration(320L);
                        x3Var.Q.setInterpolator(kr.g);
                        x3Var.Q.addUpdateListener(new org.telegram.ui.Wallet.q3(x3Var, i10));
                        x3Var.Q.start();
                        break;
                    }
                } else {
                    x3Var.b();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.o6 o6Var = (org.telegram.ui.Wallet.o6) obj;
                if (o6Var.n0 == animator) {
                    o6Var.n0 = null;
                    o6Var.R0(f10);
                    o6Var.s0.l(false);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 6:
                jf0 jf0Var = (jf0) this.c;
                jf0Var.f = true;
                jf0Var.c = this.b;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
