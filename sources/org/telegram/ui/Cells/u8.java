package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class u8 extends FrameLayout {
    public static Paint d;
    public final TextView a;
    public int b;
    public float c;

    public u8(Context context) {
        super(context);
        this.c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextColor(-14606047);
        textView.setTextSize(1, 16.0f);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((id.a0 ? 5 : 3) | 16);
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(3.0f));
        boolean z9 = id.a0;
        addView(textView, c8.ha.d(-1, -1.0f, (z9 ? 5 : 3) | 48, z9 ? 21 : 57, 0.0f, z9 ? 57 : 21, 0.0f));
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i7 = this.b;
        if (i7 != 0) {
            d.setColor(i7);
            d.setAlpha((int) (this.c * 255.0f));
            canvas.drawCircle(!id.a0 ? org.telegram.messenger.g0.L(28.0f) : getMeasuredWidth() - org.telegram.messenger.g0.L(28.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(10.0f), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(50.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.c = f10;
        invalidate();
    }
}
