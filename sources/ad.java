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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ad extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public ad(Context context, wjb wjbVar) {
        super(context);
        int i = bkb.H5;
        Drawable f0 = bkb.f0(bkb.v0(i, wjbVar), 2, -1);
        vkb M = zkb.M(i);
        setBackground(f0);
        zkb.j(this, f0, null, M, wjbVar);
        setPadding(gl.L(23.0f), 0, gl.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        zkb.s(imageView, bkb.I5, wjbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, nme.e(-2, 40, (k96.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        zkb.X(textView, bkb.i5, wjbVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, nme.e(-2, -2, (k96.a0 ? 5 : 3) | 16));
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
            textView.setPadding(k96.a0 ? 0 : gl.L(56.0f), 0, k96.a0 ? gl.L(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
