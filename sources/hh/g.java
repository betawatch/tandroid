package hh;

import ai.f0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import ci.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.l0;
import r0.l1;
import w7.y5;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public ah.e I;
    public float J;
    public float K;
    public boolean L;
    public ph.g a;
    public final eb b;
    public final FrameLayout c;
    public final f0 d;
    public boolean e;
    public ch.d f;
    public ch.d h;
    public final Path n;
    public int r;
    public float s;
    public float v;
    public boolean w;
    public float x;
    public float y;

    public g(Context context) {
        super(context);
        this.e = true;
        this.n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, y5.e(-1, -2, 80));
        f0 f0Var = new f0(this, context, 5);
        this.d = f0Var;
        addView(f0Var, y5.e(-1, -2, 80));
        this.b = new eb(this, context, 5);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.s) + AndroidUtilities.dp(9.0f) + this.F;
        if (this.r != round || z10) {
            this.r = round;
            int dp = AndroidUtilities.dp(29.0f);
            float measuredHeight = getMeasuredHeight() - this.v;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.H;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.n;
            path.rewind();
            float f7 = dp;
            path.addRoundRect(rectF, new float[]{f7, f7, f7, f7, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }

    public final void b() {
        int i10;
        int measuredHeight;
        ah.e eVar = this.I;
        if (eVar == null || (i10 = eVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            return;
        }
        this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        l1 l1Var = ((ph.i) this.a).r;
        int i10 = l1Var != null ? l1Var.a.f(2).d : 0;
        float b10 = ((ph.i) this.a).b();
        f0 f0Var = this.d;
        int childCount = f0Var.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = f0Var.getChildAt(i11);
            if (childAt instanceof ph.a) {
                ph.a aVar = (ph.a) childAt;
                aVar.b(i10);
                aVar.d(b10);
            }
        }
    }

    public final void d() {
        int i10;
        WindowInsets rootWindowInsets;
        this.s = ((ph.i) this.a).c();
        this.v = ((ph.i) this.a).b();
        int i11 = 0;
        this.w = ((ph.i) this.a).s != 1;
        f0 f0Var = this.d;
        boolean z10 = f0Var.getVisibility() == 0;
        boolean z11 = this.w;
        if (z10 != z11) {
            f0Var.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) f0Var.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((ph.i) this.a).w;
        if (i12 != i13) {
            layoutParams.height = i13;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                i10 = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                i10 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    i11 = roundedCorner2.getRadius();
                }
            }
            this.h.s(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i11, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), l0.y(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.r;
        int round = Math.round(this.x);
        int measuredWidth = getMeasuredWidth() - Math.round(this.y);
        int i10 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i10);
        rect.inset(0, -AndroidUtilities.dp(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f.setBounds(rect);
        if (this.e) {
            this.f.draw(canvas);
        }
        if (this.w) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10 = view == this.d;
        if (z10) {
            canvas.save();
            canvas.clipPath(this.h.j.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z10) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.s) - AndroidUtilities.dp(9.0f));
        this.d.setTranslationY(r0.getMeasuredHeight() - this.v);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.s) - AndroidUtilities.dp(9.0f);
    }

    public float getInputBubbleHeight() {
        return this.E;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        e();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        a(true);
        b();
        e();
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ch.d dVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            ch.d dVar2 = this.f;
            this.L = (dVar2 != null && dVar2.l == 255 && dVar2.getBounds().contains(x10, y3)) || ((dVar = this.h) != null && dVar.getBounds().contains(x10, y3));
        }
        if (action == 1 || action == 3) {
            this.L = false;
        }
        return this.L;
    }

    public void setBackgroundWithFadeDrawable(ah.e eVar) {
        this.I = eVar;
    }

    public void setBlurredBottomHeight(float f7) {
        if (this.J != f7) {
            this.J = f7;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        ch.d dVar = this.f;
        if (dVar != null) {
            dVar.setAlpha(i10);
        }
    }

    public void setInputBubbleHeight(float f7) {
        this.E = f7;
        this.F = Math.round(f7);
        a(false);
    }

    public void setInputBubbleTranslationY(float f7) {
        this.K = f7;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(ch.d dVar) {
        this.f = dVar;
        dVar.p(AndroidUtilities.dp(7.0f));
        this.f.q(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(ch.d dVar) {
        this.h = dVar;
        dVar.m = true;
        dVar.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.u(AndroidUtilities.dp(32.0f));
        ch.d dVar2 = this.h;
        dVar2.j.g = 0.4f;
        dVar2.k();
    }

    public void setWindowInsetsProvider(ph.g gVar) {
        this.a = gVar;
    }
}
