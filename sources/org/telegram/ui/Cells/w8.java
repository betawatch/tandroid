package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w8 extends FrameLayout {
    public static Paint d;
    public final TextView a;
    public int b;
    public float c;

    public w8(Context context) {
        super(context);
        this.c = 1.0f;
        if (d == null) {
            d = new Paint(1);
        }
        TextView textView = new TextView(context);
        this.a = textView;
        ll.s(textView, -14606047, 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 16);
        textView.setPadding(0, 0, 0, AndroidUtilities.dp(3.0f));
        boolean z10 = LocaleController.isRTL;
        addView(textView, g7.e6.d(-1, -1.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 57, 0.0f, z10 ? 57 : 21, 0.0f));
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i9 = this.b;
        if (i9 != 0) {
            d.setColor(i9);
            d.setAlpha((int) (this.c * 255.0f));
            canvas.drawCircle(!LocaleController.isRTL ? AndroidUtilities.dp(28.0f) : getMeasuredWidth() - AndroidUtilities.dp(28.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(10.0f), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f10) {
        this.c = f10;
        invalidate();
    }
}
