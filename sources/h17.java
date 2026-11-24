// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class h17 extends gm {
    public final /* synthetic */ j17 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h17(j17 j17Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = j17Var;
    }

    @Override // gm, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        j17 j17Var = this.a;
        int i6 = j17Var.E;
        int i7 = i5 + i3;
        int i8 = this.measuredSize;
        j17Var.c.set((int) f, ug8.g(i7, i8, 2, i6), (int) (f + i8), ((i7 + i8) / 2) + i6);
    }
}
