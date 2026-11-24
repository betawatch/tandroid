// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ir0 extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;

    public ir0(Context context) {
        super(context);
        setPadding(gl.L(22.0f), 0, gl.L(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        zkb.X(textView, bkb.i5, null);
        textView.setGravity(k96.a0 ? 5 : 3);
        addView(textView, nme.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        zkb.X(textView2, bkb.p5, null);
        textView2.setGravity(k96.a0 ? 5 : 3);
        addView(textView2, nme.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), bkb.j0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), TLObject.FLAG_30));
    }
}
