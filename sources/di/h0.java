package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.k80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class h0 extends LinearLayout {
    public final ImageView a;
    public final k80 b;
    public final k80 c;

    public h0(int i7, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), 0, org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), org.telegram.messenger.g0.L(i7 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        k80 k80Var = new k80(context, null);
        this.b = k80Var;
        k80Var.setTypeface(org.telegram.messenger.g0.o());
        k80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var, i10, i6Var);
        int i11 = org.telegram.ui.ActionBar.n6.Xc;
        org.telegram.ui.ActionBar.u6.G(k80Var, i11, i6Var);
        linearLayout.addView(k80Var, c8.ma.t(-1, -2, 7, 0, 0, 0, 3));
        k80 k80Var2 = new k80(context, null);
        this.c = k80Var2;
        k80Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(k80Var2, org.telegram.ui.ActionBar.n6.z6, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var2, i11, i6Var);
        linearLayout.addView(k80Var2, c8.ma.r(-1, -2, 7));
        addView(linearLayout, c8.ma.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.a.setImageResource(i7);
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
