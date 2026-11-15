package gi;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o extends LinearLayout {
    public final TextView a;
    public final TextView b;
    public boolean c;

    public o(Context context) {
        super(context);
        setPadding(g0.L(22.0f), 0, g0.L(22.0f), 0);
        setOrientation(1);
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setTextSize(1, 16.0f);
        q6.U(textView, j6.j5, null);
        textView.setGravity(hd.a0 ? 5 : 3);
        addView(textView, ja.t(-1, -2, 51, 0, 7, 0, 0));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        textView2.setTextSize(1, 13.0f);
        q6.U(textView2, j6.q5, null);
        textView2.setGravity(hd.a0 ? 5 : 3);
        addView(textView2, ja.t(-1, -2, 51, 0, 4, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.c) {
            canvas.drawRect(getPaddingLeft(), getHeight() - 1, getWidth(), getHeight(), j6.k0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(g0.L(56.0f), TLObject.FLAG_30));
    }
}
