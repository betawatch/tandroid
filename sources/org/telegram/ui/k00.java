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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k00 extends org.telegram.ui.Components.ua0 {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final Paint q0;
    public Boolean r0;
    public final /* synthetic */ l00 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k00(l00 l00Var, Activity activity) {
        super(activity);
        this.s0 = l00Var;
        new Paint(1);
        this.q0 = new Paint(1);
    }

    private void setLightStatusBar(int i3) {
        boolean z10 = org.telegram.messenger.g0.B(i3) >= 0.721f;
        Boolean bool = this.r0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.s0.fragmentView;
            this.r0 = Boolean.valueOf(z10);
            org.telegram.messenger.g0.r3(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.qt0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.q4 q4Var;
        org.telegram.ui.ActionBar.k kVar2;
        l00 l00Var = this.s0;
        Paint paint = l00Var.L;
        bh.a aVar = l00Var.E;
        if (!l00Var.f) {
            if (l00Var.h) {
                float f10 = l00Var.n + 0.016f;
                l00Var.n = f10;
                if (f10 > 3.0f) {
                    l00Var.h = false;
                }
            } else {
                float f11 = l00Var.n - 0.016f;
                l00Var.n = f11;
                if (f11 < 1.0f) {
                    l00Var.h = true;
                }
            }
        }
        l00Var.r = (l00Var.c.getLayoutManager() != null ? l00Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(l00Var.q0() + r3.getBottom());
        FrameLayout p02 = l00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f12 = 1.0f - ((l00Var.r - L) / (l00Var.K - L));
        l00Var.w = f12;
        l00Var.w = Utilities.i(f12, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (l00Var.r < L2) {
            l00Var.r = L2;
        }
        float f13 = l00Var.y;
        l00Var.y = 0.0f;
        if (l00Var.r < org.telegram.messenger.g0.L(30.0f) + L2) {
            l00Var.y = ((org.telegram.messenger.g0.L(30.0f) + L2) - l00Var.r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (l00Var.I) {
            l00Var.y = 1.0f;
            l00Var.w = 1.0f;
        }
        if (f13 != l00Var.y) {
            l00Var.c.invalidate();
        }
        l00Var.t0(l00Var.w);
        int measuredHeight = p02.getMeasuredHeight();
        int i3 = l00Var.r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) aVar.c;
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        TextView textView = (TextView) aVar.b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        float max = Math.max((((((measuredHeight - l00Var.J) - textView.getMeasuredHeight()) / 2.0f) + l00Var.J) - aVar.getTop()) - textView.getTop(), org.telegram.messenger.g0.L(16.0f) + (i3 - ((measuredHeight2 + measuredHeight) - l00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f14 = l00Var.w;
        float y9 = com.google.android.recaptcha.internal.a.y(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(y9);
        frameLayout2.setScaleY(y9);
        frameLayout2.setAlpha(f15);
        frameLayout.setAlpha(f15);
        s70Var.setAlpha(f15);
        if (l00Var.z0()) {
            int i10 = f15 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            s70Var.setVisibility(i10);
        }
        l00Var.e.setAlpha(1.0f - l00Var.w);
        l00Var.e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L3 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f16 = l00Var.w;
        textView.setTranslationX(l00Var.z0() ? 0.0f : (1.0f - org.telegram.ui.Components.xq.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!l00Var.f) {
            invalidate();
        }
        l00Var.a.d(0, (-getMeasuredWidth()) * 0.1f * l00Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (l00Var.N) {
            int themedColor = l00Var.getThemedColor(org.telegram.ui.ActionBar.k6.a7);
            Paint paint2 = this.q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), l00Var.a.f);
        }
        int f17 = i0.a.f(f15, l00Var.getThemedColor(org.telegram.ui.ActionBar.k6.j5), l00Var.getThemedColor(l00Var.N ? org.telegram.ui.ActionBar.k6.G6 : org.telegram.ui.ActionBar.k6.Hk));
        kVar = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f17);
        }
        textView.setTextColor(f17);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        l00Var.s0(paint.getAlpha() > 0);
        int i11 = org.telegram.ui.ActionBar.k6.Gk;
        e6Var = ((org.telegram.ui.ActionBar.d2) l00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(i11, e6Var), paint.getColor()));
        if (!l00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !l00Var.n0()) {
            return;
        }
        q4Var = ((org.telegram.ui.ActionBar.d2) l00Var).parentLayout;
        ((ActionBarLayout) q4Var).p(canvas, org.telegram.messenger.hs.e4, p02.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        l00 l00Var = this.s0;
        if (l00Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        kVar = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.d2) l00Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    if (kh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.p0 = true;
                    }
                }
                if (this.p0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.p0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        bh.a aVar = l00Var.E;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.s70 s70Var = (org.telegram.ui.Components.s70) aVar.c;
        float x11 = s70Var.getX() + x10;
        float y9 = s70Var.getY() + aVar.getY();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(x11, y9, s70Var.getMeasuredWidth() + x11, s70Var.getMeasuredHeight() + y9);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.n0) || l00Var.c.J1 || (layout = s70Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && l00Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y9);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.n0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.n0 = false;
                    }
                    s70Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y10 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y10, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y10);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !l00Var.c.J1 && isClickable && l00Var.y < f10) {
            motionEvent.offsetLocation(-x12, -y10);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.m0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.m0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y11 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y11, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) && !l00Var.c.J1 && l00Var.y < f10) {
            motionEvent.offsetLocation(-x13, -y11);
            if (motionEvent.getAction() == 0) {
                this.o0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.o0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.o0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        l00 l00Var = this.s0;
        if (view != l00Var.r0() || l00Var.z0()) {
            return super.drawChild(canvas, view, j10);
        }
        canvas.save();
        canvas.clipRect(0, l00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j10);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ua0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        int i11;
        int i12;
        u4.b0 b0Var;
        org.telegram.ui.ActionBar.q4 q4Var2;
        l00 l00Var = this.s0;
        bh.a aVar = l00Var.E;
        l00Var.I = View.MeasureSpec.getSize(i3) > View.MeasureSpec.getSize(i10);
        q4Var = ((org.telegram.ui.ActionBar.d2) l00Var).parentLayout;
        if (q4Var != null) {
            q4Var2 = ((org.telegram.ui.ActionBar.d2) l00Var).parentLayout;
            if (((ActionBarLayout) q4Var2).T0) {
                i11 = 0;
                l00Var.J = i11;
                aVar.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = l00Var.e.getLayoutParams();
                i12 = l00Var.F;
                if (i12 <= 0) {
                    i12 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i12;
                b0Var = l00Var.G;
                if (b0Var instanceof org.telegram.ui.Components.jy) {
                    org.telegram.ui.Components.jy jyVar = (org.telegram.ui.Components.jy) b0Var;
                    jyVar.M = l00Var.p0().getMeasuredHeight();
                    jyVar.p1();
                    ((org.telegram.ui.Components.jy) l00Var.G).S = 0;
                }
                super.onMeasure(i3, i10);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    l00Var.w0();
                    return;
                }
                return;
            }
        }
        i11 = org.telegram.messenger.g0.m;
        l00Var.J = i11;
        aVar.measure(i3, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = l00Var.e.getLayoutParams();
        i12 = l00Var.F;
        if (i12 <= 0) {
        }
        layoutParams2.height = i12;
        b0Var = l00Var.G;
        if (b0Var instanceof org.telegram.ui.Components.jy) {
        }
        super.onMeasure(i3, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
