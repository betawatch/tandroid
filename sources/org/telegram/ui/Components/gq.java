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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class gq extends EditTextBoldCursor {
    public final /* synthetic */ int M1;
    public final /* synthetic */ int N1;
    public final /* synthetic */ FrameLayout O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq(FrameLayout frameLayout, Context context, int i7, int i10) {
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
                ((kq) this.O1).F[this.N1 - 1].invalidate();
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
        gq gqVar;
        int i7;
        ey eyVar;
        View view;
        v4.c0 c0Var;
        ck0 ck0Var;
        ?? r16;
        gq gqVar2;
        int i10;
        boolean z10;
        rx rxVar;
        int i11 = this.M1;
        int i12 = this.N1;
        FrameLayout frameLayout = this.O1;
        int i13 = 1;
        boolean z11 = false;
        switch (i11) {
            case 0:
                kq kqVar = (kq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!kqVar.F[i12 + 1].isFocused()) {
                        kqVar.F[i12 + 1].requestFocus();
                        break;
                    } else {
                        org.telegram.messenger.g0.I3(kqVar.F[i12 + 1]);
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
                ey eyVar2 = (ey) frameLayout;
                ry ryVar = eyVar2.H;
                gq gqVar3 = eyVar2.d;
                if (!gqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i14 = 2;
                        if (ryVar.u1.z()) {
                            gqVar = gqVar3;
                            i7 = 2;
                        } else {
                            ck0 ck0Var2 = ryVar.E0;
                            ck0 ck0Var3 = ryVar.Q;
                            vx vxVar = ryVar.k0;
                            ck0 ck0Var4 = ryVar.i0;
                            AnimatorSet animatorSet = ryVar.N0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                ryVar.N0 = null;
                            }
                            ryVar.J0 = false;
                            ryVar.r0 = false;
                            ryVar.d0 = false;
                            int i15 = 0;
                            while (i15 < 3) {
                                if (i15 == 0) {
                                    eyVar = ryVar.W;
                                    view = ryVar.J;
                                    r16 = z11;
                                    c0Var = ryVar.R;
                                    ck0Var = ck0Var3;
                                } else {
                                    boolean z12 = z11;
                                    if (i15 == i13) {
                                        eyVar = ryVar.p0;
                                        view = ryVar.q0;
                                        c0Var = ryVar.j0;
                                        ck0Var = ck0Var4;
                                        r16 = z12;
                                    } else {
                                        eyVar = ryVar.H0;
                                        view = ryVar.C0;
                                        c0Var = ryVar.F0;
                                        ck0Var = ck0Var2;
                                        r16 = z12;
                                    }
                                }
                                if (eyVar == null) {
                                    gqVar2 = gqVar3;
                                    i10 = i14;
                                    z10 = r16;
                                } else if (eyVar2 == eyVar && (rxVar = ryVar.u1) != null && rxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    ryVar.N0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i15 == i14) {
                                        gqVar2 = gqVar3;
                                        float f10 = i15 == i14 ? 0.0f : -org.telegram.messenger.g0.L(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f10;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ck0Var, (Property<ck0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eyVar, (Property<ey, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i16 = i14;
                                        gqVar2 = gqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -org.telegram.messenger.g0.L(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -org.telegram.messenger.g0.L(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ck0Var, (Property<ck0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(eyVar, (Property<ey, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i16] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    ryVar.N0.setDuration(220L);
                                    ryVar.N0.setInterpolator(lr.f);
                                    ryVar.N0.addListener(new ah.l(27, ryVar, ck0Var));
                                    ryVar.N0.start();
                                    z10 = r16;
                                    i10 = 2;
                                } else {
                                    gqVar2 = gqVar3;
                                    eyVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                    i10 = 2;
                                    if (view != null && i15 != 2) {
                                        view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                    }
                                    if (ck0Var == ck0Var2) {
                                        int i17 = r16;
                                        ck0Var.setPadding(i17, i17, i17, ryVar.r2);
                                    } else {
                                        int i18 = r16;
                                        if (ck0Var == ck0Var3) {
                                            ck0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i18, org.telegram.messenger.g0.L(5.0f), ryVar.r2);
                                        } else if (ck0Var == ck0Var4) {
                                            ck0Var.setPadding(i18, ryVar.c1, i18, ryVar.r2);
                                        }
                                    }
                                    if (ck0Var == ck0Var4) {
                                        boolean z13 = ryVar.o0.y.size() > 0;
                                        vxVar.L = z13;
                                        if (z13) {
                                            vxVar.G("", true);
                                            if (ck0Var4.getAdapter() != vxVar) {
                                                ck0Var4.setAdapter(vxVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    c0Var.h1(0, 0);
                                }
                                i15++;
                                i14 = i10;
                                z11 = z10;
                                gqVar3 = gqVar2;
                                i13 = 1;
                            }
                            gqVar = gqVar3;
                            i7 = i14;
                            ryVar.N(z11);
                        }
                        ryVar.u1.i(i12 == 1 ? i7 : 1);
                        gqVar.requestFocus();
                        org.telegram.messenger.g0.I3(gqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
