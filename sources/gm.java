// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public class gm extends TextView {
    public int a;
    public PorterDuffColorFilter b;
    public dm c;

    public gm(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = hm.update(this.a, this, this.c, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hm.release(this, this.c);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        float height = ((getGravity() & 16) == 0 || getLayout() == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        float paddingRight = ob6.a0 ? getPaddingRight() : getPaddingLeft();
        if (height == 0.0f && paddingRight == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(paddingRight, height);
        }
        hm.drawAnimatedEmojis(canvas2, getLayout(), this.c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.b);
        if (height == 0.0f && paddingRight == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.c = hm.update(this.a, this, this.c, getLayout());
    }

    public void setCacheType(int i) {
        if (this.a == i) {
            return;
        }
        this.a = i;
        this.c = hm.update(i, this, this.c, getLayout());
    }

    public void setEmojiColor(int i) {
        this.b = new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.c = hm.update(this.a, this, this.c, getLayout());
    }
}
