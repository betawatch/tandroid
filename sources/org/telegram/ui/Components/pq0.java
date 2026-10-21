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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class pq0 extends lw0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final f6 G0;
    public final /* synthetic */ fr0 H0;
    public boolean w0;
    public final RectF x0;
    public boolean y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(fr0 fr0Var, Context context) {
        super(context, null);
        this.H0 = fr0Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.H = new oq0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.h5)) > 0.721f;
        this.G0 = new f6(this, 0L, 350L, bs.h);
    }

    @Override // org.telegram.ui.Components.lw0
    public final void L(Canvas canvas, ArrayList arrayList) {
        fr0 fr0Var = this.H0;
        hq0 hq0Var = fr0Var.H;
        jm0 jm0Var = fr0Var.F;
        hq0 hq0Var2 = fr0Var.G;
        if (hq0Var2.getVisibility() == 0 && hq0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(hq0Var2.getX(), hq0Var2.getY());
            hq0Var2.draw(canvas);
            canvas.restore();
        }
        if (jm0Var.getVisibility() == 0 && jm0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(jm0Var.getX(), jm0Var.getY());
            jm0Var.draw(canvas);
            canvas.restore();
        }
        if (hq0Var.getVisibility() != 0 || hq0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(hq0Var.getX(), hq0Var.getY());
        hq0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        fr0 fr0Var = this.H0;
        gh.d dVar = fr0Var.R0;
        gh.d dVar2 = fr0Var.Q0;
        if (Build.VERSION.SDK_INT >= 31 && fr0Var.P0 != null) {
            fr0.E0(fr0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                dVar2.j(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) fr0Var).containerView;
                dVar.j(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + fr0Var.u0, getMeasuredWidth(), getMeasuredHeight() + fr0Var.u0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view instanceof tz) {
            fr0 fr0Var = this.H0;
            if (fr0Var.W0 != null) {
                canvas.save();
                fr0Var.W0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(fr0Var.W0.j.k);
                fr0Var.W0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.Components.lw0
    public final org.telegram.ui.ActionBar.d6 getResourceProvider() {
        org.telegram.ui.ActionBar.d6 d6Var;
        d6Var = ((org.telegram.ui.ActionBar.f3) this.H0).resourcesProvider;
        return d6Var;
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.o1 o1Var = this.H;
        o1Var.b = this;
        o1Var.c();
    }

    @Override // org.telegram.ui.Components.lw0, android.view.ViewGroup, android.view.View
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
        fr0 fr0Var = this.H0;
        Drawable drawable = fr0Var.S;
        FrameLayout frameLayout = fr0Var.x;
        canvas.translate(0.0f, fr0Var.u0);
        int i17 = fr0Var.q0;
        i10 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i17 - i10) + this.z0;
        int i18 = fr0Var.q0;
        i11 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int dp2 = ((i18 - i11) - AndroidUtilities.dp(13.0f)) + this.z0;
        fr0Var.Y = dp2;
        int dp3 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int i19 = i12 + dp3;
        z10 = ((org.telegram.ui.ActionBar.f3) fr0Var).isFullscreen;
        if (z10) {
            f7 = 0.0f;
        } else {
            dp += fr0Var.H0.b;
            if (this.y0) {
                i16 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
                if (i16 + dp2 < fr0Var.H0.b) {
                    z11 = true;
                    int i20 = dp2 + fr0Var.H0.b;
                    i15 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z11);
                    dp2 = AndroidUtilities.lerp(i20, -i15, f7);
                }
            }
            z11 = false;
            int i202 = dp2 + fr0Var.H0.b;
            i15 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
            f7 = this.G0.e(z11);
            dp2 = AndroidUtilities.lerp(i202, -i15, f7);
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i19);
        drawable.draw(canvas);
        i13 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        float f10 = i13 + dp2 + fr0Var.u0;
        if (fr0Var.n != f10) {
            fr0Var.n = f10;
            fr0Var.b.invalidate();
        }
        if (frameLayout != null) {
            if (dp2 > fr0Var.H0.b || frameLayout.getChildCount() <= 0) {
                i14 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i14 + dp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
            } else {
                frameLayout.setTranslationY(0.0f);
                qc qcVar = qc.w;
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
            RectF rectF = this.x0;
            rectF.set(measuredWidth, f11, measuredWidth2, dp5);
            org.telegram.ui.ActionBar.h6.t0.setColor(fr0Var.getThemedColor(org.telegram.ui.ActionBar.h6.Ii));
            org.telegram.ui.ActionBar.h6.t0.setAlpha((int) ((1.0f - f7) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.h6.t0);
        }
        int systemUiVisibility = getSystemUiVisibility();
        boolean z12 = this.F0 && ((float) 0) > ((float) fr0Var.H0.b) * 0.5f;
        if (z12 != ((systemUiVisibility & 8192) > 0)) {
            setSystemUiVisibility(z12 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
        }
        canvas.restore();
        this.A0 = this.z0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10 = this.y0;
        fr0 fr0Var = this.H0;
        if (z10) {
            if (motionEvent.getAction() == 0 && fr0Var.q0 != 0 && motionEvent.getY() < fr0Var.q0 - AndroidUtilities.dp(30.0f)) {
                fr0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.z0 - AndroidUtilities.dp(30.0f)) {
            fr0Var.dismiss();
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
    @Override // org.telegram.ui.Components.lw0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        fr0 fr0Var = this.H0;
        jq0 jq0Var = fr0Var.d;
        z11 = ((org.telegram.ui.ActionBar.f3) fr0Var).keyboardVisible;
        int max = (z11 || R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(fr0Var.H0.d, jq0Var.getEmojiPadding());
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
                        if (jq0Var != null && jq0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == fr0Var.r) {
                            i19 += fr0Var.H0.d;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - max) - (this.z0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (jq0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == fr0Var.r) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (jq0Var != null) {
                }
                if (childAt == fr0Var.r) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
        fr0Var.a1();
        fr0.v0(fr0Var);
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
        pq0 pq0Var = this;
        fr0 fr0Var = pq0Var.H0;
        hq0 hq0Var = fr0Var.H;
        FrameLayout frameLayout = fr0Var.d0;
        hq0 hq0Var2 = fr0Var.G;
        jm0 jm0Var = fr0Var.F;
        int size = pq0Var.getLayoutParams().height > 0 ? pq0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i18 = 0;
        fr0Var.I.G = pq0Var.getLayoutParams().height <= 0;
        fr0Var.K.G = pq0Var.getLayoutParams().height <= 0;
        z10 = ((org.telegram.ui.ActionBar.f3) fr0Var).isFullscreen;
        if (!z10) {
            pq0Var.w0 = true;
            i16 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingLeft;
            int i19 = fr0Var.H0.b;
            i17 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingLeft;
            pq0Var.setPadding(i16, i19, i17, 0);
            pq0Var.w0 = false;
        }
        int paddingTop = size - pq0Var.getPaddingTop();
        int D = org.telegram.messenger.g0.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(fr0Var.N.h(), fr0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
        int i20 = i12 + D;
        if (jm0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.g0.D(103.0f, Math.max(2, (int) Math.ceil((fr0Var.M.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i15 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingTop;
            int i21 = i15 + D2;
            if (i21 > i20) {
                i20 = AndroidUtilities.lerp(i20, i21, jm0Var.getAlpha());
            }
        }
        int i22 = i20 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int dp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + fr0Var.H0.d;
        if (hq0Var2.getPaddingTop() != i22 || hq0Var2.getPaddingBottom() != dp) {
            pq0Var.w0 = true;
            hq0Var2.setPadding(0, i22, 0, dp);
            jm0Var.setPadding(0, i22, 0, dp);
            pq0Var.w0 = false;
        }
        z11 = ((org.telegram.ui.ActionBar.f3) fr0Var).keyboardVisible;
        if (z11 && pq0Var.getLayoutParams().height <= 0 && hq0Var.getPaddingTop() != i22) {
            pq0Var.w0 = true;
            hq0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + fr0Var.H0.d);
            pq0Var.w0 = false;
        }
        boolean z13 = i20 >= size;
        pq0Var.y0 = z13;
        pq0Var.z0 = z13 ? 0 : size - i20;
        pq0Var.w0 = true;
        fr0Var.M0(false);
        pq0Var.w0 = false;
        pq0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i13 = ((org.telegram.ui.ActionBar.f3) fr0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = fr0Var.s;
        jq0 jq0Var = fr0Var.d;
        int i23 = size2 - (i13 * 2);
        int R = pq0Var.R();
        fr0Var.O0 = R;
        if (!jq0Var.N && R <= AndroidUtilities.dp(20.0f) && !jq0Var.e && !jq0Var.O) {
            pq0Var.w0 = true;
            jq0Var.j();
            pq0Var.w0 = false;
        }
        pq0Var.w0 = true;
        if (fr0Var.O0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z12 = ((org.telegram.ui.ActionBar.f3) fr0Var).keyboardVisible;
                size3 -= z12 ? 0 : jq0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i24 = jq0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i24);
            }
            i14 = 8;
        } else {
            if (!jq0Var.m()) {
                jq0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i25 = makeMeasureSpec;
        int i26 = size3;
        pq0Var.w0 = false;
        int childCount = pq0Var.getChildCount();
        while (i18 < childCount) {
            View childAt = pq0Var.getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (!jq0Var.l(childAt)) {
                    pq0Var.measureChildWithMargins(childAt, i10, 0, i25, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), pq0Var.getPaddingTop() + (i26 - fr0Var.H0.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(pq0Var.getPaddingTop() + (i26 - fr0Var.H0.b), TLObject.FLAG_30));
                }
            }
            i18++;
            pq0Var = this;
        }
        fr0Var.a1();
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
