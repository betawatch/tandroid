package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import ei.c3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class l extends View {
    public final int a;
    public g5 b;
    public final Paint c;
    public long d;
    public TLRPC.Document e;
    public String f;
    public float h;
    public float n;
    public float r;

    public l(Context context, int i3) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.n = 1.0f;
        this.r = 1.0f;
        this.a = i3;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        g5 g5Var = this.b;
        if (g5Var != null) {
            g5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g5 g5Var = this.b;
        if (g5Var != null) {
            g5Var.n(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        c3 c3Var;
        float f10 = isPressed() ? 1.0f : 0.0f;
        float f11 = this.h;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.h;
                f10 = com.google.android.recaptcha.internal.a.y(f10, f12, 0.35f, f12);
            }
            this.h = f10;
            invalidate();
        }
        float f13 = (1.0f - (this.h * 0.2f)) * this.n * this.r;
        if (f13 <= 0.01f) {
            return;
        }
        float width = getWidth() * 0.78f * f13;
        float width2 = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        g5 g5Var = this.b;
        if (g5Var == null || (c3Var = g5Var.k) == null || !c3Var.I()) {
            canvas.drawCircle(width2, height, 0.42f * width, this.c);
        }
        g5 g5Var2 = this.b;
        if (g5Var2 != null) {
            float f14 = width / 2.0f;
            g5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
            s.b(canvas, this.b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        int size = View.MeasureSpec.getSize(i3);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j10 = document.id;
        if (j10 == 0) {
            if (this.b != null && isAttachedToWindow()) {
                this.b.n(this);
            }
            this.b = null;
            this.d = 0L;
            this.e = document;
            this.f = null;
            invalidate();
            return;
        }
        if (j10 != this.d || this.b == null) {
            if (this.b != null && isAttachedToWindow()) {
                this.b.n(this);
            }
            this.d = document.id;
            this.e = document;
            this.f = "c:" + document.id;
            this.b = g5.l(this.a, 2, document);
            if (isAttachedToWindow()) {
                this.b.a(this);
            }
            setContentDescription(document.id + "");
            invalidate();
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        if (z10 != isPressed()) {
            super.setPressed(z10);
            invalidate();
        }
    }
}
