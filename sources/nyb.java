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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class nyb extends FrameLayout implements au5 {
    public final bf0 a;
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
    public final /* synthetic */ oyb y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyb(oyb oybVar, Context context) {
        super(context);
        this.y = oybVar;
        this.b = new Paint(1);
        setWillNotDraw(false);
        bf0 bf0Var = new bf0(context);
        this.a = bf0Var;
        addView(bf0Var, qoe.d(20, 20.0f, 51, 12.0f, 10.0f, 0.0f, 0.0f));
    }

    @Override // au5
    public final void e(RectF rectF) {
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
    }

    @Override // au5
    public final void g(Canvas canvas, float f) {
        int v0 = cmb.v0(cmb.c6, this.y.e);
        Paint paint = this.b;
        paint.setColor(v0);
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), paint);
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
        oyb oybVar = this.y;
        TextPaint textPaint = oybVar.q0;
        ylb ylbVar = oybVar.e;
        float translationY = getTranslationY();
        Paint paint = this.b;
        if (translationY != 0.0f) {
            paint.setColor(cmb.v0(cmb.c6, ylbVar));
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            paint = paint;
        } else {
            canvas2 = canvas;
        }
        if (this.s) {
            paint.setColor(cmb.p1(0.06f, cmb.v0(cmb.F6, ylbVar)));
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas2.drawRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), paint);
        }
        int L = gm.L(12.0f);
        int width = getWidth() - gm.L(12.0f);
        if (this.d != null) {
            canvas2.save();
            canvas2.translate(gm.L(26.0f) + L, ((gm.L(20.0f) - this.d.getHeight()) / 2.0f) + gm.L(10.0f));
            this.d.draw(canvas2);
            canvas2.restore();
        }
        float f4 = width;
        if (this.f != null) {
            float width2 = f4 - r6.getWidth();
            canvas2.save();
            canvas2.translate(width2, ((gm.L(20.0f) - this.f.getHeight()) / 2.0f) + gm.L(10.0f));
            this.f.draw(canvas2);
            canvas2.restore();
            f = width2 - gm.L(6.0f);
        } else {
            f = f4;
        }
        int v0 = cmb.v0(cmb.x6, ylbVar);
        if (!this.r || (drawable2 = this.x) == null) {
            f2 = 12.0f;
            f3 = 2.0f;
        } else {
            drawable2.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L2 = gm.L(13.0f);
            int i = (int) f;
            f2 = 12.0f;
            f3 = 2.0f;
            this.x.setBounds(i - L2, gm.L(14.0f), i, gm.L(14.0f) + L2);
            this.x.draw(canvas2);
            f -= gm.L(6.0f) + L2;
        }
        if (this.n && (drawable = this.w) != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
            int L3 = gm.L(f2);
            int i2 = (int) f;
            this.w.setBounds(i2 - L3, gm.L(14.0f), i2, gm.L(14.0f) + L3);
            this.w.draw(canvas2);
        }
        if (this.e != null) {
            canvas2.save();
            canvas2.translate(L, gm.L(34.0f));
            this.e.draw(canvas2);
            canvas2.restore();
        }
        if (this.h != null) {
            float max = Math.max(gm.L(23.0f), textPaint.measureText(this.h) + gm.L(14.0f));
            paint.setColor(cmb.v0(this.n ? cmb.U8 : cmb.T8, ylbVar));
            RectF rectF2 = gm.P;
            rectF2.set(f4 - max, gm.L(34.0f), f4, gm.L(57.0f));
            canvas2.drawRoundRect(rectF2, gm.L(11.5f), gm.L(11.5f), paint);
            textPaint.setColor(cmb.v0(cmb.V8, ylbVar));
            canvas2.drawText(this.h, rectF2.centerX() - (textPaint.measureText(this.h) / f3), rectF2.centerY() - ((textPaint.ascent() + textPaint.descent()) / f3), textPaint);
        }
        if (!this.c || this.s) {
            return;
        }
        paint.setColor(cmb.v0(cmb.c7, ylbVar));
        canvas2.drawRect(L, getHeight() - 1, f4, getHeight(), paint);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        StaticLayout staticLayout = this.e;
        int height = (staticLayout == null || staticLayout.getText().length() <= 0) ? 0 : this.e.getHeight();
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.max(gm.L(48.0f), gm.L(height > gm.L(24.0f) ? 6.0f : 10.0f) + gm.L(34.0f) + height), TLObject.FLAG_30));
    }

    @Override // au5
    public final /* synthetic */ void setScrimHidden(boolean z) {
        td4.a(this, z);
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        if ((getTranslationY() != 0.0f) != (f != 0.0f)) {
            invalidate();
        }
        super.setTranslationY(f);
    }
}
