// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class f76 extends TextView {
    public int a;
    public final xl3 b;

    public f76(Context context) {
        super(context);
        this.a = -1;
        this.b = new xl3((byte) 7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.a;
        if (i < 0) {
            i = getLayout() == null ? 0 : (int) getLayout().getLineWidth(0);
            this.a = i;
        }
        if (i <= gl.L(100.0f)) {
            super.onDraw(canvas);
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), kk7.d4, 31);
        super.onDraw(canvas);
        canvas.save();
        RectF rectF = gl.P;
        rectF.set(getWidth() - gl.L(15.0f), 0.0f, getWidth(), getHeight());
        this.b.s(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(100.0f), TLObject.FLAG_31), i2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.a = -1;
    }
}
