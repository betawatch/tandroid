// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class m0c extends FrameLayout implements eu5 {
    public final de0 a;
    public final Paint b;
    public boolean c;
    public StaticLayout d;
    public StaticLayout e;
    public StaticLayout f;
    public String h;
    public boolean n;
    public boolean r;
    public boolean s;
    public Drawable w;
    public Drawable x;
    public final /* synthetic */ n0c y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0c(n0c n0cVar, Context context) {
        super(context);
        this.y = n0cVar;
        this.b = new Paint(1);
        setWillNotDraw(false);
        de0 de0Var = new de0(context);
        this.a = de0Var;
        addView(de0Var, tre.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // eu5
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // eu5
    public final void f(Canvas canvas, float f) {
        int v0 = aob.v0(aob.d6, this.y.e);
        Paint paint = this.b;
        paint.setColor(v0);
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), paint);
        draw(canvas);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        n0c n0cVar = this.y;
        TextPaint textPaint = n0cVar.q0;
        vnb vnbVar = n0cVar.e;
        float translationY = getTranslationY();
        Paint paint = this.b;
        if (translationY != 0.0f) {
            paint.setColor(aob.v0(aob.d6, vnbVar));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint = paint;
        } else {
            canvas2 = canvas;
        }
        if (this.s) {
            paint.setColor(aob.p1(0.06f, aob.v0(aob.G6, vnbVar)));
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, hl.L(16.0f), hl.L(16.0f), paint);
        }
        int L = hl.L(12.0f);
        int width = getWidth() - hl.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(hl.L(26.0f) + L, ((hl.L(20.0f) - this.d.getHeight()) / 2.0f) + hl.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f4 = width;
        if (this.f != null) {
            float width2 = f4 - r6.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((hl.L(20.0f) - this.f.getHeight()) / 2.0f) + hl.L(10.0f));
            this.f.draw(canvas2);
            canvas2.restore();
            f = width2 - hl.L(6.0f);
        } else {
            f = f4;
        }
        int v0 = aob.v0(aob.y6, vnbVar);
        if (!this.r || (drawable2 = this.x) == null) {
            f2 = 12.0f;
            f3 = 2.0f;
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L2 = hl.L(13.0f);
            int i = (int) f;
            f2 = 12.0f;
            f3 = 2.0f;
            this.x.setBounds(i - L2, hl.L(14.0f), i, hl.L(14.0f) + L2);
            this.x.draw(canvas2);
            f -= hl.L(6.0f) + L2;
        }
        if (this.n && (drawable = this.w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L3 = hl.L(f2);
            int i2 = (int) f;
            this.w.setBounds(i2 - L3, hl.L(14.0f), i2, hl.L(14.0f) + L3);
            this.w.draw(canvas2);
        }
        if (this.e != null) {
            canvas2.save();
            canvas2.translate(L, hl.L(34.0f));
            this.e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(hl.L(23.0f), textPaint.measureText(this.h) + hl.L(14.0f));
            paint.setColor(aob.v0(this.n ? aob.V8 : aob.U8, vnbVar));
            RectF rectF2 = hl.P;
            rectF2.set(f4 - max, hl.L(34.0f), f4, hl.L(57.0f));
            canvas2.drawRoundRect(rectF2, hl.L(11.5f), hl.L(11.5f), paint);
            textPaint.setColor(aob.v0(aob.W8, vnbVar));
            canvas2.drawText(this.h, rectF2.centerX() - (textPaint.measureText(this.h) / f3), rectF2.centerY() - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint);
        }
        if (!this.c || this.s) {
            return;
        }
        paint.setColor(aob.v0(aob.d7, vnbVar));
        canvas2.drawRect(L, getHeight() - 1, f4, getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayout = this.e;
        int height = (staticLayout == null || staticLayout.getText().length() <= 0) ? 0 : this.e.getHeight();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(hl.L(48.0f), hl.L(height > hl.L(24.0f) ? 6.0f : 10.0f) + hl.L(34.0f) + height), TLObject.FLAG_30));
    }

    @Override // eu5
    public final /* synthetic */ void setScrimHidden(boolean z) {
        qd4.a(this, z);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if ((getTranslationY() != 0.0f) != (f != 0.0f)) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
