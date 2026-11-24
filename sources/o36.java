// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.Premium.LimitPreviewView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class o36 extends View {
    public final /* synthetic */ LimitPreviewView E;
    public final Path a;
    public final CornerPathEffect b;
    public final TextPaint c;
    public StaticLayout d;
    public float e;
    public SpannableStringBuilder f;
    public final ArrayList h;
    public StaticLayout n;
    public boolean r;
    public float s;
    public boolean w;
    public final Paint x;
    public final Paint y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o36(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.E = limitPreviewView;
        this.a = new Path();
        this.b = new CornerPathEffect(gm.L(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.x = paint;
        Paint paint2 = new Paint();
        this.y = paint2;
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.L(22.0f));
        textPaint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.OVERLAY));
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                arrayList.clear();
                this.r = false;
                invalidate();
                return;
            } else if (((n36) arrayList.get(i)).f != null) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - gm.L(8.0f);
        float measuredWidth = getMeasuredWidth() * this.s;
        float i = Utilities.i(gm.L(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float i2 = Utilities.i(gm.L(10.0f) + measuredWidth, getMeasuredWidth(), gm.L(24.0f));
        float i3 = Utilities.i(measuredWidth - gm.L(this.s >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
        float i4 = Utilities.i(measuredWidth - gm.L(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.a;
        path.rewind();
        float f = measuredHeight;
        float f2 = f - (f / 2.0f);
        path.moveTo(i3, f2 - gm.L(2.0f));
        path.lineTo(i3, f);
        path.lineTo(i4, f);
        path.lineTo(measuredWidth, gm.L(8.0f) + measuredHeight);
        if (this.s < 0.7f) {
            path.lineTo(i, f);
        }
        path.lineTo(i2, f);
        path.lineTo(i2, f2 - gm.L(2.0f));
        path.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float globalXOffset;
        float globalXOffset2;
        int measuredHeight = getMeasuredHeight() - gm.L(8.0f);
        LimitPreviewView limitPreviewView = this.E;
        Paint paint = limitPreviewView.L;
        if (limitPreviewView.K) {
            measuredHeight = getMeasuredHeight();
            oj8 d = oj8.d();
            int measuredWidth = limitPreviewView.getMeasuredWidth();
            int measuredHeight2 = limitPreviewView.getMeasuredHeight();
            globalXOffset2 = limitPreviewView.getGlobalXOffset();
            d.f(globalXOffset2 - getX(), -getTop(), measuredWidth, measuredHeight2);
            RectF rectF = gm.P;
            rectF.set(0.0f, gm.L(3.0f), getMeasuredWidth(), measuredHeight - gm.L(3.0f));
            float f = measuredHeight / 2.0f;
            oj8 d2 = oj8.d();
            Paint paint2 = d2.c;
            if (paint2 == null) {
                paint2 = new Paint(1);
                d2.c = paint2;
            }
            paint2.setColor(cmb.w0(null, cmb.Ei, false));
            canvas.drawRoundRect(rectF, f, f, d2.c);
        } else {
            if (this.w) {
                this.w = false;
                b();
            }
            oj8 d3 = oj8.d();
            int measuredWidth2 = limitPreviewView.getMeasuredWidth();
            int measuredHeight3 = limitPreviewView.getMeasuredHeight();
            globalXOffset = limitPreviewView.getGlobalXOffset();
            d3.f(globalXOffset - getX(), -getTop(), measuredWidth2, measuredHeight3);
            RectF rectF2 = gm.P;
            float f2 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f2);
            float f3 = f2 / 2.0f;
            boolean z = limitPreviewView.S;
            TextPaint textPaint = this.c;
            canvas.drawRoundRect(rectF2, f3, f3, z ? paint : limitPreviewView.e() ? textPaint : oj8.d().e());
            Paint e = oj8.d().e();
            CornerPathEffect cornerPathEffect = this.b;
            e.setPathEffect(cornerPathEffect);
            if (limitPreviewView.e()) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.S) {
                paint = limitPreviewView.e() ? textPaint : oj8.d().e();
            }
            canvas.drawPath(this.a, paint);
            oj8.d().e().setPathEffect(null);
            if (limitPreviewView.e()) {
                textPaint.setPathEffect(null);
            }
            if (limitPreviewView.e0) {
                invalidate();
            }
        }
        int i = measuredHeight;
        if (limitPreviewView.e()) {
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.x, 31);
        }
        float measuredWidth3 = (getMeasuredWidth() - this.e) / 2.0f;
        float height = (i - this.d.getHeight()) / 2.0f;
        if (this.r) {
            canvas.save();
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - gm.L(8.0f));
            if (this.n != null) {
                canvas.save();
                canvas.translate(measuredWidth3, height);
                this.n.draw(canvas);
                canvas.restore();
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i2 >= arrayList.size()) {
                    break;
                }
                n36 n36Var = (n36) arrayList.get(i2);
                canvas.save();
                boolean z2 = n36Var.a;
                ArrayList arrayList2 = n36Var.b;
                if (z2) {
                    canvas.translate(n36Var.e + measuredWidth3, ((i * n36Var.c) + height) - ((1 - arrayList2.size()) * i));
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        canvas.translate(0.0f, -i);
                        ((StaticLayout) arrayList2.get(i3)).draw(canvas);
                    }
                } else {
                    boolean z3 = n36Var.d;
                    float f4 = n36Var.e;
                    float f5 = n36Var.c;
                    float f6 = f4 + measuredWidth3;
                    if (z3) {
                        canvas.translate(f6, (height - ((i * 10) * f5)) + ((10 - arrayList2.size()) * i));
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            canvas.translate(0.0f, i);
                            ((StaticLayout) arrayList2.get(i4)).draw(canvas);
                        }
                    } else {
                        canvas.translate(f6, (((i * 10) * f5) + height) - ((10 - arrayList2.size()) * i));
                        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                            canvas.translate(0.0f, -i);
                            ((StaticLayout) arrayList2.get(i5)).draw(canvas);
                        }
                    }
                }
                canvas.restore();
                i2++;
            }
            canvas.restore();
        } else if (this.d != null) {
            canvas.save();
            canvas.translate(measuredWidth3, height);
            this.d.draw(canvas);
            canvas.restore();
        }
        if (limitPreviewView.e()) {
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.y, 31);
            canvas.drawRect(gm.L(12.0f), gm.L(10.0f), getMeasuredWidth() - gm.L(12.0f), getMeasuredHeight() - gm.L(10.0f), ((lp0) ((xg0) limitPreviewView.f0).b).v0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = this.f;
        TextPaint textPaint = this.c;
        this.e = hg5.h(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f, textPaint, gm.L(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        int i3 = 0;
        while (true) {
            int lineCount = this.d.getLineCount();
            float f = this.e;
            if (i3 >= lineCount) {
                setMeasuredDimension((int) (f + getPaddingRight() + getPaddingLeft()), gm.L(8.0f) + gm.L(44.0f));
                b();
                return;
            }
            this.e = Math.max(f, this.d.getLineWidth(i3));
            i3++;
        }
    }

    @Override // android.view.View
    public final void setTranslationX(float f) {
        if (f != getTranslationX()) {
            super.setTranslationX(f);
            invalidate();
        }
    }
}
