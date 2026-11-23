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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class fq extends EditTextBoldCursor {
    public final /* synthetic */ int M1;
    public final /* synthetic */ int N1;
    public final /* synthetic */ FrameLayout O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq(FrameLayout frameLayout, Context context, int i7, int i10) {
        super(context);
        this.M1 = i10;
        this.O1 = frameLayout;
        this.N1 = i7;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.M1) {
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
        switch (this.M1) {
            case 1:
                super.invalidate();
                ((jq) this.O1).F[this.N1 - 1].invalidate();
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
        fq fqVar;
        int i7;
        dy dyVar;
        View view;
        v4.c0 c0Var;
        ek0 ek0Var;
        ?? r16;
        fq fqVar2;
        int i10;
        boolean z10;
        qx qxVar;
        int i11 = this.M1;
        int i12 = this.N1;
        FrameLayout frameLayout = this.O1;
        int i13 = 1;
        boolean z11 = false;
        switch (i11) {
            case 0:
                jq jqVar = (jq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!jqVar.F[i12 + 1].isFocused()) {
                        jqVar.F[i12 + 1].requestFocus();
                        break;
                    } else {
                        org.telegram.messenger.g0.I3(jqVar.F[i12 + 1]);
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
                        org.telegram.messenger.g0.I3(this);
                        break;
                    }
                }
                break;
            default:
                dy dyVar2 = (dy) frameLayout;
                qy qyVar = dyVar2.H;
                fq fqVar3 = dyVar2.d;
                if (!fqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i14 = 2;
                        if (qyVar.u1.z()) {
                            fqVar = fqVar3;
                            i7 = 2;
                        } else {
                            ek0 ek0Var2 = qyVar.E0;
                            ek0 ek0Var3 = qyVar.Q;
                            ux uxVar = qyVar.k0;
                            ek0 ek0Var4 = qyVar.i0;
                            AnimatorSet animatorSet = qyVar.N0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                qyVar.N0 = null;
                            }
                            qyVar.J0 = false;
                            qyVar.r0 = false;
                            qyVar.d0 = false;
                            int i15 = 0;
                            while (i15 < 3) {
                                if (i15 == 0) {
                                    dyVar = qyVar.W;
                                    view = qyVar.J;
                                    r16 = z11;
                                    c0Var = qyVar.R;
                                    ek0Var = ek0Var3;
                                } else {
                                    boolean z12 = z11;
                                    if (i15 == i13) {
                                        dyVar = qyVar.p0;
                                        view = qyVar.q0;
                                        c0Var = qyVar.j0;
                                        ek0Var = ek0Var4;
                                        r16 = z12;
                                    } else {
                                        dyVar = qyVar.H0;
                                        view = qyVar.C0;
                                        c0Var = qyVar.F0;
                                        ek0Var = ek0Var2;
                                        r16 = z12;
                                    }
                                }
                                if (dyVar == null) {
                                    fqVar2 = fqVar3;
                                    i10 = i14;
                                    z10 = r16;
                                } else if (dyVar2 == dyVar && (qxVar = qyVar.u1) != null && qxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    qyVar.N0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i15 == i14) {
                                        fqVar2 = fqVar3;
                                        float f10 = i15 == i14 ? 0.0f : -org.telegram.messenger.g0.L(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f10;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ek0Var, (Property<ek0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(dyVar, (Property<dy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i16 = i14;
                                        fqVar2 = fqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -org.telegram.messenger.g0.L(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -org.telegram.messenger.g0.L(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ek0Var, (Property<ek0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(dyVar, (Property<dy, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i16] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    qyVar.N0.setDuration(220L);
                                    qyVar.N0.setInterpolator(kr.f);
                                    qyVar.N0.addListener(new ah.l(28, qyVar, ek0Var));
                                    qyVar.N0.start();
                                    z10 = r16;
                                    i10 = 2;
                                } else {
                                    fqVar2 = fqVar3;
                                    dyVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                    i10 = 2;
                                    if (view != null && i15 != 2) {
                                        view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                    }
                                    if (ek0Var == ek0Var2) {
                                        int i17 = r16;
                                        ek0Var.setPadding(i17, i17, i17, qyVar.r2);
                                    } else {
                                        int i18 = r16;
                                        if (ek0Var == ek0Var3) {
                                            ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i18, org.telegram.messenger.g0.L(5.0f), qyVar.r2);
                                        } else if (ek0Var == ek0Var4) {
                                            ek0Var.setPadding(i18, qyVar.c1, i18, qyVar.r2);
                                        }
                                    }
                                    if (ek0Var == ek0Var4) {
                                        boolean z13 = qyVar.o0.y.size() > 0;
                                        uxVar.L = z13;
                                        if (z13) {
                                            uxVar.G("", true);
                                            if (ek0Var4.getAdapter() != uxVar) {
                                                ek0Var4.setAdapter(uxVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    c0Var.h1(0, 0);
                                }
                                i15++;
                                i14 = i10;
                                z11 = z10;
                                fqVar3 = fqVar2;
                                i13 = 1;
                            }
                            fqVar = fqVar3;
                            i7 = i14;
                            qyVar.N(z11);
                        }
                        qyVar.u1.i(i12 == 1 ? i7 : 1);
                        fqVar.requestFocus();
                        org.telegram.messenger.g0.I3(fqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
