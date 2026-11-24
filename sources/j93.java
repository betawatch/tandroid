// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j93 extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;
    public boolean e;

    public j93(t93 t93Var, Context context) {
        super(context);
        anb.h(cmb.c6, null, this);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.d(28, 28.0f, (jb6.a0 ? 5 : 3) | 16, 18.0f, 0.0f, 18.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(2.0f);
        addView(linearLayout, qoe.i(-1.0f, -2.0f, (jb6.a0 ? 5 : 3) | 16, 64.0f, 0.0f, 20.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        if (jb6.a0) {
            linearLayout2.setGravity(5);
        }
        linearLayout2.setWeightSum(2.0f);
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 16.0f);
        int i = cmb.F6;
        anb.X(textView, i, null);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setSingleLine();
        textView.setLines(1);
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setImageResource(R.drawable.arrow_more);
        anb.s(imageView2, i, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setTranslationY(gm.L(1.0f));
        imageView2.setVisibility(8);
        if (jb6.a0) {
            linearLayout2.addView(imageView2, qoe.t(16, 16, 21, 3, 0, 0, 0));
            linearLayout2.addView(textView, qoe.r(-2, -2, 21));
        } else {
            linearLayout2.addView(textView, qoe.r(-2, -2, 16));
            linearLayout2.addView(imageView2, qoe.t(16, 16, 16, 3, 0, 0, 0));
        }
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 16.0f);
        anb.X(textView2, cmb.n6, null);
        textView2.setGravity(jb6.a0 ? 3 : 5);
        if (jb6.a0) {
            linearLayout.addView(textView2, qoe.r(-2, -2, 19));
            linearLayout.addView(linearLayout2, qoe.p(0, -2, 2.0f, 21));
        } else {
            linearLayout.addView(linearLayout2, qoe.p(0, -2, 2.0f, 16));
            linearLayout.addView(textView2, qoe.r(-2, -2, 21));
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawLine(jb6.a0 ? 0.0f : gm.L(64.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (jb6.a0 ? gm.L(64.0f) : 0), getMeasuredHeight() - 1, cmb.j0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }
}
