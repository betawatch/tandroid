package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class rp extends EditTextBoldCursor {
    public final /* synthetic */ int G1;
    public final /* synthetic */ int H1;
    public final /* synthetic */ FrameLayout I1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp(FrameLayout frameLayout, Context context, int i7, int i10) {
        super(context);
        this.G1 = i10;
        this.I1 = frameLayout;
        this.H1 = i7;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.G1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.G1) {
            case 1:
                super.invalidate();
                ((vp) this.I1).E[this.H1 - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rp rpVar;
        int i7;
        tx txVar;
        View view;
        v4.b0 b0Var;
        pj0 pj0Var;
        ?? r16;
        rp rpVar2;
        int i10;
        boolean z9;
        hx hxVar;
        int i11 = this.G1;
        int i12 = this.H1;
        FrameLayout frameLayout = this.I1;
        int i13 = 1;
        boolean z10 = false;
        switch (i11) {
            case 0:
                vp vpVar = (vp) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!vpVar.E[i12 + 1].isFocused()) {
                        vpVar.E[i12 + 1].requestFocus();
                        break;
                    } else {
                        org.telegram.messenger.g0.K3(vpVar.E[i12 + 1]);
                        break;
                    }
                }
                break;
            case 1:
                if (getAlpha() == 1.0f) {
                    if (!isFocused()) {
                        requestFocus();
                        break;
                    } else {
                        org.telegram.messenger.g0.K3(this);
                        break;
                    }
                }
                break;
            default:
                tx txVar2 = (tx) frameLayout;
                gy gyVar = txVar2.G;
                rp rpVar3 = txVar2.d;
                if (!rpVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i14 = 2;
                        if (gyVar.t1.z()) {
                            rpVar = rpVar3;
                            i7 = 2;
                        } else {
                            pj0 pj0Var2 = gyVar.D0;
                            pj0 pj0Var3 = gyVar.P;
                            lx lxVar = gyVar.j0;
                            pj0 pj0Var4 = gyVar.h0;
                            AnimatorSet animatorSet = gyVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                gyVar.M0 = null;
                            }
                            gyVar.I0 = false;
                            gyVar.q0 = false;
                            gyVar.c0 = false;
                            int i15 = 0;
                            while (i15 < 3) {
                                if (i15 == 0) {
                                    txVar = gyVar.V;
                                    view = gyVar.I;
                                    r16 = z10;
                                    b0Var = gyVar.Q;
                                    pj0Var = pj0Var3;
                                } else {
                                    boolean z11 = z10;
                                    if (i15 == i13) {
                                        txVar = gyVar.o0;
                                        view = gyVar.p0;
                                        b0Var = gyVar.i0;
                                        pj0Var = pj0Var4;
                                        r16 = z11;
                                    } else {
                                        txVar = gyVar.G0;
                                        view = gyVar.B0;
                                        b0Var = gyVar.E0;
                                        pj0Var = pj0Var2;
                                        r16 = z11;
                                    }
                                }
                                if (txVar == null) {
                                    rpVar2 = rpVar3;
                                    i10 = i14;
                                    z9 = r16;
                                } else if (txVar2 == txVar && (hxVar = gyVar.t1) != null && hxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    gyVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i15 == i14) {
                                        rpVar2 = rpVar3;
                                        float f10 = i15 == i14 ? 0.0f : -org.telegram.messenger.g0.L(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f10;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pj0Var, (Property<pj0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(txVar, (Property<tx, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i16 = i14;
                                        rpVar2 = rpVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -org.telegram.messenger.g0.L(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -org.telegram.messenger.g0.L(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(pj0Var, (Property<pj0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(txVar, (Property<tx, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i16] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    gyVar.M0.setDuration(220L);
                                    gyVar.M0.setInterpolator(wq.f);
                                    gyVar.M0.addListener(new ah.l(27, gyVar, pj0Var));
                                    gyVar.M0.start();
                                    z9 = r16;
                                    i10 = 2;
                                } else {
                                    rpVar2 = rpVar3;
                                    txVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                    i10 = 2;
                                    if (view != null && i15 != 2) {
                                        view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                    }
                                    if (pj0Var == pj0Var2) {
                                        int i17 = r16;
                                        pj0Var.setPadding(i17, i17, i17, gyVar.q2);
                                    } else {
                                        int i18 = r16;
                                        if (pj0Var == pj0Var3) {
                                            pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i18, org.telegram.messenger.g0.L(5.0f), gyVar.q2);
                                        } else if (pj0Var == pj0Var4) {
                                            pj0Var.setPadding(i18, gyVar.b1, i18, gyVar.q2);
                                        }
                                    }
                                    if (pj0Var == pj0Var4) {
                                        boolean z12 = gyVar.n0.y.size() > 0;
                                        lxVar.K = z12;
                                        if (z12) {
                                            lxVar.G("", true);
                                            if (pj0Var4.getAdapter() != lxVar) {
                                                pj0Var4.setAdapter(lxVar);
                                            }
                                        }
                                    }
                                    z9 = false;
                                    b0Var.h1(0, 0);
                                }
                                i15++;
                                i14 = i10;
                                z10 = z9;
                                rpVar3 = rpVar2;
                                i13 = 1;
                            }
                            rpVar = rpVar3;
                            i7 = i14;
                            gyVar.M(z10);
                        }
                        gyVar.t1.i(i12 == 1 ? i7 : 1);
                        rpVar.requestFocus();
                        org.telegram.messenger.g0.K3(rpVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
