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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class gq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((kq) this.d).B[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gq gqVar;
        char c3;
        wy wyVar;
        View view;
        f2.i0 i0Var;
        sl0 sl0Var;
        gq gqVar2;
        ky kyVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                kq kqVar = (kq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!kqVar.B[i11 + 1].isFocused()) {
                        kqVar.B[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(kqVar.B[i11 + 1]);
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
                wy wyVar2 = (wy) frameLayout;
                kz kzVar = wyVar2.D;
                gq gqVar3 = wyVar2.d;
                if (!gqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (kzVar.q1.z()) {
                            gqVar = gqVar3;
                        } else {
                            sl0 sl0Var2 = kzVar.A0;
                            sl0 sl0Var3 = kzVar.M;
                            oy oyVar = kzVar.g0;
                            sl0 sl0Var4 = kzVar.e0;
                            AnimatorSet animatorSet = kzVar.J0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                kzVar.J0 = null;
                            }
                            kzVar.F0 = false;
                            kzVar.n0 = false;
                            kzVar.W = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    wyVar = kzVar.S;
                                    view = kzVar.F;
                                    c3 = 0;
                                    i0Var = kzVar.N;
                                    sl0Var = sl0Var3;
                                } else {
                                    c3 = 0;
                                    if (i14 == i12) {
                                        wyVar = kzVar.l0;
                                        view = kzVar.m0;
                                        i0Var = kzVar.f0;
                                        sl0Var = sl0Var4;
                                    } else {
                                        wyVar = kzVar.D0;
                                        view = kzVar.y0;
                                        i0Var = kzVar.B0;
                                        sl0Var = sl0Var2;
                                    }
                                }
                                if (wyVar == null) {
                                    gqVar2 = gqVar3;
                                } else if (wyVar2 == wyVar && (kyVar = kzVar.q1) != null && kyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    kzVar.J0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        gqVar2 = gqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c3] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(sl0Var, (Property<sl0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c3] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(wyVar, (Property<wy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c3] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        gqVar2 = gqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c3] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c3] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(sl0Var, (Property<sl0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c3] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(wyVar, (Property<wy, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c3] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    kzVar.J0.setDuration(220L);
                                    kzVar.J0.setInterpolator(nr.f);
                                    kzVar.J0.addListener(new dg.y2(21, kzVar, sl0Var));
                                    kzVar.J0.start();
                                } else {
                                    gqVar2 = gqVar3;
                                    wyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (sl0Var == sl0Var2) {
                                        sl0Var.setPadding(0, 0, 0, kzVar.n2);
                                    } else if (sl0Var == sl0Var3) {
                                        sl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.n2);
                                    } else if (sl0Var == sl0Var4) {
                                        sl0Var.setPadding(0, kzVar.Y0, 0, kzVar.n2);
                                    }
                                    if (sl0Var == sl0Var4) {
                                        boolean z4 = kzVar.k0.x.size() > 0;
                                        oyVar.H = z4;
                                        if (z4) {
                                            oyVar.G("", true);
                                            if (sl0Var4.getAdapter() != oyVar) {
                                                sl0Var4.setAdapter(oyVar);
                                            }
                                        }
                                    }
                                    i0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    gqVar3 = gqVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                gqVar3 = gqVar2;
                            }
                            gqVar = gqVar3;
                            kzVar.O(false);
                        }
                        kzVar.q1.i(i11 == 1 ? 2 : 1);
                        gqVar.requestFocus();
                        AndroidUtilities.showKeyboard(gqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
