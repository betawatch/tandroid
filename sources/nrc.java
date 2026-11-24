// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class nrc extends ReplacementSpan {
    public final String a;
    public final String b;
    public final boolean c;
    public float d;
    public int e;
    public int f;
    public prc h;
    public prc n;
    public final /* synthetic */ qrc r;

    public nrc(qrc qrcVar, String str, boolean z, boolean z2) {
        this.r = qrcVar;
        this.a = str;
        this.b = z ? qrcVar.Q : "";
        this.c = z2;
    }

    public final int a() {
        return Math.round((qrc.T.getInterpolation(this.r.J) * (this.f - r0)) + this.e);
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
        prc prcVar = this.n;
        if (prcVar != null) {
            paint2 = paint;
            i6 = i4;
            canvas2 = canvas;
            prcVar.b(canvas2, paint2, this.b, f2, i6);
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
