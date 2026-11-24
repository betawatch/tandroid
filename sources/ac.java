// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ac extends FrameLayout {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public ac(wjb wjbVar, Context context, boolean z) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i = bkb.F6;
        zkb.s(imageView, i, wjbVar, PorterDuff.Mode.SRC_IN);
        addView(imageView, nme.d(24, 24.0f, 51, 20.0f, 11.46f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, nme.d(-1, -2.0f, 23, 64.0f, z ? 2.0f : 9.8f, 24.0f, z ? 4.0f : 9.8f));
        TextView textView = new TextView(context);
        this.b = textView;
        zkb.X(textView, i, wjbVar);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 14.0f);
        TextView m = ug8.m(linearLayout, textView, nme.t(-1, -2, 55, 0, 0, 0, 1), context);
        this.c = m;
        zkb.X(m, bkb.y6, wjbVar);
        m.setTextSize(1, 14.0f);
        linearLayout.addView(m, nme.t(-1, -2, 55, 0, 0, 0, 0));
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setText(CharSequence charSequence) {
        this.c.setText(charSequence);
    }
}
