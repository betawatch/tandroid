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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class oaa extends FrameLayout {
    public final TextView a;
    public final TextView b;
    public final ImageView c;
    public boolean d;
    public byte e;

    public oaa(Context context) {
        super(context);
        int i;
        float f;
        int i2;
        float f2;
        TextView textView = new TextView(context);
        this.a = textView;
        anb.X(textView, cmb.F6, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity(jb6.a0 ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = jb6.a0;
        if (z) {
            f = 16.0f;
            i = 5;
        } else {
            i = 3;
            f = 71.0f;
        }
        addView(textView, qoe.d(-2, -2.0f, i, f, 10.0f, z ? 71.0f : 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.b = textView2;
        anb.X(textView2, cmb.y6, null);
        wi8.w(textView2, 1, 13.0f, 1, 1);
        textView2.setSingleLine(true);
        textView2.setGravity(jb6.a0 ? 5 : 3);
        boolean z2 = jb6.a0;
        if (z2) {
            f2 = 16.0f;
            i2 = 5;
        } else {
            i2 = 3;
            f2 = 71.0f;
        }
        addView(textView2, qoe.d(-2, -2.0f, i2, f2, 33.0f, z2 ? 71.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.c = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.l6, null, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.d(48, 48.0f, jb6.a0 ? 5 : 3, 10.0f, 8.0f, 10.0f, 0.0f));
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
                    anb.x(this, mutate, cmb.F6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new naa(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = gm.L(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (i2 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                        mutate2.setBounds(0, 0, mutate2.getIntrinsicWidth(), mutate2.getIntrinsicHeight());
                        anb.x(this, mutate2, cmb.y6, null, PorterDuff.Mode.MULTIPLY);
                        spannableStringBuilder2.setSpan(new naa(mutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i2]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = gm.L(10.0f);
            } else {
                layoutParams.topMargin = gm.L(21.0f);
                textView2.setVisibility(8);
            }
        }
        int L = gm.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int L2 = gm.L(16.0f);
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
        layoutParams.leftMargin = gm.L(jb6.a0 ? 16.0f : 71.0f);
        layoutParams.rightMargin = gm.L(jb6.a0 ? 71.0f : 16.0f);
        TextView textView2 = this.b;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (i2 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable mutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
                    anb.x(this, mutate, cmb.y6, null, PorterDuff.Mode.MULTIPLY);
                    spannableStringBuilder.setSpan(new naa(mutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i2]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = gm.L(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.leftMargin = gm.L(jb6.a0 ? 16.0f : 71.0f);
            layoutParams2.rightMargin = gm.L(jb6.a0 ? 71.0f : 16.0f);
        } else {
            layoutParams.topMargin = gm.L(21.0f);
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
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(this.e), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(this.e) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.d ? 1 : 0), TLObject.FLAG_30));
    }
}
