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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o00 extends org.telegram.ui.Components.ab0 {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final Paint q0;
    public Boolean r0;
    public final /* synthetic */ p00 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00(p00 p00Var, Activity activity) {
        super(activity);
        this.s0 = p00Var;
        new Paint(1);
        this.q0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z10 = org.telegram.messenger.g0.B(i7) >= 0.721f;
        Boolean bool = this.r0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.s0.fragmentView;
            this.r0 = Boolean.valueOf(z10);
            org.telegram.messenger.g0.r3(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.st0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        org.telegram.ui.ActionBar.o4 o4Var;
        org.telegram.ui.ActionBar.k kVar2;
        p00 p00Var = this.s0;
        Paint paint = p00Var.L;
        ah.a aVar = p00Var.E;
        if (!p00Var.f) {
            if (p00Var.h) {
                float f10 = p00Var.n + 0.016f;
                p00Var.n = f10;
                if (f10 > 3.0f) {
                    p00Var.h = false;
                }
            } else {
                float f11 = p00Var.n - 0.016f;
                p00Var.n = f11;
                if (f11 < 1.0f) {
                    p00Var.h = true;
                }
            }
        }
        p00Var.r = (p00Var.c.getLayoutManager() != null ? p00Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(p00Var.q0() + r3.getBottom());
        FrameLayout p02 = p00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f12 = 1.0f - ((p00Var.r - L) / (p00Var.K - L));
        p00Var.w = f12;
        p00Var.w = Utilities.i(f12, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (p00Var.r < L2) {
            p00Var.r = L2;
        }
        float f13 = p00Var.y;
        p00Var.y = 0.0f;
        if (p00Var.r < org.telegram.messenger.g0.L(30.0f) + L2) {
            p00Var.y = ((org.telegram.messenger.g0.L(30.0f) + L2) - p00Var.r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (p00Var.I) {
            p00Var.y = 1.0f;
            p00Var.w = 1.0f;
        }
        if (f13 != p00Var.y) {
            p00Var.c.invalidate();
        }
        p00Var.t0(p00Var.w);
        int measuredHeight = p02.getMeasuredHeight();
        int i7 = p00Var.r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) aVar.c;
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        TextView textView = (TextView) aVar.b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        float max = Math.max((((((measuredHeight - p00Var.J) - textView.getMeasuredHeight()) / 2.0f) + p00Var.J) - aVar.getTop()) - textView.getTop(), org.telegram.messenger.g0.L(16.0f) + (i7 - ((measuredHeight2 + measuredHeight) - p00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f14 = p00Var.w;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(z10);
        frameLayout2.setScaleY(z10);
        frameLayout2.setAlpha(f15);
        frameLayout.setAlpha(f15);
        z70Var.setAlpha(f15);
        if (p00Var.z0()) {
            int i10 = f15 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            z70Var.setVisibility(i10);
        }
        p00Var.e.setAlpha(1.0f - p00Var.w);
        p00Var.e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L3 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f16 = p00Var.w;
        textView.setTranslationX(p00Var.z0() ? 0.0f : (1.0f - org.telegram.ui.Components.er.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!p00Var.f) {
            invalidate();
        }
        p00Var.a.d(0, (-getMeasuredWidth()) * 0.1f * p00Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (p00Var.N) {
            int themedColor = p00Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7);
            Paint paint2 = this.q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), p00Var.a.f);
        }
        int f17 = i0.a.f(f15, p00Var.getThemedColor(org.telegram.ui.ActionBar.j6.j5), p00Var.getThemedColor(p00Var.N ? org.telegram.ui.ActionBar.j6.G6 : org.telegram.ui.ActionBar.j6.Kk));
        kVar = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f17);
        }
        textView.setTextColor(f17);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        p00Var.s0(paint.getAlpha() > 0);
        int i11 = org.telegram.ui.ActionBar.j6.Jk;
        e6Var = ((org.telegram.ui.ActionBar.e2) p00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(i11, e6Var), paint.getColor()));
        if (!p00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !p00Var.n0()) {
            return;
        }
        o4Var = ((org.telegram.ui.ActionBar.e2) p00Var).parentLayout;
        ((ActionBarLayout) o4Var).p(canvas, org.telegram.messenger.ns.e4, p02.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        p00 p00Var = this.s0;
        if (p00Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        kVar = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.e2) p00Var).actionBar;
            ImageView backButton = kVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = org.telegram.messenger.g0.P;
                    if (jh.k.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        ah.a aVar = p00Var.E;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) aVar.c;
        float x11 = z70Var.getX() + x10;
        float y10 = z70Var.getY() + aVar.getY();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(x11, y10, z70Var.getMeasuredWidth() + x11, z70Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.n0) || p00Var.c.J1 || (layout = z70Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && p00Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.n0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.n0 = false;
                    }
                    z70Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !p00Var.c.J1 && isClickable && p00Var.y < f10) {
            motionEvent.offsetLocation(-x12, -y11);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.m0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.m0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x13 = frameLayout.getX() + aVar.getX();
        float y12 = frameLayout.getY() + aVar.getY();
        rectF2.set(x13, y12, frameLayout.getMeasuredWidth() + x13, frameLayout.getMeasuredHeight() + y12);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) && !p00Var.c.J1 && p00Var.y < f10) {
            motionEvent.offsetLocation(-x13, -y12);
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        p00 p00Var = this.s0;
        if (view != p00Var.r0() || p00Var.z0()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, p00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ab0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.o4 o4Var;
        int i11;
        int i12;
        v4.b0 b0Var;
        org.telegram.ui.ActionBar.o4 o4Var2;
        p00 p00Var = this.s0;
        ah.a aVar = p00Var.E;
        p00Var.I = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        o4Var = ((org.telegram.ui.ActionBar.e2) p00Var).parentLayout;
        if (o4Var != null) {
            o4Var2 = ((org.telegram.ui.ActionBar.e2) p00Var).parentLayout;
            if (((ActionBarLayout) o4Var2).T0) {
                i11 = 0;
                p00Var.J = i11;
                aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = p00Var.e.getLayoutParams();
                i12 = p00Var.F;
                if (i12 <= 0) {
                    i12 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i12;
                b0Var = p00Var.G;
                if (b0Var instanceof org.telegram.ui.Components.qy) {
                    org.telegram.ui.Components.qy qyVar = (org.telegram.ui.Components.qy) b0Var;
                    qyVar.M = p00Var.p0().getMeasuredHeight();
                    qyVar.p1();
                    ((org.telegram.ui.Components.qy) p00Var.G).S = 0;
                }
                super.onMeasure(i7, i10);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    p00Var.w0();
                    return;
                }
                return;
            }
        }
        i11 = org.telegram.messenger.g0.m;
        p00Var.J = i11;
        aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = p00Var.e.getLayoutParams();
        i12 = p00Var.F;
        if (i12 <= 0) {
        }
        layoutParams2.height = i12;
        b0Var = p00Var.G;
        if (b0Var instanceof org.telegram.ui.Components.qy) {
        }
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
