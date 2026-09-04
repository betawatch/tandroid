package ih;

import ah.y;
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
import di.eb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.w1;
import r0.l1;
import w7.x5;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class g extends FrameLayout {
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public bh.c I;
    public float J;
    public float K;
    public boolean L;
    public qh.g a;
    public final eb b;
    public final FrameLayout c;
    public final y d;
    public boolean e;
    public dh.d f;
    public dh.d h;
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
        addView(frameLayout, x5.e(-1, -2, 80));
        y yVar = new y(this, context, 6);
        this.d = yVar;
        addView(yVar, x5.e(-1, -2, 80));
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
        bh.c cVar = this.I;
        if (cVar == null || (i10 = cVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            return;
        }
        this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i10, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        l1 l1Var = ((qh.i) this.a).r;
        int i10 = l1Var != null ? l1Var.a.f(2).d : 0;
        float b10 = ((qh.i) this.a).b();
        y yVar = this.d;
        int childCount = yVar.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            KeyEvent.Callback childAt = yVar.getChildAt(i11);
            if (childAt instanceof qh.a) {
                qh.a aVar = (qh.a) childAt;
                aVar.a(i10);
                aVar.b(b10);
            }
        }
    }

    public final void d() {
        int i10;
        WindowInsets rootWindowInsets;
        this.s = ((qh.i) this.a).c();
        this.v = ((qh.i) this.a).b();
        int i11 = 0;
        this.w = ((qh.i) this.a).s != 1;
        y yVar = this.d;
        boolean z10 = yVar.getVisibility() == 0;
        boolean z11 = this.w;
        if (z10 != z11) {
            yVar.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yVar.getLayoutParams();
        int i12 = layoutParams.height;
        int i13 = ((qh.i) this.a).w;
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
            this.h.r(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), i11, i10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.v), getMeasuredWidth(), w1.b(58.0f, getMeasuredHeight() - ((int) this.v), getMeasuredHeight()));
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
            canvas.clipPath(this.h.h.k);
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
        dh.d dVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            dh.d dVar2 = this.f;
            this.L = (dVar2 != null && dVar2.j == 255 && dVar2.getBounds().contains(x10, y3)) || ((dVar = this.h) != null && dVar.getBounds().contains(x10, y3));
        }
        if (action == 1 || action == 3) {
            this.L = false;
        }
        return this.L;
    }

    public void setBackgroundWithFadeDrawable(bh.c cVar) {
        this.I = cVar;
    }

    public void setBlurredBottomHeight(float f7) {
        if (this.J != f7) {
            this.J = f7;
            b();
        }
    }

    public void setInputBubbleAlpha(int i10) {
        dh.d dVar = this.f;
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

    public void setInputIslandBubbleDrawable(dh.d dVar) {
        this.f = dVar;
        dVar.o(AndroidUtilities.dp(7.0f));
        this.f.p(AndroidUtilities.dp(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(dh.d dVar) {
        this.h = dVar;
        dVar.k = true;
        dVar.q(AndroidUtilities.dp(29.0f), AndroidUtilities.dp(29.0f), 0.0f, 0.0f);
        this.h.t(AndroidUtilities.dp(32.0f));
        dh.d dVar2 = this.h;
        dVar2.h.g = 0.4f;
        dVar2.j();
    }

    public void setWindowInsetsProvider(qh.g gVar) {
        this.a = gVar;
    }
}
