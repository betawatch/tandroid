package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class c20 extends org.telegram.ui.Components.ed0 {
    public boolean r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public final Paint v0;
    public Boolean w0;
    public final /* synthetic */ d20 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c20(d20 d20Var, Activity activity) {
        super(activity);
        this.x0 = d20Var;
        new Paint(1);
        this.v0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f;
        Boolean bool = this.w0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.x0.fragmentView;
            this.w0 = Boolean.valueOf(z10);
            AndroidUtilities.setLightStatusBar(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.vw0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.u6 u6Var;
        org.telegram.ui.ActionBar.j5 j5Var;
        org.telegram.ui.ActionBar.k kVar2;
        d20 d20Var = this.x0;
        Paint paint = d20Var.K;
        bi.sc scVar = d20Var.y;
        if (!d20Var.f) {
            if (d20Var.h) {
                float f7 = d20Var.n + 0.016f;
                d20Var.n = f7;
                if (f7 > 3.0f) {
                    d20Var.h = false;
                }
            } else {
                float f10 = d20Var.n - 0.016f;
                d20Var.n = f10;
                if (f10 < 1.0f) {
                    d20Var.h = true;
                }
            }
        }
        d20Var.r = (d20Var.c.getLayoutManager() != null ? d20Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(d20Var.m0() + r3.getBottom());
        FrameLayout l02 = d20Var.l0();
        int dp = AndroidUtilities.dp(16.0f) + l02.getBottom();
        float f11 = 1.0f - ((d20Var.r - dp) / (d20Var.J - dp));
        d20Var.v = f11;
        d20Var.v = Utilities.clamp(f11, 1.0f, 0.0f);
        int dp2 = AndroidUtilities.dp(16.0f) + l02.getBottom();
        if (d20Var.r < dp2) {
            d20Var.r = dp2;
        }
        float f12 = d20Var.x;
        d20Var.x = 0.0f;
        if (d20Var.r < AndroidUtilities.dp(30.0f) + dp2) {
            d20Var.x = ((AndroidUtilities.dp(30.0f) + dp2) - d20Var.r) / AndroidUtilities.dp(30.0f);
        }
        if (d20Var.H) {
            d20Var.x = 1.0f;
            d20Var.v = 1.0f;
        }
        if (f12 != d20Var.x) {
            d20Var.c.invalidate();
        }
        d20Var.p0(d20Var.v);
        int measuredHeight = l02.getMeasuredHeight();
        int i10 = d20Var.r;
        int measuredHeight2 = scVar.getMeasuredHeight();
        org.telegram.ui.Components.z90 z90Var = (org.telegram.ui.Components.z90) scVar.c;
        FrameLayout frameLayout = (FrameLayout) scVar.e;
        TextView textView = (TextView) scVar.b;
        FrameLayout frameLayout2 = (FrameLayout) scVar.d;
        float max = Math.max((((((measuredHeight - d20Var.I) - textView.getMeasuredHeight()) / 2.0f) + d20Var.I) - scVar.getTop()) - textView.getTop(), AndroidUtilities.dp(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - d20Var.I)));
        scVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + AndroidUtilities.dp(16.0f) + AndroidUtilities.dp(16.0f));
        float f13 = d20Var.v;
        float z10 = c3.h0.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(z10);
        frameLayout2.setScaleY(z10);
        frameLayout2.setAlpha(f14);
        frameLayout.setAlpha(f14);
        z90Var.setAlpha(f14);
        if (d20Var.v0()) {
            int i11 = f14 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i11);
            frameLayout.setVisibility(i11);
            z90Var.setVisibility(i11);
        }
        d20Var.e.setAlpha(1.0f - d20Var.v);
        d20Var.e.setTranslationY((frameLayout2.getY() + scVar.getY()) - AndroidUtilities.dp(30.0f));
        float dp3 = AndroidUtilities.dp(72.0f) - textView.getLeft();
        float f15 = d20Var.v;
        textView.setTranslationX(d20Var.v0() ? 0.0f : (1.0f - org.telegram.ui.Components.ds.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * dp3);
        if (!d20Var.f) {
            invalidate();
        }
        d20Var.a.d(0, (-getMeasuredWidth()) * 0.1f * d20Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (d20Var.M) {
            int themedColor = d20Var.getThemedColor(org.telegram.ui.ActionBar.y6.a7);
            Paint paint2 = this.v0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), d20Var.a.f);
        }
        int f16 = i0.a.f(f14, d20Var.getThemedColor(org.telegram.ui.ActionBar.y6.j5), d20Var.getThemedColor(d20Var.M ? org.telegram.ui.ActionBar.y6.G6 : org.telegram.ui.ActionBar.y6.Tj));
        kVar = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
            kVar2.getBackButton().setColorFilter(f16);
        }
        textView.setTextColor(f16);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        d20Var.o0(paint.getAlpha() > 0);
        int i12 = org.telegram.ui.ActionBar.y6.Sj;
        u6Var = ((org.telegram.ui.ActionBar.r2) d20Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.y6.v(org.telegram.ui.ActionBar.y6.w0(i12, u6Var), paint.getColor()));
        if (!d20Var.v0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), l02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !d20Var.j0()) {
            return;
        }
        j5Var = ((org.telegram.ui.ActionBar.r2) d20Var).parentLayout;
        ((ActionBarLayout) j5Var).p(canvas, 255, l02.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.k kVar2;
        d20 d20Var = this.x0;
        if (d20Var.v0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        kVar = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.r2) d20Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.u0 = true;
                    }
                }
                if (this.u0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.u0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        bi.sc scVar = d20Var.y;
        float x9 = scVar.getX();
        FrameLayout frameLayout = (FrameLayout) scVar.e;
        FrameLayout frameLayout2 = (FrameLayout) scVar.d;
        org.telegram.ui.Components.z90 z90Var = (org.telegram.ui.Components.z90) scVar.c;
        float x10 = z90Var.getX() + x9;
        float y3 = z90Var.getY() + scVar.getY();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(x10, y3, z90Var.getMeasuredWidth() + x10, z90Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.s0) || d20Var.c.I1 || (layout = z90Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && d20Var.x < 1.0f) {
                    motionEvent.offsetLocation(-x10, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.s0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.s0 = false;
                    }
                    z90Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x11 = frameLayout2.getX() + scVar.getX();
        float y10 = frameLayout2.getY() + scVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x11, y10, frameLayout2.getMeasuredWidth() + x11, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.r0) && !d20Var.c.I1 && isClickable && d20Var.x < f7) {
            motionEvent.offsetLocation(-x11, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.r0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.r0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x12 = frameLayout.getX() + scVar.getX();
        float y11 = frameLayout.getY() + scVar.getY();
        rectF2.set(x12, y11, frameLayout.getMeasuredWidth() + x12, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.t0) && !d20Var.c.I1 && d20Var.x < f7) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() == 0) {
                this.t0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.t0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.t0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        d20 d20Var = this.x0;
        if (view != d20Var.n0() || d20Var.v0()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, d20Var.l0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ed0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.j5 j5Var;
        int i12;
        int i13;
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.j5 j5Var2;
        d20 d20Var = this.x0;
        bi.sc scVar = d20Var.y;
        d20Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        j5Var = ((org.telegram.ui.ActionBar.r2) d20Var).parentLayout;
        if (j5Var != null) {
            j5Var2 = ((org.telegram.ui.ActionBar.r2) d20Var).parentLayout;
            if (((ActionBarLayout) j5Var2).S0) {
                i12 = 0;
                d20Var.I = i12;
                scVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = d20Var.e.getLayoutParams();
                i13 = d20Var.E;
                if (i13 <= 0) {
                    i13 = scVar.getMeasuredHeight();
                }
                layoutParams.height = i13;
                c0Var = d20Var.F;
                if (c0Var instanceof org.telegram.ui.Components.yz) {
                    org.telegram.ui.Components.yz yzVar = (org.telegram.ui.Components.yz) c0Var;
                    yzVar.M = d20Var.l0().getMeasuredHeight();
                    yzVar.q1();
                    ((org.telegram.ui.Components.yz) d20Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    d20Var.s0();
                    return;
                }
                return;
            }
        }
        i12 = AndroidUtilities.statusBarHeight;
        d20Var.I = i12;
        scVar.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = d20Var.e.getLayoutParams();
        i13 = d20Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        c0Var = d20Var.F;
        if (c0Var instanceof org.telegram.ui.Components.yz) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
