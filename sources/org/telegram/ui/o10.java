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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o10 extends org.telegram.ui.Components.sb0 {
    public boolean l0;
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public final Paint p0;
    public Boolean q0;
    public final /* synthetic */ p10 r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o10(p10 p10Var, Activity activity) {
        super(activity);
        this.r0 = p10Var;
        new Paint(1);
        this.p0 = new Paint(1);
    }

    private void setLightStatusBar(int i10) {
        boolean z10 = org.telegram.messenger.i0.B(i10) >= 0.721f;
        Boolean bool = this.q0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.r0.fragmentView;
            this.q0 = Boolean.valueOf(z10);
            org.telegram.messenger.i0.q3(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.uu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.p6 p6Var;
        org.telegram.ui.ActionBar.z4 z4Var;
        org.telegram.ui.ActionBar.l lVar2;
        p10 p10Var = this.r0;
        Paint paint = p10Var.K;
        m10 m10Var = p10Var.D;
        if (!p10Var.f) {
            if (p10Var.h) {
                float f7 = p10Var.n + 0.016f;
                p10Var.n = f7;
                if (f7 > 3.0f) {
                    p10Var.h = false;
                }
            } else {
                float f10 = p10Var.n - 0.016f;
                p10Var.n = f10;
                if (f10 < 1.0f) {
                    p10Var.h = true;
                }
            }
        }
        p10Var.r = (p10Var.c.getLayoutManager() != null ? p10Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(p10Var.p0() + r3.getBottom());
        FrameLayout o02 = p10Var.o0();
        int L = org.telegram.messenger.i0.L(16.0f) + o02.getBottom();
        float f11 = 1.0f - ((p10Var.r - L) / (p10Var.J - L));
        p10Var.w = f11;
        p10Var.w = Utilities.i(f11, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.i0.L(16.0f) + o02.getBottom();
        if (p10Var.r < L2) {
            p10Var.r = L2;
        }
        float f12 = p10Var.y;
        p10Var.y = 0.0f;
        if (p10Var.r < org.telegram.messenger.i0.L(30.0f) + L2) {
            p10Var.y = ((org.telegram.messenger.i0.L(30.0f) + L2) - p10Var.r) / org.telegram.messenger.i0.L(30.0f);
        }
        if (p10Var.H) {
            p10Var.y = 1.0f;
            p10Var.w = 1.0f;
        }
        if (f12 != p10Var.y) {
            p10Var.c.invalidate();
        }
        p10Var.s0(p10Var.w);
        int measuredHeight = o02.getMeasuredHeight();
        int i10 = p10Var.r;
        int measuredHeight2 = m10Var.getMeasuredHeight();
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) m10Var.c;
        FrameLayout frameLayout = (FrameLayout) m10Var.e;
        TextView textView = (TextView) m10Var.b;
        FrameLayout frameLayout2 = (FrameLayout) m10Var.d;
        float max = Math.max((((((measuredHeight - p10Var.I) - textView.getMeasuredHeight()) / 2.0f) + p10Var.I) - m10Var.getTop()) - textView.getTop(), org.telegram.messenger.i0.L(16.0f) + (i10 - ((measuredHeight2 + measuredHeight) - p10Var.I)));
        m10Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.i0.L(16.0f) + org.telegram.messenger.i0.L(16.0f));
        float f13 = p10Var.w;
        float z10 = c3.i0.z(1.0f, f13, 0.4f, 0.6f);
        float f14 = 1.0f - (f13 > 0.5f ? (f13 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(z10);
        frameLayout2.setScaleY(z10);
        frameLayout2.setAlpha(f14);
        frameLayout.setAlpha(f14);
        p80Var.setAlpha(f14);
        if (p10Var.y0()) {
            int i11 = f14 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i11);
            frameLayout.setVisibility(i11);
            p80Var.setVisibility(i11);
        }
        p10Var.e.setAlpha(1.0f - p10Var.w);
        p10Var.e.setTranslationY((frameLayout2.getY() + m10Var.getY()) - org.telegram.messenger.i0.L(30.0f));
        float L3 = org.telegram.messenger.i0.L(72.0f) - textView.getLeft();
        float f15 = p10Var.w;
        textView.setTranslationX(p10Var.y0() ? 0.0f : (1.0f - org.telegram.ui.Components.gr.h.getInterpolation(1.0f - (f15 > 0.3f ? (f15 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!p10Var.f) {
            invalidate();
        }
        p10Var.a.d(0, (-getMeasuredWidth()) * 0.1f * p10Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (p10Var.M) {
            int themedColor = p10Var.getThemedColor(org.telegram.ui.ActionBar.t6.a7);
            Paint paint2 = this.p0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), p10Var.a.f);
        }
        int f16 = i0.b.f(f14, p10Var.getThemedColor(org.telegram.ui.ActionBar.t6.j5), p10Var.getThemedColor(p10Var.M ? org.telegram.ui.ActionBar.t6.G6 : org.telegram.ui.ActionBar.t6.Hk));
        lVar = ((org.telegram.ui.ActionBar.k2) p10Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) p10Var).actionBar;
            lVar2.getBackButton().setColorFilter(f16);
        }
        textView.setTextColor(f16);
        paint.setAlpha((int) ((1.0f - f14) * 255.0f));
        p10Var.r0(paint.getAlpha() > 0);
        int i12 = org.telegram.ui.ActionBar.t6.Gk;
        p6Var = ((org.telegram.ui.ActionBar.k2) p10Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(i12, p6Var), paint.getColor()));
        if (!p10Var.y0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), o02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f14 > 0.01f || !p10Var.m0()) {
            return;
        }
        z4Var = ((org.telegram.ui.ActionBar.k2) p10Var).parentLayout;
        ((ActionBarLayout) z4Var).p(canvas, org.telegram.messenger.zs.e4, o02.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.l lVar;
        Layout layout;
        float f7;
        org.telegram.ui.ActionBar.l lVar2;
        p10 p10Var = this.r0;
        if (p10Var.y0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        lVar = ((org.telegram.ui.ActionBar.k2) p10Var).actionBar;
        if (lVar != null) {
            lVar2 = ((org.telegram.ui.ActionBar.k2) p10Var).actionBar;
            ImageView backButton = lVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = org.telegram.messenger.i0.P;
                    if (zg.h.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        m10 m10Var = p10Var.D;
        float x10 = m10Var.getX();
        FrameLayout frameLayout = (FrameLayout) m10Var.e;
        FrameLayout frameLayout2 = (FrameLayout) m10Var.d;
        org.telegram.ui.Components.p80 p80Var = (org.telegram.ui.Components.p80) m10Var.c;
        float x11 = p80Var.getX() + x10;
        float y3 = p80Var.getY() + m10Var.getY();
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(x11, y3, p80Var.getMeasuredWidth() + x11, p80Var.getMeasuredHeight() + y3);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.m0) || p10Var.c.I1 || (layout = p80Var.getLayout()) == null) {
            f7 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f7 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && p10Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y3);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.m0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.m0 = false;
                    }
                    p80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + m10Var.getX();
        float y10 = frameLayout2.getY() + m10Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.l0) && !p10Var.c.I1 && isClickable && p10Var.y < f7) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.l0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.l0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + m10Var.getX();
        float y11 = frameLayout.getY() + m10Var.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.n0) && !p10Var.c.I1 && p10Var.y < f7) {
            motionEvent.offsetLocation(-x13, -y11);
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        p10 p10Var = this.r0;
        if (view != p10Var.q0() || p10Var.y0()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, p10Var.o0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.sb0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.z4 z4Var;
        int i12;
        int i13;
        s4.a0 a0Var;
        org.telegram.ui.ActionBar.z4 z4Var2;
        p10 p10Var = this.r0;
        m10 m10Var = p10Var.D;
        p10Var.H = View.MeasureSpec.getSize(i10) > View.MeasureSpec.getSize(i11);
        z4Var = ((org.telegram.ui.ActionBar.k2) p10Var).parentLayout;
        if (z4Var != null) {
            z4Var2 = ((org.telegram.ui.ActionBar.k2) p10Var).parentLayout;
            if (((ActionBarLayout) z4Var2).S0) {
                i12 = 0;
                p10Var.I = i12;
                m10Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = p10Var.e.getLayoutParams();
                i13 = p10Var.E;
                if (i13 <= 0) {
                    i13 = m10Var.getMeasuredHeight();
                }
                layoutParams.height = i13;
                a0Var = p10Var.F;
                if (a0Var instanceof org.telegram.ui.Components.az) {
                    org.telegram.ui.Components.az azVar = (org.telegram.ui.Components.az) a0Var;
                    azVar.M = p10Var.o0().getMeasuredHeight();
                    azVar.p1();
                    ((org.telegram.ui.Components.az) p10Var.F).S = 0;
                }
                super.onMeasure(i10, i11);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    p10Var.v0();
                    return;
                }
                return;
            }
        }
        i12 = org.telegram.messenger.i0.m;
        p10Var.I = i12;
        m10Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = p10Var.e.getLayoutParams();
        i13 = p10Var.E;
        if (i13 <= 0) {
        }
        layoutParams2.height = i13;
        a0Var = p10Var.F;
        if (a0Var instanceof org.telegram.ui.Components.az) {
        }
        super.onMeasure(i10, i11);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
