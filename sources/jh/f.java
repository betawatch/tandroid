package jh;

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
import bi.e5;
import bi.ec;
import c8.ha;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.a6;
import r0.k1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements a6 {
    public float D;
    public float E;
    public int F;
    public final Rect G;
    public final RectF H;
    public dh.d I;
    public float J;
    public float K;
    public boolean L;
    public rh.f a;
    public final ec b;
    public final FrameLayout c;
    public final e5 d;
    public boolean e;
    public fh.g f;
    public fh.g h;
    public final Path n;
    public int r;
    public float s;
    public float w;
    public boolean x;
    public float y;

    public f(Context context) {
        super(context);
        this.e = true;
        this.n = new Path();
        this.G = new Rect();
        this.H = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, ha.e(-1, -2, 80));
        e5 e5Var = new e5(8, context, this);
        this.d = e5Var;
        addView(e5Var, ha.e(-1, -2, 80));
        this.b = new ec(7, context, this);
    }

    public final void a(boolean z9) {
        e();
        int round = Math.round(this.s) + g0.L(9.0f) + this.F;
        if (this.r != round || z9) {
            this.r = round;
            int L = g0.L(29.0f);
            float measuredHeight = getMeasuredHeight() - this.w;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.H;
            rectF.set(0.0f, measuredHeight, measuredWidth, measuredHeight2);
            Path path = this.n;
            path.rewind();
            float f10 = L;
            path.addRoundRect(rectF, new float[]{f10, f10, f10, f10, 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CW);
            path.close();
            invalidate();
        }
    }

    public final void b() {
        int i7;
        int measuredHeight;
        dh.d dVar = this.I;
        if (dVar == null || (i7 = dVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.J))) {
            return;
        }
        this.I.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i7, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        k1 k1Var = ((rh.h) this.a).r;
        int i7 = k1Var != null ? k1Var.a.f(2).d : 0;
        float c10 = ((rh.h) this.a).c();
        e5 e5Var = this.d;
        int childCount = e5Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            KeyEvent.Callback childAt = e5Var.getChildAt(i10);
            if (childAt instanceof rh.a) {
                rh.a aVar = (rh.a) childAt;
                aVar.b(i7);
                aVar.c(c10);
            }
        }
    }

    public final void d() {
        int i7;
        WindowInsets rootWindowInsets;
        this.s = ((rh.h) this.a).d();
        this.w = ((rh.h) this.a).c();
        int i10 = 0;
        this.x = ((rh.h) this.a).s != 1;
        e5 e5Var = this.d;
        boolean z9 = e5Var.getVisibility() == 0;
        boolean z10 = this.x;
        if (z9 != z10) {
            e5Var.setVisibility(z10 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = ((rh.h) this.a).x;
        if (i11 != i12) {
            layoutParams.height = i12;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                i7 = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                i7 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    i10 = roundedCorner2.getRadius();
                }
            }
            this.h.t(g0.L(29.0f), g0.L(29.0f), i10, i7, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.w), getMeasuredWidth(), k5.b(58.0f, getMeasuredHeight() - ((int) this.w), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.r;
        int round = Math.round(this.y);
        int measuredWidth = getMeasuredWidth() - Math.round(this.D);
        int i7 = this.F;
        Rect rect = this.G;
        rect.set(round, 0, measuredWidth, i7);
        rect.inset(0, -g0.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.K));
        this.f.setBounds(rect);
        if (this.e) {
            this.f.draw(canvas);
        }
        if (this.x) {
            this.h.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9 = view == this.d;
        if (z9) {
            canvas.save();
            canvas.clipPath(this.h.Q.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (z9) {
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        this.c.setTranslationY((-this.s) - g0.L(9.0f));
        this.d.setTranslationY(r0.getMeasuredHeight() - this.w);
    }

    public View getFadeView() {
        return this.b;
    }

    public FrameLayout getInAppKeyboardBubbleContainer() {
        return this.d;
    }

    public float getInputBubbleBottom() {
        return (getMeasuredHeight() - this.s) - g0.L(9.0f);
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        e();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        a(true);
        b();
        e();
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        fh.g gVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            fh.g gVar2 = this.f;
            this.L = (gVar2 != null && gVar2.c == 255 && gVar2.getBounds().contains(x10, y10)) || ((gVar = this.h) != null && gVar.getBounds().contains(x10, y10));
        }
        if (action == 1 || action == 3) {
            this.L = false;
        }
        return this.L;
    }

    public void setBackgroundWithFadeDrawable(dh.d dVar) {
        this.I = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.J != f10) {
            this.J = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i7) {
        fh.g gVar = this.f;
        if (gVar != null) {
            gVar.setAlpha(i7);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.E = f10;
        this.F = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.K = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(fh.g gVar) {
        this.f = gVar;
        gVar.q(g0.L(7.0f));
        this.f.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(fh.g gVar) {
        this.h = gVar;
        gVar.S = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.h.u(g0.L(32.0f));
        fh.g gVar2 = this.h;
        gVar2.Q.g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(rh.f fVar) {
        this.a = fVar;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        fh.g gVar = this.f;
        if (gVar != null) {
            gVar.updateColors();
        }
        fh.g gVar2 = this.h;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
