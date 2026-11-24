// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class f96 extends TextView {
    public int a;
    public final in3 b;

    public f96(Context context) {
        super(context);
        this.a = -1;
        this.b = new in3((byte) 7);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.a;
        if (i < 0) {
            i = getLayout() == null ? 0 : (int) getLayout().getLineWidth(0);
            this.a = i;
        }
        if (i <= gm.L(100.0f)) {
            super.onDraw(canvas);
            return;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), nm7.d4, 31);
        super.onDraw(canvas);
        canvas.save();
        RectF rectF = gm.P;
        rectF.set(getWidth() - gm.L(15.0f), 0.0f, getWidth(), getHeight());
        this.b.r(canvas, rectF, 2, 1.0f);
        canvas.restore();
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(100.0f), TLObject.FLAG_31), i2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.a = -1;
    }
}
