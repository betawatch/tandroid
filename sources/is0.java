// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class is0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;

    public is0(Context context) {
        super(context);
        setPadding(gm.L(22.0f), 0, gm.L(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        anb.X(textView, cmb.i5, null);
        textView.setGravity(jb6.a0 ? 5 : 3);
        addView(textView, qoe.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        anb.X(textView2, cmb.p5, null);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        addView(textView2, qoe.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), cmb.j0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), TLObject.FLAG_30));
    }
}
