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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class iq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((mq) this.d).B[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        iq iqVar;
        char c3;
        yy yyVar;
        View view;
        f2.j0 j0Var;
        sl0 sl0Var;
        iq iqVar2;
        my myVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                mq mqVar = (mq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!mqVar.B[i11 + 1].isFocused()) {
                        mqVar.B[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(mqVar.B[i11 + 1]);
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
                yy yyVar2 = (yy) frameLayout;
                mz mzVar = yyVar2.D;
                iq iqVar3 = yyVar2.d;
                if (!iqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (mzVar.q1.z()) {
                            iqVar = iqVar3;
                        } else {
                            sl0 sl0Var2 = mzVar.A0;
                            sl0 sl0Var3 = mzVar.M;
                            qy qyVar = mzVar.g0;
                            sl0 sl0Var4 = mzVar.e0;
                            AnimatorSet animatorSet = mzVar.J0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                mzVar.J0 = null;
                            }
                            mzVar.F0 = false;
                            mzVar.n0 = false;
                            mzVar.W = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    yyVar = mzVar.S;
                                    view = mzVar.F;
                                    c3 = 0;
                                    j0Var = mzVar.N;
                                    sl0Var = sl0Var3;
                                } else {
                                    c3 = 0;
                                    if (i14 == i12) {
                                        yyVar = mzVar.l0;
                                        view = mzVar.m0;
                                        j0Var = mzVar.f0;
                                        sl0Var = sl0Var4;
                                    } else {
                                        yyVar = mzVar.D0;
                                        view = mzVar.y0;
                                        j0Var = mzVar.B0;
                                        sl0Var = sl0Var2;
                                    }
                                }
                                if (yyVar == null) {
                                    iqVar2 = iqVar3;
                                } else if (yyVar2 == yyVar && (myVar = mzVar.q1) != null && myVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    mzVar.J0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        iqVar2 = iqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c3] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sl0Var, (Property<sl0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c3] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yyVar, (Property<yy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c3] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        iqVar2 = iqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c3] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c3] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(sl0Var, (Property<sl0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c3] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(yyVar, (Property<yy, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c3] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    mzVar.J0.setDuration(220L);
                                    mzVar.J0.setInterpolator(pr.f);
                                    mzVar.J0.addListener(new eg.w2(21, mzVar, sl0Var));
                                    mzVar.J0.start();
                                } else {
                                    iqVar2 = iqVar3;
                                    yyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (sl0Var == sl0Var2) {
                                        sl0Var.setPadding(0, 0, 0, mzVar.n2);
                                    } else if (sl0Var == sl0Var3) {
                                        sl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), mzVar.n2);
                                    } else if (sl0Var == sl0Var4) {
                                        sl0Var.setPadding(0, mzVar.Y0, 0, mzVar.n2);
                                    }
                                    if (sl0Var == sl0Var4) {
                                        boolean z4 = mzVar.k0.x.size() > 0;
                                        qyVar.H = z4;
                                        if (z4) {
                                            qyVar.G("", true);
                                            if (sl0Var4.getAdapter() != qyVar) {
                                                sl0Var4.setAdapter(qyVar);
                                            }
                                        }
                                    }
                                    j0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    iqVar3 = iqVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                iqVar3 = iqVar2;
                            }
                            iqVar = iqVar3;
                            mzVar.O(false);
                        }
                        mzVar.q1.i(i11 == 1 ? 2 : 1);
                        iqVar.requestFocus();
                        AndroidUtilities.showKeyboard(iqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
