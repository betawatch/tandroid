package ai;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import di.z2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i5;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class q extends View {
    public final int a;
    public i5 b;
    public final Paint c;
    public long d;
    public TLRPC.Document e;
    public String f;
    public float h;
    public float n;
    public float r;

    public q(Context context, int i7) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.n = 1.0f;
        this.r = 1.0f;
        this.a = i7;
        paint.setColor(738197503);
    }

    public String getKey() {
        return this.f;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i5 i5Var = this.b;
        if (i5Var != null) {
            i5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i5 i5Var = this.b;
        if (i5Var != null) {
            i5Var.n(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        z2 z2Var;
        float f10 = isPressed() ? 1.0f : 0.0f;
        float f11 = this.h;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.h;
                f10 = com.google.android.recaptcha.internal.a.z(f10, f12, 0.35f, f12);
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
        i5 i5Var = this.b;
        if (i5Var == null || (z2Var = i5Var.k) == null || !z2Var.I()) {
            canvas.drawCircle(width2, height, 0.42f * width, this.c);
        }
        i5 i5Var2 = this.b;
        if (i5Var2 != null) {
            float f14 = width / 2.0f;
            i5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
            x.b(canvas, this.b);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        int size = View.MeasureSpec.getSize(i7);
        setMeasuredDimension(size, size);
    }

    public void set(TLRPC.Document document) {
        long j3 = document.id;
        if (j3 == 0) {
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
        if (j3 != this.d || this.b == null) {
            if (this.b != null && isAttachedToWindow()) {
                this.b.n(this);
            }
            this.d = document.id;
            this.e = document;
            this.f = "c:" + document.id;
            this.b = i5.l(this.a, 2, document);
            if (isAttachedToWindow()) {
                this.b.a(this);
            }
            setContentDescription(document.id + "");
            invalidate();
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z9) {
        if (z9 != isPressed()) {
            super.setPressed(z9);
            invalidate();
        }
    }
}
