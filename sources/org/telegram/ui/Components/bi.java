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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class bi extends qv0 {
    public int t0;
    public final RectF u0;
    public boolean v0;
    public float w0;
    public final ai x0;
    public final /* synthetic */ li y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(li liVar, Context context) {
        super(context, null);
        this.y0 = liVar;
        this.u0 = new RectF();
        this.x0 = new ai(this, this);
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int i10;
        int i11;
        float f10;
        int dp;
        int dp2;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        int i12;
        Drawable drawable3;
        float f13;
        int themedColor;
        float alpha;
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
        di diVar;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        li liVar = this.y0;
        sg.d dVar = liVar.B2;
        sg.d dVar2 = liVar.A2;
        if (Build.VERSION.SDK_INT >= 31 && liVar.z2 != null) {
            liVar.Z0();
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        di diVar2 = liVar.v0;
        nm nmVar = liVar.n0;
        if ((diVar2 == nmVar || (diVar = liVar.w0) == nmVar || (diVar2 == liVar.g0 && diVar == null)) && diVar2 != null) {
            canvas.save();
            float f14 = liVar.i2;
            boolean z4 = liVar.d0;
            ah.e eVar = liVar.L0;
            mh mhVar = liVar.f1;
            canvas.translate(0.0f, f14);
            int alpha2 = (int) (diVar2.getAlpha() * 255.0f);
            int h = diVar2.h();
            int dp3 = AndroidUtilities.dp(13.0f) + ((int) ((mhVar != null ? mhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (eVar != null ? eVar.getAlpha() * eVar.getMeasuredHeight() : 0.0f));
            int p12 = liVar.p1(0);
            i10 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            int i25 = (p12 - i10) - dp3;
            i11 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
            if (i11 == 1 || liVar.q1 != null) {
                i25 = (int) (diVar2.getTranslationY() + i25);
            }
            int dp4 = AndroidUtilities.dp(20.0f) + i25;
            getMeasuredHeight();
            AndroidUtilities.dp(45.0f);
            int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            float f15 = 1.0f;
            if (h == 2) {
                if (i25 < currentActionBarHeight) {
                    float f16 = currentActionBarHeight - i25;
                    i24 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    f12 = Math.max(0.0f, 1.0f - (f16 / i24));
                } else {
                    f12 = 1.0f;
                }
                f10 = 0.0f;
            } else {
                float f17 = dp3;
                f10 = 0.0f;
                if (diVar2 == liVar.l0) {
                    dp = AndroidUtilities.dp(11.0f);
                } else {
                    if (diVar2 == liVar.j0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else if (diVar2 == liVar.k0) {
                        dp2 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp = AndroidUtilities.dp(4.0f);
                    }
                    f11 = f17 - dp2;
                    float alpha3 = liVar.U0.getAlpha();
                    int i26 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha3);
                    i25 -= i26;
                    dp4 -= i26;
                    f12 = 1.0f - alpha3;
                }
                f11 = f17 + dp;
                float alpha32 = liVar.U0.getAlpha();
                int i262 = (int) (((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight) * alpha32);
                i25 -= i262;
                dp4 -= i262;
                f12 = 1.0f - alpha32;
            }
            if (!z4) {
                int i27 = AndroidUtilities.statusBarHeight;
                i25 += i27;
                dp4 += i27;
            }
            int customBackground = liVar.v0.f() ? liVar.v0.getCustomBackground() : liVar.q1(true);
            drawable = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            drawable.setAlpha(alpha2);
            drawable2 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            int measuredWidth3 = getMeasuredWidth();
            int dp5 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
            i12 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            drawable2.setBounds(0, i25, measuredWidth3, i12 + dp5);
            drawable3 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            drawable3.draw(canvas);
            RectF rectF = this.u0;
            if (h == 2) {
                org.telegram.ui.ActionBar.j6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha2);
                i20 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i21 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                f13 = 24.0f;
                float f18 = i21 + i25;
                int measuredWidth4 = getMeasuredWidth();
                i22 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                float f19 = measuredWidth4 - i22;
                i23 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                rectF.set(i20, f18, f19, AndroidUtilities.dp(24.0f) + i23 + i25);
            } else {
                f13 = 24.0f;
            }
            if ((f12 != 1.0f && h != 2) || liVar.v0.e()) {
                Paint paint = org.telegram.ui.ActionBar.j6.t0;
                if (liVar.v0.e()) {
                    customBackground = liVar.v0.getCustomActionBarBackground();
                }
                paint.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha2);
                i16 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i17 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int measuredWidth5 = getMeasuredWidth();
                i18 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                float f20 = measuredWidth5 - i18;
                i19 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                rectF.set(i16, i17 + i25, f20, AndroidUtilities.dp(f13) + i19 + i25);
            }
            if (liVar.v0.e()) {
                org.telegram.ui.ActionBar.j6.t0.setColor(liVar.v0.getCustomActionBarBackground());
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha2);
                int p13 = liVar.p1(0);
                if (!z4) {
                    p13 += AndroidUtilities.statusBarHeight;
                }
                i13 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i14 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                float dp6 = (AndroidUtilities.dp(12.0f) + i14 + i25) * f12;
                int measuredWidth6 = getMeasuredWidth();
                i15 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                rectF.set(i13, dp6, measuredWidth6 - i15, AndroidUtilities.dp(12.0f) + p13);
                canvas.save();
                canvas.drawRect(rectF, org.telegram.ui.ActionBar.j6.t0);
                canvas.restore();
            }
            if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f12 != f10) {
                int dp7 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp7) / 2, dp4, (getMeasuredWidth() + dp7) / 2, AndroidUtilities.dp(4.0f) + dp4);
                if (h == 2) {
                    themedColor = TLObject.FLAG_29;
                    f15 = f12;
                } else if (liVar.v0.e()) {
                    int customActionBarBackground = liVar.v0.getCustomActionBarBackground();
                    themedColor = i0.a.d(0.5f, customActionBarBackground, i0.a.f(customActionBarBackground) < 0.5d ? -1 : -16777216);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f15 = 1.0f - alpha;
                    }
                } else {
                    themedColor = liVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    if (mhVar != null) {
                        alpha = mhVar.getAlpha();
                        f15 = 1.0f - alpha;
                    }
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.j6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (diVar2.getAlpha() * alpha4 * f15 * f12));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
            }
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        float f10;
        int i10;
        int i11;
        int i12;
        int dp;
        int dp2;
        float f11;
        int i13;
        int i14;
        int i15;
        int i16;
        float f12;
        int dp3;
        int dp4;
        float f13;
        int i17;
        float f14;
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
        di diVar;
        int i26;
        li liVar = this.y0;
        boolean z4 = liVar.d0;
        ah.e eVar = liVar.L0;
        pg.b bVar = liVar.x0;
        mh mhVar = liVar.f1;
        eg.l1 l1Var = liVar.U0;
        if (!(view instanceof di) || view.getAlpha() <= 0.0f) {
            if (view != l1Var) {
                if (!(view instanceof kz) || bVar == null) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                bVar.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(bVar.h.k);
                bVar.draw(canvas);
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild2;
            }
            float alpha2 = l1Var.getAlpha();
            if (alpha2 <= 0.0f) {
                return false;
            }
            if (alpha2 >= 1.0f) {
                return super.drawChild(canvas, view, j10);
            }
            canvas.save();
            float x10 = l1Var.getX();
            di diVar2 = liVar.v0;
            if (diVar2 != null) {
                int h = diVar2.h();
                int dp5 = AndroidUtilities.dp(13.0f) + ((int) ((mhVar != null ? mhVar.getAlpha() : 0.0f) * AndroidUtilities.dp(26.0f))) + ((int) (eVar != null ? eVar.getAlpha() * eVar.getMeasuredHeight() : 0.0f));
                int p12 = liVar.p1(0);
                i10 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int i27 = (p12 - i10) - dp5;
                i11 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
                if (i11 == 1 || liVar.q1 != null) {
                    i27 = (int) (diVar2.getTranslationY() + i27);
                }
                int dp6 = AndroidUtilities.dp(20.0f) + i27;
                int currentActionBarHeight = h != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                if (h != 2) {
                    i12 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    if (i12 + i27 < currentActionBarHeight) {
                        float f15 = dp5;
                        if (diVar2 == liVar.l0) {
                            dp = AndroidUtilities.dp(11.0f);
                        } else {
                            if (diVar2 == liVar.j0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else if (diVar2 == liVar.k0) {
                                dp2 = AndroidUtilities.dp(3.0f);
                            } else {
                                dp = AndroidUtilities.dp(4.0f);
                            }
                            f11 = f15 - dp2;
                            dp6 -= (int) (l1Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                        }
                        f11 = f15 + dp;
                        dp6 -= (int) (l1Var.getAlpha() * ((currentActionBarHeight - f11) + AndroidUtilities.statusBarHeight));
                    }
                }
                if (!z4) {
                    dp6 += AndroidUtilities.statusBarHeight;
                }
                f10 = dp6;
            } else {
                f10 = 0.0f;
            }
            canvas.clipRect(x10, f10, l1Var.getX() + l1Var.getWidth(), l1Var.getY() + l1Var.getHeight());
            boolean drawChild3 = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild3;
        }
        canvas.save();
        canvas.translate(0.0f, liVar.i2);
        int alpha3 = (int) (view.getAlpha() * 255.0f);
        di diVar3 = (di) view;
        int h9 = diVar3.h();
        int dp7 = AndroidUtilities.dp(13.0f) + (mhVar != null ? AndroidUtilities.dp(mhVar.getAlpha() * 26.0f) : 0) + ((int) (eVar != null ? eVar.getAlpha() * eVar.getMeasuredHeight() : 0.0f));
        int p13 = liVar.p1(diVar3 == liVar.v0 ? 0 : 1);
        i13 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
        int i28 = (p13 - i13) - dp7;
        i14 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
        if (i14 == 1 || liVar.q1 != null) {
            i28 = (int) (view.getTranslationY() + i28);
        }
        int dp8 = AndroidUtilities.dp(20.0f) + i28;
        int dp9 = AndroidUtilities.dp(45.0f) + getMeasuredHeight();
        i15 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
        int i29 = i15 + dp9;
        int currentActionBarHeight2 = h9 != 0 ? org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() : ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
        if (h9 != 2) {
            i16 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            f12 = 0.0f;
            if (i16 + i28 < currentActionBarHeight2) {
                float f16 = dp7;
                if (diVar3 == liVar.l0) {
                    dp3 = AndroidUtilities.dp(11.0f);
                } else {
                    if (diVar3 == liVar.j0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else if (diVar3 == liVar.k0) {
                        dp4 = AndroidUtilities.dp(3.0f);
                    } else {
                        dp3 = AndroidUtilities.dp(4.0f);
                    }
                    f13 = f16 - dp4;
                    i17 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                    float min = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f13);
                    int i30 = (int) ((currentActionBarHeight2 - f13) * min);
                    i28 -= i30;
                    dp8 -= i30;
                    i29 += i30;
                    f14 = 1.0f - min;
                }
                f13 = f16 + dp3;
                i17 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                float min2 = Math.min(1.0f, ((currentActionBarHeight2 - i28) - i17) / f13);
                int i302 = (int) ((currentActionBarHeight2 - f13) * min2);
                i28 -= i302;
                dp8 -= i302;
                i29 += i302;
                f14 = 1.0f - min2;
            }
            f14 = 1.0f;
        } else if (i28 < currentActionBarHeight2) {
            i26 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
            f14 = Math.max(0.0f, 1.0f - ((currentActionBarHeight2 - i28) / i26));
            f12 = 0.0f;
        } else {
            f12 = 0.0f;
            f14 = 1.0f;
        }
        if (!z4) {
            int i31 = AndroidUtilities.statusBarHeight;
            i28 += i31;
            dp8 += i31;
            i29 -= i31;
        }
        int i32 = i29;
        int customBackground = liVar.v0.f() ? liVar.v0.getCustomBackground() : liVar.q1(true);
        di diVar4 = liVar.v0;
        nm nmVar = liVar.n0;
        boolean z10 = (diVar4 == nmVar || (diVar = liVar.w0) == nmVar || (diVar4 == liVar.g0 && diVar == null)) ? false : true;
        RectF rectF = this.u0;
        if (z10) {
            drawable = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            drawable.setAlpha(alpha3);
            drawable2 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            drawable2.setBounds(0, i28, getMeasuredWidth(), i32);
            drawable3 = ((org.telegram.ui.ActionBar.g3) liVar).shadowDrawable;
            drawable3.draw(canvas);
            if (h9 == 2) {
                org.telegram.ui.ActionBar.j6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha3);
                i22 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i23 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int measuredWidth = getMeasuredWidth();
                i24 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                float f17 = measuredWidth - i24;
                i25 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                rectF.set(i22, i23 + i28, f17, AndroidUtilities.dp(24.0f) + i25 + i28);
            }
        }
        if (view == liVar.h0 || view == liVar.p0 || view == liVar.i0) {
            drawChild = super.drawChild(canvas, view, j10);
        } else {
            canvas.save();
            drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
        }
        if (z10) {
            if (f14 != 1.0f && h9 != 2) {
                org.telegram.ui.ActionBar.j6.t0.setColor(customBackground);
                org.telegram.ui.ActionBar.j6.t0.setAlpha(alpha3);
                i18 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                i19 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int measuredWidth2 = getMeasuredWidth();
                i20 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                float f18 = measuredWidth2 - i20;
                i21 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                rectF.set(i18, i19 + i28, f18, AndroidUtilities.dp(24.0f) + i21 + i28);
            }
            if ((mhVar == null || mhVar.getAlpha() != 1.0f) && f14 != f12) {
                int dp10 = AndroidUtilities.dp(36.0f);
                rectF.set((getMeasuredWidth() - dp10) / 2, dp8, (getMeasuredWidth() + dp10) / 2, AndroidUtilities.dp(4.0f) + dp8);
                if (h9 == 2) {
                    themedColor = TLObject.FLAG_29;
                    alpha = f14;
                } else {
                    themedColor = liVar.getThemedColor(org.telegram.ui.ActionBar.j6.Ii);
                    alpha = mhVar == null ? 1.0f : 1.0f - mhVar.getAlpha();
                }
                int alpha4 = Color.alpha(themedColor);
                org.telegram.ui.ActionBar.j6.t0.setColor(themedColor);
                org.telegram.ui.ActionBar.j6.t0.setAlpha((int) (view.getAlpha() * alpha4 * alpha * f14));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
            }
        }
        canvas.restore();
        return drawChild;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ai aiVar = this.x0;
        aiVar.b = this;
        aiVar.c();
        li liVar = this.y0;
        liVar.B0.setAdjustPanLayoutHelper(aiVar);
        liVar.M0.setAdjustPanLayoutHelper(aiVar);
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z4 = this.y0.d0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i10;
        li liVar = this.y0;
        int[] iArr = liVar.Y1;
        if (liVar.v0.l(motionEvent)) {
            return true;
        }
        if (motionEvent.getAction() == 0) {
            if (iArr[0] != 0) {
                float y10 = motionEvent.getY();
                ah.e eVar = liVar.L0;
                int i11 = iArr[0];
                i10 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingTop;
                int i12 = i11 - (i10 * 2);
                int dp = AndroidUtilities.dp(13.0f);
                mh mhVar = liVar.f1;
                int dp2 = AndroidUtilities.dp(20.0f) + ((i12 - (dp + (mhVar != null ? AndroidUtilities.dp(mhVar.getAlpha() * 26.0f) : 0))) - ((int) (eVar != null ? eVar.getAlpha() * eVar.getMeasuredHeight() : 0.0f)));
                if (!liVar.d0) {
                    dp2 += AndroidUtilities.statusBarHeight;
                }
                if (y10 < dp2 && liVar.U0.getAlpha() == 0.0f) {
                    liVar.onDismissWithTouchOutside();
                    return true;
                }
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0161  */
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        ol olVar;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        qh qhVar;
        th thVar;
        pn pnVar;
        pn pnVar2;
        int i20;
        int max;
        int measuredHeight;
        int measuredHeight2;
        int emojiPadding;
        bi biVar = this;
        li liVar = biVar.y0;
        ah.e eVar = liVar.L0;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = liVar.g0;
        int i21 = i12 - i10;
        if (biVar.t0 != i21) {
            biVar.t0 = i21;
            cf cfVar = liVar.e0;
            if (cfVar != null && !cfVar.n0) {
                cfVar.dismiss();
            }
        }
        int childCount = biVar.getChildCount();
        if (Build.VERSION.SDK_INT >= 29) {
            liVar.h2.set(i10, i11, i12, i13);
            biVar.setSystemGestureExclusionRects(liVar.g2);
        }
        r0.m1 f10 = r0.j0.f(biVar);
        int i22 = 8;
        int i23 = f10 != null ? f10.a.f(8).d : 0;
        int paddingBottom = biVar.getPaddingBottom();
        z10 = ((org.telegram.ui.ActionBar.g3) liVar).keyboardVisible;
        if (!z10) {
            pn pnVar3 = liVar.j0;
            if (pnVar3 == null || liVar.v0 != pnVar3 || pnVar3.B == null) {
                pn pnVar4 = liVar.k0;
                if (pnVar4 == null || liVar.v0 != pnVar4 || pnVar4.B == null) {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = liVar.m1().getEmojiPadding();
                        if (emojiPadding > 0) {
                            paddingBottom += emojiPadding;
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                } else {
                    if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                        emojiPadding = liVar.k0.getEmojiPadding();
                        if (emojiPadding > 0) {
                        }
                    }
                    emojiPadding = 0;
                    if (emojiPadding > 0) {
                    }
                }
            } else {
                if (i23 <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    emojiPadding = liVar.j0.getEmojiPadding();
                    if (emojiPadding > 0) {
                    }
                }
                emojiPadding = 0;
                if (emojiPadding > 0) {
                }
            }
        }
        biVar.setBottomClip(paddingBottom);
        int i24 = 0;
        while (i24 < childCount) {
            View childAt = biVar.getChildAt(i24);
            if (childAt.getVisibility() != i22) {
                int i25 = AndroidUtilities.statusBarHeight;
                int max2 = i23 == 0 ? Math.max(AndroidUtilities.navigationBarHeight, paddingBottom) : 0;
                if (childAt instanceof di) {
                    di diVar = (di) childAt;
                    if (diVar.h) {
                        i25 = 0;
                    }
                    if (diVar.f) {
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
                        if (childAt != liVar.U0 || childAt == liVar.s1) {
                            i19 = 0;
                        }
                        qhVar = liVar.B0;
                        if ((qhVar == null && qhVar.l(childAt)) || (((thVar = liVar.M0) != null && thVar.l(childAt)) || (((pnVar = liVar.j0) != null && childAt == pnVar.B) || ((pnVar2 = liVar.k0) != null && childAt == pnVar2.B)))) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight() + i23;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        } else if (childAt == liVar.y2) {
                            if (liVar.Z) {
                                i20 = AndroidUtilities.statusBarHeight;
                                max = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                                i19 = i20 + max;
                            }
                        } else if (childAt == liVar.t1) {
                            i20 = i19 + AndroidUtilities.navigationBarHeight;
                            max = Math.max(i23, liVar.o1());
                            i19 = i20 + max;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, i19 + measuredHeight3);
                    } else {
                        i17 = ((((i13 - max2) - i11) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (childAt != liVar.U0) {
                    }
                    i19 = 0;
                    qhVar = liVar.B0;
                    if (qhVar == null) {
                    }
                    if (childAt == liVar.y2) {
                    }
                } else {
                    i14 = ((i21 - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i27 == 16) {
                }
                i19 = i17 - i18;
                if (childAt != liVar.U0) {
                }
                i19 = 0;
                qhVar = liVar.B0;
                if (qhVar == null) {
                }
                if (childAt == liVar.y2) {
                }
            }
            i24++;
            biVar = this;
            i22 = 8;
        }
        S();
        liVar.X1(liVar.v0, 0);
        liVar.X1(liVar.w0, 0);
        if (liVar.Z) {
            liVar.U1();
        }
        if (chatAttachAlertPhotoLayout == null || (olVar = chatAttachAlertPhotoLayout.B) == null || olVar.getFastScroll() == null) {
            return;
        }
        chatAttachAlertPhotoLayout.B.getFastScroll().e0 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + chatAttachAlertPhotoLayout.m1 + (liVar.Z ? (int) (eVar.getAlpha() * eVar.getMeasuredHeight()) : 0);
        chatAttachAlertPhotoLayout.B.getFastScroll().invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        pn pnVar;
        pn pnVar2;
        boolean z4;
        int o12;
        int i15;
        int i16;
        bi biVar = this;
        li liVar = biVar.y0;
        boolean z10 = liVar.d0;
        org.telegram.ui.ActionBar.w0 w0Var = liVar.X0;
        int size = biVar.getLayoutParams().height > 0 ? biVar.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        if (!z10) {
            biVar.v0 = true;
            i15 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
            i16 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
            biVar.setPadding(i15, 0, i16, 0);
            biVar.v0 = false;
        }
        int size2 = View.MeasureSpec.getSize(i10);
        i12 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
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
        ((FrameLayout.LayoutParams) liVar.c1.getLayoutParams()).height = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        biVar.v0 = true;
        int min = (int) (i17 / Math.min(4.5f, liVar.x1.h()));
        if (liVar.V1 != min) {
            liVar.V1 = min;
            AndroidUtilities.runOnUIThread(new fg(biVar, 21));
        }
        biVar.v0 = false;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size3 = View.MeasureSpec.getSize(i10);
        int size4 = View.MeasureSpec.getSize(makeMeasureSpec);
        biVar.setMeasuredDimension(size3, size4);
        i13 = ((org.telegram.ui.ActionBar.g3) liVar).backgroundPaddingLeft;
        th thVar = liVar.M0;
        qh qhVar = liVar.B0;
        int i18 = size3 - (i13 * 2);
        if (!qhVar.K && AndroidUtilities.dp(20.0f) >= 0 && !qhVar.e && !qhVar.L) {
            biVar.v0 = true;
            qhVar.j();
            biVar.v0 = false;
        }
        if (!thVar.K && AndroidUtilities.dp(20.0f) >= 0 && !thVar.e && !thVar.L) {
            biVar.v0 = true;
            thVar.j();
            biVar.v0 = false;
        }
        if (liVar.j0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            pn pnVar3 = liVar.j0;
            if (!pnVar3.D && !pnVar3.X0 && !pnVar3.c1 && !pnVar3.e1) {
                biVar.v0 = true;
                pnVar3.a0();
                biVar.v0 = false;
            }
        }
        if (liVar.k0 != null && AndroidUtilities.dp(20.0f) >= 0) {
            pn pnVar4 = liVar.k0;
            if (!pnVar4.D && !pnVar4.X0 && !pnVar4.c1 && !pnVar4.e1) {
                biVar.v0 = true;
                pnVar4.a0();
                biVar.v0 = false;
            }
        }
        if (AndroidUtilities.dp(20.0f) >= 0) {
            z4 = ((org.telegram.ui.ActionBar.g3) liVar).keyboardVisible;
            if (z4) {
                di diVar = liVar.v0;
                pn pnVar5 = liVar.j0;
                if (diVar == pnVar5 && pnVar5.B != null && pnVar5.e1) {
                    o12 = AndroidUtilities.dp(120.0f);
                } else {
                    pn pnVar6 = liVar.k0;
                    o12 = (diVar == pnVar6 && pnVar6.B != null && pnVar6.e1) ? AndroidUtilities.dp(120.0f) : 0;
                }
            } else {
                o12 = liVar.o1();
            }
            r0.m1 f10 = r0.j0.f(biVar);
            int i19 = f10 != null ? f10.a.f(8).d : 0;
            r0.m1 f11 = r0.j0.f(biVar);
            Math.max(f11 != null ? f11.a.f(527).d : 0, o12);
            int max = Math.max(i19 > 0 ? 0 : AndroidUtilities.navigationBarHeight, o12);
            biVar.v0 = true;
            di diVar2 = liVar.v0;
            if (diVar2.f) {
                diVar2.e = AndroidUtilities.dp(62.0f) + max;
                liVar.v0.y(i18, size4);
            } else {
                diVar2.e = AndroidUtilities.navigationBarHeight;
                diVar2.y(i18, size4 - o12);
            }
            di diVar3 = liVar.w0;
            if (diVar3 != null) {
                if (diVar3.f) {
                    diVar3.e = AndroidUtilities.dp(62.0f) + max;
                    liVar.w0.y(i18, size4);
                } else {
                    diVar3.e = AndroidUtilities.navigationBarHeight;
                    diVar3.y(i18, size4 - o12);
                }
            }
            biVar.v0 = false;
        }
        int childCount = biVar.getChildCount();
        int i20 = 0;
        while (i20 < childCount) {
            int i21 = i20;
            View childAt = biVar.getChildAt(i21);
            if (childAt == null || childAt.getVisibility() == 8) {
                i14 = i21;
            } else if (childAt == liVar.s1) {
                i14 = i21;
                biVar.measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, 0);
            } else {
                i14 = i21;
                int i22 = AndroidUtilities.statusBarHeight;
                int i23 = AndroidUtilities.navigationBarHeight;
                if (childAt instanceof di) {
                    di diVar4 = (di) childAt;
                    if (diVar4.h) {
                        i22 = 0;
                    }
                    if (diVar4.f) {
                        i23 = 0;
                    }
                }
                if (!qhVar.l(childAt) && !thVar.l(childAt) && (((pnVar = liVar.j0) == null || childAt != pnVar.B) && ((pnVar2 = liVar.k0) == null || childAt != pnVar2.B))) {
                    measureChildWithMargins(childAt, i10, 0, makeMeasureSpec, i22 + i23);
                } else if (z10) {
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
            biVar = this;
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
        pg.b bVar = this.y0.x0;
        if (bVar != null) {
            bVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i15, i14);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        li liVar = this.y0;
        if (liVar.v0.l(motionEvent)) {
            return true;
        }
        return !liVar.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v0) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        int i10;
        int i11;
        int i12;
        ViewGroup viewGroup;
        li liVar = this.y0;
        mh mhVar = liVar.u1;
        float f11 = f10 + liVar.i2;
        i10 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
        if (i10 == 0) {
            this.w0 = f11;
        }
        i11 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
        if (i11 == 1) {
            if (f11 < 0.0f) {
                liVar.v0.setTranslationY(f11);
                if (liVar.N0 != 0 || liVar.Q0) {
                    liVar.f1.setTranslationY((liVar.m1 + f11) - liVar.i2);
                }
                mhVar.setTranslationY(0.0f);
                f11 = 0.0f;
            } else {
                liVar.v0.setTranslationY(0.0f);
                mhVar.setTranslationY(((f11 / this.w0) * mhVar.getMeasuredHeight()) + (-f11));
            }
            viewGroup = ((org.telegram.ui.ActionBar.g3) liVar).containerView;
            viewGroup.invalidate();
        }
        super.setTranslationY(f11 - liVar.i2);
        i12 = ((org.telegram.ui.ActionBar.g3) liVar).currentSheetAnimationType;
        if (i12 != 1) {
            liVar.v0.k(liVar.i2);
        }
    }

    @Override // org.telegram.ui.Components.qv0
    public final void J(Canvas canvas, float f10, Rect rect, Paint paint, boolean z4) {
    }
}
