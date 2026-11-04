package kh;

import ai.o2;
import ai.x2;
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
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.g0;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.z5;
import r0.k1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends FrameLayout implements z5 {
    public float E;
    public float F;
    public int G;
    public final Rect H;
    public final RectF I;
    public eh.d J;
    public float K;
    public float L;
    public boolean M;
    public sh.f a;
    public final x2 b;
    public final FrameLayout c;
    public final o2 d;
    public boolean e;
    public gh.g f;
    public gh.g h;
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
        this.H = new Rect();
        this.I = new RectF();
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        addView(frameLayout, mf.e(-1, -2, 80));
        o2 o2Var = new o2(9, context, this);
        this.d = o2Var;
        addView(o2Var, mf.e(-1, -2, 80));
        this.b = new x2(8, context, this);
    }

    public final void a(boolean z10) {
        e();
        int round = Math.round(this.s) + g0.L(9.0f) + this.G;
        if (this.r != round || z10) {
            this.r = round;
            int L = g0.L(29.0f);
            float measuredHeight = getMeasuredHeight() - this.w;
            float measuredWidth = getMeasuredWidth();
            float measuredHeight2 = getMeasuredHeight();
            RectF rectF = this.I;
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
        int i3;
        int measuredHeight;
        eh.d dVar = this.J;
        if (dVar == null || (i3 = dVar.getBounds().top) == (measuredHeight = getMeasuredHeight() - Math.round(this.K))) {
            return;
        }
        this.J.setBounds(0, measuredHeight, getMeasuredWidth(), getMeasuredHeight());
        this.b.invalidate(0, Math.max(0, Math.min(i3, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
        invalidate(0, Math.max(0, Math.min(i3, measuredHeight)), getMeasuredWidth(), getMeasuredHeight());
    }

    public final void c() {
        k1 k1Var = ((sh.h) this.a).r;
        int i3 = k1Var != null ? k1Var.a.f(2).d : 0;
        float c2 = ((sh.h) this.a).c();
        o2 o2Var = this.d;
        int childCount = o2Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            KeyEvent.Callback childAt = o2Var.getChildAt(i10);
            if (childAt instanceof sh.a) {
                sh.a aVar = (sh.a) childAt;
                aVar.c(i3);
                aVar.d(c2);
            }
        }
    }

    public final void d() {
        int i3;
        WindowInsets rootWindowInsets;
        this.s = ((sh.h) this.a).d();
        this.w = ((sh.h) this.a).c();
        int i10 = 0;
        this.x = ((sh.h) this.a).s != 1;
        o2 o2Var = this.d;
        boolean z10 = o2Var.getVisibility() == 0;
        boolean z11 = this.x;
        if (z10 != z11) {
            o2Var.setVisibility(z11 ? 0 : 8);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.getLayoutParams();
        int i11 = layoutParams.height;
        int i12 = ((sh.h) this.a).x;
        if (i11 != i12) {
            layoutParams.height = i12;
            requestLayout();
        }
        a(false);
        c();
        if (this.h != null) {
            if (Build.VERSION.SDK_INT < 31 || (rootWindowInsets = getRootWindowInsets()) == null) {
                i3 = 0;
            } else {
                RoundedCorner roundedCorner = rootWindowInsets.getRoundedCorner(3);
                RoundedCorner roundedCorner2 = rootWindowInsets.getRoundedCorner(2);
                i3 = roundedCorner == null ? 0 : roundedCorner.getRadius();
                if (roundedCorner2 != null) {
                    i10 = roundedCorner2.getRadius();
                }
            }
            this.h.t(g0.L(29.0f), g0.L(29.0f), i10, i3, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        this.h.setBounds(0, getMeasuredHeight() - ((int) this.w), getMeasuredWidth(), k5.b(58.0f, getMeasuredHeight() - ((int) this.w), getMeasuredHeight()));
        int measuredHeight = getMeasuredHeight() - this.r;
        int round = Math.round(this.y);
        int measuredWidth = getMeasuredWidth() - Math.round(this.E);
        int i3 = this.G;
        Rect rect = this.H;
        rect.set(round, 0, measuredWidth, i3);
        rect.inset(0, -g0.L(7.0f));
        rect.offset(0, measuredHeight + ((int) this.L));
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
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10 = view == this.d;
        if (z10) {
            canvas.save();
            canvas.clipPath(this.h.R.k);
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (z10) {
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
        return this.F;
    }

    public float getInputBubbleTop() {
        return getInputBubbleBottom() - getInputBubbleHeight();
    }

    public FrameLayout getInputIslandBubbleContainer() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        e();
        c();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        a(true);
        b();
        e();
        c();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gh.g gVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            int x10 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            gh.g gVar2 = this.f;
            this.M = (gVar2 != null && gVar2.c == 255 && gVar2.getBounds().contains(x10, y9)) || ((gVar = this.h) != null && gVar.getBounds().contains(x10, y9));
        }
        if (action == 1 || action == 3) {
            this.M = false;
        }
        return this.M;
    }

    public void setBackgroundWithFadeDrawable(eh.d dVar) {
        this.J = dVar;
    }

    public void setBlurredBottomHeight(float f10) {
        if (this.K != f10) {
            this.K = f10;
            b();
        }
    }

    public void setInputBubbleAlpha(int i3) {
        gh.g gVar = this.f;
        if (gVar != null) {
            gVar.setAlpha(i3);
        }
    }

    public void setInputBubbleHeight(float f10) {
        this.F = f10;
        this.G = Math.round(f10);
        a(false);
    }

    public void setInputBubbleTranslationY(float f10) {
        this.L = f10;
        invalidate();
    }

    public void setInputIslandBubbleDrawable(gh.g gVar) {
        this.f = gVar;
        gVar.q(g0.L(7.0f));
        this.f.r(g0.L(22.0f));
    }

    public void setUnderKeyboardBackgroundDrawable(gh.g gVar) {
        this.h = gVar;
        gVar.T = true;
        gVar.s(g0.L(29.0f), g0.L(29.0f), 0.0f, 0.0f);
        this.h.u(g0.L(32.0f));
        gh.g gVar2 = this.h;
        gVar2.R.g = 0.4f;
        gVar2.n();
    }

    public void setWindowInsetsProvider(sh.f fVar) {
        this.a = fVar;
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        gh.g gVar = this.f;
        if (gVar != null) {
            gVar.updateColors();
        }
        gh.g gVar2 = this.h;
        if (gVar2 != null) {
            gVar2.updateColors();
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
