// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ejb extends FrameLayout {
    public static Paint d;
    public final TextView a;
    public int b;
    public float c;

    public ejb(Context context) {
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
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        textView.setPadding(0, 0, 0, gm.L(3.0f));
        boolean z = jb6.a0;
        addView(textView, qoe.d(-1, -1.0f, (z ? 5 : 3) | 48, z ? 21 : 57, 0.0f, z ? 57 : 21, 0.0f));
    }

    @Override // android.view.View
    public float getAlpha() {
        return this.c;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.b;
        if (i != 0) {
            d.setColor(i);
            d.setAlpha((int) (this.c * 255.0f));
            canvas.drawCircle(!jb6.a0 ? gm.L(28.0f) : getMeasuredWidth() - gm.L(28.0f), getMeasuredHeight() / 2, gm.L(10.0f), d);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(50.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.c = f;
        invalidate();
    }
}
