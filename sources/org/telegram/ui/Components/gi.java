package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class gi extends ww0 {
    public int l0;
    public final RectF m0;
    public boolean n0;
    public float o0;
    public final fi p0;
    public final /* synthetic */ ti q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(ti tiVar, Context context) {
        super(context, null);
        this.q0 = tiVar;
        this.m0 = new RectF();
        this.p0 = new fi(this, this);
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f7;
        int dp;
        int dp2;
        float f10;
        float f11;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        Drawable drawable3;
        float f12;
        int themedColor;
        float alpha;
        float f13;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        li liVar;
        canvas.save();
        ti tiVar = this.q0;
        li liVar2 = tiVar.B0;
        cn cnVar = tiVar.q0;
        if ((liVar2 == cnVar || (liVar = tiVar.C0) == cnVar || (liVar2 == tiVar.j0 && liVar == null)) && liVar2 != null) {
            canvas.save();
            float f14 = tiVar.o2;
            boolean z10 = tiVar.g0;
            bh.p pVar = tiVar.R0;
            th thVar = tiVar.l1;
            canvas.translate(0.0f, f14);
            int alpha2 = (int) (liVar2.getAlpha() * 255.0f);
            int i25 = liVar2.i();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((thVar != null ? thVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (pVar != null ? pVar.getAlpha() * pVar.getMeasuredHeight() : 0.0f));
            int u12 = tiVar.u1(0);
            i10 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            int i26 = (u12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
            if (i11 == 1 || tiVar.w1 != null) {
                i26 = (int) (liVar2.getTranslationY() + i26);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i26;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = i25 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            if (i25 != 2) {
                float f15 = dp3;
                f7 = 1.0f;
                if (liVar2 == tiVar.o0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (liVar2 == tiVar.m0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (liVar2 == tiVar.n0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f10 = f15 - dp2;
                    float alpha3 = tiVar.a1.getAlpha();
                    int i27 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha3);
                    i26 -= i27;
                    dp4 -= i27;
                    f11 = 1.0f - alpha3;
                }
                f10 = f15 + dp;
                float alpha32 = tiVar.a1.getAlpha();
                int i272 = (int) (((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight) * alpha32);
                i26 -= i272;
                dp4 -= i272;
                f11 = 1.0f - alpha32;
            } else if (i26 < currentActionBarHeight) {
                float f16 = currentActionBarHeight - i26;
                i24 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                f11 = org.telegram.ui.d3.v(f16, i24, 1.0f, 0.0f);
                f7 = 1.0f;
            } else {
                f11 = 1.0f;
                f7 = 1.0f;
            }
            if (!z10) {
                int i28 = AndroidUtilities.statusBarHeight;
                i26 += i28;
                dp4 += i28;
            }
            int customBackground = tiVar.B0.g() ? tiVar.B0.getCustomBackground() : tiVar.v1(true);
            drawable = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            int measuredWidth = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            drawable2.setBounds(0, i26, measuredWidth, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.m0;
            if (i25 == 2) {
                org.telegram.ui.ActionBar.y6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.y6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                f12 = 24.0f;
                float f17 = measuredWidth2 - i22;
                i23 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                rectF.set(i20, i21 + i26, f17, AndroidUtilities.dp(24.0f) + i23 + i26);
            } else {
                f12 = 24.0f;
            }
            if ((f11 != f7 && i25 != 2) || tiVar.B0.f()) {
                Paint paint = org.telegram.ui.ActionBar.y6.t0;
                if (tiVar.B0.f()) {
                    customBackground = tiVar.B0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.y6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int measuredWidth3 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                float f18 = measuredWidth3 - i18;
                i19 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i26, f18, AndroidUtilities.dp(f12) + i19 + i26);
            }
            if (tiVar.B0.f()) {
                org.telegram.ui.ActionBar.y6.t0.setColor(tiVar.B0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.y6.t0.setAlpha(alpha2);
                int u13 = tiVar.u1(0);
                if (!z10) {
                    u13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i26) * f11;
                int measuredWidth4 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth4 - i15, AndroidUtilities.dp(12.0f) + u13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.y6.t0);
                canvas.restore();
            }
            if ((thVar == null || thVar.getAlpha() != f7) && f11 != 0.0f) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (i25 == 2) {
                    themedColor = TLObject.FLAG_29;
                    f13 = f11;
                } else if (tiVar.B0.f()) {
                    int customActionBarBackground = tiVar.B0.getCustomActionBarBackground();
                    themedColor = i0.a.f(0.5f, customActionBarBackground, i0.a.h(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f13 = f7 - alpha;
                    }
                    f13 = f7;
                } else {
                    themedColor = tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.Ii);
                    if (thVar != null) {
                        alpha = thVar.getAlpha();
                        f13 = f7 - alpha;
                    }
                    f13 = f7;
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.y6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.y6.t0.setAlpha((int) (liVar2.getAlpha() * alpha4 * f13 * f11));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f7;
        int i10;
        int i11;
        int i12;
        int dp;
        int dp2;
        float f10;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        int dp3;
        int dp4;
        float f12;
        int i17;
        float f13;
        boolean drawChild;
        int themedColor;
        float alpha;
        int i18;
        int i19;
        int i20;
        int i21;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i22;
        int i23;
        int i24;
        int i25;
        li liVar;
        int i26;
        ti tiVar = this.q0;
        boolean z10 = tiVar.g0;
        bh.p pVar = tiVar.R0;
        eh.d dVar = tiVar.D0;
        th thVar = tiVar.l1;
        b8 b8Var = tiVar.a1;
        if (!(view instanceof li) || view.getAlpha() <= 0.0f) {
            if (view != b8Var) {
                if (!(view instanceof sz) || dVar == null) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                dVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dVar.x.k);
                dVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = b8Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x9 = b8Var.getX();
            li liVar2 = tiVar.B0;
            if (liVar2 != null) {
                int i27 = liVar2.i();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((thVar != null ? thVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (pVar != null ? pVar.getAlpha() * pVar.getMeasuredHeight() : 0.0f));
                int u12 = tiVar.u1(0);
                i10 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int i28 = (u12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
                if (i11 == 1 || tiVar.w1 != null) {
                    i28 = (int) (liVar2.getTranslationY() + i28);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i28;
                int currentActionBarHeight = i27 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                if (i27 != 2) {
                    i12 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    if (i12 + i28 < currentActionBarHeight) {
                        float f14 = dp5;
                        if (liVar2 == tiVar.o0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (liVar2 == tiVar.m0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (liVar2 == tiVar.n0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f10 = f14 - dp2;
                            dp6 -= (int) (b8Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                        }
                        f10 = f14 + dp;
                        dp6 -= (int) (b8Var.getAlpha() * ((currentActionBarHeight - f10) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z10) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f7 = dp6;
            } else {
                f7 = 0.0f;
            }
            canvas.clipRect(x9, f7, b8Var.getX() + b8Var.getWidth(), b8Var.getY() + b8Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, tiVar.o2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        li liVar3 = (li) view;
        int i29 = liVar3.i();
        int dp7 = AndroidUtilities.dp(13.0f) + (thVar != null ? AndroidUtilities.dp(thVar.getAlpha() * 26.0f) : 0) + ((int) (pVar != null ? pVar.getAlpha() * pVar.getMeasuredHeight() : 0.0f));
        int u13 = tiVar.u1(liVar3 == tiVar.B0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
        int i30 = (u13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
        if (i14 == 1 || tiVar.w1 != null) {
            i30 = (int) (view.getTranslationY() + i30);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i30;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
        int i31 = i15 + dp9;
        int currentActionBarHeight2 = i29 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
        if (i29 != 2) {
            i16 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            f11 = 0.0f;
            if (i16 + i30 < currentActionBarHeight2) {
                float f15 = dp7;
                if (liVar3 == tiVar.o0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (liVar3 == tiVar.m0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (liVar3 == tiVar.n0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f12 = f15 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i30) - i17) / f12);
                    int i32 = (int) ((currentActionBarHeight2 - f12) * min);
                    i30 -= i32;
                    dp8 -= i32;
                    i31 += i32;
                    f13 = 1.0f - min;
                }
                f12 = f15 + dp3;
                i17 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i30) - i17) / f12);
                int i322 = (int) ((currentActionBarHeight2 - f12) * min2);
                i30 -= i322;
                dp8 -= i322;
                i31 += i322;
                f13 = 1.0f - min2;
            }
            f13 = 1.0f;
        } else if (i30 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
            f13 = org.telegram.ui.d3.v(currentActionBarHeight2 - i30, i26, 1.0f, 0.0f);
            f11 = 0.0f;
        } else {
            f11 = 0.0f;
            f13 = 1.0f;
        }
        if (!z10) {
            int i33 = AndroidUtilities.statusBarHeight;
            i30 += i33;
            dp8 += i33;
            i31 -= i33;
        }
        int i34 = i31;
        int customBackground = tiVar.B0.g() ? tiVar.B0.getCustomBackground() : tiVar.v1(true);
        li liVar4 = tiVar.B0;
        cn cnVar = tiVar.q0;
        boolean z11 = (liVar4 == cnVar || (liVar = tiVar.C0) == cnVar || (liVar4 == tiVar.j0 && liVar == null)) ? false : true;
        RectF rectF = this.m0;
        if (z11) {
            drawable = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            drawable2.setBounds(0, i30, getMeasuredWidth(), i34);
            drawable3 = ((org.telegram.ui.ActionBar.k3) tiVar).shadowDrawable;
            drawable3.draw(canvas);
            if (i29 == 2) {
                org.telegram.ui.ActionBar.y6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.y6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                float f16 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i30, f16, AndroidUtilities.dp(24.0f) + i25 + i30);
            }
        }
        if (view == tiVar.k0 || view == tiVar.s0 || view == tiVar.l0) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z11) {
            if (f13 != 1.0f && i29 != 2) {
                org.telegram.ui.ActionBar.y6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.y6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                float f17 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i30, f17, AndroidUtilities.dp(24.0f) + i21 + i30);
            }
            if ((thVar == null || thVar.getAlpha() != 1.0f) && f13 != f11) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (i29 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f13;
                } else {
                    themedColor = tiVar.getThemedColor(org.telegram.ui.ActionBar.y6.Ii);
                    alpha = thVar == null ? 1.0f : 1.0f - thVar.getAlpha();
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.y6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.y6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f13));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fi fiVar = this.p0;
        fiVar.b = this;
        fiVar.c();
        ti tiVar = this.q0;
        tiVar.H0.setAdjustPanLayoutHelper(fiVar);
        tiVar.S0.setAdjustPanLayoutHelper(fiVar);
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.p0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z10 = this.q0.g0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        ti tiVar = this.q0;
        int[] iArr = tiVar.e2;
        if (tiVar.B0.n(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y3 = motionEvent.getY();
                bh.p pVar = tiVar.R0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                th thVar = tiVar.l1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (thVar != null ? AndroidUtilities.dp(thVar.getAlpha() * 26.0f) : 0))) - ((int) (pVar != null ? pVar.getAlpha() * pVar.getMeasuredHeight() : 0.0f)));
                if (!tiVar.g0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y3 < dp2 && tiVar.a1.getAlpha() == 0.0f) {
                    tiVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0163  */
    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        fm fmVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        wh whVar;
        yh yhVar;
        go goVar;
        go goVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        gi giVar = this;
        ti tiVar = giVar.q0;
        bh.p pVar = tiVar.R0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.j0;
        int i21 = i12 - i10;
        if (giVar.l0 != i21) {
            giVar.l0 = i21;
            mf mfVar = tiVar.h0;
            if (mfVar != null && !mfVar.p0) {
                mfVar.dismiss();
            }
        }
        int childCount = giVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            tiVar.n2.set(i10, i11, i12, i13);
            giVar.setSystemGestureExclusionRects(tiVar.m2);
        }
        WeakHashMap weakHashMap = r0.i0.a;
        r0.k1 a2 = r0.b0.a(giVar);
        int i22 = 8;
        int i23 = a2 != null ? a2.a.f(8).d : 0;
        int paddingBottom = giVar.getPaddingBottom();
        z11 = ((org.telegram.ui.ActionBar.k3) tiVar).keyboardVisible;
        if (!z11) {
            go goVar3 = tiVar.m0;
            if (goVar3 == null || tiVar.B0 != goVar3 || goVar3.E == null) {
                go goVar4 = tiVar.n0;
                if (goVar4 == null || tiVar.B0 != goVar4 || goVar4.E == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = tiVar.s1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = tiVar.n0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = tiVar.m0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        giVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = giVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof li) {
                    li liVar = (li) childAt;
                    if (liVar.h) {
                        i25 = 0;
                    }
                    if (liVar.f) {
                        max2 = 0;
                    }
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i26 = layoutParams.gravity;
                if (i26 == -1) {
                    i26 = 51;
                }
                int i27 = i26 & 112;
                int i28 = i26 & 7;
                if (i28 == 1) {
                    i14 = ((i21 - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i28 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i27 == 16) {
                        if (i27 == 48) {
                            i19 = layoutParams.topMargin + i25;
                        } else if (i27 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max2) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (childAt != tiVar.a1 || childAt == tiVar.y1) {
                            i19 = 0;
                        }
                        whVar = tiVar.H0;
                        if ((whVar == null && whVar.l(childAt)) || (((yhVar = tiVar.S0) != null && yhVar.l(childAt)) || (((goVar = tiVar.m0) != null && childAt == goVar.E) || ((goVar2 = tiVar.n0) != null && childAt == goVar2.E)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == tiVar.H2) {
                            if (tiVar.c0) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == tiVar.z1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, ti.n0(tiVar));
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != tiVar.a1) {
                    }
                    i19 = 0;
                    whVar = tiVar.H0;
                    if (whVar == null) {
                    }
                    if (childAt == tiVar.H2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != tiVar.a1) {
                }
                i19 = 0;
                whVar = tiVar.H0;
                if (whVar == null) {
                }
                if (childAt == tiVar.H2) {
                }
            }
            i24++;
            giVar = this;
            i22 = 8;
        }
        R();
        tiVar.f2(tiVar.B0, 0);
        tiVar.f2(tiVar.C0, 0);
        if (tiVar.c0) {
            tiVar.c2();
        }
        if (chatAttachAlertPhotoLayout == null || (fmVar = chatAttachAlertPhotoLayout.E) == null || fmVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.E.getFastScroll().h0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.p1 + (tiVar.c0 ? (int) (pVar.getAlpha() * pVar.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.E.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        go goVar;
        go goVar2;
        boolean z10;
        int n02;
        int i15;
        int i16;
        gi giVar = this;
        ti tiVar = giVar.q0;
        boolean z11 = tiVar.g0;
        org.telegram.ui.ActionBar.w0 w0Var = tiVar.d1;
        int size = giVar.getLayoutParams().height > 0 ? giVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z11) {
            giVar.n0 = true;
            i15 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
            giVar.setPadding(i15, 0, i16, 0);
            giVar.n0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
        int i17 = size2 - (i12 * 2);
        if (AndroidUtilities.isTablet()) {
            w0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                w0Var.setAdditionalYOffset(0);
            } else {
                w0Var.setAdditionalYOffset(-AndroidUtilities.dp(3.0f));
            }
        }
        ((FrameLayout.LayoutParams) tiVar.i1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        giVar.n0 = true;
        int min = (int) (i17 / Math.min(4.5f, tiVar.D1.h()));
        if (tiVar.b2 != min) {
            tiVar.b2 = min;
            AndroidUtilities.runOnUIThread(new pg(giVar, 23));
        }
        giVar.n0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        giVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.k3) tiVar).backgroundPaddingLeft;
        yh yhVar = tiVar.S0;
        wh whVar = tiVar.H0;
        int i18 = size3 - (i13 * 2);
        if (!whVar.N && AndroidUtilities.dp(20.0f) >= 0 && !whVar.e && !whVar.O) {
            giVar.n0 = true;
            whVar.j();
            giVar.n0 = false;
        }
        if (!yhVar.N && AndroidUtilities.dp(20.0f) >= 0 && !yhVar.e && !yhVar.O) {
            giVar.n0 = true;
            yhVar.j();
            giVar.n0 = false;
        }
        if (tiVar.m0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            go goVar3 = tiVar.m0;
            if (!goVar3.G && !goVar3.a1 && !goVar3.f1 && !goVar3.h1) {
                giVar.n0 = true;
                goVar3.d0();
                giVar.n0 = false;
            }
        }
        if (tiVar.n0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            go goVar4 = tiVar.n0;
            if (!goVar4.G && !goVar4.a1 && !goVar4.f1 && !goVar4.h1) {
                giVar.n0 = true;
                goVar4.d0();
                giVar.n0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z10 = ((org.telegram.ui.ActionBar.k3) tiVar).keyboardVisible;
            if (z10) {
                li liVar = tiVar.B0;
                go goVar5 = tiVar.m0;
                if (liVar == goVar5 && goVar5.E != null && goVar5.h1) {
                    n02 = AndroidUtilities.dp(120.0f);
                } else {
                    go goVar6 = tiVar.n0;
                    n02 = (liVar == goVar6 && goVar6.E != null && goVar6.h1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                n02 = ti.n0(tiVar);
            }
            WeakHashMap weakHashMap = r0.i0.a;
            r0.k1 a2 = r0.b0.a(giVar);
            int i19 = a2 != null ? a2.a.f(8).d : 0;
            r0.k1 a10 = r0.b0.a(giVar);
            Math.max(a10 != null ? a10.a.f(527).d : 0, n02);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, n02);
            giVar.n0 = true;
            li liVar2 = tiVar.B0;
            if (liVar2.f) {
                liVar2.e = AndroidUtilities.dp(62.0f) + max;
                tiVar.B0.B(i18, size4);
            } else {
                liVar2.e = AndroidUtilities.navigationBarHeight;
                liVar2.B(i18, size4 - n02);
            }
            li liVar3 = tiVar.C0;
            if (liVar3 != null) {
                if (liVar3.f) {
                    liVar3.e = AndroidUtilities.dp(62.0f) + max;
                    tiVar.C0.B(i18, size4);
                } else {
                    liVar3.e = AndroidUtilities.navigationBarHeight;
                    liVar3.B(i18, size4 - n02);
                }
            }
            giVar.n0 = false;
        }
        int childCount = giVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = giVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == tiVar.y1) {
                i14 = i21;
                giVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof li) {
                    li liVar4 = (li) childAt;
                    if (liVar4.h) {
                        i22 = 0;
                    }
                    if (liVar4.f) {
                        i23 = 0;
                    }
                }
                if (!whVar.l(childAt) && !yhVar.l(childAt) && (((goVar = tiVar.m0) == null || childAt != goVar.E) && ((goVar2 = tiVar.n0) == null || childAt != goVar2.E))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i22 + i23);
                } else if (z11) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + size4, TLObject.FLAG_30));
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(getPaddingTop() + (size4 - AndroidUtilities.statusBarHeight), TLObject.FLAG_30));
                }
            }
            i20 = i14 + 1;
            giVar = this;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        WindowInsets rootWindowInsets;
        super.onSizeChanged(i10, i11, i12, i13);
        int i15 = 0;
        if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
            i14 = 0;
        } else {
            RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
            RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
            i14 = roundedCorner == null ? 0 : roundedCorner.getRadius();
            if (roundedCorner2 != null) {
                i15 = roundedCorner2.getRadius();
            }
        }
        eh.d dVar = this.q0.D0;
        if (dVar != null) {
            dVar.z(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ti tiVar = this.q0;
        if (tiVar.B0.n(motionEvent)) {
            return true;
        }
        return !tiVar.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.n0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f7) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        ti tiVar = this.q0;
        th thVar = tiVar.A1;
        float f10 = f7 + tiVar.o2;
        i10 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.o0 = f10;
        }
        i11 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f10 < 0.0f) {
                tiVar.B0.setTranslationY(f10);
                if (tiVar.T0 != 0 || tiVar.W0) {
                    tiVar.l1.setTranslationY((tiVar.s1 + f10) - tiVar.o2);
                }
                thVar.setTranslationY(0.0f);
                f10 = 0.0f;
            } else {
                tiVar.B0.setTranslationY(0.0f);
                thVar.setTranslationY(((f10 / this.o0) * thVar.getMeasuredHeight()) + (-f10));
            }
            viewGroup = ((org.telegram.ui.ActionBar.k3) tiVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY((f10 - tiVar.o2) + tiVar.y0);
        i12 = ((org.telegram.ui.ActionBar.k3) tiVar).currentSheetAnimationType;
        if (i12 != 1) {
            tiVar.B0.l(tiVar.o2);
        }
    }

    @Override // org.telegram.ui.Components.ww0
    public final void H(Canvas canvas, float f7, Rect rect, Paint paint, boolean z10) {
    }
}
