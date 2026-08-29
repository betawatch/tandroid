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
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class cq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((gq) this.d).A[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cq cqVar;
        char c3;
        ry ryVar;
        View view;
        f2.j0 j0Var;
        ViewGroup viewGroup;
        cq cqVar2;
        fy fyVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                gq gqVar = (gq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!gqVar.A[i11 + 1].isFocused()) {
                        gqVar.A[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(gqVar.A[i11 + 1]);
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
                ry ryVar2 = (ry) frameLayout;
                fz fzVar = ryVar2.C;
                cq cqVar3 = ryVar2.d;
                if (!cqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (fzVar.p1.z()) {
                            cqVar = cqVar3;
                        } else {
                            ViewGroup viewGroup2 = fzVar.z0;
                            ViewGroup viewGroup3 = fzVar.L;
                            jy jyVar = fzVar.f0;
                            fw fwVar = fzVar.d0;
                            AnimatorSet animatorSet = fzVar.I0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                fzVar.I0 = null;
                            }
                            fzVar.E0 = false;
                            fzVar.m0 = false;
                            fzVar.V = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    ryVar = fzVar.R;
                                    view = fzVar.E;
                                    c3 = 0;
                                    j0Var = fzVar.M;
                                    viewGroup = viewGroup3;
                                } else {
                                    c3 = 0;
                                    if (i14 == i12) {
                                        ryVar = fzVar.k0;
                                        view = fzVar.l0;
                                        j0Var = fzVar.e0;
                                        viewGroup = fwVar;
                                    } else {
                                        ryVar = fzVar.C0;
                                        view = fzVar.x0;
                                        j0Var = fzVar.A0;
                                        viewGroup = viewGroup2;
                                    }
                                }
                                if (ryVar == null) {
                                    cqVar2 = cqVar3;
                                } else if (ryVar2 == ryVar && (fyVar = fzVar.p1) != null && fyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    fzVar.I0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        cqVar2 = cqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c3] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c3] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ryVar, (Property<ry, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c3] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        cqVar2 = cqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c3] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c3] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c3] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ryVar, (Property<ry, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c3] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    fzVar.I0.setDuration(220L);
                                    fzVar.I0.setInterpolator(jr.f);
                                    fzVar.I0.addListener(new bg.c3(25, fzVar, viewGroup));
                                    fzVar.I0.start();
                                } else {
                                    cqVar2 = cqVar3;
                                    ryVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (viewGroup == viewGroup2) {
                                        viewGroup.setPadding(0, 0, 0, fzVar.m2);
                                    } else if (viewGroup == viewGroup3) {
                                        viewGroup.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), fzVar.m2);
                                    } else if (viewGroup == fwVar) {
                                        viewGroup.setPadding(0, fzVar.X0, 0, fzVar.m2);
                                    }
                                    if (viewGroup == fwVar) {
                                        boolean z10 = fzVar.j0.x.size() > 0;
                                        jyVar.G = z10;
                                        if (z10) {
                                            jyVar.G("", true);
                                            if (fwVar.getAdapter() != jyVar) {
                                                fwVar.setAdapter(jyVar);
                                            }
                                        }
                                    }
                                    j0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    cqVar3 = cqVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                cqVar3 = cqVar2;
                            }
                            cqVar = cqVar3;
                            fzVar.O(false);
                        }
                        fzVar.p1.i(i11 == 1 ? 2 : 1);
                        cqVar.requestFocus();
                        AndroidUtilities.showKeyboard(cqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
