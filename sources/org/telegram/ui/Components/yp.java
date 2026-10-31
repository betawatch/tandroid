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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yp extends EditTextBoldCursor {
    public final /* synthetic */ int G1;
    public final /* synthetic */ int H1;
    public final /* synthetic */ FrameLayout I1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.G1 = i11;
        this.I1 = frameLayout;
        this.H1 = i10;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.G1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = org.telegram.messenger.i0.L(40.0f) + rect.bottom;
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
                ((cq) this.I1).E[this.H1 - 1].invalidate();
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
        yp ypVar;
        int i10;
        iy iyVar;
        View view;
        s4.a0 a0Var;
        tk0 tk0Var;
        ?? r16;
        yp ypVar2;
        int i11;
        boolean z10;
        vx vxVar;
        int i12 = this.G1;
        int i13 = this.H1;
        FrameLayout frameLayout = this.I1;
        int i14 = 1;
        boolean z11 = false;
        switch (i12) {
            case 0:
                cq cqVar = (cq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!cqVar.E[i13 + 1].isFocused()) {
                        cqVar.E[i13 + 1].requestFocus();
                        break;
                    } else {
                        org.telegram.messenger.i0.J3(cqVar.E[i13 + 1]);
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
                        org.telegram.messenger.i0.J3(this);
                        break;
                    }
                }
                break;
            default:
                iy iyVar2 = (iy) frameLayout;
                vy vyVar = iyVar2.G;
                yp ypVar3 = iyVar2.d;
                if (!ypVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i15 = 2;
                        if (vyVar.t1.z()) {
                            ypVar = ypVar3;
                            i10 = 2;
                        } else {
                            tk0 tk0Var2 = vyVar.D0;
                            tk0 tk0Var3 = vyVar.P;
                            zx zxVar = vyVar.j0;
                            tk0 tk0Var4 = vyVar.h0;
                            AnimatorSet animatorSet = vyVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                vyVar.M0 = null;
                            }
                            vyVar.I0 = false;
                            vyVar.q0 = false;
                            vyVar.c0 = false;
                            int i16 = 0;
                            while (i16 < 3) {
                                if (i16 == 0) {
                                    iyVar = vyVar.V;
                                    view = vyVar.I;
                                    r16 = z11;
                                    a0Var = vyVar.Q;
                                    tk0Var = tk0Var3;
                                } else {
                                    boolean z12 = z11;
                                    if (i16 == i14) {
                                        iyVar = vyVar.o0;
                                        view = vyVar.p0;
                                        a0Var = vyVar.i0;
                                        tk0Var = tk0Var4;
                                        r16 = z12;
                                    } else {
                                        iyVar = vyVar.G0;
                                        view = vyVar.B0;
                                        a0Var = vyVar.E0;
                                        tk0Var = tk0Var2;
                                        r16 = z12;
                                    }
                                }
                                if (iyVar == null) {
                                    ypVar2 = ypVar3;
                                    i11 = i15;
                                    z10 = r16;
                                } else if (iyVar2 == iyVar && (vxVar = vyVar.t1) != null && vxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    vyVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i16 == i15) {
                                        ypVar2 = ypVar3;
                                        float f7 = i16 == i15 ? 0.0f : -org.telegram.messenger.i0.L(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f7;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tk0Var, (Property<tk0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = org.telegram.messenger.i0.L(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(iyVar, (Property<iy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i17 = i15;
                                        ypVar2 = ypVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -org.telegram.messenger.i0.L(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -org.telegram.messenger.i0.L(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tk0Var, (Property<tk0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = org.telegram.messenger.i0.L(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(iyVar, (Property<iy, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i17] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    vyVar.M0.setDuration(220L);
                                    vyVar.M0.setInterpolator(gr.f);
                                    vyVar.M0.addListener(new bg.f(22, vyVar, tk0Var));
                                    vyVar.M0.start();
                                    z10 = r16;
                                    i11 = 2;
                                } else {
                                    ypVar2 = ypVar3;
                                    iyVar.setTranslationY(org.telegram.messenger.i0.L(0.0f));
                                    i11 = 2;
                                    if (view != null && i16 != 2) {
                                        view.setTranslationY(-org.telegram.messenger.i0.L(40.0f));
                                    }
                                    if (tk0Var == tk0Var2) {
                                        int i18 = r16;
                                        tk0Var.setPadding(i18, i18, i18, vyVar.q2);
                                    } else {
                                        int i19 = r16;
                                        if (tk0Var == tk0Var3) {
                                            tk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), i19, org.telegram.messenger.i0.L(5.0f), vyVar.q2);
                                        } else if (tk0Var == tk0Var4) {
                                            tk0Var.setPadding(i19, vyVar.b1, i19, vyVar.q2);
                                        }
                                    }
                                    if (tk0Var == tk0Var4) {
                                        boolean z13 = vyVar.n0.y.size() > 0;
                                        zxVar.K = z13;
                                        if (z13) {
                                            zxVar.G("", true);
                                            if (tk0Var4.getAdapter() != zxVar) {
                                                tk0Var4.setAdapter(zxVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    a0Var.h1(0, 0);
                                }
                                i16++;
                                i15 = i11;
                                z11 = z10;
                                ypVar3 = ypVar2;
                                i14 = 1;
                            }
                            ypVar = ypVar3;
                            i10 = i15;
                            vyVar.N(z11);
                        }
                        vyVar.t1.i(i13 == 1 ? i10 : 1);
                        ypVar.requestFocus();
                        org.telegram.messenger.i0.J3(ypVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
