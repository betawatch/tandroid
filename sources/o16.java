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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o16 extends View {
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
    public o16(LimitPreviewView limitPreviewView, Context context) {
        super(context);
        this.E = limitPreviewView;
        this.a = new Path();
        this.b = new CornerPathEffect(gl.L(6.0f));
        TextPaint textPaint = new TextPaint(1);
        this.c = textPaint;
        this.h = new ArrayList();
        Paint paint = new Paint();
        this.x = paint;
        Paint paint2 = new Paint();
        this.y = paint2;
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(22.0f));
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
            } else if (((n16) arrayList.get(i)).f != null) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b() {
        int measuredHeight = getMeasuredHeight() - gl.L(8.0f);
        float measuredWidth = getMeasuredWidth() * this.s;
        float i = Utilities.i(gl.L(8.0f) + measuredWidth, getMeasuredWidth(), 0.0f);
        float i2 = Utilities.i(gl.L(10.0f) + measuredWidth, getMeasuredWidth(), gl.L(24.0f));
        float i3 = Utilities.i(measuredWidth - gl.L(this.s >= 0.7f ? 24.0f : 10.0f), getMeasuredWidth(), 0.0f);
        float i4 = Utilities.i(measuredWidth - gl.L(8.0f), getMeasuredWidth(), 0.0f);
        Path path = this.a;
        path.rewind();
        float f = measuredHeight;
        float f2 = f - (f / 2.0f);
        path.moveTo(i3, f2 - gl.L(2.0f));
        path.lineTo(i3, f);
        path.lineTo(i4, f);
        path.lineTo(measuredWidth, gl.L(8.0f) + measuredHeight);
        if (this.s < 0.7f) {
            path.lineTo(i, f);
        }
        path.lineTo(i2, f);
        path.lineTo(i2, f2 - gl.L(2.0f));
        path.close();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float globalXOffset;
        float globalXOffset2;
        int measuredHeight = getMeasuredHeight() - gl.L(8.0f);
        LimitPreviewView limitPreviewView = this.E;
        Paint paint = limitPreviewView.L;
        if (limitPreviewView.K) {
            measuredHeight = getMeasuredHeight();
            nh8 d = nh8.d();
            int measuredWidth = limitPreviewView.getMeasuredWidth();
            int measuredHeight2 = limitPreviewView.getMeasuredHeight();
            globalXOffset2 = limitPreviewView.getGlobalXOffset();
            d.f(globalXOffset2 - getX(), -getTop(), measuredWidth, measuredHeight2);
            RectF rectF = gl.P;
            rectF.set(0.0f, gl.L(3.0f), getMeasuredWidth(), measuredHeight - gl.L(3.0f));
            float f = measuredHeight / 2.0f;
            nh8 d2 = nh8.d();
            Paint paint2 = d2.c;
            if (paint2 == null) {
                paint2 = new Paint(1);
                d2.c = paint2;
            }
            paint2.setColor(bkb.w0(null, bkb.Ei, false));
            canvas.drawRoundRect(rectF, f, f, d2.c);
        } else {
            if (this.w) {
                this.w = false;
                b();
            }
            nh8 d3 = nh8.d();
            int measuredWidth2 = limitPreviewView.getMeasuredWidth();
            int measuredHeight3 = limitPreviewView.getMeasuredHeight();
            globalXOffset = limitPreviewView.getGlobalXOffset();
            d3.f(globalXOffset - getX(), -getTop(), measuredWidth2, measuredHeight3);
            RectF rectF2 = gl.P;
            float f2 = measuredHeight;
            rectF2.set(0.0f, 0.0f, getMeasuredWidth(), f2);
            float f3 = f2 / 2.0f;
            boolean z = limitPreviewView.S;
            TextPaint textPaint = this.c;
            canvas.drawRoundRect(rectF2, f3, f3, z ? paint : limitPreviewView.e() ? textPaint : nh8.d().e());
            Paint e = nh8.d().e();
            CornerPathEffect cornerPathEffect = this.b;
            e.setPathEffect(cornerPathEffect);
            if (limitPreviewView.e()) {
                textPaint.setPathEffect(cornerPathEffect);
            }
            if (!limitPreviewView.S) {
                paint = limitPreviewView.e() ? textPaint : nh8.d().e();
            }
            canvas.drawPath(this.a, paint);
            nh8.d().e().setPathEffect(null);
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
            canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - gl.L(8.0f));
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
                n16 n16Var = (n16) arrayList.get(i2);
                canvas.save();
                boolean z2 = n16Var.a;
                ArrayList arrayList2 = n16Var.b;
                if (z2) {
                    canvas.translate(n16Var.e + measuredWidth3, ((i * n16Var.c) + height) - ((1 - arrayList2.size()) * i));
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        canvas.translate(0.0f, -i);
                        ((StaticLayout) arrayList2.get(i3)).draw(canvas);
                    }
                } else {
                    boolean z3 = n16Var.d;
                    float f4 = n16Var.e;
                    float f5 = n16Var.c;
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
            canvas.drawRect(gl.L(12.0f), gl.L(10.0f), getMeasuredWidth() - gl.L(12.0f), getMeasuredHeight() - gl.L(10.0f), ((lo0) ((sg0) limitPreviewView.f0).b).u0(getX(), getY()));
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        SpannableStringBuilder spannableStringBuilder = this.f;
        TextPaint textPaint = this.c;
        this.e = je5.h(spannableStringBuilder, textPaint);
        this.d = new StaticLayout(this.f, textPaint, gl.L(12.0f) + ((int) this.e), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.e = 0.0f;
        int i3 = 0;
        while (true) {
            int lineCount = this.d.getLineCount();
            float f = this.e;
            if (i3 >= lineCount) {
                setMeasuredDimension((int) (f + getPaddingRight() + getPaddingLeft()), gl.L(8.0f) + gl.L(44.0f));
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
