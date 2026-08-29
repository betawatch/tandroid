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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class np0 extends hv0 {
    public int A0;
    public final boolean B0;
    public final d6 C0;
    public final /* synthetic */ dq0 D0;
    public boolean s0;
    public final RectF t0;
    public boolean u0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np0(dq0 dq0Var, Context context) {
        super(context, null);
        this.D0 = dq0Var;
        this.s0 = false;
        this.t0 = new RectF();
        this.D = new mp0(this, this);
        this.B0 = AndroidUtilities.computePerceivedBrightness(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.h5)) > 0.721f;
        this.C0 = new d6(this, 0L, 350L, jr.h);
    }

    @Override // org.telegram.ui.Components.hv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        dq0 dq0Var = this.D0;
        dp0 dp0Var = dq0Var.C;
        jl0 jl0Var = dq0Var.A;
        dp0 dp0Var2 = dq0Var.B;
        if (dp0Var2.getVisibility() == 0 && dp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(dp0Var2.getX(), dp0Var2.getY());
            dp0Var2.draw(canvas);
            canvas.restore();
        }
        if (jl0Var.getVisibility() == 0 && jl0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(jl0Var.getX(), jl0Var.getY());
            jl0Var.draw(canvas);
            canvas.restore();
        }
        if (dp0Var.getVisibility() != 0 || dp0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(dp0Var.getX(), dp0Var.getY());
        dp0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        dq0 dq0Var = this.D0;
        qg.d dVar = dq0Var.M0;
        qg.d dVar2 = dq0Var.L0;
        if (Build.VERSION.SDK_INT >= 31 && dq0Var.K0 != null) {
            dq0.A0(dq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                dVar2.h(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.j();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) dq0Var).containerView;
                dVar.h(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.j();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + dq0Var.p0, getMeasuredWidth(), getMeasuredHeight() + dq0Var.p0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof fz) {
            dq0 dq0Var = this.D0;
            if (dq0Var.R0 != null) {
                canvas.save();
                dq0Var.R0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(dq0Var.R0.h.k);
                dq0Var.R0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.hv0
    public final org.telegram.ui.ActionBar.c6 getResourceProvider() {
        org.telegram.ui.ActionBar.c6 c6Var;
        c6Var = ((org.telegram.ui.ActionBar.f3) this.D0).resourcesProvider;
        return c6Var;
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.D;
        q1Var.b = this;
        q1Var.c();
    }

    @Override // org.telegram.ui.Components.hv0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.D.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f9;
        int i13;
        boolean z11;
        int i14;
        int i15;
        canvas.save();
        dq0 dq0Var = this.D0;
        Drawable drawable = dq0Var.N;
        FrameLayout frameLayout = dq0Var.w;
        canvas.translate(0.0f, dq0Var.p0);
        int i16 = dq0Var.l0;
        i10 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i16 - i10) + this.v0;
        int i17 = dq0Var.l0;
        i11 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int dp2 = ((i17 - i11) - AndroidUtilities.dp(13.0f)) + this.v0;
        dq0Var.T = dp2;
        int dp3 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int i18 = i12 + dp3;
        z10 = ((org.telegram.ui.ActionBar.f3) dq0Var).isFullscreen;
        if (z10) {
            f9 = 0.0f;
        } else {
            dp += dq0Var.C0.b;
            if (this.u0) {
                i15 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
                if (i15 + dp2 < dq0Var.C0.b) {
                    z11 = true;
                    int i19 = dp2 + dq0Var.C0.b;
                    i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
                    f9 = this.C0.e(z11);
                    dp2 = AndroidUtilities.lerp(i19, -i14, f9);
                }
            }
            z11 = false;
            int i192 = dp2 + dq0Var.C0.b;
            i14 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
            f9 = this.C0.e(z11);
            dp2 = AndroidUtilities.lerp(i192, -i14, f9);
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i18);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp2 > dq0Var.C0.b || frameLayout.getChildCount() <= 0) {
                i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i13 + dp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                mc mcVar = mc.w;
                if (mcVar != null) {
                    rb rbVar = mcVar.e;
                    if (rbVar != null) {
                        rbVar.setTop(true);
                    }
                    mcVar.b();
                }
            }
        }
        if (f9 < 1.0f) {
            int dp4 = AndroidUtilities.dp(36.0f);
            float measuredWidth = (getMeasuredWidth() - dp4) / 2;
            float f10 = dp;
            float measuredWidth2 = (getMeasuredWidth() + dp4) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp;
            RectF rectF = this.t0;
            rectF.set(measuredWidth, f10, measuredWidth2, dp5);
            org.telegram.ui.ActionBar.g6.t0.setColor(dq0Var.getThemedColor(org.telegram.ui.ActionBar.g6.Ii));
            org.telegram.ui.ActionBar.g6.t0.setAlpha((int) ((1.0f - f9) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.g6.t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            boolean z12 = this.B0 && ((float) 0) > ((float) dq0Var.C0.b) * 0.5f;
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
        dq0 dq0Var = this.D0;
        if (z10) {
            if (motionEvent.getAction() == 0 && dq0Var.l0 != 0 && motionEvent.getY() < dq0Var.l0 - AndroidUtilities.dp(30.0f)) {
                dq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.v0 - AndroidUtilities.dp(30.0f)) {
            dq0Var.dismiss();
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
    @Override // org.telegram.ui.Components.hv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
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
        dq0 dq0Var = this.D0;
        gp0 gp0Var = dq0Var.d;
        z11 = ((org.telegram.ui.ActionBar.f3) dq0Var).keyboardVisible;
        int max = (z11 || R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(dq0Var.C0.d, gp0Var.getEmojiPadding());
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
                            i19 = this.v0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (gp0Var != null && gp0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == dq0Var.n) {
                            i19 += dq0Var.C0.d;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - max) - (this.v0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (gp0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == dq0Var.n) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (gp0Var != null) {
                }
                if (childAt == dq0Var.n) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
        dq0Var.Y0();
        dq0.s0(dq0Var);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        np0 np0Var = this;
        dq0 dq0Var = np0Var.D0;
        dp0 dp0Var = dq0Var.C;
        FrameLayout frameLayout = dq0Var.Y;
        dp0 dp0Var2 = dq0Var.B;
        jl0 jl0Var = dq0Var.A;
        int size = np0Var.getLayoutParams().height > 0 ? np0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i18 = 0;
        dq0Var.D.G = np0Var.getLayoutParams().height <= 0;
        dq0Var.F.G = np0Var.getLayoutParams().height <= 0;
        z10 = ((org.telegram.ui.ActionBar.f3) dq0Var).isFullscreen;
        if (!z10) {
            np0Var.s0 = true;
            i16 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingLeft;
            int i19 = dq0Var.C0.b;
            i17 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingLeft;
            np0Var.setPadding(i16, i19, i17, 0);
            np0Var.s0 = false;
        }
        int paddingTop = size - np0Var.getPaddingTop();
        int D = org.telegram.messenger.x3.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(dq0Var.I.h(), dq0Var.G.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
        int i20 = i12 + D;
        if (jl0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.x3.D(103.0f, Math.max(2, (int) Math.ceil((dq0Var.H.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i15 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingTop;
            int i21 = i15 + D2;
            if (i21 > i20) {
                i20 = AndroidUtilities.lerp(i20, i21, jl0Var.getAlpha());
            }
        }
        int i22 = i20 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int dp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + dq0Var.C0.d;
        if (dp0Var2.getPaddingTop() != i22 || dp0Var2.getPaddingBottom() != dp) {
            np0Var.s0 = true;
            dp0Var2.setPadding(0, i22, 0, dp);
            jl0Var.setPadding(0, i22, 0, dp);
            np0Var.s0 = false;
        }
        z11 = ((org.telegram.ui.ActionBar.f3) dq0Var).keyboardVisible;
        if (z11 && np0Var.getLayoutParams().height <= 0 && dp0Var.getPaddingTop() != i22) {
            np0Var.s0 = true;
            dp0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + dq0Var.C0.d);
            np0Var.s0 = false;
        }
        boolean z13 = i20 >= size;
        np0Var.u0 = z13;
        np0Var.v0 = z13 ? 0 : size - i20;
        np0Var.s0 = true;
        dq0Var.K0(false);
        np0Var.s0 = false;
        np0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i13 = ((org.telegram.ui.ActionBar.f3) dq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = dq0Var.r;
        gp0 gp0Var = dq0Var.d;
        int i23 = size2 - (i13 * 2);
        int R = np0Var.R();
        dq0Var.J0 = R;
        if (!gp0Var.J && R <= AndroidUtilities.dp(20.0f) && !gp0Var.e && !gp0Var.K) {
            np0Var.s0 = true;
            gp0Var.j();
            np0Var.s0 = false;
        }
        np0Var.s0 = true;
        if (dq0Var.J0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z12 = ((org.telegram.ui.ActionBar.f3) dq0Var).keyboardVisible;
                size3 -= z12 ? 0 : gp0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i24 = gp0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i24);
            }
            i14 = 8;
        } else {
            if (!gp0Var.m()) {
                gp0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i25 = makeMeasureSpec;
        int i26 = size3;
        np0Var.s0 = false;
        int childCount = np0Var.getChildCount();
        while (i18 < childCount) {
            View childAt = np0Var.getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (!gp0Var.l(childAt)) {
                    np0Var.measureChildWithMargins(childAt, i10, 0, i25, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), np0Var.getPaddingTop() + (i26 - dq0Var.C0.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(np0Var.getPaddingTop() + (i26 - dq0Var.C0.b), TLObject.FLAG_30));
                }
            }
            i18++;
            np0Var = this;
        }
        dq0Var.Y0();
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
