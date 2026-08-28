package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.TextView;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class s5 extends TextView {
    public int a;
    public PorterDuffColorFilter b;
    public p5 c;

    public s5(Context context) {
        super(context);
        this.a = 0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = t5.update(this.a, this, this.c, getLayout());
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t5.release(this, this.c);
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        float height = ((getGravity() & 16) == 0 || getLayout() == null) ? 0.0f : ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
        float paddingRight = LocaleController.isRTL ? getPaddingRight() : getPaddingLeft();
        if (height == 0.0f && paddingRight == 0.0f) {
            canvas2 = canvas;
        } else {
            canvas.save();
            canvas2 = canvas;
            canvas2.translate(paddingRight, height);
        }
        t5.drawAnimatedEmojis(canvas2, getLayout(), this.c, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f, this.b);
        if (height == 0.0f && paddingRight == 0.0f) {
            return;
        }
        canvas.restore();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        this.c = t5.update(this.a, this, this.c, getLayout());
    }

    public void setCacheType(int i9) {
        if (this.a == i9) {
            return;
        }
        this.a = i9;
        this.c = t5.update(i9, this, this.c, getLayout());
    }

    public void setEmojiColor(int i9) {
        this.b = new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        this.c = t5.update(this.a, this, this.c, getLayout());
    }
}
