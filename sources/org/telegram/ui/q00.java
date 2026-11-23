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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class q00 extends org.telegram.ui.Components.ib0 {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final Paint q0;
    public Boolean r0;
    public final /* synthetic */ r00 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q00(r00 r00Var, Activity activity) {
        super(activity);
        this.s0 = r00Var;
        new Paint(1);
        this.q0 = new Paint(1);
    }

    private void setLightStatusBar(int i7) {
        boolean z10 = org.telegram.messenger.g0.B(i7) >= 0.721f;
        Boolean bool = this.r0;
        if (bool == null || bool.booleanValue() != z10) {
            View view = this.s0.fragmentView;
            this.r0 = Boolean.valueOf(z10);
            org.telegram.messenger.g0.q3(view, z10);
        }
    }

    @Override // org.telegram.ui.Components.cu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.ActionBar.r4 r4Var;
        org.telegram.ui.ActionBar.k kVar2;
        r00 r00Var = this.s0;
        Paint paint = r00Var.L;
        ah.a aVar = r00Var.E;
        if (!r00Var.f) {
            if (r00Var.h) {
                float f10 = r00Var.n + 0.016f;
                r00Var.n = f10;
                if (f10 > 3.0f) {
                    r00Var.h = false;
                }
            } else {
                float f11 = r00Var.n - 0.016f;
                r00Var.n = f11;
                if (f11 < 1.0f) {
                    r00Var.h = true;
                }
            }
        }
        r00Var.r = (r00Var.c.getLayoutManager() != null ? r00Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(r00Var.q0() + r3.getBottom());
        FrameLayout p02 = r00Var.p0();
        int L = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        float f12 = 1.0f - ((r00Var.r - L) / (r00Var.K - L));
        r00Var.w = f12;
        r00Var.w = Utilities.i(f12, 1.0f, 0.0f);
        int L2 = org.telegram.messenger.g0.L(16.0f) + p02.getBottom();
        if (r00Var.r < L2) {
            r00Var.r = L2;
        }
        float f13 = r00Var.y;
        r00Var.y = 0.0f;
        if (r00Var.r < org.telegram.messenger.g0.L(30.0f) + L2) {
            r00Var.y = ((org.telegram.messenger.g0.L(30.0f) + L2) - r00Var.r) / org.telegram.messenger.g0.L(30.0f);
        }
        if (r00Var.I) {
            r00Var.y = 1.0f;
            r00Var.w = 1.0f;
        }
        if (f13 != r00Var.y) {
            r00Var.c.invalidate();
        }
        r00Var.t0(r00Var.w);
        int measuredHeight = p02.getMeasuredHeight();
        int i7 = r00Var.r;
        int measuredHeight2 = aVar.getMeasuredHeight();
        org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) aVar.c;
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        TextView textView = (TextView) aVar.b;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        float max = Math.max((((((measuredHeight - r00Var.J) - textView.getMeasuredHeight()) / 2.0f) + r00Var.J) - aVar.getTop()) - textView.getTop(), org.telegram.messenger.g0.L(16.0f) + (i7 - ((measuredHeight2 + measuredHeight) - r00Var.J)));
        aVar.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + org.telegram.messenger.g0.L(16.0f) + org.telegram.messenger.g0.L(16.0f));
        float f14 = r00Var.w;
        float z10 = com.google.android.gms.internal.vision.e2.z(1.0f, f14, 0.4f, 0.6f);
        float f15 = 1.0f - (f14 > 0.5f ? (f14 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(z10);
        frameLayout2.setScaleY(z10);
        frameLayout2.setAlpha(f15);
        frameLayout.setAlpha(f15);
        j80Var.setAlpha(f15);
        if (r00Var.z0()) {
            int i10 = f15 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i10);
            frameLayout.setVisibility(i10);
            j80Var.setVisibility(i10);
        }
        r00Var.e.setAlpha(1.0f - r00Var.w);
        r00Var.e.setTranslationY((frameLayout2.getY() + aVar.getY()) - org.telegram.messenger.g0.L(30.0f));
        float L3 = org.telegram.messenger.g0.L(72.0f) - textView.getLeft();
        float f16 = r00Var.w;
        textView.setTranslationX(r00Var.z0() ? 0.0f : (1.0f - org.telegram.ui.Components.kr.h.getInterpolation(1.0f - (f16 > 0.3f ? (f16 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!r00Var.f) {
            invalidate();
        }
        r00Var.a.d(0, (-getMeasuredWidth()) * 0.1f * r00Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (r00Var.N) {
            int themedColor = r00Var.getThemedColor(org.telegram.ui.ActionBar.n6.a7);
            Paint paint2 = this.q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), r00Var.a.f);
        }
        int f17 = i0.a.f(f15, r00Var.getThemedColor(org.telegram.ui.ActionBar.n6.j5), r00Var.getThemedColor(r00Var.N ? org.telegram.ui.ActionBar.n6.G6 : org.telegram.ui.ActionBar.n6.Kk));
        kVar = ((org.telegram.ui.ActionBar.g2) r00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) r00Var).actionBar;
            kVar2.getBackButton().setColorFilter(f17);
        }
        textView.setTextColor(f17);
        paint.setAlpha((int) ((1.0f - f15) * 255.0f));
        r00Var.s0(paint.getAlpha() > 0);
        int i11 = org.telegram.ui.ActionBar.n6.Jk;
        i6Var = ((org.telegram.ui.ActionBar.g2) r00Var).resourceProvider;
        setLightStatusBar(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(i11, i6Var), paint.getColor()));
        if (!r00Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p02.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f15 > 0.01f || !r00Var.n0()) {
            return;
        }
        r4Var = ((org.telegram.ui.ActionBar.g2) r00Var).parentLayout;
        ((ActionBarLayout) r4Var).p(canvas, org.telegram.messenger.ks.e4, p02.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.ActionBar.k kVar;
        Layout layout;
        float f10;
        org.telegram.ui.ActionBar.k kVar2;
        r00 r00Var = this.s0;
        if (r00Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        kVar = ((org.telegram.ui.ActionBar.g2) r00Var).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.g2) r00Var).actionBar;
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
        ah.a aVar = r00Var.E;
        float x10 = aVar.getX();
        FrameLayout frameLayout = (FrameLayout) aVar.e;
        FrameLayout frameLayout2 = (FrameLayout) aVar.d;
        org.telegram.ui.Components.j80 j80Var = (org.telegram.ui.Components.j80) aVar.c;
        float x11 = j80Var.getX() + x10;
        float y10 = j80Var.getY() + aVar.getY();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(x11, y10, j80Var.getMeasuredWidth() + x11, j80Var.getMeasuredHeight() + y10);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.n0) || r00Var.c.J1 || (layout = j80Var.getLayout()) == null) {
            f10 = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f10 = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && r00Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x11, -y10);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.n0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.n0 = false;
                    }
                    j80Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x12 = frameLayout2.getX() + aVar.getX();
        float y11 = frameLayout2.getY() + aVar.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x12, y11, frameLayout2.getMeasuredWidth() + x12, frameLayout2.getMeasuredHeight() + y11);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !r00Var.c.J1 && isClickable && r00Var.y < f10) {
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
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) && !r00Var.c.J1 && r00Var.y < f10) {
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
        r00 r00Var = this.s0;
        if (view != r00Var.r0() || r00Var.z0()) {
            return super.drawChild(canvas, view, j3);
        }
        canvas.save();
        canvas.clipRect(0, r00Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j3);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // org.telegram.ui.Components.ib0, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.ActionBar.r4 r4Var;
        int i11;
        int i12;
        v4.c0 c0Var;
        org.telegram.ui.ActionBar.r4 r4Var2;
        r00 r00Var = this.s0;
        ah.a aVar = r00Var.E;
        r00Var.I = View.MeasureSpec.getSize(i7) > View.MeasureSpec.getSize(i10);
        r4Var = ((org.telegram.ui.ActionBar.g2) r00Var).parentLayout;
        if (r4Var != null) {
            r4Var2 = ((org.telegram.ui.ActionBar.g2) r00Var).parentLayout;
            if (((ActionBarLayout) r4Var2).T0) {
                i11 = 0;
                r00Var.J = i11;
                aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
                ViewGroup.LayoutParams layoutParams = r00Var.e.getLayoutParams();
                i12 = r00Var.F;
                if (i12 <= 0) {
                    i12 = aVar.getMeasuredHeight();
                }
                layoutParams.height = i12;
                c0Var = r00Var.G;
                if (c0Var instanceof org.telegram.ui.Components.vy) {
                    org.telegram.ui.Components.vy vyVar = (org.telegram.ui.Components.vy) c0Var;
                    vyVar.M = r00Var.p0().getMeasuredHeight();
                    vyVar.p1();
                    ((org.telegram.ui.Components.vy) r00Var.G).S = 0;
                }
                super.onMeasure(i7, i10);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    r00Var.w0();
                    return;
                }
                return;
            }
        }
        i11 = org.telegram.messenger.g0.m;
        r00Var.J = i11;
        aVar.measure(i7, View.MeasureSpec.makeMeasureSpec(0, 0));
        ViewGroup.LayoutParams layoutParams2 = r00Var.e.getLayoutParams();
        i12 = r00Var.F;
        if (i12 <= 0) {
        }
        layoutParams2.height = i12;
        c0Var = r00Var.G;
        if (c0Var instanceof org.telegram.ui.Components.vy) {
        }
        super.onMeasure(i7, i10);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
