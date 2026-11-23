package di;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class d4 extends TextView {
    public final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(Context context, float f10) {
        super(context);
        this.a = f10;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        if (View.MeasureSpec.getMode(i7) != 0) {
            int size = (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight();
            TextPaint textPaint = new TextPaint(getPaint());
            float f10 = this.a;
            textPaint.setTextSize(f10);
            if (textPaint.measureText("0000 0000 0000 0000") > size && size > 0) {
                f10 = (float) Math.floor((f10 * r3) / r1);
            }
            if (getTextSize() != f10) {
                setTextSize(0, f10);
            }
        }
        super.onMeasure(i7, i10);
    }
}
