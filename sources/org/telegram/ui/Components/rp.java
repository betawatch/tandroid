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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rp extends EditTextBoldCursor {
    public final /* synthetic */ int H1;
    public final /* synthetic */ int I1;
    public final /* synthetic */ FrameLayout J1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rp(FrameLayout frameLayout, Context context, int i3, int i10) {
        super(context);
        this.H1 = i10;
        this.J1 = frameLayout;
        this.I1 = i3;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(Rect rect, Point point) {
        switch (this.H1) {
            case 1:
                boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
                rect.bottom = org.telegram.messenger.g0.L(40.0f) + rect.bottom;
                return globalVisibleRect;
            default:
                return super.getGlobalVisibleRect(rect, point);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.H1) {
            case 1:
                super.invalidate();
                ((vp) this.J1).F[this.I1 - 1].invalidate();
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
        rp rpVar;
        int i3;
        rx rxVar;
        View view;
        u4.b0 b0Var;
        tj0 tj0Var;
        ?? r16;
        rp rpVar2;
        int i10;
        boolean z10;
        fx fxVar;
        int i11 = this.H1;
        int i12 = this.I1;
        FrameLayout frameLayout = this.J1;
        int i13 = 1;
        boolean z11 = false;
        switch (i11) {
            case 0:
                vp vpVar = (vp) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!vpVar.F[i12 + 1].isFocused()) {
                        vpVar.F[i12 + 1].requestFocus();
                        break;
                    } else {
                        org.telegram.messenger.g0.K3(vpVar.F[i12 + 1]);
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
                        org.telegram.messenger.g0.K3(this);
                        break;
                    }
                }
                break;
            default:
                rx rxVar2 = (rx) frameLayout;
                ey eyVar = rxVar2.H;
                rp rpVar3 = rxVar2.d;
                if (!rpVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i14 = 2;
                        if (eyVar.u1.z()) {
                            rpVar = rpVar3;
                            i3 = 2;
                        } else {
                            tj0 tj0Var2 = eyVar.E0;
                            tj0 tj0Var3 = eyVar.Q;
                            jx jxVar = eyVar.k0;
                            tj0 tj0Var4 = eyVar.i0;
                            AnimatorSet animatorSet = eyVar.N0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                eyVar.N0 = null;
                            }
                            eyVar.J0 = false;
                            eyVar.r0 = false;
                            eyVar.d0 = false;
                            int i15 = 0;
                            while (i15 < 3) {
                                if (i15 == 0) {
                                    rxVar = eyVar.W;
                                    view = eyVar.J;
                                    r16 = z11;
                                    b0Var = eyVar.R;
                                    tj0Var = tj0Var3;
                                } else {
                                    boolean z12 = z11;
                                    if (i15 == i13) {
                                        rxVar = eyVar.p0;
                                        view = eyVar.q0;
                                        b0Var = eyVar.j0;
                                        tj0Var = tj0Var4;
                                        r16 = z12;
                                    } else {
                                        rxVar = eyVar.H0;
                                        view = eyVar.C0;
                                        b0Var = eyVar.F0;
                                        tj0Var = tj0Var2;
                                        r16 = z12;
                                    }
                                }
                                if (rxVar == null) {
                                    rpVar2 = rpVar3;
                                    i10 = i14;
                                    z10 = r16;
                                } else if (rxVar2 == rxVar && (fxVar = eyVar.u1) != null && fxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    eyVar.N0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i15 == i14) {
                                        rpVar2 = rpVar3;
                                        float f10 = i15 == i14 ? 0.0f : -org.telegram.messenger.g0.L(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f10;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tj0Var, (Property<tj0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rxVar, (Property<rx, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i16 = i14;
                                        rpVar2 = rpVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -org.telegram.messenger.g0.L(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -org.telegram.messenger.g0.L(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tj0Var, (Property<tj0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = org.telegram.messenger.g0.L(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(rxVar, (Property<rx, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i16] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    eyVar.N0.setDuration(220L);
                                    eyVar.N0.setInterpolator(xq.f);
                                    eyVar.N0.addListener(new bh.j(26, eyVar, tj0Var));
                                    eyVar.N0.start();
                                    z10 = r16;
                                    i10 = 2;
                                } else {
                                    rpVar2 = rpVar3;
                                    rxVar.setTranslationY(org.telegram.messenger.g0.L(0.0f));
                                    i10 = 2;
                                    if (view != null && i15 != 2) {
                                        view.setTranslationY(-org.telegram.messenger.g0.L(40.0f));
                                    }
                                    if (tj0Var == tj0Var2) {
                                        int i17 = r16;
                                        tj0Var.setPadding(i17, i17, i17, eyVar.r2);
                                    } else {
                                        int i18 = r16;
                                        if (tj0Var == tj0Var3) {
                                            tj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), i18, org.telegram.messenger.g0.L(5.0f), eyVar.r2);
                                        } else if (tj0Var == tj0Var4) {
                                            tj0Var.setPadding(i18, eyVar.c1, i18, eyVar.r2);
                                        }
                                    }
                                    if (tj0Var == tj0Var4) {
                                        boolean z13 = eyVar.o0.y.size() > 0;
                                        jxVar.L = z13;
                                        if (z13) {
                                            jxVar.G("", true);
                                            if (tj0Var4.getAdapter() != jxVar) {
                                                tj0Var4.setAdapter(jxVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    b0Var.h1(0, 0);
                                }
                                i15++;
                                i14 = i10;
                                z11 = z10;
                                rpVar3 = rpVar2;
                                i13 = 1;
                            }
                            rpVar = rpVar3;
                            i3 = i14;
                            eyVar.M(z11);
                        }
                        eyVar.u1.i(i12 == 1 ? i3 : 1);
                        rpVar.requestFocus();
                        org.telegram.messenger.g0.K3(rpVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
