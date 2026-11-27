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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class bd extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public bd(Context context, vnb vnbVar) {
        super(context);
        int i = aob.I5;
        Drawable f0 = aob.f0(aob.v0(i, vnbVar), 2, -1);
        uob M = yob.M(i);
        setBackground(f0);
        yob.j(this, f0, null, M, vnbVar);
        setPadding(hl.L(23.0f), 0, hl.L(23.0f), 0);
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.J5, vnbVar, PorterDuff.Mode.MULTIPLY);
        addView(imageView, tre.e(-2, 40, (ob6.a0 ? 5 : 3) | 16));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        yob.X(textView, aob.j5, vnbVar);
        textView.setTextSize(1, 16.0f);
        addView(textView, tre.e(-2, -2, (ob6.a0 ? 5 : 3) | 16));
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
            textView.setPadding(ob6.a0 ? 0 : hl.L(56.0f), 0, ob6.a0 ? hl.L(56.0f) : 0, 0);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(48.0f), TLObject.FLAG_30));
    }

    public void setGravity(int i) {
        this.a.setGravity(i);
    }

    public void setTextColor(int i) {
        this.a.setTextColor(i);
    }
}
