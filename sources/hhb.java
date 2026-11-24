// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class hhb extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public boolean e;

    public hhb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, null);
        ug8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((k96.a0 ? 5 : 3) | 16);
        addView(textView, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, bkb.y6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(k96.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        addView(textView2, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, nme.d(52, 52.0f, (k96.a0 ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
    }

    public final void a(String str, String str2, boolean z) {
        this.a.setText(str);
        this.b.setText(str2);
        this.d = z;
        this.c.setVisibility(8);
        setWillNotDraw(!z);
    }

    public final void b(int i, String str, String str2, boolean z) {
        TextView textView = this.a;
        textView.setText(str);
        TextView textView2 = this.b;
        textView2.setText(str2);
        ImageView imageView = this.c;
        imageView.setImageResource(i);
        imageView.setVisibility(0);
        textView.setPadding(k96.a0 ? 0 : gl.L(50.0f), 0, k96.a0 ? gl.L(50.0f) : 0, 0);
        textView2.setPadding(k96.a0 ? 0 : gl.L(50.0f), 0, k96.a0 ? gl.L(50.0f) : 0, this.e ? gl.L(12.0f) : 0);
        this.d = z;
        setWillNotDraw(!z);
    }

    public TextView getTextView() {
        return this.a;
    }

    public TextView getValueTextView() {
        return this.b;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        if (!this.d || bkb.j0 == null) {
            return;
        }
        boolean z = k96.a0;
        ImageView imageView = this.c;
        if (z) {
            L = 0.0f;
        } else {
            L = gl.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (k96.a0) {
            i = gl.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
        }
    }

    public void setMultilineDetail(boolean z) {
        this.e = z;
        TextView textView = this.b;
        if (z) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, gl.L(12.0f));
            return;
        }
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setPadding(0, 0, 0, 0);
    }

    public void setValue(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
