package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public class o5 extends TextView {
    public int a;
    public PorterDuffColorFilter b;
    public l5 c;

    public o5(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = p5.update(this.a, this, this.c, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        p5.release(this, this.c);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        float height = ((getGravity() & 16) == 0 || getLayout() == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        float paddingRight = org.telegram.messenger.hd.a0 ? getPaddingRight() : getPaddingLeft();
        if (height == 0.0f && paddingRight == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(paddingRight, height);
        }
        p5.drawAnimatedEmojis(canvas2, getLayout(), this.c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.b);
        if (height == 0.0f && paddingRight == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        this.c = p5.update(this.a, this, this.c, getLayout());
    }

    public void setCacheType(int i7) {
        if (this.a == i7) {
            return;
        }
        this.a = i7;
        this.c = p5.update(i7, this, this.c, getLayout());
    }

    public void setEmojiColor(int i7) {
        this.b = new PorterDuffColorFilter(i7, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.c = p5.update(this.a, this, this.c, getLayout());
    }
}
