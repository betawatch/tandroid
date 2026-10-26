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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class uq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((yq) this.d).E[this.c - 1].invalidate();
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
        uq uqVar;
        int i10;
        fz fzVar;
        View view;
        s4.c0 c0Var;
        View view2;
        ?? r16;
        uq uqVar2;
        int i11;
        boolean z10;
        ty tyVar;
        int i12 = this.b;
        int i13 = this.c;
        FrameLayout frameLayout = this.d;
        int i14 = 1;
        boolean z11 = false;
        switch (i12) {
            case 0:
                yq yqVar = (yq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!yqVar.E[i13 + 1].isFocused()) {
                        yqVar.E[i13 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(yqVar.E[i13 + 1]);
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
                fz fzVar2 = (fz) frameLayout;
                sz szVar = fzVar2.G;
                uq uqVar3 = fzVar2.d;
                if (!uqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i15 = 2;
                        if (szVar.t1.z()) {
                            uqVar = uqVar3;
                            i10 = 2;
                        } else {
                            View view3 = szVar.D0;
                            View view4 = szVar.P;
                            xy xyVar = szVar.j0;
                            uw uwVar = szVar.h0;
                            AnimatorSet animatorSet = szVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                szVar.M0 = null;
                            }
                            szVar.I0 = false;
                            szVar.q0 = false;
                            szVar.c0 = false;
                            int i16 = 0;
                            while (i16 < 3) {
                                if (i16 == 0) {
                                    fzVar = szVar.V;
                                    view = szVar.I;
                                    r16 = z11;
                                    c0Var = szVar.Q;
                                    view2 = view4;
                                } else {
                                    boolean z12 = z11;
                                    if (i16 == i14) {
                                        fzVar = szVar.o0;
                                        view = szVar.p0;
                                        c0Var = szVar.i0;
                                        view2 = uwVar;
                                        r16 = z12;
                                    } else {
                                        fzVar = szVar.G0;
                                        view = szVar.B0;
                                        c0Var = szVar.E0;
                                        view2 = view3;
                                        r16 = z12;
                                    }
                                }
                                if (fzVar == null) {
                                    uqVar2 = uqVar3;
                                    i11 = i15;
                                    z10 = r16;
                                } else if (fzVar2 == fzVar && (tyVar = szVar.t1) != null && tyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    szVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i16 == i15) {
                                        uqVar2 = uqVar3;
                                        float f7 = i16 == i15 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f7;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fzVar, (Property<fz, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i17 = i15;
                                        uqVar2 = uqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(fzVar, (Property<fz, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i17] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    szVar.M0.setDuration(220L);
                                    szVar.M0.setInterpolator(ds.f);
                                    szVar.M0.addListener(new bi.ce(25, szVar, view2));
                                    szVar.M0.start();
                                    z10 = r16;
                                    i11 = 2;
                                } else {
                                    uqVar2 = uqVar3;
                                    fzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    i11 = 2;
                                    if (view != null && i16 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (view2 == view3) {
                                        int i18 = r16;
                                        view2.setPadding(i18, i18, i18, szVar.q2);
                                    } else {
                                        int i19 = r16;
                                        if (view2 == view4) {
                                            view2.setPadding(AndroidUtilities.dp(5.0f), i19, AndroidUtilities.dp(5.0f), szVar.q2);
                                        } else if (view2 == uwVar) {
                                            view2.setPadding(i19, szVar.b1, i19, szVar.q2);
                                        }
                                    }
                                    if (view2 == uwVar) {
                                        boolean z13 = szVar.n0.x.size() > 0;
                                        xyVar.K = z13;
                                        if (z13) {
                                            xyVar.G("", true);
                                            if (uwVar.getAdapter() != xyVar) {
                                                uwVar.setAdapter(xyVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    c0Var.h1(0, 0);
                                }
                                i16++;
                                i15 = i11;
                                z11 = z10;
                                uqVar3 = uqVar2;
                                i14 = 1;
                            }
                            uqVar = uqVar3;
                            i10 = i15;
                            szVar.M(z11);
                        }
                        szVar.t1.i(i13 == 1 ? i10 : 1);
                        uqVar.requestFocus();
                        AndroidUtilities.showKeyboard(uqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
