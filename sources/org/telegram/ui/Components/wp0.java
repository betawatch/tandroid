package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class wp0 extends pv0 {
    public int A0;
    public int B0;
    public final boolean C0;
    public final z5 D0;
    public final /* synthetic */ lq0 E0;
    public boolean t0;
    public final RectF u0;
    public boolean v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp0(lq0 lq0Var, Context context) {
        super(context, null);
        this.E0 = lq0Var;
        this.t0 = false;
        this.u0 = new RectF();
        this.E = new vp0(this, this);
        this.C0 = AndroidUtilities.computePerceivedBrightness(lq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.h5)) > 0.721f;
        this.D0 = new z5(this, 0L, 350L, pr.h);
    }

    @Override // org.telegram.ui.Components.pv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        lq0 lq0Var = this.E0;
        mp0 mp0Var = lq0Var.D;
        sl0 sl0Var = lq0Var.B;
        mp0 mp0Var2 = lq0Var.C;
        if (mp0Var2.getVisibility() == 0 && mp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(mp0Var2.getX(), mp0Var2.getY());
            mp0Var2.draw(canvas);
            canvas.restore();
        }
        if (sl0Var.getVisibility() == 0 && sl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(sl0Var.getX(), sl0Var.getY());
            sl0Var.draw(canvas);
            canvas.restore();
        }
        if (mp0Var.getVisibility() != 0 || mp0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(mp0Var.getX(), mp0Var.getY());
        mp0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        lq0 lq0Var = this.E0;
        tg.d dVar = lq0Var.N0;
        tg.d dVar2 = lq0Var.M0;
        if (Build.VERSION.SDK_INT >= 31 && lq0Var.L0 != null) {
            lq0.A0(lq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.h3) lq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + lq0Var.q0, getMeasuredWidth(), getMeasuredHeight() + lq0Var.q0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof mz) {
            lq0 lq0Var = this.E0;
            if (lq0Var.S0 != null) {
                canvas.save();
                lq0Var.S0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(lq0Var.S0.h.k);
                lq0Var.S0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.pv0
    public final org.telegram.ui.ActionBar.g6 getResourceProvider() {
        org.telegram.ui.ActionBar.g6 g6Var;
        g6Var = ((org.telegram.ui.ActionBar.h3) this.E0).resourcesProvider;
        return g6Var;
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.r1 r1Var = this.E;
        r1Var.b = this;
        r1Var.c();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z4;
        float f10;
        int i13;
        boolean z10;
        int i14;
        int i15;
        canvas.save();
        lq0 lq0Var = this.E0;
        Drawable drawable = lq0Var.O;
        FrameLayout frameLayout = lq0Var.w;
        canvas.translate(0.0f, lq0Var.q0);
        int i16 = lq0Var.m0;
        i10 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i16 - i10) + this.w0;
        int i17 = lq0Var.m0;
        i11 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int dp2 = ((i17 - i11) - AndroidUtilities.dp(13.0f)) + this.w0;
        lq0Var.U = dp2;
        int dp3 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int i18 = i12 + dp3;
        z4 = ((org.telegram.ui.ActionBar.h3) lq0Var).isFullscreen;
        if (z4) {
            f10 = 0.0f;
        } else {
            dp += lq0Var.D0.b;
            if (this.v0) {
                i15 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
                if (i15 + dp2 < lq0Var.D0.b) {
                    z10 = true;
                    int i19 = dp2 + lq0Var.D0.b;
                    i14 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
                    f10 = this.D0.e(z10);
                    dp2 = AndroidUtilities.lerp(i19, -i14, f10);
                }
            }
            z10 = false;
            int i192 = dp2 + lq0Var.D0.b;
            i14 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
            f10 = this.D0.e(z10);
            dp2 = AndroidUtilities.lerp(i192, -i14, f10);
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i18);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp2 > lq0Var.D0.b || frameLayout.getChildCount() <= 0) {
                i13 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i13 + dp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                ic icVar = ic.w;
                if (icVar != null) {
                    nb nbVar = icVar.e;
                    if (nbVar != null) {
                        nbVar.setTop(true);
                    }
                    icVar.b();
                }
            }
        }
        if (f10 < 1.0f) {
            int dp4 = AndroidUtilities.dp(36.0f);
            float measuredWidth = (getMeasuredWidth() - dp4) / 2;
            float f11 = dp;
            float measuredWidth2 = (getMeasuredWidth() + dp4) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp;
            RectF rectF = this.u0;
            rectF.set(measuredWidth, f11, measuredWidth2, dp5);
            org.telegram.ui.ActionBar.k6.t0.setColor(lq0Var.getThemedColor(org.telegram.ui.ActionBar.k6.Ii));
            org.telegram.ui.ActionBar.k6.t0.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.k6.t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            boolean z11 = this.C0 && ((float) 0) > ((float) lq0Var.D0.b) * 0.5f;
            if (z11 != ((systemUiVisibility & 8192) > 0)) {
                setSystemUiVisibility(z11 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
        canvas.restore();
        this.x0 = this.w0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4 = this.v0;
        lq0 lq0Var = this.E0;
        if (z4) {
            if (motionEvent.getAction() == 0 && lq0Var.m0 != 0 && motionEvent.getY() < lq0Var.m0 - AndroidUtilities.dp(30.0f)) {
                lq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.w0 - AndroidUtilities.dp(30.0f)) {
            lq0Var.dismiss();
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a7  */
    @Override // org.telegram.ui.Components.pv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        boolean z10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int R = R();
        lq0 lq0Var = this.E0;
        pp0 pp0Var = lq0Var.d;
        z10 = ((org.telegram.ui.ActionBar.h3) lq0Var).keyboardVisible;
        int max = (z10 || R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(lq0Var.D0.d, pp0Var.getEmojiPadding());
        setBottomClip(max);
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i21 = layoutParams.gravity;
                if (i21 == -1) {
                    i21 = 51;
                }
                int i22 = i21 & 112;
                int i23 = i21 & 7;
                if (i23 == 1) {
                    i14 = (((i12 - i10) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i15 = layoutParams.rightMargin;
                } else if (i23 != 5) {
                    i16 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i22 == 16) {
                        if (i22 == 48) {
                            i19 = this.w0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (pp0Var != null && pp0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == lq0Var.n) {
                            i19 += lq0Var.D0.d;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - max) - (this.w0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (pp0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == lq0Var.n) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (pp0Var != null) {
                }
                if (childAt == lq0Var.n) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
        lq0Var.Y0();
        lq0.s0(lq0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z4;
        int i12;
        boolean z10;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17;
        wp0 wp0Var = this;
        lq0 lq0Var = wp0Var.E0;
        mp0 mp0Var = lq0Var.D;
        FrameLayout frameLayout = lq0Var.Z;
        mp0 mp0Var2 = lq0Var.C;
        sl0 sl0Var = lq0Var.B;
        int size = wp0Var.getLayoutParams().height > 0 ? wp0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i18 = 0;
        lq0Var.E.G = wp0Var.getLayoutParams().height <= 0;
        lq0Var.G.G = wp0Var.getLayoutParams().height <= 0;
        z4 = ((org.telegram.ui.ActionBar.h3) lq0Var).isFullscreen;
        if (!z4) {
            wp0Var.t0 = true;
            i16 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingLeft;
            int i19 = lq0Var.D0.b;
            i17 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingLeft;
            wp0Var.setPadding(i16, i19, i17, 0);
            wp0Var.t0 = false;
        }
        int paddingTop = size - wp0Var.getPaddingTop();
        int D = org.telegram.messenger.y3.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(lq0Var.J.h(), lq0Var.H.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
        int i20 = i12 + D;
        if (sl0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.y3.D(103.0f, Math.max(2, (int) Math.ceil((lq0Var.I.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i15 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingTop;
            int i21 = i15 + D2;
            if (i21 > i20) {
                i20 = AndroidUtilities.lerp(i20, i21, sl0Var.getAlpha());
            }
        }
        int i22 = i20 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int dp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + lq0Var.D0.d;
        if (mp0Var2.getPaddingTop() != i22 || mp0Var2.getPaddingBottom() != dp) {
            wp0Var.t0 = true;
            mp0Var2.setPadding(0, i22, 0, dp);
            sl0Var.setPadding(0, i22, 0, dp);
            wp0Var.t0 = false;
        }
        z10 = ((org.telegram.ui.ActionBar.h3) lq0Var).keyboardVisible;
        if (z10 && wp0Var.getLayoutParams().height <= 0 && mp0Var.getPaddingTop() != i22) {
            wp0Var.t0 = true;
            mp0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + lq0Var.D0.d);
            wp0Var.t0 = false;
        }
        boolean z12 = i20 >= size;
        wp0Var.v0 = z12;
        wp0Var.w0 = z12 ? 0 : size - i20;
        wp0Var.t0 = true;
        lq0Var.K0(false);
        wp0Var.t0 = false;
        wp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i13 = ((org.telegram.ui.ActionBar.h3) lq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = lq0Var.r;
        pp0 pp0Var = lq0Var.d;
        int i23 = size2 - (i13 * 2);
        int R = wp0Var.R();
        lq0Var.K0 = R;
        if (!pp0Var.K && R <= AndroidUtilities.dp(20.0f) && !pp0Var.e && !pp0Var.L) {
            wp0Var.t0 = true;
            pp0Var.j();
            wp0Var.t0 = false;
        }
        wp0Var.t0 = true;
        if (lq0Var.K0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z11 = ((org.telegram.ui.ActionBar.h3) lq0Var).keyboardVisible;
                size3 -= z11 ? 0 : pp0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i24 = pp0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i24);
            }
            i14 = 8;
        } else {
            if (!pp0Var.m()) {
                pp0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i25 = makeMeasureSpec;
        int i26 = size3;
        wp0Var.t0 = false;
        int childCount = wp0Var.getChildCount();
        while (i18 < childCount) {
            View childAt = wp0Var.getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (!pp0Var.l(childAt)) {
                    wp0Var.measureChildWithMargins(childAt, i10, 0, i25, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), wp0Var.getPaddingTop() + (i26 - lq0Var.D0.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(wp0Var.getPaddingTop() + (i26 - lq0Var.D0.b), TLObject.FLAG_30));
                }
            }
            i18++;
            wp0Var = this;
        }
        lq0Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.E0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.t0) {
            return;
        }
        super.requestLayout();
    }
}
