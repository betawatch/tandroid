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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class vq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((zq) this.d).E[this.c - 1].invalidate();
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
        vq vqVar;
        int i10;
        iz izVar;
        View view;
        s4.b0 b0Var;
        View view2;
        ?? r16;
        vq vqVar2;
        int i11;
        boolean z10;
        wy wyVar;
        int i12 = this.b;
        int i13 = this.c;
        FrameLayout frameLayout = this.d;
        int i14 = 1;
        boolean z11 = false;
        switch (i12) {
            case 0:
                zq zqVar = (zq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!zqVar.E[i13 + 1].isFocused()) {
                        zqVar.E[i13 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(zqVar.E[i13 + 1]);
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
                iz izVar2 = (iz) frameLayout;
                wz wzVar = izVar2.G;
                vq vqVar3 = izVar2.d;
                if (!vqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i15 = 2;
                        if (wzVar.t1.z()) {
                            vqVar = vqVar3;
                            i10 = 2;
                        } else {
                            View view3 = wzVar.D0;
                            View view4 = wzVar.P;
                            az azVar = wzVar.j0;
                            yw ywVar = wzVar.h0;
                            AnimatorSet animatorSet = wzVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                wzVar.M0 = null;
                            }
                            wzVar.I0 = false;
                            wzVar.q0 = false;
                            wzVar.c0 = false;
                            int i16 = 0;
                            while (i16 < 3) {
                                if (i16 == 0) {
                                    izVar = wzVar.V;
                                    view = wzVar.I;
                                    r16 = z11;
                                    b0Var = wzVar.Q;
                                    view2 = view4;
                                } else {
                                    boolean z12 = z11;
                                    if (i16 == i14) {
                                        izVar = wzVar.o0;
                                        view = wzVar.p0;
                                        b0Var = wzVar.i0;
                                        view2 = ywVar;
                                        r16 = z12;
                                    } else {
                                        izVar = wzVar.G0;
                                        view = wzVar.B0;
                                        b0Var = wzVar.E0;
                                        view2 = view3;
                                        r16 = z12;
                                    }
                                }
                                if (izVar == null) {
                                    vqVar2 = vqVar3;
                                    i11 = i15;
                                    z10 = r16;
                                } else if (izVar2 == izVar && (wyVar = wzVar.t1) != null && wyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    wzVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i16 == i15) {
                                        vqVar2 = vqVar3;
                                        float f7 = i16 == i15 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f7;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(izVar, (Property<iz, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i17 = i15;
                                        vqVar2 = vqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(izVar, (Property<iz, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i17] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    wzVar.M0.setDuration(220L);
                                    wzVar.M0.setInterpolator(es.f);
                                    wzVar.M0.addListener(new bi.t(24, wzVar, view2));
                                    wzVar.M0.start();
                                    z10 = r16;
                                    i11 = 2;
                                } else {
                                    vqVar2 = vqVar3;
                                    izVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    i11 = 2;
                                    if (view != null && i16 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (view2 == view3) {
                                        int i18 = r16;
                                        view2.setPadding(i18, i18, i18, wzVar.p2);
                                    } else {
                                        int i19 = r16;
                                        if (view2 == view4) {
                                            view2.setPadding(AndroidUtilities.dp(5.0f), i19, AndroidUtilities.dp(5.0f), wzVar.p2);
                                        } else if (view2 == ywVar) {
                                            view2.setPadding(i19, wzVar.b1, i19, wzVar.p2);
                                        }
                                    }
                                    if (view2 == ywVar) {
                                        boolean z13 = wzVar.n0.x.size() > 0;
                                        azVar.K = z13;
                                        if (z13) {
                                            azVar.G("", true);
                                            if (ywVar.getAdapter() != azVar) {
                                                ywVar.setAdapter(azVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    b0Var.h1(0, 0);
                                }
                                i16++;
                                i15 = i11;
                                z11 = z10;
                                vqVar3 = vqVar2;
                                i14 = 1;
                            }
                            vqVar = vqVar3;
                            i10 = i15;
                            wzVar.M(z11);
                        }
                        wzVar.t1.i(i13 == 1 ? i10 : 1);
                        vqVar.requestFocus();
                        AndroidUtilities.showKeyboard(vqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
