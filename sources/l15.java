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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class l15 extends dl7 {
    public boolean m0;
    public boolean n0;
    public boolean o0;
    public boolean p0;
    public final Paint q0;
    public Boolean r0;
    public final /* synthetic */ m15 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l15(m15 m15Var, Activity activity) {
        super(activity);
        this.s0 = m15Var;
        new Paint(1);
        this.q0 = new Paint(1);
    }

    private void setLightStatusBar(int i) {
        boolean z = hl.B(i) >= 0.721f;
        Boolean bool = this.r0;
        if (bool == null || bool.booleanValue() != z) {
            View view = this.s0.fragmentView;
            this.r0 = Boolean.valueOf(z);
            hl.m3(view, z);
        }
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        vnb vnbVar;
        wk5 wk5Var;
        a aVar2;
        m15 m15Var = this.s0;
        Paint paint = m15Var.L;
        dr0 dr0Var = m15Var.E;
        if (!m15Var.f) {
            boolean z = m15Var.h;
            float f = m15Var.n;
            if (z) {
                float f2 = f + 0.016f;
                m15Var.n = f2;
                if (f2 > 3.0f) {
                    m15Var.h = false;
                }
            } else {
                float f3 = f - 0.016f;
                m15Var.n = f3;
                if (f3 < 1.0f) {
                    m15Var.h = true;
                }
            }
        }
        m15Var.r = (m15Var.c.getLayoutManager() != null ? m15Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(m15Var.p0() + r3.getBottom());
        FrameLayout o0 = m15Var.o0();
        int L = hl.L(16.0f) + o0.getBottom();
        float f4 = 1.0f - ((m15Var.r - L) / (m15Var.K - L));
        m15Var.w = f4;
        m15Var.w = Utilities.i(f4, 1.0f, 0.0f);
        int L2 = hl.L(16.0f) + o0.getBottom();
        int i = m15Var.r;
        if (i < L2) {
            m15Var.r = L2;
            i = L2;
        }
        float f5 = m15Var.y;
        m15Var.y = 0.0f;
        if (i < hl.L(30.0f) + L2) {
            m15Var.y = ((hl.L(30.0f) + L2) - m15Var.r) / hl.L(30.0f);
        }
        if (m15Var.I) {
            m15Var.y = 1.0f;
            m15Var.w = 1.0f;
        }
        if (f5 != m15Var.y) {
            m15Var.c.invalidate();
        }
        m15Var.s0(m15Var.w);
        int measuredHeight = o0.getMeasuredHeight();
        int i2 = m15Var.r;
        int measuredHeight2 = dr0Var.getMeasuredHeight();
        p66 p66Var = (p66) dr0Var.c;
        FrameLayout frameLayout = (FrameLayout) dr0Var.e;
        TextView textView = (TextView) dr0Var.b;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
        float max = Math.max((((((measuredHeight - m15Var.J) - textView.getMeasuredHeight()) / 2.0f) + m15Var.J) - dr0Var.getTop()) - textView.getTop(), hl.L(16.0f) + (i2 - ((measuredHeight2 + measuredHeight) - m15Var.J)));
        dr0Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + hl.L(16.0f) + hl.L(16.0f));
        float f6 = m15Var.w;
        float A = qd4.A(1.0f, f6, 0.4f, 0.6f);
        float f7 = 1.0f - (f6 > 0.5f ? (f6 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(A);
        frameLayout2.setScaleY(A);
        frameLayout2.setAlpha(f7);
        frameLayout.setAlpha(f7);
        p66Var.setAlpha(f7);
        if (m15Var.z0()) {
            int i3 = f7 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i3);
            frameLayout.setVisibility(i3);
            p66Var.setVisibility(i3);
        }
        m15Var.e.setAlpha(1.0f - m15Var.w);
        m15Var.e.setTranslationY((frameLayout2.getY() + dr0Var.getY()) - hl.L(30.0f));
        float L3 = hl.L(72.0f) - textView.getLeft();
        float f8 = m15Var.w;
        textView.setTranslationX(m15Var.z0() ? 0.0f : (1.0f - k43.h.getInterpolation(1.0f - (f8 > 0.3f ? (f8 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!m15Var.f) {
            invalidate();
        }
        m15Var.a.d(0, (-getMeasuredWidth()) * 0.1f * m15Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (m15Var.N) {
            int themedColor = m15Var.getThemedColor(aob.a7);
            Paint paint2 = this.q0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), m15Var.a.f);
        }
        int f9 = vm2.f(f7, m15Var.getThemedColor(aob.j5), m15Var.getThemedColor(m15Var.N ? aob.G6 : aob.Kk));
        aVar = ((e) m15Var).actionBar;
        if (aVar != null) {
            aVar2 = ((e) m15Var).actionBar;
            aVar2.getBackButton().setColorFilter(f9);
        }
        textView.setTextColor(f9);
        paint.setAlpha((int) ((1.0f - f7) * 255.0f));
        m15Var.r0(paint.getAlpha() > 0);
        int i4 = aob.Jk;
        vnbVar = ((e) m15Var).resourceProvider;
        setLightStatusBar(aob.v(aob.v0(i4, vnbVar), paint.getColor()));
        if (!m15Var.z0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), o0.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f7 > 0.01f || !m15Var.m0()) {
            return;
        }
        wk5Var = ((e) m15Var).parentLayout;
        ((ActionBarLayout) wk5Var).n(canvas, jn7.d4, o0.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        Layout layout;
        float f;
        a aVar2;
        m15 m15Var = this.s0;
        if (m15Var.z0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        aVar = ((e) m15Var).actionBar;
        if (aVar != null) {
            aVar2 = ((e) m15Var).actionBar;
            ImageView backButton = aVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = hl.P;
                    if (yic.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        dr0 dr0Var = m15Var.E;
        float x = dr0Var.getX();
        FrameLayout frameLayout = (FrameLayout) dr0Var.e;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
        p66 p66Var = (p66) dr0Var.c;
        float x2 = p66Var.getX() + x;
        float y = p66Var.getY() + dr0Var.getY();
        RectF rectF2 = hl.P;
        rectF2.set(x2, y, p66Var.getMeasuredWidth() + x2, p66Var.getMeasuredHeight() + y);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.n0) || m15Var.c.J1 || (layout = p66Var.getLayout()) == null) {
            f = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && m15Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x2, -y);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.n0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.n0 = false;
                    }
                    p66Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x3 = frameLayout2.getX() + dr0Var.getX();
        float y2 = frameLayout2.getY() + dr0Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x3, y2, frameLayout2.getMeasuredWidth() + x3, frameLayout2.getMeasuredHeight() + y2);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.m0) && !m15Var.c.J1 && isClickable && m15Var.y < f) {
            motionEvent.offsetLocation(-x3, -y2);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.m0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.m0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x4 = frameLayout.getX() + dr0Var.getX();
        float y3 = frameLayout.getY() + dr0Var.getY();
        rectF2.set(x4, y3, frameLayout.getMeasuredWidth() + x4, frameLayout.getMeasuredHeight() + y3);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.o0) && !m15Var.c.J1 && m15Var.y < f) {
            motionEvent.offsetLocation(-x4, -y3);
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
    public final boolean drawChild(Canvas canvas, View view, long j) {
        m15 m15Var = this.s0;
        if (view != m15Var.q0() || m15Var.z0()) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, m15Var.o0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // dl7, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        wk5 wk5Var;
        int i3;
        int i4;
        x46 x46Var;
        wk5 wk5Var2;
        m15 m15Var = this.s0;
        dr0 dr0Var = m15Var.E;
        m15Var.I = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        wk5Var = ((e) m15Var).parentLayout;
        if (wk5Var != null) {
            wk5Var2 = ((e) m15Var).parentLayout;
            if (((ActionBarLayout) wk5Var2).T0) {
                i3 = 0;
                m15Var.J = i3;
                dr0Var.measure(i, 0);
                ViewGroup.LayoutParams layoutParams = m15Var.e.getLayoutParams();
                i4 = m15Var.F;
                if (i4 <= 0) {
                    i4 = dr0Var.getMeasuredHeight();
                }
                layoutParams.height = i4;
                x46Var = m15Var.G;
                if (x46Var instanceof td4) {
                    td4 td4Var = (td4) x46Var;
                    td4Var.M = m15Var.o0().getMeasuredHeight();
                    td4Var.o1();
                    ((td4) m15Var.G).S = 0;
                }
                super.onMeasure(i, i2);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    m15Var.w0();
                    return;
                }
                return;
            }
        }
        i3 = hl.m;
        m15Var.J = i3;
        dr0Var.measure(i, 0);
        ViewGroup.LayoutParams layoutParams2 = m15Var.e.getLayoutParams();
        i4 = m15Var.F;
        if (i4 <= 0) {
        }
        layoutParams2.height = i4;
        x46Var = m15Var.G;
        if (x46Var instanceof td4) {
        }
        super.onMeasure(i, i2);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
