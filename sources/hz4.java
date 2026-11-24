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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class hz4 extends vi7 {
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public final Paint w0;
    public Boolean x0;
    public final /* synthetic */ iz4 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz4(iz4 iz4Var, Activity activity) {
        super(activity);
        this.y0 = iz4Var;
        new Paint(1);
        this.w0 = new Paint(1);
    }

    private void setLightStatusBar(int i) {
        boolean z = gl.B(i) >= 0.721f;
        Boolean bool = this.x0;
        if (bool == null || bool.booleanValue() != z) {
            View view = this.y0.fragmentView;
            this.x0 = Boolean.valueOf(z);
            gl.n3(view, z);
        }
    }

    @Override // cja, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a aVar;
        wjb wjbVar;
        ui5 ui5Var;
        a aVar2;
        iz4 iz4Var = this.y0;
        Paint paint = iz4Var.L;
        dr0 dr0Var = iz4Var.E;
        if (!iz4Var.f) {
            boolean z = iz4Var.h;
            float f = iz4Var.n;
            if (z) {
                float f2 = f + 0.016f;
                iz4Var.n = f2;
                if (f2 > 3.0f) {
                    iz4Var.h = false;
                }
            } else {
                float f3 = f - 0.016f;
                iz4Var.n = f3;
                if (f3 < 1.0f) {
                    iz4Var.h = true;
                }
            }
        }
        iz4Var.r = (iz4Var.c.getLayoutManager() != null ? iz4Var.c.getLayoutManager().m(0) : null) == null ? 0 : Math.round(iz4Var.p0() + r3.getBottom());
        FrameLayout o0 = iz4Var.o0();
        int L = gl.L(16.0f) + o0.getBottom();
        float f4 = 1.0f - ((iz4Var.r - L) / (iz4Var.K - L));
        iz4Var.w = f4;
        iz4Var.w = Utilities.i(f4, 1.0f, 0.0f);
        int L2 = gl.L(16.0f) + o0.getBottom();
        int i = iz4Var.r;
        if (i < L2) {
            iz4Var.r = L2;
            i = L2;
        }
        float f5 = iz4Var.y;
        iz4Var.y = 0.0f;
        if (i < gl.L(30.0f) + L2) {
            iz4Var.y = ((gl.L(30.0f) + L2) - iz4Var.r) / gl.L(30.0f);
        }
        if (iz4Var.I) {
            iz4Var.y = 1.0f;
            iz4Var.w = 1.0f;
        }
        if (f5 != iz4Var.y) {
            iz4Var.c.invalidate();
        }
        iz4Var.s0(iz4Var.w);
        int measuredHeight = o0.getMeasuredHeight();
        int i2 = iz4Var.r;
        int measuredHeight2 = dr0Var.getMeasuredHeight();
        l46 l46Var = (l46) dr0Var.c;
        FrameLayout frameLayout = (FrameLayout) dr0Var.e;
        TextView textView = (TextView) dr0Var.b;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
        float max = Math.max((((((measuredHeight - iz4Var.J) - textView.getMeasuredHeight()) / 2.0f) + iz4Var.J) - dr0Var.getTop()) - textView.getTop(), gl.L(16.0f) + (i2 - ((measuredHeight2 + measuredHeight) - iz4Var.J)));
        dr0Var.setTranslationY(max);
        frameLayout2.setTranslationY(((-max) / 4.0f) + gl.L(16.0f) + gl.L(16.0f));
        float f6 = iz4Var.w;
        float A = tb4.A(1.0f, f6, 0.4f, 0.6f);
        float f7 = 1.0f - (f6 > 0.5f ? (f6 - 0.5f) / 0.5f : 0.0f);
        frameLayout2.setScaleX(A);
        frameLayout2.setScaleY(A);
        frameLayout2.setAlpha(f7);
        frameLayout.setAlpha(f7);
        l46Var.setAlpha(f7);
        if (iz4Var.y0()) {
            int i3 = f7 > 0.0f ? 0 : 4;
            frameLayout2.setVisibility(i3);
            frameLayout.setVisibility(i3);
            l46Var.setVisibility(i3);
        }
        iz4Var.e.setAlpha(1.0f - iz4Var.w);
        iz4Var.e.setTranslationY((frameLayout2.getY() + dr0Var.getY()) - gl.L(30.0f));
        float L3 = gl.L(72.0f) - textView.getLeft();
        float f8 = iz4Var.w;
        textView.setTranslationX(iz4Var.y0() ? 0.0f : (1.0f - s33.h.getInterpolation(1.0f - (f8 > 0.3f ? (f8 - 0.3f) / 0.7f : 0.0f))) * L3);
        if (!iz4Var.f) {
            invalidate();
        }
        iz4Var.a.d(0, (-getMeasuredWidth()) * 0.1f * iz4Var.n, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
        if (iz4Var.N) {
            int themedColor = iz4Var.getThemedColor(bkb.Z6);
            Paint paint2 = this.w0;
            paint2.setColor(themedColor);
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint2);
        } else {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), iz4Var.a.f);
        }
        int f9 = bm2.f(f7, iz4Var.getThemedColor(bkb.i5), iz4Var.getThemedColor(iz4Var.N ? bkb.F6 : bkb.Jk));
        aVar = ((d) iz4Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) iz4Var).actionBar;
            aVar2.getBackButton().setColorFilter(f9);
        }
        textView.setTextColor(f9);
        paint.setAlpha((int) ((1.0f - f7) * 255.0f));
        iz4Var.r0(paint.getAlpha() > 0);
        int i4 = bkb.Ik;
        wjbVar = ((d) iz4Var).resourceProvider;
        setLightStatusBar(bkb.v(bkb.v0(i4, wjbVar), paint.getColor()));
        if (!iz4Var.y0()) {
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), o0.getMeasuredHeight(), paint);
        }
        super.dispatchDraw(canvas);
        if (f7 > 0.01f || !iz4Var.m0()) {
            return;
        }
        ui5Var = ((d) iz4Var).parentLayout;
        ((ActionBarLayout) ui5Var).n(canvas, kk7.d4, o0.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        a aVar;
        Layout layout;
        float f;
        a aVar2;
        iz4 iz4Var = this.y0;
        if (iz4Var.y0()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        aVar = ((d) iz4Var).actionBar;
        if (aVar != null) {
            aVar2 = ((d) iz4Var).actionBar;
            ImageView backButton = aVar2.getBackButton();
            if (backButton != null && backButton.getVisibility() == 0) {
                if (motionEvent.getAction() == 0) {
                    RectF rectF = gl.P;
                    if (zec.c(backButton, this, rectF) && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
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
        dr0 dr0Var = iz4Var.E;
        float x = dr0Var.getX();
        FrameLayout frameLayout = (FrameLayout) dr0Var.e;
        FrameLayout frameLayout2 = (FrameLayout) dr0Var.d;
        l46 l46Var = (l46) dr0Var.c;
        float x2 = l46Var.getX() + x;
        float y = l46Var.getY() + dr0Var.getY();
        RectF rectF2 = gl.P;
        rectF2.set(x2, y, l46Var.getMeasuredWidth() + x2, l46Var.getMeasuredHeight() + y);
        if ((!rectF2.contains(motionEvent.getX(), motionEvent.getY()) && !this.t0) || iz4Var.c.J1 || (layout = l46Var.getLayout()) == null) {
            f = 1.0f;
        } else {
            CharSequence text = layout.getText();
            f = 1.0f;
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spanned.getSpans(0, spanned.length(), ClickableSpan.class);
                if (clickableSpanArr != null && clickableSpanArr.length > 0 && iz4Var.y < 1.0f) {
                    motionEvent.offsetLocation(-x2, -y);
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                        this.t0 = true;
                    } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                        this.t0 = false;
                    }
                    l46Var.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        float x3 = frameLayout2.getX() + dr0Var.getX();
        float y2 = frameLayout2.getY() + dr0Var.getY();
        boolean isClickable = frameLayout2.isClickable();
        rectF2.set(x3, y2, frameLayout2.getMeasuredWidth() + x3, frameLayout2.getMeasuredHeight() + y2);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.s0) && !iz4Var.c.J1 && isClickable && iz4Var.y < f) {
            motionEvent.offsetLocation(-x3, -y2);
            if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2) {
                this.s0 = true;
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                this.s0 = false;
            }
            frameLayout2.dispatchTouchEvent(motionEvent);
            return true;
        }
        float x4 = frameLayout.getX() + dr0Var.getX();
        float y3 = frameLayout.getY() + dr0Var.getY();
        rectF2.set(x4, y3, frameLayout.getMeasuredWidth() + x4, frameLayout.getMeasuredHeight() + y3);
        if ((rectF2.contains(motionEvent.getX(), motionEvent.getY()) || this.u0) && !iz4Var.c.J1 && iz4Var.y < f) {
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
        iz4 iz4Var = this.y0;
        if (view != iz4Var.q0() || iz4Var.y0()) {
            return super.drawChild(canvas, view, j);
        }
        canvas.save();
        canvas.clipRect(0, iz4Var.o0().getBottom(), getMeasuredWidth(), getMeasuredHeight());
        super.drawChild(canvas, view, j);
        canvas.restore();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // vi7, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        ui5 ui5Var;
        int i3;
        int i4;
        t26 t26Var;
        ui5 ui5Var2;
        iz4 iz4Var = this.y0;
        dr0 dr0Var = iz4Var.E;
        iz4Var.I = View.MeasureSpec.getSize(i) > View.MeasureSpec.getSize(i2);
        ui5Var = ((d) iz4Var).parentLayout;
        if (ui5Var != null) {
            ui5Var2 = ((d) iz4Var).parentLayout;
            if (((ActionBarLayout) ui5Var2).T0) {
                i3 = 0;
                iz4Var.J = i3;
                dr0Var.measure(i, 0);
                ViewGroup.LayoutParams layoutParams = iz4Var.e.getLayoutParams();
                i4 = iz4Var.F;
                if (i4 <= 0) {
                    i4 = dr0Var.getMeasuredHeight();
                }
                layoutParams.height = i4;
                t26Var = iz4Var.G;
                if (t26Var instanceof wb4) {
                    wb4 wb4Var = (wb4) t26Var;
                    wb4Var.M = iz4Var.o0().getMeasuredHeight();
                    wb4Var.o1();
                    ((wb4) iz4Var.G).S = 0;
                }
                super.onMeasure(i, i2);
                if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
                    iz4Var.v0();
                    return;
                }
                return;
            }
        }
        i3 = gl.m;
        iz4Var.J = i3;
        dr0Var.measure(i, 0);
        ViewGroup.LayoutParams layoutParams2 = iz4Var.e.getLayoutParams();
        i4 = iz4Var.F;
        if (i4 <= 0) {
        }
        layoutParams2.height = i4;
        t26Var = iz4Var.G;
        if (t26Var instanceof wb4) {
        }
        super.onMeasure(i, i2);
        if (((getMeasuredWidth() + getMeasuredHeight()) << 16) == 0) {
        }
    }
}
