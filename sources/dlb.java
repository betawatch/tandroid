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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class dlb extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public boolean e;

    public dlb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        yob.X(textView, aob.G6, null);
        ik8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((ob6.a0 ? 5 : 3) | 16);
        addView(textView, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        yob.X(textView2, aob.z6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(ob6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        addView(textView2, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.m6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, tre.d(52, 52.0f, (ob6.a0 ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
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
        textView.setPadding(ob6.a0 ? 0 : hl.L(50.0f), 0, ob6.a0 ? hl.L(50.0f) : 0, 0);
        textView2.setPadding(ob6.a0 ? 0 : hl.L(50.0f), 0, ob6.a0 ? hl.L(50.0f) : 0, this.e ? hl.L(12.0f) : 0);
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
        if (!this.d || aob.j0 == null) {
            return;
        }
        boolean z = ob6.a0;
        ImageView imageView = this.c;
        if (z) {
            L = 0.0f;
        } else {
            L = hl.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (ob6.a0) {
            i = hl.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
        }
    }

    public void setMultilineDetail(boolean z) {
        this.e = z;
        TextView textView = this.b;
        if (z) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, hl.L(12.0f));
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
