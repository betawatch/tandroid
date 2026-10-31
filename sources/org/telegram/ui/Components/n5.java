package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class n5 extends TextView {
    public int a;
    public PorterDuffColorFilter b;
    public k5 c;

    public n5(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = o5.update(this.a, this, this.c, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o5.release(this, this.c);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        float height = ((getGravity() & 16) == 0 || getLayout() == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        float paddingRight = org.telegram.messenger.cd.X ? getPaddingRight() : getPaddingLeft();
        if (height == 0.0f && paddingRight == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(paddingRight, height);
        }
        o5.drawAnimatedEmojis(canvas2, getLayout(), this.c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.b);
        if (height == 0.0f && paddingRight == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.c = o5.update(this.a, this, this.c, getLayout());
    }

    public void setCacheType(int i10) {
        if (this.a == i10) {
            return;
        }
        this.a = i10;
        this.c = o5.update(i10, this, this.c, getLayout());
    }

    public void setEmojiColor(int i10) {
        this.b = new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.c = o5.update(this.a, this, this.c, getLayout());
    }
}
