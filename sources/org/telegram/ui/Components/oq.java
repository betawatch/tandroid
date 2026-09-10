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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class oq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((sq) this.d).E[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        oq oqVar;
        char c10;
        ez ezVar;
        View view;
        s4.c0 c0Var;
        vl0 vl0Var;
        oq oqVar2;
        sy syVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                sq sqVar = (sq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!sqVar.E[i11 + 1].isFocused()) {
                        sqVar.E[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(sqVar.E[i11 + 1]);
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
                ez ezVar2 = (ez) frameLayout;
                rz rzVar = ezVar2.G;
                oq oqVar3 = ezVar2.d;
                if (!oqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (rzVar.t1.z()) {
                            oqVar = oqVar3;
                        } else {
                            vl0 vl0Var2 = rzVar.D0;
                            vl0 vl0Var3 = rzVar.P;
                            wy wyVar = rzVar.j0;
                            vl0 vl0Var4 = rzVar.h0;
                            AnimatorSet animatorSet = rzVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                rzVar.M0 = null;
                            }
                            rzVar.I0 = false;
                            rzVar.q0 = false;
                            rzVar.c0 = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    ezVar = rzVar.V;
                                    view = rzVar.I;
                                    c10 = 0;
                                    c0Var = rzVar.Q;
                                    vl0Var = vl0Var3;
                                } else {
                                    c10 = 0;
                                    if (i14 == i12) {
                                        ezVar = rzVar.o0;
                                        view = rzVar.p0;
                                        c0Var = rzVar.i0;
                                        vl0Var = vl0Var4;
                                    } else {
                                        ezVar = rzVar.G0;
                                        view = rzVar.B0;
                                        c0Var = rzVar.E0;
                                        vl0Var = vl0Var2;
                                    }
                                }
                                if (ezVar == null) {
                                    oqVar2 = oqVar3;
                                } else if (ezVar2 == ezVar && (syVar = rzVar.t1) != null && syVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    rzVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        oqVar2 = oqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c10] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vl0Var, (Property<vl0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ezVar, (Property<ez, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        oqVar2 = oqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(vl0Var, (Property<vl0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ezVar, (Property<ez, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c10] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    rzVar.M0.setDuration(220L);
                                    rzVar.M0.setInterpolator(wr.f);
                                    rzVar.M0.addListener(new bi.u3(22, rzVar, vl0Var));
                                    rzVar.M0.start();
                                } else {
                                    oqVar2 = oqVar3;
                                    ezVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (vl0Var == vl0Var2) {
                                        vl0Var.setPadding(0, 0, 0, rzVar.q2);
                                    } else if (vl0Var == vl0Var3) {
                                        vl0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), rzVar.q2);
                                    } else if (vl0Var == vl0Var4) {
                                        vl0Var.setPadding(0, rzVar.b1, 0, rzVar.q2);
                                    }
                                    if (vl0Var == vl0Var4) {
                                        boolean z10 = rzVar.n0.x.size() > 0;
                                        wyVar.K = z10;
                                        if (z10) {
                                            wyVar.G("", true);
                                            if (vl0Var4.getAdapter() != wyVar) {
                                                vl0Var4.setAdapter(wyVar);
                                            }
                                        }
                                    }
                                    c0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    oqVar3 = oqVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                oqVar3 = oqVar2;
                            }
                            oqVar = oqVar3;
                            rzVar.O(false);
                        }
                        rzVar.t1.i(i11 == 1 ? 2 : 1);
                        oqVar.requestFocus();
                        AndroidUtilities.showKeyboard(oqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
