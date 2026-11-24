// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ae extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public ae(Context context, ylb ylbVar) {
        super(context);
        int i = cmb.H5;
        Drawable f0 = cmb.f0(cmb.v0(i, ylbVar), 2, -1);
        wmb M = anb.M(i);
        setBackground(f0);
        anb.j(this, f0, null, M, ylbVar);
        setPadding(gm.L(23.0f), 0, gm.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        anb.s(imageView, cmb.I5, ylbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, qoe.e(-2, 40, (jb6.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        anb.X(textView, cmb.i5, ylbVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, qoe.e(-2, -2, (jb6.a0 ? 5 : 3) | 16));
    }

    public final void a(int i, CharSequence charSequence) {
        TextView textView = this.a;
        textView.setText(charSequence);
        ImageView imageView = this.b;
        if (i == 0) {
            imageView.setVisibility(4);
            textView.setPadding(0, 0, 0, 0);
        } else {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
            textView.setPadding(jb6.a0 ? 0 : gm.L(56.0f), 0, jb6.a0 ? gm.L(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
