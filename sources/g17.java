// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class g17 extends gm {
    public final /* synthetic */ j17 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g17(j17 j17Var, TLRPC.Document document, Paint.FontMetricsInt fontMetricsInt) {
        super(document, fontMetricsInt);
        this.a = j17Var;
    }

    @Override // gm, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6 = i5 + i3;
        int i7 = this.measuredSize;
        this.a.c.set((int) f, (i6 - i7) / 2, (int) (f + i7), (i6 + i7) / 2);
    }
}
