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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sp0 extends ov0 {
    public int A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public final boolean F0;
    public final e6 G0;
    public final /* synthetic */ hq0 H0;
    public boolean w0;
    public final RectF x0;
    public boolean y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(hq0 hq0Var, Context context) {
        super(context, null);
        this.H0 = hq0Var;
        this.w0 = false;
        this.x0 = new RectF();
        this.H = new rp0(this, this);
        this.F0 = AndroidUtilities.computePerceivedBrightness(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.h5)) > 0.721f;
        this.G0 = new e6(this, 0L, 350L, pr.h);
    }

    @Override // org.telegram.ui.Components.ov0
    public final void L(Canvas canvas, ArrayList arrayList) {
        hq0 hq0Var = this.H0;
        jp0 jp0Var = hq0Var.G;
        ll0 ll0Var = hq0Var.E;
        jp0 jp0Var2 = hq0Var.F;
        if (jp0Var2.getVisibility() == 0 && jp0Var2.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(jp0Var2.getX(), jp0Var2.getY());
            jp0Var2.draw(canvas);
            canvas.restore();
        }
        if (ll0Var.getVisibility() == 0 && ll0Var.getAlpha() >= 0.0f) {
            canvas.save();
            canvas.translate(ll0Var.getX(), ll0Var.getY());
            ll0Var.draw(canvas);
            canvas.restore();
        }
        if (jp0Var.getVisibility() != 0 || jp0Var.getAlpha() < 0.0f) {
            return;
        }
        canvas.save();
        canvas.translate(jp0Var.getX(), jp0Var.getY());
        jp0Var.draw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        ViewGroup viewGroup4;
        hq0 hq0Var = this.H0;
        gh.d dVar = hq0Var.Q0;
        gh.d dVar2 = hq0Var.P0;
        if (Build.VERSION.SDK_INT >= 31 && hq0Var.O0 != null) {
            hq0.A0(hq0Var);
            if (dVar2 != null) {
                viewGroup3 = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                int measuredWidth = viewGroup3.getMeasuredWidth();
                viewGroup4 = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                dVar2.i(measuredWidth, viewGroup4.getMeasuredHeight());
                dVar2.l();
            }
            if (dVar != null) {
                viewGroup = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                int measuredWidth2 = viewGroup.getMeasuredWidth();
                viewGroup2 = ((org.telegram.ui.ActionBar.f3) hq0Var).containerView;
                dVar.i(measuredWidth2, viewGroup2.getMeasuredHeight());
                dVar.l();
            }
        }
        canvas.save();
        canvas.clipRect(0.0f, getPaddingTop() + hq0Var.t0, getMeasuredWidth(), getMeasuredHeight() + hq0Var.t0 + AndroidUtilities.dp(50.0f));
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof kz) {
            hq0 hq0Var = this.H0;
            if (hq0Var.V0 != null) {
                canvas.save();
                hq0Var.V0.setBounds(0, view.getTop(), getMeasuredWidth(), getMeasuredHeight());
                canvas.clipPath(hq0Var.V0.h.k);
                hq0Var.V0.draw(canvas);
                boolean drawChild = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild;
            }
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // org.telegram.ui.Components.ov0
    public final org.telegram.ui.ActionBar.f6 getResourceProvider() {
        org.telegram.ui.ActionBar.f6 f6Var;
        f6Var = ((org.telegram.ui.ActionBar.f3) this.H0).resourcesProvider;
        return f6Var;
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.ui.ActionBar.p1 p1Var = this.H;
        p1Var.b = this;
        p1Var.c();
    }

    @Override // org.telegram.ui.Components.ov0, android.view.ViewGroup, android.view.View
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
        hq0 hq0Var = this.H0;
        Drawable drawable = hq0Var.R;
        FrameLayout frameLayout = hq0Var.w;
        canvas.translate(0.0f, hq0Var.t0);
        int i16 = hq0Var.p0;
        i10 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int dp = AndroidUtilities.dp(6.0f) + (i16 - i10) + this.z0;
        int i17 = hq0Var.p0;
        i11 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int dp2 = ((i17 - i11) - AndroidUtilities.dp(13.0f)) + this.z0;
        hq0Var.X = dp2;
        int dp3 = AndroidUtilities.dp(60.0f) + getMeasuredHeight();
        i12 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int i18 = i12 + dp3;
        z10 = ((org.telegram.ui.ActionBar.f3) hq0Var).isFullscreen;
        if (z10) {
            f7 = 0.0f;
        } else {
            dp += hq0Var.G0.b;
            if (this.y0) {
                i15 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
                if (i15 + dp2 < hq0Var.G0.b) {
                    z11 = true;
                    int i19 = dp2 + hq0Var.G0.b;
                    i14 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
                    f7 = this.G0.e(z11);
                    dp2 = AndroidUtilities.lerp(i19, -i14, f7);
                }
            }
            z11 = false;
            int i192 = dp2 + hq0Var.G0.b;
            i14 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
            f7 = this.G0.e(z11);
            dp2 = AndroidUtilities.lerp(i192, -i14, f7);
        }
        drawable.setBounds(0, dp2, getMeasuredWidth(), i18);
        drawable.draw(canvas);
        if (frameLayout != null) {
            if (dp2 > hq0Var.G0.b || frameLayout.getChildCount() <= 0) {
                i13 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
                frameLayout.setTranslationY(Math.max(0, ((i13 + dp2) - frameLayout.getTop()) - frameLayout.getMeasuredHeight()));
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
            float f10 = dp;
            float measuredWidth2 = (getMeasuredWidth() + dp4) / 2;
            float dp5 = AndroidUtilities.dp(4.0f) + dp;
            RectF rectF = this.x0;
            rectF.set(measuredWidth, f10, measuredWidth2, dp5);
            org.telegram.ui.ActionBar.j6.t0.setColor(hq0Var.getThemedColor(org.telegram.ui.ActionBar.j6.Ii));
            org.telegram.ui.ActionBar.j6.t0.setAlpha((int) ((1.0f - f7) * r2.getAlpha()));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), org.telegram.ui.ActionBar.j6.t0);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            int systemUiVisibility = getSystemUiVisibility();
            boolean z12 = this.F0 && ((float) 0) > ((float) hq0Var.G0.b) * 0.5f;
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
        hq0 hq0Var = this.H0;
        if (z10) {
            if (motionEvent.getAction() == 0 && hq0Var.p0 != 0 && motionEvent.getY() < hq0Var.p0 - AndroidUtilities.dp(30.0f)) {
                hq0Var.dismiss();
                return true;
            }
        } else if (motionEvent.getAction() == 0 && motionEvent.getY() < this.z0 - AndroidUtilities.dp(30.0f)) {
            hq0Var.dismiss();
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
    @Override // org.telegram.ui.Components.ov0, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
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
        hq0 hq0Var = this.H0;
        mp0 mp0Var = hq0Var.d;
        z11 = ((org.telegram.ui.ActionBar.f3) hq0Var).keyboardVisible;
        int max = (z11 || R > AndroidUtilities.dp(20.0f) || AndroidUtilities.isInMultiwindow) ? 0 : Math.max(hq0Var.G0.d, mp0Var.getEmojiPadding());
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
                        if (mp0Var != null && mp0Var.l(childAt)) {
                            if (AndroidUtilities.isTablet()) {
                                measuredHeight = getMeasuredHeight() + R;
                                measuredHeight2 = childAt.getMeasuredHeight();
                            } else {
                                measuredHeight = getMeasuredHeight();
                                measuredHeight2 = childAt.getMeasuredHeight();
                            }
                            i19 = measuredHeight - measuredHeight2;
                        }
                        if (childAt == hq0Var.n) {
                            i19 += hq0Var.G0.d;
                        }
                        childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                    } else {
                        i17 = ((((i13 - max) - (this.z0 + i11)) - measuredHeight3) / 2) + layoutParams.topMargin;
                        i18 = layoutParams.bottomMargin;
                    }
                    i19 = i17 - i18;
                    if (mp0Var != null) {
                        if (AndroidUtilities.isTablet()) {
                        }
                        i19 = measuredHeight - measuredHeight2;
                    }
                    if (childAt == hq0Var.n) {
                    }
                    childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
                } else {
                    i14 = (((i12 - i10) - measuredWidth) - layoutParams.rightMargin) - getPaddingRight();
                    i15 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingLeft;
                }
                i16 = i14 - i15;
                if (i22 == 16) {
                }
                i19 = i17 - i18;
                if (mp0Var != null) {
                }
                if (childAt == hq0Var.n) {
                }
                childAt.layout(i16, i19, measuredWidth + i16, measuredHeight3 + i19);
            }
        }
        S();
        hq0Var.Y0();
        hq0.s0(hq0Var);
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
        sp0 sp0Var = this;
        hq0 hq0Var = sp0Var.H0;
        jp0 jp0Var = hq0Var.G;
        FrameLayout frameLayout = hq0Var.c0;
        jp0 jp0Var2 = hq0Var.F;
        ll0 ll0Var = hq0Var.E;
        int size = sp0Var.getLayoutParams().height > 0 ? sp0Var.getLayoutParams().height : View.MeasureSpec.getSize(i11);
        int i18 = 0;
        hq0Var.H.G = sp0Var.getLayoutParams().height <= 0;
        hq0Var.J.G = sp0Var.getLayoutParams().height <= 0;
        z10 = ((org.telegram.ui.ActionBar.f3) hq0Var).isFullscreen;
        if (!z10) {
            sp0Var.w0 = true;
            i16 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingLeft;
            int i19 = hq0Var.G0.b;
            i17 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingLeft;
            sp0Var.setPadding(i16, i19, i17, 0);
            sp0Var.w0 = false;
        }
        int paddingTop = size - sp0Var.getPaddingTop();
        int D = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil(Math.max(hq0Var.M.h(), hq0Var.K.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
        i12 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
        int i20 = i12 + D;
        if (ll0Var.getVisibility() != 8) {
            int D2 = org.telegram.messenger.w1.D(103.0f, Math.max(2, (int) Math.ceil((hq0Var.L.h() - 1) / 4.0f)), AndroidUtilities.dp(48.0f) + AndroidUtilities.dp(103.0f));
            i15 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingTop;
            int i21 = i15 + D2;
            if (i21 > i20) {
                i20 = AndroidUtilities.lerp(i20, i21, ll0Var.getAlpha());
            }
        }
        int i22 = i20 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3);
        int dp = AndroidUtilities.dp((frameLayout != null ? 48 : 0) + 100) + hq0Var.G0.d;
        if (jp0Var2.getPaddingTop() != i22 || jp0Var2.getPaddingBottom() != dp) {
            sp0Var.w0 = true;
            jp0Var2.setPadding(0, i22, 0, dp);
            ll0Var.setPadding(0, i22, 0, dp);
            sp0Var.w0 = false;
        }
        z11 = ((org.telegram.ui.ActionBar.f3) hq0Var).keyboardVisible;
        if (z11 && sp0Var.getLayoutParams().height <= 0 && jp0Var.getPaddingTop() != i22) {
            sp0Var.w0 = true;
            jp0Var.setPadding(0, 0, 0, AndroidUtilities.dp((frameLayout == null ? 0 : 48) + 60) + hq0Var.G0.d);
            sp0Var.w0 = false;
        }
        boolean z13 = i20 >= size;
        sp0Var.y0 = z13;
        sp0Var.z0 = z13 ? 0 : size - i20;
        sp0Var.w0 = true;
        hq0Var.K0(false);
        sp0Var.w0 = false;
        sp0Var.setMeasuredDimension(View.MeasureSpec.getSize(i10), size);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30);
        int size2 = View.MeasureSpec.getSize(i10);
        int size3 = View.MeasureSpec.getSize(makeMeasureSpec);
        i13 = ((org.telegram.ui.ActionBar.f3) hq0Var).backgroundPaddingLeft;
        FrameLayout frameLayout2 = hq0Var.r;
        mp0 mp0Var = hq0Var.d;
        int i23 = size2 - (i13 * 2);
        int R = sp0Var.R();
        hq0Var.N0 = R;
        if (!mp0Var.N && R <= AndroidUtilities.dp(20.0f) && !mp0Var.e && !mp0Var.O) {
            sp0Var.w0 = true;
            mp0Var.j();
            sp0Var.w0 = false;
        }
        sp0Var.w0 = true;
        if (hq0Var.N0 <= AndroidUtilities.dp(20.0f)) {
            if (!AndroidUtilities.isInMultiwindow) {
                z12 = ((org.telegram.ui.ActionBar.f3) hq0Var).keyboardVisible;
                size3 -= z12 ? 0 : mp0Var.getEmojiPadding();
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, TLObject.FLAG_30);
            }
            int i24 = mp0Var.e ? 8 : 0;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(i24);
            }
            i14 = 8;
        } else {
            if (!mp0Var.m()) {
                mp0Var.j();
            }
            i14 = 8;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(8);
            }
        }
        int i25 = makeMeasureSpec;
        int i26 = size3;
        sp0Var.w0 = false;
        int childCount = sp0Var.getChildCount();
        while (i18 < childCount) {
            View childAt = sp0Var.getChildAt(i18);
            if (childAt != null && childAt.getVisibility() != i14) {
                if (!mp0Var.l(childAt)) {
                    sp0Var.measureChildWithMargins(childAt, i10, 0, i25, 0);
                } else if (!AndroidUtilities.isInMultiwindow && !AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, TLObject.FLAG_30));
                } else if (AndroidUtilities.isTablet()) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(200.0f), sp0Var.getPaddingTop() + (i26 - hq0Var.G0.b)), TLObject.FLAG_30));
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(sp0Var.getPaddingTop() + (i26 - hq0Var.G0.b), TLObject.FLAG_30));
                }
            }
            i18++;
            sp0Var = this;
        }
        hq0Var.Y0();
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
