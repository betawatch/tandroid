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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class hq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((lq) this.d).E[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hq hqVar;
        char c10;
        xy xyVar;
        View view;
        s4.c0 c0Var;
        ViewGroup viewGroup;
        hq hqVar2;
        ly lyVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                lq lqVar = (lq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!lqVar.E[i11 + 1].isFocused()) {
                        lqVar.E[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(lqVar.E[i11 + 1]);
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
                hq hqVar3 = xyVar2.d;
                if (!hqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (kzVar.t1.z()) {
                            hqVar = hqVar3;
                        } else {
                            ViewGroup viewGroup2 = kzVar.D0;
                            ViewGroup viewGroup3 = kzVar.P;
                            py pyVar = kzVar.j0;
                            nw nwVar = kzVar.h0;
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
                                    viewGroup = viewGroup3;
                                } else {
                                    c10 = 0;
                                    if (i14 == i12) {
                                        xyVar = kzVar.o0;
                                        view = kzVar.p0;
                                        c0Var = kzVar.i0;
                                        viewGroup = nwVar;
                                    } else {
                                        xyVar = kzVar.G0;
                                        view = kzVar.B0;
                                        c0Var = kzVar.E0;
                                        viewGroup = viewGroup2;
                                    }
                                }
                                if (xyVar == null) {
                                    hqVar2 = hqVar3;
                                } else if (xyVar2 == xyVar && (lyVar = kzVar.t1) != null && lyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    kzVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        hqVar2 = hqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c10] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(xyVar, (Property<xy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        hqVar2 = hqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(viewGroup, (Property<ViewGroup, Float>) property, fArr4);
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
                                    kzVar.M0.setInterpolator(pr.f);
                                    kzVar.M0.addListener(new bi.t(24, kzVar, viewGroup));
                                    kzVar.M0.start();
                                } else {
                                    hqVar2 = hqVar3;
                                    xyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (viewGroup == viewGroup2) {
                                        viewGroup.setPadding(0, 0, 0, kzVar.q2);
                                    } else if (viewGroup == viewGroup3) {
                                        viewGroup.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), kzVar.q2);
                                    } else if (viewGroup == nwVar) {
                                        viewGroup.setPadding(0, kzVar.b1, 0, kzVar.q2);
                                    }
                                    if (viewGroup == nwVar) {
                                        boolean z10 = kzVar.n0.x.size() > 0;
                                        pyVar.K = z10;
                                        if (z10) {
                                            pyVar.G("", true);
                                            if (nwVar.getAdapter() != pyVar) {
                                                nwVar.setAdapter(pyVar);
                                            }
                                        }
                                    }
                                    c0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    hqVar3 = hqVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                hqVar3 = hqVar2;
                            }
                            hqVar = hqVar3;
                            kzVar.O(false);
                        }
                        kzVar.t1.i(i11 == 1 ? 2 : 1);
                        hqVar.requestFocus();
                        AndroidUtilities.showKeyboard(hqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
