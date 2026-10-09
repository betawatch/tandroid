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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yq(FrameLayout frameLayout, Context context, int i10, int i11) {
        super(context);
        this.b = i11;
        this.d = frameLayout;
        this.c = i10;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.b) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.b) {
            case 1:
                super.invalidate();
                ((cr) this.d).E[this.c - 1].invalidate();
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
        yq yqVar;
        int i10;
        mz mzVar;
        View view;
        s4.d0 d0Var;
        qm0 qm0Var;
        ?? r16;
        yq yqVar2;
        int i11;
        boolean z10;
        az azVar;
        int i12 = this.b;
        int i13 = this.c;
        FrameLayout frameLayout = this.d;
        int i14 = 1;
        boolean z11 = false;
        switch (i12) {
            case 0:
                cr crVar = (cr) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!crVar.E[i13 + 1].isFocused()) {
                        crVar.E[i13 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(crVar.E[i13 + 1]);
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
                        AndroidUtilities.showKeyboard(this);
                        break;
                    }
                }
                break;
            default:
                mz mzVar2 = (mz) frameLayout;
                a00 a00Var = mzVar2.G;
                yq yqVar3 = mzVar2.d;
                if (!yqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i15 = 2;
                        if (a00Var.t1.z()) {
                            yqVar = yqVar3;
                            i10 = 2;
                        } else {
                            qm0 qm0Var2 = a00Var.D0;
                            qm0 qm0Var3 = a00Var.P;
                            ez ezVar = a00Var.j0;
                            qm0 qm0Var4 = a00Var.h0;
                            AnimatorSet animatorSet = a00Var.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                a00Var.M0 = null;
                            }
                            a00Var.I0 = false;
                            a00Var.q0 = false;
                            a00Var.c0 = false;
                            int i16 = 0;
                            while (i16 < 3) {
                                if (i16 == 0) {
                                    mzVar = a00Var.V;
                                    view = a00Var.I;
                                    r16 = z11;
                                    d0Var = a00Var.Q;
                                    qm0Var = qm0Var3;
                                } else {
                                    boolean z12 = z11;
                                    if (i16 == i14) {
                                        mzVar = a00Var.o0;
                                        view = a00Var.p0;
                                        d0Var = a00Var.i0;
                                        qm0Var = qm0Var4;
                                        r16 = z12;
                                    } else {
                                        mzVar = a00Var.G0;
                                        view = a00Var.B0;
                                        d0Var = a00Var.E0;
                                        qm0Var = qm0Var2;
                                        r16 = z12;
                                    }
                                }
                                if (mzVar == null) {
                                    yqVar2 = yqVar3;
                                    i11 = i15;
                                    z10 = r16;
                                } else if (mzVar2 == mzVar && (azVar = a00Var.t1) != null && azVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    a00Var.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i16 == i15) {
                                        yqVar2 = yqVar3;
                                        float f7 = i16 == i15 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f7;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qm0Var, (Property<qm0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mzVar, (Property<mz, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i17 = i15;
                                        yqVar2 = yqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(qm0Var, (Property<qm0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(mzVar, (Property<mz, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i17] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    a00Var.M0.setDuration(220L);
                                    a00Var.M0.setInterpolator(hs.f);
                                    a00Var.M0.addListener(new ai.z(24, a00Var, qm0Var));
                                    a00Var.M0.start();
                                    z10 = r16;
                                    i11 = 2;
                                } else {
                                    yqVar2 = yqVar3;
                                    mzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    i11 = 2;
                                    if (view != null && i16 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (qm0Var == qm0Var2) {
                                        int i18 = r16;
                                        qm0Var.setPadding(i18, i18, i18, a00Var.p2);
                                    } else {
                                        int i19 = r16;
                                        if (qm0Var == qm0Var3) {
                                            qm0Var.setPadding(AndroidUtilities.dp(5.0f), i19, AndroidUtilities.dp(5.0f), a00Var.p2);
                                        } else if (qm0Var == qm0Var4) {
                                            qm0Var.setPadding(i19, a00Var.b1, i19, a00Var.p2);
                                        }
                                    }
                                    if (qm0Var == qm0Var4) {
                                        boolean z13 = a00Var.n0.x.size() > 0;
                                        ezVar.K = z13;
                                        if (z13) {
                                            ezVar.G("", true);
                                            if (qm0Var4.getAdapter() != ezVar) {
                                                qm0Var4.setAdapter(ezVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    d0Var.h1(0, 0);
                                }
                                i16++;
                                i15 = i11;
                                z11 = z10;
                                yqVar3 = yqVar2;
                                i14 = 1;
                            }
                            yqVar = yqVar3;
                            i10 = i15;
                            a00Var.M(z11);
                        }
                        a00Var.t1.i(i13 == 1 ? i10 : 1);
                        yqVar.requestFocus();
                        AndroidUtilities.showKeyboard(yqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
