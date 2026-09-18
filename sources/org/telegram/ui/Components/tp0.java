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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class tp0 extends qv0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final c6 G0;
    public final /* synthetic */ iq0 H0;
    public boolean w0;
    public final RectF x0;
    public boolean y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp0(iq0 iq0Var, Context context) {
        super(context, null);
        this.H0 = iq0Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.H = new sp0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
        this.G0 = new c6(this, 0L, 350L, qr.h);
    }

    @Override // org.telegram.ui.Components.qv0
    public final void L(Canvas canvas, ArrayList arrayList) {
        iq0 iq0Var = this.H0;
        kp0 kp0Var = iq0Var.G;
        ml0 ml0Var = iq0Var.E;
        kp0 kp0Var2 = iq0Var.F;
        if (kp0Var2.getVisibility() == 0 && kp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(kp0Var2.getX(), kp0Var2.getY());
            kp0Var2.draw(canvas);
            canvas.restore();
        }
        if (ml0Var.getVisibility() == 0 && ml0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ml0Var.getX(), ml0Var.getY());
            ml0Var.draw(canvas);
            canvas.restore();
        }
        if (kp0Var.getVisibility() != 0 || kp0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(kp0Var.getX(), kp0Var.getY());
        kp0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        iq0 iq0Var = this.H0;
        fh.d dVar = iq0Var.Q0;
        fh.d dVar2 = iq0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && iq0Var.O0 != null) {
            iq0.A0(iq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.k();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.g3) iq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.k();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + iq0Var.t0, getMeasuredWidth(), getMeasuredHeight() + iq0Var.t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof kz) {
            iq0 iq0Var = this.H0;
            if (iq0Var.V0 != null) {
                canvas.save();
                iq0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(iq0Var.V0.j.k);
                iq0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.qv0
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        f6Var = ((org.telegram.ui.ActionBar.g3) this.H0).resourcesProvider;
        return f6Var;
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.q1 q1Var = this.H;
        q1Var.b = this;
        q1Var.c();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
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
        boolean z11;
        int i14;
        int i15;
        canvas.save();
        iq0 iq0Var = this.H0;
        Drawable drawable = iq0Var.R;
        FrameLayout frameLayout = iq0Var.w;
        canvas.translate(0.0f, iq0Var.t0);
        int i16 = iq0Var.p0;
        i10 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i16 - i10) + this.z0;
        int i17 = iq0Var.p0;
        i11 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int dp2 = ((i17 - i11) - AndroidUtilities.dp(13.0f)) + this.z0;
        iq0Var.X = dp2;
        int dp3 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int i18 = i12 + dp3;
        z10 = ((org.telegram.ui.ActionBar.g3) iq0Var).isFullscreen;
        if (z10) {
            f7 = 0.0f;
        } else {
            dp += iq0Var.G0.b;
            if (this.y0) {
                i15 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
                if (i15 + dp2 < iq0Var.G0.b) {
                    z11 = true;
                    int i19 = dp2 + iq0Var.G0.b;
                    i14 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z11);
                    dp2 = AndroidUtilities.lerp(i19, -i14, f7);
                }
            }
            z11 = false;
            int i192 = dp2 + iq0Var.G0.b;
            i14 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z11);
            dp2 = AndroidUtilities.lerp(i192, -i14, f7);
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i18);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp2 > iq0Var.G0.b || frameLayout.getChildCount() <= 0) {
                i13 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i13 + dp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                oc ocVar = oc.w;
                if (ocVar != null) {
                    sb sbVar = ocVar.e;
                    if (sbVar != null) {
                        sbVar.setTop(true);
                    }
                    ocVar.b();
                }
            }
        }
        if (f7 < 1.0f) {
            int dp4 = AndroidUtilities.dp(36.0f);
            float measuredWidth = (getMeasuredWidth() - dp4) / 2;
            float f10 = dp;
            float measuredWidth2 = (getMeasuredWidth() + dp4) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp;
            RectF rectF = this.x0;
            rectF.set(measuredWidth, f10, measuredWidth2, dp5);
            org.telegram.ui.ActionBar.j6.t0.setColor(iq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) ((1.0f - f7) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            boolean z12 = this.F0 && ((float) 0) > ((float) iq0Var.G0.b) * 0.5f;
            if (z12 != ((systemUiVisibility & 8192) > 0)) {
                setSystemUiVisibility(z12 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
        canvas.restore();
        this.A0 = this.z0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.y0;
        iq0 iq0Var = this.H0;
        if (z10) {
            if (motionEvent.getAction() == 0 && iq0Var.p0 != 0 && motionEvent.getY() < iq0Var.p0 - AndroidUtilities.dp(30.0f)) {
                iq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.z0 - AndroidUtilities.dp(30.0f)) {
            iq0Var.dismiss();
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
    @Override // org.telegram.ui.Components.qv0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        iq0 iq0Var = this.H0;
        np0 np0Var = iq0Var.d;
        z11 = ((org.telegram.ui.ActionBar.g3) iq0Var).keyboardVisible;
        int max = (z11 || R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(iq0Var.G0.d, np0Var.getEmojiPadding());
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
                            i19 = this.z0 + getPaddingTop() + layoutParams.topMargin;
                        } else if (i22 != 80) {
                            i19 = layoutParams.topMargin;
                        } else {
                            i17 = ((i13 - max) - i11) - measuredHeight3;
                            i18 = layoutParams.bottomMargin;
                        }
                        if (np0Var != null && np0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == iq0Var.n) {
                            i19 += iq0Var.G0.d;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - max) - (this.z0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (np0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == iq0Var.n) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (np0Var != null) {
                }
                if (childAt == iq0Var.n) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
        iq0Var.Y0();
        iq0.s0(iq0Var);
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
        tp0 tp0Var = this;
        iq0 iq0Var = tp0Var.H0;
        kp0 kp0Var = iq0Var.G;
        FrameLayout frameLayout = iq0Var.c0;
        kp0 kp0Var2 = iq0Var.F;
        ml0 ml0Var = iq0Var.E;
        int size = tp0Var.getLayoutParams().height > 0 ? tp0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i18 = 0;
        iq0Var.H.G = tp0Var.getLayoutParams().height <= 0;
        iq0Var.J.G = tp0Var.getLayoutParams().height <= 0;
        z10 = ((org.telegram.ui.ActionBar.g3) iq0Var).isFullscreen;
        if (!z10) {
            tp0Var.w0 = true;
            i16 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingLeft;
            int i19 = iq0Var.G0.b;
            i17 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingLeft;
            tp0Var.setPadding(i16, i19, i17, 0);
            tp0Var.w0 = false;
        }
        int paddingTop = size - tp0Var.getPaddingTop();
        int D = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(iq0Var.M.h(), iq0Var.K.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
        int i20 = i12 + D;
        if (ml0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil((iq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i15 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingTop;
            int i21 = i15 + D2;
            if (i21 > i20) {
                i20 = AndroidUtilities.lerp(i20, i21, ml0Var.getAlpha());
            }
        }
        int i22 = i20 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int dp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + iq0Var.G0.d;
        if (kp0Var2.getPaddingTop() != i22 || kp0Var2.getPaddingBottom() != dp) {
            tp0Var.w0 = true;
            kp0Var2.setPadding(0, i22, 0, dp);
            ml0Var.setPadding(0, i22, 0, dp);
            tp0Var.w0 = false;
        }
        z11 = ((org.telegram.ui.ActionBar.g3) iq0Var).keyboardVisible;
        if (z11 && tp0Var.getLayoutParams().height <= 0 && kp0Var.getPaddingTop() != i22) {
            tp0Var.w0 = true;
            kp0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + iq0Var.G0.d);
            tp0Var.w0 = false;
        }
        boolean z13 = i20 >= size;
        tp0Var.y0 = z13;
        tp0Var.z0 = z13 ? 0 : size - i20;
        tp0Var.w0 = true;
        iq0Var.K0(false);
        tp0Var.w0 = false;
        tp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i13 = ((org.telegram.ui.ActionBar.g3) iq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = iq0Var.r;
        np0 np0Var = iq0Var.d;
        int i23 = size2 - (i13 * 2);
        int R = tp0Var.R();
        iq0Var.N0 = R;
        if (!np0Var.N && R <= AndroidUtilities.dp(20.0f) && !np0Var.e && !np0Var.O) {
            tp0Var.w0 = true;
            np0Var.j();
            tp0Var.w0 = false;
        }
        tp0Var.w0 = true;
        if (iq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z12 = ((org.telegram.ui.ActionBar.g3) iq0Var).keyboardVisible;
                size3 -= z12 ? 0 : np0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i24 = np0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i24);
            }
            i14 = 8;
        } else {
            if (!np0Var.m()) {
                np0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i25 = makeMeasureSpec;
        int i26 = size3;
        tp0Var.w0 = false;
        int childCount = tp0Var.getChildCount();
        while (i18 < childCount) {
            View childAt = tp0Var.getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (!np0Var.l(childAt)) {
                    tp0Var.measureChildWithMargins(childAt, i10, 0, i25, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), tp0Var.getPaddingTop() + (i26 - iq0Var.G0.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(tp0Var.getPaddingTop() + (i26 - iq0Var.G0.b), TLObject.FLAG_30));
                }
            }
            i18++;
            tp0Var = this;
        }
        iq0Var.Y0();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return !this.H0.isDismissed() && super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.w0) {
            return;
        }
        super.requestLayout();
    }
}
