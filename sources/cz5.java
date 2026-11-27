// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadioButton;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cz5 extends FrameLayout {
    public final RadioButton a;
    public final TextView b;
    public final TextView c;
    public boolean d;
    public mb6 e;
    public final byte f;

    public cz5(Context context) {
        super(context);
        this.f = (byte) 62;
        if (aob.j0 == null) {
            aob.Q(context);
        }
        setWillNotDraw(false);
        RadioButton radioButton = new RadioButton(context);
        this.a = radioButton;
        radioButton.setSize(hl.L(20.0f));
        yob.O(radioButton, aob.D5, aob.E5, null);
        boolean z = ob6.a0;
        addView(radioButton, tre.d(22, 22.0f, (z ? 5 : 3) | 16, z ? 0 : 20, 0.0f, z ? 20 : 0, 0.0f));
        TextView textView = new TextView(context);
        this.b = textView;
        yob.X(textView, aob.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        boolean z2 = ob6.a0;
        addView(textView, tre.d(-1, -1.0f, (z2 ? 5 : 3) | 48, z2 ? 23.0f : 62.0f, 0.0f, z2 ? 62.0f : 23.0f, 17.0f));
        TextView textView2 = new TextView(context);
        this.c = textView2;
        yob.X(textView2, aob.r5, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setSingleLine(true);
        textView2.setEllipsize(truncateAt);
        textView2.setGravity((ob6.a0 ? 5 : 3) | 16);
        boolean z3 = ob6.a0;
        addView(textView2, tre.d(-1, -1.0f, (z3 ? 5 : 3) | 48, z3 ? 23.0f : 62.0f, 20.0f, z3 ? 62.0f : 23.0f, 0.0f));
    }

    public mb6 getCurrentLocale() {
        return this.e;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            boolean z = ob6.a0;
            byte b = this.f;
            canvas.drawLine(z ? 0.0f : hl.L(b - 3), getMeasuredHeight() - 1, getMeasuredWidth() - (ob6.a0 ? hl.L(b - 3) : 0), getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(60.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
