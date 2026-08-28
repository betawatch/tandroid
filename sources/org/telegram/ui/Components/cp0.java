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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cp0 extends xu0 {
    public int A0;
    public final boolean B0;
    public final y5 C0;
    public final /* synthetic */ rp0 D0;
    public boolean s0;
    public final RectF t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp0(rp0 rp0Var, Context context) {
        super(context, null);
        this.D0 = rp0Var;
        this.s0 = false;
        this.t0 = new RectF();
        this.D = new bp0(this, this);
        this.B0 = AndroidUtilities.computePerceivedBrightness(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.h5)) > 0.721f;
        this.C0 = new y5(this, 0L, 350L, gr.h);
    }

    @Override // org.telegram.ui.Components.xu0
    public final void L(Canvas canvas, ArrayList arrayList) {
        rp0 rp0Var = this.D0;
        so0 so0Var = rp0Var.C;
        wk0 wk0Var = rp0Var.A;
        so0 so0Var2 = rp0Var.B;
        if (so0Var2.getVisibility() == 0 && so0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(so0Var2.getX(), so0Var2.getY());
            so0Var2.draw(canvas);
            canvas.restore();
        }
        if (wk0Var.getVisibility() == 0 && wk0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(wk0Var.getX(), wk0Var.getY());
            wk0Var.draw(canvas);
            canvas.restore();
        }
        if (so0Var.getVisibility() != 0 || so0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(so0Var.getX(), so0Var.getY());
        so0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        rp0 rp0Var = this.D0;
        ng.d dVar = rp0Var.M0;
        ng.d dVar2 = rp0Var.L0;
        if (Build.VERSION.SDK_INT >= 31 && rp0Var.K0 != null) {
            rp0.z0(rp0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) rp0Var).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + rp0Var.p0, getMeasuredWidth(), getMeasuredHeight() + rp0Var.p0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof wy) {
            rp0 rp0Var = this.D0;
            if (rp0Var.R0 != null) {
                canvas.save();
                rp0Var.R0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(rp0Var.R0.h.k);
                rp0Var.R0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.xu0
    public final org.telegram.ui.ActionBar.b6 getResourceProvider() {
        org.telegram.ui.ActionBar.b6 b6Var;
        b6Var = ((org.telegram.ui.ActionBar.f3) this.D0).resourcesProvider;
        return b6Var;
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.D;
        q1Var.b = this;
        q1Var.c();
    }

    @Override // org.telegram.ui.Components.xu0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9;
        int i10;
        int i11;
        boolean z10;
        float f10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        canvas.save();
        rp0 rp0Var = this.D0;
        Drawable drawable = rp0Var.N;
        FrameLayout frameLayout = rp0Var.w;
        canvas.translate(0.0f, rp0Var.p0);
        int i15 = rp0Var.l0;
        i9 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i15 - i9) + this.v0;
        int i16 = rp0Var.l0;
        i10 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int dp2 = ((i16 - i10) - AndroidUtilities.dp(13.0f)) + this.v0;
        rp0Var.T = dp2;
        int dp3 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int i17 = i11 + dp3;
        z10 = ((org.telegram.ui.ActionBar.f3) rp0Var).isFullscreen;
        if (z10) {
            f10 = 0.0f;
        } else {
            dp += rp0Var.C0.b;
            if (this.u0) {
                i14 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
                if (i14 + dp2 < rp0Var.C0.b) {
                    z11 = true;
                    int i18 = dp2 + rp0Var.C0.b;
                    i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
                    f10 = this.C0.e(z11);
                    dp2 = AndroidUtilities.lerp(i18, -i13, f10);
                }
            }
            z11 = false;
            int i182 = dp2 + rp0Var.C0.b;
            i13 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
            f10 = this.C0.e(z11);
            dp2 = AndroidUtilities.lerp(i182, -i13, f10);
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i17);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp2 > rp0Var.C0.b || frameLayout.getChildCount() <= 0) {
                i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i12 + dp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                gc gcVar = gc.w;
                if (gcVar != null) {
                    lb lbVar = gcVar.e;
                    if (lbVar != null) {
                        lbVar.setTop(true);
                    }
                    gcVar.b();
                }
            }
        }
        if (f10 < 1.0f) {
            int dp4 = AndroidUtilities.dp(36.0f);
            float measuredWidth = (getMeasuredWidth() - dp4) / 2;
            float f11 = dp;
            float measuredWidth2 = (getMeasuredWidth() + dp4) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp;
            RectF rectF = this.t0;
            rectF.set(measuredWidth, f11, measuredWidth2, dp5);
            org.telegram.ui.ActionBar.f6.t0.setColor(rp0Var.getThemedColor(org.telegram.ui.ActionBar.f6.Ii));
            org.telegram.ui.ActionBar.f6.t0.setAlpha((int) ((1.0f - f10) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.f6.t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            boolean z12 = this.B0 && ((float) 0) > ((float) rp0Var.C0.b) * 0.5f;
            if (z12 != ((systemUiVisibility & 8192) > 0)) {
                setSystemUiVisibility(z12 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
        canvas.restore();
        this.w0 = this.v0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.u0;
        rp0 rp0Var = this.D0;
        if (z10) {
            if (motionEvent.getAction() == 0 && rp0Var.l0 != 0 && motionEvent.getY() < rp0Var.l0 - AndroidUtilities.dp(30.0f)) {
                rp0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.v0 - AndroidUtilities.dp(30.0f)) {
            rp0Var.dismiss();
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
    @Override // org.telegram.ui.Components.xu0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        int R = R();
        rp0 rp0Var = this.D0;
        vo0 vo0Var = rp0Var.d;
        z11 = ((org.telegram.ui.ActionBar.f3) rp0Var).keyboardVisible;
        int max = (z11 || R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(rp0Var.C0.d, vo0Var.getEmojiPadding());
        setBottomClip(max);
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt = getChildAt(i19);
            if (childAt.getVisibility() != 8) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight3 = childAt.getMeasuredHeight();
                int i20 = layoutParams.gravity;
                if (i20 == -1) {
                    i20 = 51;
                }
                int i21 = i20 & 112;
                int i22 = i20 & 7;
                if (i22 == 1) {
                    i13 = (((i11 - i9) - measuredWidth) / 2) + layoutParams.leftMargin;
                    i14 = layoutParams.rightMargin;
                } else if (i22 != 5) {
                    i15 = getPaddingLeft() + layoutParams.leftMargin;
                    if (i21 == 16) {
                        if (i21 == 48) {
                            i18 = this.v0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i21 != 80) {
                            i18 = layoutParams.topMargin;
                        } else {
                            i16 = ((i12 - max) - i10) - measuredHeight3;
                            i17 = layoutParams.bottomMargin;
                        }
                        if (vo0Var != null && vo0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i18 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == rp0Var.n) {
                            i18 += rp0Var.C0.d;
                        }
                        childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                    } else {
                        i16 = ((((i12 - max) - (this.v0 + i10)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i17 = layoutParams.bottomMargin;
                    }
                    i18 = i16 - i17;
                    if (vo0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i18 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == rp0Var.n) {
                    }
                    childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
                } else {
                    i13 = (((i11 - i9) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i14 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingLeft;
                }
                i15 = i13 - i14;
                if (i21 == 16) {
                }
                i18 = i16 - i17;
                if (vo0Var != null) {
                }
                if (childAt == rp0Var.n) {
                }
                childAt.layout(i15, i18, measuredWidth + i15, measuredHeight3 + i18);
            }
        }
        S();
        rp0Var.Y0();
        rp0.r0(rp0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        int i13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        cp0 cp0Var = this;
        rp0 rp0Var = cp0Var.D0;
        so0 so0Var = rp0Var.C;
        FrameLayout frameLayout = rp0Var.Y;
        so0 so0Var2 = rp0Var.B;
        wk0 wk0Var = rp0Var.A;
        int size = cp0Var.getLayoutParams().height > 0 ? cp0Var.getLayoutParams().height : View.MeasureSpec.getSize(i10);
        int i17 = 0;
        rp0Var.D.G = cp0Var.getLayoutParams().height <= 0;
        rp0Var.F.G = cp0Var.getLayoutParams().height <= 0;
        z10 = ((org.telegram.ui.ActionBar.f3) rp0Var).isFullscreen;
        if (!z10) {
            cp0Var.s0 = true;
            i15 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingLeft;
            int i18 = rp0Var.C0.b;
            i16 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingLeft;
            cp0Var.setPadding(i15, i18, i16, 0);
            cp0Var.s0 = false;
        }
        int paddingTop = size - cp0Var.getPaddingTop();
        int D = org.telegram.messenger.l0.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(rp0Var.I.h(), rp0Var.G.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i11 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
        int i19 = i11 + D;
        if (wk0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.l0.D(103.0f, Math.max(2, (int) Math.ceil((rp0Var.H.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i14 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingTop;
            int i20 = i14 + D2;
            if (i20 > i19) {
                i19 = AndroidUtilities.lerp(i19, i20, wk0Var.getAlpha());
            }
        }
        int i21 = i19 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int dp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + rp0Var.C0.d;
        if (so0Var2.getPaddingTop() != i21 || so0Var2.getPaddingBottom() != dp) {
            cp0Var.s0 = true;
            so0Var2.setPadding(0, i21, 0, dp);
            wk0Var.setPadding(0, i21, 0, dp);
            cp0Var.s0 = false;
        }
        z11 = ((org.telegram.ui.ActionBar.f3) rp0Var).keyboardVisible;
        if (z11 && cp0Var.getLayoutParams().height <= 0 && so0Var.getPaddingTop() != i21) {
            cp0Var.s0 = true;
            so0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + rp0Var.C0.d);
            cp0Var.s0 = false;
        }
        boolean z13 = i19 >= size;
        cp0Var.u0 = z13;
        cp0Var.v0 = z13 ? 0 : size - i19;
        cp0Var.s0 = true;
        rp0Var.K0(false);
        cp0Var.s0 = false;
        cp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i9), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i9);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i12 = ((org.telegram.ui.ActionBar.f3) rp0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = rp0Var.r;
        vo0 vo0Var = rp0Var.d;
        int i22 = size2 - (i12 * 2);
        int R = cp0Var.R();
        rp0Var.J0 = R;
        if (!vo0Var.J && R <= AndroidUtilities.dp(20.0f) && !vo0Var.e && !vo0Var.K) {
            cp0Var.s0 = true;
            vo0Var.j();
            cp0Var.s0 = false;
        }
        cp0Var.s0 = true;
        if (rp0Var.J0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z12 = ((org.telegram.ui.ActionBar.f3) rp0Var).keyboardVisible;
                size3 -= z12 ? 0 : vo0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i23 = vo0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i23);
            }
            i13 = 8;
        } else {
            if (!vo0Var.m()) {
                vo0Var.j();
            }
            i13 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i24 = makeMeasureSpec;
        int i25 = size3;
        cp0Var.s0 = false;
        int childCount = cp0Var.getChildCount();
        while (i17 < childCount) {
            View childAt = cp0Var.getChildAt(i17);
            if (childAt != null && childAt.getVisibility() != i13) {
                if (!vo0Var.l(childAt)) {
                    cp0Var.measureChildWithMargins(childAt, i9, 0, i24, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), cp0Var.getPaddingTop() + (i25 - rp0Var.C0.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(cp0Var.getPaddingTop() + (i25 - rp0Var.C0.b), TLObject.FLAG_30));
                }
            }
            i17++;
            cp0Var = this;
        }
        rp0Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.D0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.s0) {
            return;
        }
        super.requestLayout();
    }
}
