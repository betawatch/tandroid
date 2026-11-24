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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class ijb extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public boolean e;

    public ijb(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        wi8.w(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity((jb6.a0 ? 5 : 3) | 16);
        addView(textView, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 10.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.y6, null);
        textView2.setTextSize(1, 13.0f);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        addView(textView2, qoe.d(-2, -2.0f, (jb6.a0 ? 5 : 3) | 48, 21.0f, 35.0f, 21.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setVisibility(8);
        addView(imageView, qoe.d(52, 52.0f, (jb6.a0 ? 5 : 3) | 48, 8.0f, 6.0f, 8.0f, 0.0f));
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
        textView.setPadding(jb6.a0 ? 0 : gm.L(50.0f), 0, jb6.a0 ? gm.L(50.0f) : 0, 0);
        textView2.setPadding(jb6.a0 ? 0 : gm.L(50.0f), 0, jb6.a0 ? gm.L(50.0f) : 0, this.e ? gm.L(12.0f) : 0);
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
        if (!this.d || cmb.j0 == null) {
            return;
        }
        boolean z = jb6.a0;
        ImageView imageView = this.c;
        if (z) {
            L = 0.0f;
        } else {
            L = gm.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        }
        float f = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (jb6.a0) {
            i = gm.L(imageView.getVisibility() == 0 ? 71.0f : 20.0f);
        } else {
            i = 0;
        }
        canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), 0);
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
        }
    }

    public void setMultilineDetail(boolean z) {
        this.e = z;
        TextView textView = this.b;
        if (z) {
            textView.setLines(0);
            textView.setMaxLines(0);
            textView.setSingleLine(false);
            textView.setPadding(0, 0, 0, gm.L(12.0f));
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
