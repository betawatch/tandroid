// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class auc extends ReplacementSpan {
    public final String a;
    public final String b;
    public final boolean c;
    public float d;
    public int e;
    public int f;
    public cuc h;
    public cuc n;
    public final /* synthetic */ duc r;

    public auc(duc ducVar, String str, boolean z, boolean z2) {
        this.r = ducVar;
        this.a = str;
        this.b = z ? ducVar.Q : "";
        this.c = z2;
    }

    public final int a() {
        return Math.round((duc.T.getInterpolation(this.r.J) * (this.f - r0)) + this.e);
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2;
        Paint paint2;
        int i6;
        float textSize = paint.getTextSize();
        if (this.c) {
            paint.setTextSize((28.0f * textSize) / 44.0f);
        }
        float f2 = f - this.d;
        cuc cucVar = this.n;
        if (cucVar != null) {
            paint2 = paint;
            i6 = i4;
            canvas2 = canvas;
            cucVar.b(canvas2, paint2, this.b, f2, i6);
        } else {
            canvas2 = canvas;
            paint2 = paint;
            i6 = i4;
        }
        this.h.b(canvas2, paint2, this.a, f2, i6);
        paint2.setTextSize(textSize);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            paint.getFontMetricsInt(fontMetricsInt);
        }
        return a();
    }
}
