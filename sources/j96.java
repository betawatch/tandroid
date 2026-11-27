// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class j96 extends TextView {
    public int a;
    public final pm3 b;

    public j96(Context context) {
        super(context);
        this.a = -1;
        this.b = new pm3((byte) 7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.a;
        if (i < 0) {
            i = getLayout() == null ? 0 : (int) getLayout().getLineWidth(0);
            this.a = i;
        }
        if (i <= hl.L(100.0f)) {
            super.onDraw(canvas);
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), jn7.d4, 31);
        super.onDraw(canvas);
        canvas.save();
        RectF rectF = hl.P;
        rectF.set(getWidth() - hl.L(15.0f), 0.0f, getWidth(), getHeight());
        this.b.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(100.0f), TLObject.FLAG_31), i2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.a = -1;
    }
}
