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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class zp extends EditTextBoldCursor {
    public final /* synthetic */ int M1;
    public final /* synthetic */ int N1;
    public final /* synthetic */ FrameLayout O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zp(FrameLayout frameLayout, Context context, int i7, int i10) {
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
                ((dq) this.O1).F[this.N1 - 1].invalidate();
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
        zp zpVar;
        int i7;
        yx yxVar;
        View view;
        v4.b0 b0Var;
        View view2;
        ?? r16;
        zp zpVar2;
        int i10;
        boolean z10;
        mx mxVar;
        int i11 = this.M1;
        int i12 = this.N1;
        FrameLayout frameLayout = this.O1;
        int i13 = 1;
        boolean z11 = false;
        switch (i11) {
            case 0:
                dq dqVar = (dq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!dqVar.F[i12 + 1].isFocused()) {
                        dqVar.F[i12 + 1].requestFocus();
                        break;
                    } else {
                        org.telegram.messenger.g0.J3(dqVar.F[i12 + 1]);
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
                        org.telegram.messenger.g0.J3(this);
                        break;
                    }
                }
                break;
            default:
                yx yxVar2 = (yx) frameLayout;
                ly lyVar = yxVar2.H;
                zp zpVar3 = yxVar2.d;
                if (!zpVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i14 = 2;
                        if (lyVar.u1.z()) {
                            zpVar = zpVar3;
                            i7 = 2;
                        } else {
                            View view3 = lyVar.E0;
                            View view4 = lyVar.Q;
                            qx qxVar = lyVar.k0;
                            qv qvVar = lyVar.i0;
                            AnimatorSet animatorSet = lyVar.N0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                lyVar.N0 = null;
                            }
                            lyVar.J0 = false;
                            lyVar.r0 = false;
                            lyVar.d0 = false;
                            int i15 = 0;
                            while (i15 < 3) {
                                if (i15 == 0) {
                                    yxVar = lyVar.W;
                                    view = lyVar.J;
                                    r16 = z11;
                                    b0Var = lyVar.R;
                                    view2 = view4;
                                } else {
                                    boolean z12 = z11;
                                    if (i15 == i13) {
                                        yxVar = lyVar.p0;
                                        view = lyVar.q0;
                                        b0Var = lyVar.j0;
                                        view2 = qvVar;
                                        r16 = z12;
                                    } else {
                                        yxVar = lyVar.H0;
                                        view = lyVar.C0;
                                        b0Var = lyVar.F0;
                                        view2 = view3;
                                        r16 = z12;
                                    }
                                }
                                if (yxVar == null) {
                                    zpVar2 = zpVar3;
                                    i10 = i14;
                                    z10 = r16;
                                } else if (yxVar2 == yxVar && (mxVar = lyVar.u1) != null && mxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    lyVar.N0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i15 == i14) {
                                        zpVar2 = zpVar3;
                                        float f10 = i15 == i14 ? 0.0f : -org.telegram.messenger.g0.L(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f10;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yxVar, (Property<yx, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i16 = i14;
                                        zpVar2 = zpVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -org.telegram.messenger.g0.L(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -org.telegram.messenger.g0.L(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(yxVar, (Property<yx, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i16] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    lyVar.N0.setDuration(220L);
                                    lyVar.N0.setInterpolator(er.f);
                                    lyVar.N0.addListener(new ah.l(27, lyVar, view2));
                                    lyVar.N0.start();
                                    z10 = r16;
                                    i10 = 2;
                                } else {
                                    zpVar2 = zpVar3;
                                    yxVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                    i10 = 2;
                                    if (view != null && i15 != 2) {
                                        view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                    }
                                    if (view2 == view3) {
                                        int i17 = r16;
                                        view2.setPadding(i17, i17, i17, lyVar.r2);
                                    } else {
                                        int i18 = r16;
                                        if (view2 == view4) {
                                            view2.setPadding(org.telegram.messenger.g0.L(5.0f), i18, org.telegram.messenger.g0.L(5.0f), lyVar.r2);
                                        } else if (view2 == qvVar) {
                                            view2.setPadding(i18, lyVar.c1, i18, lyVar.r2);
                                        }
                                    }
                                    if (view2 == qvVar) {
                                        boolean z13 = lyVar.o0.y.size() > 0;
                                        qxVar.L = z13;
                                        if (z13) {
                                            qxVar.G("", true);
                                            if (qvVar.getAdapter() != qxVar) {
                                                qvVar.setAdapter(qxVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    b0Var.h1(0, 0);
                                }
                                i15++;
                                i14 = i10;
                                z11 = z10;
                                zpVar3 = zpVar2;
                                i13 = 1;
                            }
                            zpVar = zpVar3;
                            i7 = i14;
                            lyVar.N(z11);
                        }
                        lyVar.u1.i(i12 == 1 ? i7 : 1);
                        zpVar.requestFocus();
                        org.telegram.messenger.g0.J3(zpVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
