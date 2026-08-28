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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class yp extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yp(FrameLayout frameLayout, Context context, int i9, int i10) {
        super(context);
        this.b = i10;
        this.d = frameLayout;
        this.c = i9;
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
                ((cq) this.d).A[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        yp ypVar;
        char c10;
        jy jyVar;
        View view;
        f2.m0 m0Var;
        wk0 wk0Var;
        yp ypVar2;
        wx wxVar;
        int i9 = this.b;
        int i10 = this.c;
        FrameLayout frameLayout = this.d;
        int i11 = 1;
        switch (i9) {
            case 0:
                cq cqVar = (cq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!cqVar.A[i10 + 1].isFocused()) {
                        cqVar.A[i10 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(cqVar.A[i10 + 1]);
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
                jy jyVar2 = (jy) frameLayout;
                wy wyVar = jyVar2.C;
                yp ypVar3 = jyVar2.d;
                if (!ypVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i12 = 2;
                        if (wyVar.p1.z()) {
                            ypVar = ypVar3;
                        } else {
                            wk0 wk0Var2 = wyVar.z0;
                            wk0 wk0Var3 = wyVar.L;
                            ay ayVar = wyVar.f0;
                            wk0 wk0Var4 = wyVar.d0;
                            AnimatorSet animatorSet = wyVar.I0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                wyVar.I0 = null;
                            }
                            wyVar.E0 = false;
                            wyVar.m0 = false;
                            wyVar.V = false;
                            int i13 = 0;
                            while (i13 < 3) {
                                if (i13 == 0) {
                                    jyVar = wyVar.R;
                                    view = wyVar.E;
                                    c10 = 0;
                                    m0Var = wyVar.M;
                                    wk0Var = wk0Var3;
                                } else {
                                    c10 = 0;
                                    if (i13 == i11) {
                                        jyVar = wyVar.k0;
                                        view = wyVar.l0;
                                        m0Var = wyVar.e0;
                                        wk0Var = wk0Var4;
                                    } else {
                                        jyVar = wyVar.C0;
                                        view = wyVar.x0;
                                        m0Var = wyVar.A0;
                                        wk0Var = wk0Var2;
                                    }
                                }
                                if (jyVar == null) {
                                    ypVar2 = ypVar3;
                                } else if (jyVar2 == jyVar && (wxVar = wyVar.p1) != null && wxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    wyVar.I0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i13 == i12) {
                                        ypVar2 = ypVar3;
                                        float[] fArr = new float[1];
                                        fArr[c10] = i13 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(wk0Var, (Property<wk0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(jyVar, (Property<jy, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        ypVar2 = ypVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(wk0Var, (Property<wk0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(jyVar, (Property<jy, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c10] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    wyVar.I0.setDuration(220L);
                                    wyVar.I0.setInterpolator(gr.f);
                                    wyVar.I0.addListener(new fg.j(22, wyVar, wk0Var));
                                    wyVar.I0.start();
                                } else {
                                    ypVar2 = ypVar3;
                                    jyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i13 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (wk0Var == wk0Var2) {
                                        wk0Var.setPadding(0, 0, 0, wyVar.m2);
                                    } else if (wk0Var == wk0Var3) {
                                        wk0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), wyVar.m2);
                                    } else if (wk0Var == wk0Var4) {
                                        wk0Var.setPadding(0, wyVar.X0, 0, wyVar.m2);
                                    }
                                    if (wk0Var == wk0Var4) {
                                        boolean z10 = wyVar.j0.x.size() > 0;
                                        ayVar.G = z10;
                                        if (z10) {
                                            ayVar.G("", true);
                                            if (wk0Var4.getAdapter() != ayVar) {
                                                wk0Var4.setAdapter(ayVar);
                                            }
                                        }
                                    }
                                    m0Var.h1(0, 0);
                                    i13++;
                                    i11 = 1;
                                    i12 = 2;
                                    ypVar3 = ypVar2;
                                }
                                i13++;
                                i11 = 1;
                                i12 = 2;
                                ypVar3 = ypVar2;
                            }
                            ypVar = ypVar3;
                            wyVar.N(false);
                        }
                        wyVar.p1.i(i10 == 1 ? 2 : 1);
                        ypVar.requestFocus();
                        AndroidUtilities.showKeyboard(ypVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
