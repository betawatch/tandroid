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

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        ux uxVar;
        View view;
        v4.b0 b0Var;
        pj0 pj0Var;
        ?? r16;
        rp rpVar2;
        int i10;
        boolean z9;
        ix ixVar;
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
                ux uxVar2 = (ux) frameLayout;
                hy hyVar = uxVar2.G;
                rp rpVar3 = uxVar2.d;
                if (!rpVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i14 = 2;
                        if (hyVar.t1.z()) {
                            rpVar = rpVar3;
                            i7 = 2;
                        } else {
                            pj0 pj0Var2 = hyVar.D0;
                            pj0 pj0Var3 = hyVar.P;
                            mx mxVar = hyVar.j0;
                            pj0 pj0Var4 = hyVar.h0;
                            AnimatorSet animatorSet = hyVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                hyVar.M0 = null;
                            }
                            hyVar.I0 = false;
                            hyVar.q0 = false;
                            hyVar.c0 = false;
                            int i15 = 0;
                            while (i15 < 3) {
                                if (i15 == 0) {
                                    uxVar = hyVar.V;
                                    view = hyVar.I;
                                    r16 = z10;
                                    b0Var = hyVar.Q;
                                    pj0Var = pj0Var3;
                                } else {
                                    boolean z11 = z10;
                                    if (i15 == i13) {
                                        uxVar = hyVar.o0;
                                        view = hyVar.p0;
                                        b0Var = hyVar.i0;
                                        pj0Var = pj0Var4;
                                        r16 = z11;
                                    } else {
                                        uxVar = hyVar.G0;
                                        view = hyVar.B0;
                                        b0Var = hyVar.E0;
                                        pj0Var = pj0Var2;
                                        r16 = z11;
                                    }
                                }
                                if (uxVar == null) {
                                    rpVar2 = rpVar3;
                                    i10 = i14;
                                    z9 = r16;
                                } else if (uxVar2 == uxVar && (ixVar = hyVar.t1) != null && ixVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    hyVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i15 == i14) {
                                        rpVar2 = rpVar3;
                                        float f10 = i15 == i14 ? 0.0f : -org.telegram.messenger.g0.L(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f10;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pj0Var, (Property<pj0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(uxVar, (Property<ux, Float>) property, fArr2);
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
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(uxVar, (Property<ux, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i16] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    hyVar.M0.setDuration(220L);
                                    hyVar.M0.setInterpolator(xq.f);
                                    hyVar.M0.addListener(new ah.l(27, hyVar, pj0Var));
                                    hyVar.M0.start();
                                    z9 = r16;
                                    i10 = 2;
                                } else {
                                    rpVar2 = rpVar3;
                                    uxVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                    i10 = 2;
                                    if (view != null && i15 != 2) {
                                        view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                    }
                                    if (pj0Var == pj0Var2) {
                                        int i17 = r16;
                                        pj0Var.setPadding(i17, i17, i17, hyVar.q2);
                                    } else {
                                        int i18 = r16;
                                        if (pj0Var == pj0Var3) {
                                            pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i18, org.telegram.messenger.g0.L(5.0f), hyVar.q2);
                                        } else if (pj0Var == pj0Var4) {
                                            pj0Var.setPadding(i18, hyVar.b1, i18, hyVar.q2);
                                        }
                                    }
                                    if (pj0Var == pj0Var4) {
                                        boolean z12 = hyVar.n0.y.size() > 0;
                                        mxVar.K = z12;
                                        if (z12) {
                                            mxVar.G("", true);
                                            if (pj0Var4.getAdapter() != mxVar) {
                                                pj0Var4.setAdapter(mxVar);
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
                            hyVar.M(z10);
                        }
                        hyVar.t1.i(i12 == 1 ? i7 : 1);
                        rpVar.requestFocus();
                        org.telegram.messenger.g0.K3(rpVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
