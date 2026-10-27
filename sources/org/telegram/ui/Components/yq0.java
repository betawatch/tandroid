package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yq0 extends ww0 {
    public boolean l0;
    public final RectF m0;
    public boolean n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public final h6 u0;
    public final /* synthetic */ nr0 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yq0(nr0 nr0Var, Context context) {
        super(context, null);
        this.v0 = nr0Var;
        this.l0 = false;
        this.m0 = new RectF();
        this.H = new xq0(this, this);
        AndroidUtilities.computePerceivedBrightness(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5));
        this.u0 = new h6(this, 0L, 350L, ds.h);
    }

    @Override // org.telegram.ui.Components.ww0
    public final void K(Canvas canvas, ArrayList arrayList) {
        nr0 nr0Var = this.v0;
        oq0 oq0Var = nr0Var.H;
        nm0 nm0Var = nr0Var.F;
        oq0 oq0Var2 = nr0Var.G;
        if (oq0Var2.getVisibility() == 0 && oq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(oq0Var2.getX(), oq0Var2.getY());
            oq0Var2.draw(canvas);
            canvas.restore();
        }
        if (nm0Var.getVisibility() == 0 && nm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(nm0Var.getX(), nm0Var.getY());
            nm0Var.draw(canvas);
            canvas.restore();
        }
        if (oq0Var.getVisibility() != 0 || oq0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(oq0Var.getX(), oq0Var.getY());
        oq0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        float paddingTop = getPaddingTop();
        nr0 nr0Var = this.v0;
        canvas.clipRect(0.0f, paddingTop + nr0Var.u0, getMeasuredWidth(), getMeasuredHeight() + nr0Var.u0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof sz) {
            nr0 nr0Var = this.v0;
            if (nr0Var.V0 != null) {
                canvas.save();
                nr0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(nr0Var.V0.x.k);
                nr0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.ww0
    public final org.telegram.ui.ActionBar.u6 getResourceProvider() {
        org.telegram.ui.ActionBar.u6 u6Var;
        u6Var = ((org.telegram.ui.ActionBar.k3) this.v0).resourcesProvider;
        return u6Var;
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.H;
        q1Var.b = this;
        q1Var.c();
    }

    @Override // org.telegram.ui.Components.ww0, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.H.d();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        float f7;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int i16;
        canvas.save();
        nr0 nr0Var = this.v0;
        Drawable drawable = nr0Var.S;
        FrameLayout frameLayout = nr0Var.x;
        canvas.translate(0.0f, nr0Var.u0);
        int i17 = nr0Var.q0;
        i10 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.o0;
        int i18 = nr0Var.q0;
        i11 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
        int dp2 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.o0;
        nr0Var.Y = dp2;
        int dp3 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
        int i19 = i12 + dp3;
        z10 = ((org.telegram.ui.ActionBar.k3) nr0Var).isFullscreen;
        if (z10) {
            f7 = 0.0f;
        } else {
            dp += nr0Var.H0.b;
            if (this.n0) {
                i16 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
                if (i16 + dp2 < nr0Var.H0.b) {
                    z11 = true;
                    int i20 = dp2 + nr0Var.H0.b;
                    i15 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
                    f7 = this.u0.e(z11);
                    dp2 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z11 = false;
            int i202 = dp2 + nr0Var.H0.b;
            i15 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
            f7 = this.u0.e(z11);
            dp2 = AndroidUtilities.lerp(i202, -i15, f7);
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        i13 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
        float f10 = i13 + dp2 + nr0Var.u0;
        if (nr0Var.n != f10) {
            nr0Var.n = f10;
            nr0Var.b.invalidate();
        }
        if (frameLayout != null) {
            if (dp2 > nr0Var.H0.b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.x;
                if (qcVar != null) {
                    ub ubVar = qcVar.e;
                    if (ubVar != null) {
                        ubVar.setTop(true);
                    }
                    qcVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            int dp4 = AndroidUtilities.dp(36.0f);
            float measuredWidth = (getMeasuredWidth() - dp4) / 2;
            float f11 = dp;
            float measuredWidth2 = (getMeasuredWidth() + dp4) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp;
            RectF rectF = this.m0;
            rectF.set(measuredWidth, f11, measuredWidth2, dp5);
            org.telegram.ui.ActionBar.y6.t0.setColor(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.Ii));
            org.telegram.ui.ActionBar.y6.t0.setAlpha((int) ((1.0f - f7) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.y6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z12 = AndroidUtilities.computePerceivedBrightness(nr0Var.getThemedColor(org.telegram.ui.ActionBar.y6.h5)) > 0.721f && ((float) 0) > ((float) nr0Var.H0.b) * 0.5f;
        if (z12 != ((systemUiVisibility & 8192) > 0)) {
            setSystemUiVisibility(z12 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.p0 = this.o0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.n0;
        nr0 nr0Var = this.v0;
        if (z10) {
            if (motionEvent.getAction() == 0 && nr0Var.q0 != 0 && motionEvent.getY() < nr0Var.q0 - AndroidUtilities.dp(30.0f)) {
                nr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.o0 - AndroidUtilities.dp(30.0f)) {
            nr0Var.dismiss();
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
    @Override // org.telegram.ui.Components.ww0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        int Q = Q();
        nr0 nr0Var = this.v0;
        sq0 sq0Var = nr0Var.d;
        z11 = ((org.telegram.ui.ActionBar.k3) nr0Var).keyboardVisible;
        int max = (z11 || Q > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(nr0Var.H0.d, sq0Var.getEmojiPadding());
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
                            i19 = this.o0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (sq0Var != null && sq0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight() + Q;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == nr0Var.r) {
                            i19 += nr0Var.H0.d;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - max) - (this.o0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (sq0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == nr0Var.r) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (sq0Var != null) {
                }
                if (childAt == nr0Var.r) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        R();
        nr0Var.b1();
        nr0.r0(nr0Var);
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
        yq0 yq0Var = this;
        nr0 nr0Var = yq0Var.v0;
        oq0 oq0Var = nr0Var.H;
        FrameLayout frameLayout = nr0Var.d0;
        oq0 oq0Var2 = nr0Var.G;
        nm0 nm0Var = nr0Var.F;
        int size = yq0Var.getLayoutParams().height > 0 ? yq0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i18 = 0;
        nr0Var.I.G = yq0Var.getLayoutParams().height <= 0;
        nr0Var.K.G = yq0Var.getLayoutParams().height <= 0;
        z10 = ((org.telegram.ui.ActionBar.k3) nr0Var).isFullscreen;
        if (!z10) {
            yq0Var.l0 = true;
            i16 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingLeft;
            int i19 = nr0Var.H0.b;
            i17 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingLeft;
            yq0Var.setPadding(i16, i19, i17, 0);
            yq0Var.l0 = false;
        }
        int paddingTop = size - yq0Var.getPaddingTop();
        int b10 = org.telegram.messenger.wh.b(103.0f, Math.max(2, (int) Math.ceil(Math.max(nr0Var.N.h(), nr0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
        int i20 = i12 + b10;
        if (nm0Var.getVisibility() != 8) {
            int b11 = org.telegram.messenger.wh.b(103.0f, Math.max(2, (int) Math.ceil((nr0Var.M.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i15 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingTop;
            int i21 = i15 + b11;
            if (i21 > i20) {
                i20 = AndroidUtilities.lerp(i20, i21, nm0Var.getAlpha());
            }
        }
        int i22 = i20 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int dp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + nr0Var.H0.d;
        if (oq0Var2.getPaddingTop() != i22 || oq0Var2.getPaddingBottom() != dp) {
            yq0Var.l0 = true;
            oq0Var2.setPadding(0, i22, 0, dp);
            nm0Var.setPadding(0, i22, 0, dp);
            yq0Var.l0 = false;
        }
        z11 = ((org.telegram.ui.ActionBar.k3) nr0Var).keyboardVisible;
        if (z11 && yq0Var.getLayoutParams().height <= 0 && oq0Var.getPaddingTop() != i22) {
            yq0Var.l0 = true;
            oq0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + nr0Var.H0.d);
            yq0Var.l0 = false;
        }
        boolean z13 = i20 >= size;
        yq0Var.n0 = z13;
        yq0Var.o0 = z13 ? 0 : size - i20;
        yq0Var.l0 = true;
        nr0Var.M0(false);
        yq0Var.l0 = false;
        yq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i13 = ((org.telegram.ui.ActionBar.k3) nr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = nr0Var.s;
        sq0 sq0Var = nr0Var.d;
        int i23 = size2 - (i13 * 2);
        int Q = yq0Var.Q();
        nr0Var.O0 = Q;
        if (!sq0Var.N && Q <= AndroidUtilities.dp(20.0f) && !sq0Var.e && !sq0Var.O) {
            yq0Var.l0 = true;
            sq0Var.j();
            yq0Var.l0 = false;
        }
        yq0Var.l0 = true;
        if (nr0Var.O0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z12 = ((org.telegram.ui.ActionBar.k3) nr0Var).keyboardVisible;
                size3 -= z12 ? 0 : sq0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i24 = sq0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i24);
            }
            i14 = 8;
        } else {
            if (!sq0Var.m()) {
                sq0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i25 = makeMeasureSpec;
        int i26 = size3;
        yq0Var.l0 = false;
        int childCount = yq0Var.getChildCount();
        while (i18 < childCount) {
            View childAt = yq0Var.getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (!sq0Var.l(childAt)) {
                    yq0Var.measureChildWithMargins(childAt, i10, 0, i25, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), yq0Var.getPaddingTop() + (i26 - nr0Var.H0.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(yq0Var.getPaddingTop() + (i26 - nr0Var.H0.b), TLObject.FLAG_30));
                }
            }
            i18++;
            yq0Var = this;
        }
        nr0Var.b1();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.v0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.l0) {
            return;
        }
        super.requestLayout();
    }
}
