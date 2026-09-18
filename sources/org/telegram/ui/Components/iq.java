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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                ((mq) this.d).E[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        iq iqVar;
        char c10;
        xy xyVar;
        View view;
        s4.c0 c0Var;
        View view2;
        iq iqVar2;
        ly lyVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                mq mqVar = (mq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!mqVar.E[i11 + 1].isFocused()) {
                        mqVar.E[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(mqVar.E[i11 + 1]);
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
                xy xyVar2 = (xy) frameLayout;
                kz kzVar = xyVar2.G;
                iq iqVar3 = xyVar2.d;
                if (!iqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (kzVar.t1.z()) {
                            iqVar = iqVar3;
                        } else {
                            View view3 = kzVar.D0;
                            View view4 = kzVar.P;
                            py pyVar = kzVar.j0;
                            mw mwVar = kzVar.h0;
                            AnimatorSet animatorSet = kzVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                kzVar.M0 = null;
                            }
                            kzVar.I0 = false;
                            kzVar.q0 = false;
                            kzVar.c0 = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    xyVar = kzVar.V;
                                    view = kzVar.I;
                                    c10 = 0;
                                    c0Var = kzVar.Q;
                                    view2 = view4;
                                } else {
                                    c10 = 0;
                                    if (i14 == i12) {
                                        xyVar = kzVar.o0;
                                        view = kzVar.p0;
                                        c0Var = kzVar.i0;
                                        view2 = mwVar;
                                    } else {
                                        xyVar = kzVar.G0;
                                        view = kzVar.B0;
                                        c0Var = kzVar.E0;
                                        view2 = view3;
                                    }
                                }
                                if (xyVar == null) {
                                    iqVar2 = iqVar3;
                                } else if (xyVar2 == xyVar && (lyVar = kzVar.t1) != null && lyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    kzVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        iqVar2 = iqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c10] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xyVar, (Property<xy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        iqVar2 = iqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(xyVar, (Property<xy, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c10] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    kzVar.M0.setDuration(220L);
                                    kzVar.M0.setInterpolator(qr.f);
                                    kzVar.M0.addListener(new ai.z(24, kzVar, view2));
                                    kzVar.M0.start();
                                } else {
                                    iqVar2 = iqVar3;
                                    xyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (view2 == view3) {
                                        view2.setPadding(0, 0, 0, kzVar.p2);
                                    } else if (view2 == view4) {
                                        view2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.p2);
                                    } else if (view2 == mwVar) {
                                        view2.setPadding(0, kzVar.b1, 0, kzVar.p2);
                                    }
                                    if (view2 == mwVar) {
                                        boolean z10 = kzVar.n0.x.size() > 0;
                                        pyVar.K = z10;
                                        if (z10) {
                                            pyVar.G("", true);
                                            if (mwVar.getAdapter() != pyVar) {
                                                mwVar.setAdapter(pyVar);
                                            }
                                        }
                                    }
                                    c0Var.h1(0, 0);
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
                            kzVar.M(false);
                        }
                        kzVar.t1.i(i11 == 1 ? 2 : 1);
                        iqVar.requestFocus();
                        AndroidUtilities.showKeyboard(iqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
