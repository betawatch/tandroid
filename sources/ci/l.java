package ci;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import fi.s2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l extends View {
    public final int a;
    public p5 b;
    public final Paint c;
    public long d;
    public TLRPC.Document e;
    public String f;
    public float h;
    public float n;
    public float r;

    public l(Context context, int i7) {
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
        p5 p5Var = this.b;
        if (p5Var != null) {
            p5Var.a(this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5 p5Var = this.b;
        if (p5Var != null) {
            p5Var.n(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        s2 s2Var;
        float f10 = isPressed() ? 1.0f : 0.0f;
        float f11 = this.h;
        if (f11 != f10) {
            if (Math.abs(f11 - f10) >= 0.02f) {
                float f12 = this.h;
                f10 = e2.z(f10, f12, 0.35f, f12);
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
        p5 p5Var = this.b;
        if (p5Var == null || (s2Var = p5Var.k) == null || !s2Var.I()) {
            canvas.drawCircle(width2, height, 0.42f * width, this.c);
        }
        p5 p5Var2 = this.b;
        if (p5Var2 != null) {
            float f14 = width / 2.0f;
            p5Var2.setBounds((int) (width2 - f14), (int) (height - f14), (int) (width2 + f14), (int) (height + f14));
            s.b(canvas, this.b);
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
            this.b = p5.l(this.a, 2, document);
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
