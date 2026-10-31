package mg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import org.telegram.messenger.h6;
import org.telegram.ui.Components.da0;
import org.telegram.ui.wh0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d2 extends ReplacementSpan {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d2(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
        int i15 = this.a;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        switch (this.a) {
            case 0:
                return (int) ((i2) this.b).l2;
            case 1:
                return ((h6) this.b).getSize(paint, charSequence, i10, i11, fontMetricsInt);
            case 2:
                return ((da0) this.b).y;
            default:
                return (int) ((wh0) this.b).f2;
        }
    }

    private final void a(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void b(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void c(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }

    private final void d(Canvas canvas, CharSequence charSequence, int i10, int i11, float f7, int i12, int i13, int i14, Paint paint) {
    }
}
