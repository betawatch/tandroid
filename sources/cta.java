// default package

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cta extends TextView {
    public final /* synthetic */ float a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cta(Context context, float f) {
        super(context);
        this.a = f;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 0) {
            int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
            TextPaint textPaint = new TextPaint(getPaint());
            float f = this.a;
            textPaint.setTextSize(f);
            if (textPaint.measureText("0000 0000 0000 0000") > size && size > 0) {
                f = (float) Math.floor((f * r3) / r1);
            }
            if (getTextSize() != f) {
                setTextSize(0, f);
            }
        }
        super.onMeasure(i, i2);
    }
}
