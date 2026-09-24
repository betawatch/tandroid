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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class jq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((nq) this.d).E[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jq jqVar;
        char c10;
        yy yyVar;
        View view;
        s4.c0 c0Var;
        View view2;
        jq jqVar2;
        my myVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                nq nqVar = (nq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!nqVar.E[i11 + 1].isFocused()) {
                        nqVar.E[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(nqVar.E[i11 + 1]);
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
                lz lzVar = yyVar2.G;
                jq jqVar3 = yyVar2.d;
                if (!jqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (lzVar.t1.z()) {
                            jqVar = jqVar3;
                        } else {
                            View view3 = lzVar.D0;
                            View view4 = lzVar.P;
                            qy qyVar = lzVar.j0;
                            ow owVar = lzVar.h0;
                            AnimatorSet animatorSet = lzVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                lzVar.M0 = null;
                            }
                            lzVar.I0 = false;
                            lzVar.q0 = false;
                            lzVar.c0 = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    yyVar = lzVar.V;
                                    view = lzVar.I;
                                    c10 = 0;
                                    c0Var = lzVar.Q;
                                    view2 = view4;
                                } else {
                                    c10 = 0;
                                    if (i14 == i12) {
                                        yyVar = lzVar.o0;
                                        view = lzVar.p0;
                                        c0Var = lzVar.i0;
                                        view2 = owVar;
                                    } else {
                                        yyVar = lzVar.G0;
                                        view = lzVar.B0;
                                        c0Var = lzVar.E0;
                                        view2 = view3;
                                    }
                                }
                                if (yyVar == null) {
                                    jqVar2 = jqVar3;
                                } else if (yyVar2 == yyVar && (myVar = lzVar.t1) != null && myVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    lzVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        jqVar2 = jqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c10] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(yyVar, (Property<yy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        jqVar2 = jqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(yyVar, (Property<yy, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c10] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    lzVar.M0.setDuration(220L);
                                    lzVar.M0.setInterpolator(rr.f);
                                    lzVar.M0.addListener(new ai.z(24, lzVar, view2));
                                    lzVar.M0.start();
                                } else {
                                    jqVar2 = jqVar3;
                                    yyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (view2 == view3) {
                                        view2.setPadding(0, 0, 0, lzVar.p2);
                                    } else if (view2 == view4) {
                                        view2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), lzVar.p2);
                                    } else if (view2 == owVar) {
                                        view2.setPadding(0, lzVar.b1, 0, lzVar.p2);
                                    }
                                    if (view2 == owVar) {
                                        boolean z10 = lzVar.n0.x.size() > 0;
                                        qyVar.K = z10;
                                        if (z10) {
                                            qyVar.G("", true);
                                            if (owVar.getAdapter() != qyVar) {
                                                owVar.setAdapter(qyVar);
                                            }
                                        }
                                    }
                                    c0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    jqVar3 = jqVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                jqVar3 = jqVar2;
                            }
                            jqVar = jqVar3;
                            lzVar.M(false);
                        }
                        lzVar.t1.i(i11 == 1 ? 2 : 1);
                        jqVar.requestFocus();
                        AndroidUtilities.showKeyboard(jqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
