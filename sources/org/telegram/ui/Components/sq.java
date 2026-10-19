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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class sq extends EditTextBoldCursor {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ FrameLayout d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sq(FrameLayout frameLayout, Context context, int i10, int i11) {
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
                ((wq) this.d).E[this.c - 1].invalidate();
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
        sq sqVar;
        int i10;
        gz gzVar;
        View view;
        s4.b0 b0Var;
        View view2;
        ?? r16;
        sq sqVar2;
        int i11;
        boolean z10;
        uy uyVar;
        int i12 = this.b;
        int i13 = this.c;
        FrameLayout frameLayout = this.d;
        int i14 = 1;
        boolean z11 = false;
        switch (i12) {
            case 0:
                wq wqVar = (wq) frameLayout;
                if (getAlpha() == 1.0f && motionEvent.getAction() == 0) {
                    if (!wqVar.E[i13 + 1].isFocused()) {
                        wqVar.E[i13 + 1].requestFocus();
                        break;
                    } else {
                        AndroidUtilities.showKeyboard(wqVar.E[i13 + 1]);
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
                gz gzVar2 = (gz) frameLayout;
                tz tzVar = gzVar2.G;
                sq sqVar3 = gzVar2.d;
                if (!sqVar3.isEnabled()) {
                    break;
                } else {
                    if (motionEvent.getAction() == 0) {
                        int i15 = 2;
                        if (tzVar.t1.z()) {
                            sqVar = sqVar3;
                            i10 = 2;
                        } else {
                            View view3 = tzVar.D0;
                            View view4 = tzVar.P;
                            yy yyVar = tzVar.j0;
                            uw uwVar = tzVar.h0;
                            AnimatorSet animatorSet = tzVar.M0;
                            if (animatorSet != null) {
                                animatorSet.cancel();
                                tzVar.M0 = null;
                            }
                            tzVar.I0 = false;
                            tzVar.q0 = false;
                            tzVar.c0 = false;
                            int i16 = 0;
                            while (i16 < 3) {
                                if (i16 == 0) {
                                    gzVar = tzVar.V;
                                    view = tzVar.I;
                                    r16 = z11;
                                    b0Var = tzVar.Q;
                                    view2 = view4;
                                } else {
                                    boolean z12 = z11;
                                    if (i16 == i14) {
                                        gzVar = tzVar.o0;
                                        view = tzVar.p0;
                                        b0Var = tzVar.i0;
                                        view2 = uwVar;
                                        r16 = z12;
                                    } else {
                                        gzVar = tzVar.G0;
                                        view = tzVar.B0;
                                        b0Var = tzVar.E0;
                                        view2 = view3;
                                        r16 = z12;
                                    }
                                }
                                if (gzVar == null) {
                                    sqVar2 = sqVar3;
                                    i11 = i15;
                                    z10 = r16;
                                } else if (gzVar2 == gzVar && (uyVar = tzVar.t1) != null && uyVar.A()) {
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    tzVar.M0 = animatorSet2;
                                    Property property = View.TRANSLATION_Y;
                                    if (view == null || i16 == i15) {
                                        sqVar2 = sqVar3;
                                        float f7 = i16 == i15 ? 0.0f : -AndroidUtilities.dp(36.0f);
                                        float[] fArr = new float[1];
                                        fArr[r16] = f7;
                                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr);
                                        float[] fArr2 = new float[1];
                                        fArr2[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gzVar, (Property<gz, Float>) property, fArr2);
                                        Animator[] animatorArr = new Animator[2];
                                        animatorArr[r16] = ofFloat;
                                        animatorArr[1] = ofFloat2;
                                        animatorSet2.playTogether(animatorArr);
                                    } else {
                                        int i17 = i15;
                                        sqVar2 = sqVar3;
                                        float[] fArr3 = new float[1];
                                        fArr3[r16] = -AndroidUtilities.dp(40.0f);
                                        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr3);
                                        float[] fArr4 = new float[1];
                                        fArr4[r16] = -AndroidUtilities.dp(36.0f);
                                        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr4);
                                        float[] fArr5 = new float[1];
                                        fArr5[r16] = AndroidUtilities.dp(0.0f);
                                        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(gzVar, (Property<gz, Float>) property, fArr5);
                                        Animator[] animatorArr2 = new Animator[3];
                                        animatorArr2[r16] = ofFloat3;
                                        animatorArr2[1] = ofFloat4;
                                        animatorArr2[i17] = ofFloat5;
                                        animatorSet2.playTogether(animatorArr2);
                                    }
                                    tzVar.M0.setDuration(220L);
                                    tzVar.M0.setInterpolator(bs.f);
                                    tzVar.M0.addListener(new ai.me(25, tzVar, view2));
                                    tzVar.M0.start();
                                    z10 = r16;
                                    i11 = 2;
                                } else {
                                    sqVar2 = sqVar3;
                                    gzVar.setTranslationY(AndroidUtilities.dp(0.0f));
                                    i11 = 2;
                                    if (view != null && i16 != 2) {
                                        view.setTranslationY(-AndroidUtilities.dp(40.0f));
                                    }
                                    if (view2 == view3) {
                                        int i18 = r16;
                                        view2.setPadding(i18, i18, i18, tzVar.p2);
                                    } else {
                                        int i19 = r16;
                                        if (view2 == view4) {
                                            view2.setPadding(AndroidUtilities.dp(5.0f), i19, AndroidUtilities.dp(5.0f), tzVar.p2);
                                        } else if (view2 == uwVar) {
                                            view2.setPadding(i19, tzVar.b1, i19, tzVar.p2);
                                        }
                                    }
                                    if (view2 == uwVar) {
                                        boolean z13 = tzVar.n0.x.size() > 0;
                                        yyVar.K = z13;
                                        if (z13) {
                                            yyVar.G("", true);
                                            if (uwVar.getAdapter() != yyVar) {
                                                uwVar.setAdapter(yyVar);
                                            }
                                        }
                                    }
                                    z10 = false;
                                    b0Var.h1(0, 0);
                                }
                                i16++;
                                i15 = i11;
                                z11 = z10;
                                sqVar3 = sqVar2;
                                i14 = 1;
                            }
                            sqVar = sqVar3;
                            i10 = i15;
                            tzVar.M(z11);
                        }
                        tzVar.t1.i(i13 == 1 ? i10 : 1);
                        sqVar.requestFocus();
                        AndroidUtilities.showKeyboard(sqVar);
                    }
                    break;
                }
        }
        return super.onTouchEvent(motionEvent);
    }
}
