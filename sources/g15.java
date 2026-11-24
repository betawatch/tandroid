// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class g15 extends xk7 {
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final Paint w0;
    public Boolean x0;
    public final /* synthetic */ h15 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g15(h15 h15Var, Activity activity) {
        super(activity);
        this.y0 = h15Var;
        new Paint(1);
        this.w0 = new Paint(1);
    }

    private void setLightStatusBar(int i) {
        boolean z = gm.B(i) >= 0.721f;
        Boolean bool = this.x0;
        if (bool == null || bool.booleanValue() != z) {
            View view = this.y0.fragmentView;
            this.x0 = Boolean.valueOf(z);
            gm.m3(view, z);
        }
    }

    @Override // ela, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        ylb ylbVar;
        tk5 tk5Var;
        a aVar2;
        h15 h15Var = this.y0;
        Paint paint = h15Var.L;
        ds0 ds0Var = h15Var.E;
        if (!h15Var.f) {
            boolean z = h15Var.h;
            float f = h15Var.n;
            if (z) {
                float f2 = f + 0.016f;
                h15Var.n = f2;
                if (f2 > 3.0f) {
                    h15Var.h = false;
                }
            } else {
                float f3 = f - 0.016f;
                h15Var.n = f3;
                if (f3 < 1.0f) {
                    h15Var.h = true;
                }
            }
        }
        h15Var.r = (h15Var.c.getLayoutManager() != null ? h15Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(h15Var.q0() + r3.getBottom());
        FrameLayout p0 = h15Var.p0();
        int L = gm.L(16.0f) + p0.getBottom();
        float f4 = 1.0f - ((h15Var.r - L) / (h15Var.K - L));
        h15Var.w = f4;
        h15Var.w = Utilities.i(f4, 1.0f, 0.0f);
        int L2 = gm.L(16.0f) + p0.getBottom();
        int i = h15Var.r;
        if (i < L2) {
            h15Var.r = L2;
            i = L2;
        }
        float f5 = h15Var.y;
        h15Var.y = 0.0f;
        if (i < gm.L(30.0f) + L2) {
            h15Var.y = ((gm.L(30.0f) + L2) - h15Var.r) / gm.L(30.0f);
        }
        if (h15Var.I) {
            h15Var.y = 1.0f;
            h15Var.w = 1.0f;
        }
        if (f5 != h15Var.y) {
            h15Var.c.invalidate();
        }
        h15Var.t0(h15Var.w);
        int measuredHeight = p0.getMeasuredHeight();
        int i2 = h15Var.r;
        int measuredHeight2 = ds0Var.getMeasuredHeight();
        l66 l66Var = (l66) ds0Var.c;
        FrameLayout frameLayout = (FrameLayout) ds0Var.e;
        TextView textView = (TextView) ds0Var.b;
        FrameLayout frameLayout2 = (FrameLayout) ds0Var.d;
        float max = Math.max((((((measuredHeight - h15Var.J) - textView.getMeasuredHeight()) / 2.0f) + h15Var.J) - ds0Var.getTop()) - textView.getTop(), gm.L(16.0f) + (i2 - ((measuredHeight2 + measuredHeight) - h15Var.J)));
        ds0Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + gm.L(16.0f) + gm.L(16.0f));
        float f6 = h15Var.w;
        float A = td4.A(1.0f, f6, 0.4f, 0.6f);
        float f7 = 1.0f - (f6 > 0.5f ? (f6 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(A);
        frameLayout2.setScaleY(A);
        frameLayout2.setAlpha(f7);
        frameLayout.setAlpha(f7);
        l66Var.setAlpha(f7);
        if (h15Var.z0()) {
            int i3 = f7 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i3);
            frameLayout.setVisibility(i3);
            l66Var.setVisibility(i3);
        }
        h15Var.e.setAlpha(1.0f - h15Var.w);
        h15Var.e.setTranslationY((frameLayout2.getY() + ds0Var.getY()) - gm.L(30.0f));
        float L3 = gm.L(72.0f) - textView.getLeft();
        float f8 = h15Var.w;
        textView.setTranslationX(h15Var.z0() ? 0.0f : (1.0f - d53.h.getInterpolation(1.0f - (f8 > 0.3f ? (f8 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!h15Var.f) {
            invalidate();
        }
        h15Var.a.d(0, (-getMeasuredWidth()) * 0.1f * h15Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (h15Var.N) {
            int themedColor = h15Var.getThemedColor(cmb.Z6);
            Paint paint2 = this.w0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), h15Var.a.f);
        }
        int f9 = on2.f(f7, h15Var.getThemedColor(cmb.i5), h15Var.getThemedColor(h15Var.N ? cmb.F6 : cmb.Jk));
        aVar = ((d) h15Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) h15Var).actionBar;
            aVar2.getBackButton().setColorFilter(f9);
        }
        textView.setTextColor(f9);
        paint.setAlpha((int) ((1.0f - f7) * 255.0f));
        h15Var.s0(paint.getAlpha() > 0);
        int i4 = cmb.Ik;
        ylbVar = ((d) h15Var).resourceProvider;
        setLightStatusBar(cmb.v(cmb.v0(i4, ylbVar), paint.getColor()));
        if (!h15Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), p0.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f7 > 0.01f || !h15Var.n0()) {
            return;
        }
        tk5Var = ((d) h15Var).parentLayout;
        ((ActionBarLayout) tk5Var).n(canvas, nm7.d4, p0.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        Layout layout;
        float f;
        a aVar2;
        h15 h15Var = this.y0;
        if (h15Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        aVar = ((d) h15Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) h15Var).actionBar;
            ImageView backButton = aVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = gm.P;
                    if (zgc.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        this.v0 = true;
                    }
                }
                if (this.v0) {
                    boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
                    if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                        return dispatchTouchEvent;
                    }
                    this.v0 = false;
                    return dispatchTouchEvent;
                }
            }
        }
        ds0 ds0Var = h15Var.E;
        float x = ds0Var.getX();
        FrameLayout frameLayout = (FrameLayout) ds0Var.e;
        FrameLayout frameLayout2 = (FrameLayout) ds0Var.d;
        l66 l66Var = (l66) ds0Var.c;
        float x2 = l66Var.getX() + x;
        float y = l66Var.getY() + ds0Var.getY();
        RectF rectF2 = gm.P;
        rectF2.set(x2, y, l66Var.getMeasuredWidth() + x2, l66Var.getMeasuredHeight() + y);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.t0) || h15Var.c.J1 || (layout = l66Var.getLayout()) == null) {
            f = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && h15Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x2, -y);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.t0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.t0 = false;
                    }
                    l66Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x3 = frameLayout2.getX() + ds0Var.getX();
        float y2 = frameLayout2.getY() + ds0Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x3, y2, frameLayout2.getMeasuredWidth() + x3, frameLayout2.getMeasuredHeight() + y2);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.s0) && !h15Var.c.J1 && isClickable && h15Var.y < f) {
            motionEvent.offsetLocation(-x3, -y2);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.s0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.s0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x4 = frameLayout.getX() + ds0Var.getX();
        float y3 = frameLayout.getY() + ds0Var.getY();
        rectF2.set(x4, y3, frameLayout.getMeasuredWidth() + x4, frameLayout.getMeasuredHeight() + y3);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.u0) && !h15Var.c.J1 && h15Var.y < f) {
            motionEvent.offsetLocation(-x4, -y3);
            if (motionEvent.getAction() == 0) {
                this.u0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.u0 = false;
            }
            frameLayout.dispatchTouchEvent(motionEvent);
            if (this.u0) {
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h15 h15Var = this.y0;
        if (view != h15Var.r0() || h15Var.z0()) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, h15Var.p0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // xk7, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        tk5 tk5Var;
        int i3;
        int i4;
        u46 u46Var;
        tk5 tk5Var2;
        h15 h15Var = this.y0;
        ds0 ds0Var = h15Var.E;
        h15Var.I = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        tk5Var = ((d) h15Var).parentLayout;
        if (tk5Var != null) {
            tk5Var2 = ((d) h15Var).parentLayout;
            if (((ActionBarLayout) tk5Var2).T0) {
                i3 = 0;
                h15Var.J = i3;
                ds0Var.measure(i, 0);
                ViewGroup.LayoutParams layoutParams = h15Var.e.getLayoutParams();
                i4 = h15Var.F;
                if (i4 <= 0) {
                    i4 = ds0Var.getMeasuredHeight();
                }
                layoutParams.height = i4;
                u46Var = h15Var.G;
                if (u46Var instanceof wd4) {
                    wd4 wd4Var = (wd4) u46Var;
                    wd4Var.M = h15Var.p0().getMeasuredHeight();
                    wd4Var.o1();
                    ((wd4) h15Var.G).S = 0;
                }
                super.onMeasure(i, i2);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    h15Var.w0();
                    return;
                }
                return;
            }
        }
        i3 = gm.m;
        h15Var.J = i3;
        ds0Var.measure(i, 0);
        ViewGroup.LayoutParams layoutParams2 = h15Var.e.getLayoutParams();
        i4 = h15Var.F;
        if (i4 <= 0) {
        }
        layoutParams2.height = i4;
        u46Var = h15Var.G;
        if (u46Var instanceof wd4) {
        }
        super.onMeasure(i, i2);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
