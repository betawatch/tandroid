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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class lq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((pq) this.d).E[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        lq lqVar;
        char c10;
        az azVar;
        View view;
        s4.c0 c0Var;
        View view2;
        lq lqVar2;
        oy oyVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                pq pqVar = (pq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!pqVar.E[i11 + 1].isFocused()) {
                        pqVar.E[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(pqVar.E[i11 + 1]);
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
                az azVar2 = (az) frameLayout;
                nz nzVar = azVar2.G;
                lq lqVar3 = azVar2.d;
                if (!lqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (nzVar.t1.z()) {
                            lqVar = lqVar3;
                        } else {
                            View view3 = nzVar.D0;
                            View view4 = nzVar.P;
                            sy syVar = nzVar.j0;
                            qw qwVar = nzVar.h0;
                            AnimatorSet animatorSet = nzVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                nzVar.M0 = null;
                            }
                            nzVar.I0 = false;
                            nzVar.q0 = false;
                            nzVar.c0 = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    azVar = nzVar.V;
                                    view = nzVar.I;
                                    c10 = 0;
                                    c0Var = nzVar.Q;
                                    view2 = view4;
                                } else {
                                    c10 = 0;
                                    if (i14 == i12) {
                                        azVar = nzVar.o0;
                                        view = nzVar.p0;
                                        c0Var = nzVar.i0;
                                        view2 = qwVar;
                                    } else {
                                        azVar = nzVar.G0;
                                        view = nzVar.B0;
                                        c0Var = nzVar.E0;
                                        view2 = view3;
                                    }
                                }
                                if (azVar == null) {
                                    lqVar2 = lqVar3;
                                } else if (azVar2 == azVar && (oyVar = nzVar.t1) != null && oyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    nzVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        lqVar2 = lqVar3;
                                        float[] fArr = new float[1];
                                        fArr[c10] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(azVar, (Property<az, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        lqVar2 = lqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(azVar, (Property<az, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c10] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    nzVar.M0.setDuration(220L);
                                    nzVar.M0.setInterpolator(tr.f);
                                    nzVar.M0.addListener(new ai.z(24, nzVar, view2));
                                    nzVar.M0.start();
                                } else {
                                    lqVar2 = lqVar3;
                                    azVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (view2 == view3) {
                                        view2.setPadding(0, 0, 0, nzVar.p2);
                                    } else if (view2 == view4) {
                                        view2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), nzVar.p2);
                                    } else if (view2 == qwVar) {
                                        view2.setPadding(0, nzVar.b1, 0, nzVar.p2);
                                    }
                                    if (view2 == qwVar) {
                                        boolean z10 = nzVar.n0.x.size() > 0;
                                        syVar.K = z10;
                                        if (z10) {
                                            syVar.G("", true);
                                            if (qwVar.getAdapter() != syVar) {
                                                qwVar.setAdapter(syVar);
                                            }
                                        }
                                    }
                                    c0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    lqVar3 = lqVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                lqVar3 = lqVar2;
                            }
                            lqVar = lqVar3;
                            nzVar.K(false);
                        }
                        nzVar.t1.i(i11 == 1 ? 2 : 1);
                        lqVar.requestFocus();
                        AndroidUtilities.showKeyboard(lqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
