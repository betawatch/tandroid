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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wp extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((aq) this.d).A[this.c - 1].invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        wp wpVar;
        char c10;
        ky kyVar;
        View view;
        f2.k0 k0Var;
        zk0 zk0Var;
        wp wpVar2;
        xx xxVar;
        int i10 = this.b;
        int i11 = this.c;
        FrameLayout frameLayout = this.d;
        int i12 = 1;
        switch (i10) {
            case 0:
                aq aqVar = (aq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!aqVar.A[i11 + 1].isFocused()) {
                        aqVar.A[i11 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(aqVar.A[i11 + 1]);
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
                ky kyVar2 = (ky) frameLayout;
                yy yyVar = kyVar2.C;
                wp wpVar3 = kyVar2.d;
                if (!wpVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i13 = 2;
                        if (yyVar.p1.z()) {
                            wpVar = wpVar3;
                        } else {
                            zk0 zk0Var2 = yyVar.z0;
                            zk0 zk0Var3 = yyVar.L;
                            cy cyVar = yyVar.f0;
                            zk0 zk0Var4 = yyVar.d0;
                            AnimatorSet animatorSet = yyVar.I0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                yyVar.I0 = null;
                            }
                            yyVar.E0 = false;
                            yyVar.m0 = false;
                            yyVar.V = false;
                            int i14 = 0;
                            while (i14 < 3) {
                                if (i14 == 0) {
                                    kyVar = yyVar.R;
                                    view = yyVar.E;
                                    c10 = 0;
                                    k0Var = yyVar.M;
                                    zk0Var = zk0Var3;
                                } else {
                                    c10 = 0;
                                    if (i14 == i12) {
                                        kyVar = yyVar.k0;
                                        view = yyVar.l0;
                                        k0Var = yyVar.e0;
                                        zk0Var = zk0Var4;
                                    } else {
                                        kyVar = yyVar.C0;
                                        view = yyVar.x0;
                                        k0Var = yyVar.A0;
                                        zk0Var = zk0Var2;
                                    }
                                }
                                if (kyVar == null) {
                                    wpVar2 = wpVar3;
                                } else if (kyVar2 == kyVar && (xxVar = yyVar.p1) != null && xxVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    yyVar.I0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i14 == i13) {
                                        wpVar2 = wpVar3;
                                        float[] fArr = new float[1];
                                        fArr[c10] = i14 == 2 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(zk0Var, (Property<zk0, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(kyVar, (Property<ky, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[c10] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        wpVar2 = wpVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[c10] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[c10] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(zk0Var, (Property<zk0, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[c10] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(kyVar, (Property<ky, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[c10] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[2] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    yyVar.I0.setDuration(220L);
                                    yyVar.I0.setInterpolator(er.f);
                                    yyVar.I0.addListener(new ag.x1(24, yyVar, zk0Var));
                                    yyVar.I0.start();
                                } else {
                                    wpVar2 = wpVar3;
                                    kyVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    if (view != null && i14 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (zk0Var == zk0Var2) {
                                        zk0Var.setPadding(0, 0, 0, yyVar.m2);
                                    } else if (zk0Var == zk0Var3) {
                                        zk0Var.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), yyVar.m2);
                                    } else if (zk0Var == zk0Var4) {
                                        zk0Var.setPadding(0, yyVar.X0, 0, yyVar.m2);
                                    }
                                    if (zk0Var == zk0Var4) {
                                        boolean z10 = yyVar.j0.x.size() > 0;
                                        cyVar.G = z10;
                                        if (z10) {
                                            cyVar.G("", true);
                                            if (zk0Var4.getAdapter() != cyVar) {
                                                zk0Var4.setAdapter(cyVar);
                                            }
                                        }
                                    }
                                    k0Var.h1(0, 0);
                                    i14++;
                                    i12 = 1;
                                    i13 = 2;
                                    wpVar3 = wpVar2;
                                }
                                i14++;
                                i12 = 1;
                                i13 = 2;
                                wpVar3 = wpVar2;
                            }
                            wpVar = wpVar3;
                            yyVar.O(false);
                        }
                        yyVar.p1.i(i11 == 1 ? 2 : 1);
                        wpVar.requestFocus();
                        AndroidUtilities.showKeyboard(wpVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
