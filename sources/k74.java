// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class k74 extends LinearLayout {
    public final ImageView a;
    public final p66 b;
    public final p66 c;

    public k74(int i, vnb vnbVar, Context context) {
        super(context);
        setOrientation(0);
        setPadding(hl.L(i == 1 ? 11.0f : 32.0f), 0, hl.L(i == 1 ? 11.0f : 32.0f), hl.L(i == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i2 = aob.G6;
        yob.s(imageView, i2, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, tre.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        p66 p66Var = new p66(context, null);
        this.b = p66Var;
        p66Var.setTypeface(hl.o());
        p66Var.setTextSize(1, 14.0f);
        yob.X(p66Var, i2, vnbVar);
        int i3 = aob.Xc;
        yob.G(p66Var, i3, vnbVar);
        linearLayout.addView(p66Var, tre.t(-1, -2, 7, 0, 0, 0, 3));
        p66 p66Var2 = new p66(context, null);
        this.c = p66Var2;
        p66Var2.setTextSize(1, 14.0f);
        yob.X(p66Var2, aob.z6, vnbVar);
        yob.G(p66Var2, i3, vnbVar);
        linearLayout.addView(p66Var2, tre.r(-1, -2, 7));
        addView(linearLayout, tre.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i);
        this.b.setText(charSequence);
        this.c.setText(charSequence2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
