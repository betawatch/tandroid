package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.SystemClock;
import android.widget.FrameLayout;
import android.widget.TextView;
import c8.ma;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o0 extends FrameLayout {
    public final TextView a;
    public final p5 b;
    public final org.telegram.ui.ActionBar.v2 c;
    public final boolean d;
    public final Paint e;
    public final Paint f;
    public long h;

    public o0(Context context, g gVar, int i7, int i10, boolean z10) {
        super(context);
        Paint paint = new Paint(1);
        this.e = paint;
        this.f = new Paint(1);
        this.d = z10;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 19.0f);
        textView.setGravity(17);
        addView(textView, ma.d(28, 28.0f, 19, 14.0f, 0.0f, 0.0f, 0.0f));
        long j3 = gVar.b;
        if (j3 != 0) {
            this.b = p5.m(i10, j3, null, 2);
        } else if (gVar.d) {
            org.telegram.ui.ActionBar.v2 v2Var = new org.telegram.ui.ActionBar.v2(context);
            this.c = v2Var;
            v2Var.setColorFilter(new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN));
        }
        TextView textView2 = new TextView(context);
        this.a = textView2;
        textView2.setText(gVar.a());
        textView2.setTextSize(1, 16.0f);
        textView2.setTextColor(i7);
        textView2.setSingleLine(true);
        textView2.setGravity(16);
        addView(textView2, ma.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.75f));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        super.dispatchDraw(canvas);
        float height = getHeight() / 2.0f;
        p5 p5Var = this.b;
        if (p5Var != null) {
            int L = org.telegram.messenger.g0.L(24.0f);
            int L2 = org.telegram.messenger.g0.L(16.0f);
            fi.s2 s2Var = p5Var.k;
            if (s2Var != null && s2Var.J() && this.h == 0) {
                this.h = SystemClock.uptimeMillis();
            }
            float min = this.h == 0 ? 0.0f : Math.min(1.0f, (SystemClock.uptimeMillis() - this.h) / 260.0f);
            if (min < 1.0f) {
                int r12 = m6.r1((1.0f - min) * 0.08f, this.a.getCurrentTextColor());
                Paint paint = this.f;
                paint.setColor(r12);
                canvas.drawRoundRect(org.telegram.messenger.g0.L(1.0f) + L2, height - org.telegram.messenger.g0.L(11.0f), (L2 + L) - org.telegram.messenger.g0.L(1.0f), height + org.telegram.messenger.g0.L(11.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), paint);
                canvas2 = canvas;
                invalidate();
            } else {
                canvas2 = canvas;
            }
            p5Var.setAlpha((int) (min * 255.0f));
            float f10 = L / 2.0f;
            p5Var.setBounds(L2, (int) (height - f10), L + L2, (int) (f10 + height));
            p5Var.draw(canvas);
        } else {
            canvas2 = canvas;
            org.telegram.ui.ActionBar.v2 v2Var = this.c;
            if (v2Var != null) {
                int L3 = org.telegram.messenger.g0.L(24.0f);
                int L4 = org.telegram.messenger.g0.L(16.0f);
                float f11 = L3 / 2.0f;
                v2Var.setBounds(L4, (int) (height - f11), L3 + L4, (int) (f11 + height));
                v2Var.draw(canvas);
            }
        }
        if (this.d) {
            float width = getWidth() - org.telegram.messenger.g0.L(26.0f);
            Paint paint2 = this.e;
            canvas2.drawLine(width - org.telegram.messenger.g0.L(5.0f), height, width - org.telegram.messenger.g0.L(1.5f), height + org.telegram.messenger.g0.L(3.5f), paint2);
            canvas.drawLine(width - org.telegram.messenger.g0.L(1.5f), height + org.telegram.messenger.g0.L(3.5f), width + org.telegram.messenger.g0.L(5.5f), height - org.telegram.messenger.g0.L(4.0f), paint2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        p5 p5Var = this.b;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.b;
        if (p5Var != null) {
            p5Var.n(this);
        }
    }
}
