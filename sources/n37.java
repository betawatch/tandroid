// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class n37 extends hm {
    public final /* synthetic */ q37 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n37(q37 q37Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = q37Var;
    }

    @Override // hm, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i5 + i3;
        int i7 = this.measuredSize;
        this.a.c.set((int) f, (i6 - i7) / 2, (int) (f + i7), (i6 + i7) / 2);
    }
}
