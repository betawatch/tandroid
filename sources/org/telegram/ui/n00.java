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
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class n00 extends org.telegram.ui.Components.za0 {
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public final Paint p0;
    public Boolean q0;
    public final /* synthetic */ o00 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n00(o00 o00Var, Activity activity) {
        super(activity);
        this.r0 = o00Var;
        new Paint(1);
        this.p0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z9 = org.telegram.messenger.g0.B(i7) >= 0.721f;
        Boolean bool = this.q0;
        if (bool == null || bool.booleanValue() != z9) {
            View view = this.r0.fragmentView;
            this.q0 = Boolean.valueOf(z9);
            org.telegram.messenger.g0.r3(view, z9);
        }
    }

    @Override // org.telegram.ui.Components.rt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.k kVar2;
        o00 o00Var = this.r0;
        Paint paint = o00Var.K;
        ah.a aVar = o00Var.D;
        if (!o00Var.f) {
            if (o00Var.h) {
                float f10 = o00Var.n + 0.016f;
                o00Var.n = f10;
                if (f10 > 3.0f) {
                    o00Var.h = false;
                }
            } else {
                float f11 = o00Var.n - 0.016f;
                o00Var.n = f11;
                if (f11 < 1.0f) {
                    o00Var.h = true;
                }
            }
        }
        o00Var.r = (o00Var.c.getLayoutManager() != null ? o00Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(o00Var.q0() + r3.getBottom());
        FrameLayout p02 = o00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f12 = 1.0f - ((o00Var.r - L) / (o00Var.J - L));
        o00Var.w = f12;
        o00Var.w = Utilities.i(f12, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (o00Var.r < L2) {
            o00Var.r = L2;
        }
        float f13 = o00Var.y;
        o00Var.y = 0.0f;
        if (o00Var.r < org.telegram.messenger.g0.L(30.0f) + L2) {
            o00Var.y = ((org.telegram.messenger.g0.L(30.0f) + L2) - o00Var.r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (o00Var.H) {
            o00Var.y = 1.0f;
            o00Var.w = 1.0f;
        }
        if (f13 != o00Var.y) {
            o00Var.c.invalidate();
        }
        o00Var.t0(o00Var.w);
        int measuredHeight = p02.getMeasuredHeight();
        int i7 = o00Var.r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) aVar.c;
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        TextView textView = (TextView) aVar.b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        float max = Math.max((((((measuredHeight - o00Var.I) - textView.getMeasuredHeight()) / 2.0f) + o00Var.I) - aVar.getTop()) - textView.getTop(), org.telegram.messenger.g0.L(16.0f) + (i7 - ((measuredHeight2 + measuredHeight) - o00Var.I)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f14 = o00Var.w;
        float z9 = com.google.android.recaptcha.internal.a.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(z9);
        frameLayout2.setScaleY(z9);
        frameLayout2.setAlpha(f15);
        frameLayout.setAlpha(f15);
        w70Var.setAlpha(f15);
        if (o00Var.z0()) {
            int i10 = f15 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            w70Var.setVisibility(i10);
        }
        o00Var.e.setAlpha(1.0f - o00Var.w);
        o00Var.e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L3 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f16 = o00Var.w;
        textView.setTranslationX(o00Var.z0() ? 0.0f : (1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!o00Var.f) {
            invalidate();
        }
        o00Var.a.d(0, (-getMeasuredWidth()) * 0.1f * o00Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (o00Var.M) {
            int themedColor = o00Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            Paint paint2 = this.p0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), o00Var.a.f);
        }
        int f17 = i0.a.f(f15, o00Var.getThemedColor(org.telegram.ui.ActionBar.k6.j5), o00Var.getThemedColor(o00Var.M ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Hk));
        kVar = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f17);
        }
        textView.setTextColor(f17);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        o00Var.s0(paint.getAlpha() > 0);
        int i11 = org.telegram.ui.ActionBar.k6.Gk;
        f6Var = ((org.telegram.ui.ActionBar.f2) o00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i11, f6Var), paint.getColor()));
        if (!o00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !o00Var.n0()) {
            return;
        }
        q4Var = ((org.telegram.ui.ActionBar.f2) o00Var).parentLayout;
        ((ActionBarLayout) q4Var).p(canvas, org.telegram.messenger.qs.e4, p02.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        o00 o00Var = this.r0;
        if (o00Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        kVar = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.f2) o00Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.o0 = true;
                    }
                }
                if (this.o0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.o0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        ah.a aVar = o00Var.D;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.w70 w70Var = (org.telegram.ui.Components.w70) aVar.c;
        float x11 = w70Var.getX() + x10;
        float y10 = w70Var.getY() + aVar.getY();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(x11, y10, w70Var.getMeasuredWidth() + x11, w70Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.m0) || o00Var.c.I1 || (layout = w70Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && o00Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.m0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.m0 = false;
                    }
                    w70Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.l0) && !o00Var.c.I1 && isClickable && o00Var.y < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.l0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.l0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.n0) && !o00Var.c.I1 && o00Var.y < f10) {
            motionEvent.offsetLocation(-x13, -y12);
            if (motionEvent.getAction() == 0) {
                this.n0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.n0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.n0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        o00 o00Var = this.r0;
        if (view != o00Var.r0() || o00Var.z0()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, o00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.za0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11;
        int i12;
        v4.b0 b0Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        o00 o00Var = this.r0;
        ah.a aVar = o00Var.D;
        o00Var.H = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        q4Var = ((org.telegram.ui.ActionBar.f2) o00Var).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.f2) o00Var).parentLayout;
            if (((ActionBarLayout) q4Var2).S0) {
                i11 = 0;
                o00Var.I = i11;
                aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = o00Var.e.getLayoutParams();
                i12 = o00Var.E;
                if (i12 <= 0) {
                    i12 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i12;
                b0Var = o00Var.F;
                if (b0Var instanceof org.telegram.ui.Components.my) {
                    org.telegram.ui.Components.my myVar = (org.telegram.ui.Components.my) b0Var;
                    myVar.M = o00Var.p0().getMeasuredHeight();
                    myVar.p1();
                    ((org.telegram.ui.Components.my) o00Var.F).S = 0;
                }
                super.onMeasure(i7, i10);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    o00Var.w0();
                    return;
                }
                return;
            }
        }
        i11 = org.telegram.messenger.g0.m;
        o00Var.I = i11;
        aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = o00Var.e.getLayoutParams();
        i12 = o00Var.E;
        if (i12 <= 0) {
        }
        layoutParams2.height = i12;
        b0Var = o00Var.F;
        if (b0Var instanceof org.telegram.ui.Components.my) {
        }
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
