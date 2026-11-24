// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class o8a extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public byte e;

    public o8a(Context context) {
        super(context);
        int i;
        float f;
        int i2;
        float f2;
        TextView textView = new TextView(context);
        this.a = textView;
        zkb.X(textView, bkb.F6, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(k96.a0 ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = k96.a0;
        if (z) {
            f = 16.0f;
            i = 5;
        } else {
            i = 3;
            f = 71.0f;
        }
        addView(textView, nme.d(-2, -2.0f, i, f, 10.0f, z ? 71.0f : 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        zkb.X(textView2, bkb.y6, null);
        ug8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(k96.a0 ? 5 : 3);
        boolean z2 = k96.a0;
        if (z2) {
            f2 = 16.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f2 = 71.0f;
        }
        addView(textView2, nme.d(-2, -2.0f, i2, f2, 33.0f, z2 ? 71.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.l6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.d(48, 48.0f, k96.a0 ? 5 : 3, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    public final void a(CharSequence charSequence, String[] strArr, boolean z, boolean z2) {
        TextView textView = this.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.b;
        if (z) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    zkb.x(this, mutate, bkb.F6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new n8a(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = gl.L(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (i2 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        zkb.x(this, mutate2, bkb.y6, null, PorterDuff.Mode.MULTIPLY);
                        spannableStringBuilder2.setSpan(new n8a(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i2]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = gl.L(10.0f);
            } else {
                layoutParams.topMargin = gl.L(21.0f);
                textView2.setVisibility(8);
            }
        }
        int L = gl.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L2 = gl.L(16.0f);
        layoutParams2.rightMargin = L2;
        layoutParams2.leftMargin = L2;
        this.c.setVisibility(8);
        this.d = z2;
        setWillNotDraw(!z2);
        this.e = (byte) 16;
    }

    public final void b(CharSequence charSequence, String[] strArr, int i, boolean z) {
        TextView textView = this.a;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = gl.L(k96.a0 ? 16.0f : 71.0f);
        layoutParams.rightMargin = gl.L(k96.a0 ? 71.0f : 16.0f);
        TextView textView2 = this.b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (i2 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    zkb.x(this, mutate, bkb.y6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new n8a(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i2]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = gl.L(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.leftMargin = gl.L(k96.a0 ? 16.0f : 71.0f);
            layoutParams2.rightMargin = gl.L(k96.a0 ? 71.0f : 16.0f);
        } else {
            layoutParams.topMargin = gl.L(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.c;
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.e = (byte) 69;
        this.d = z;
        setWillNotDraw(!z);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.d) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(this.e), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(this.e) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
