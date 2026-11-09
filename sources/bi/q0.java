package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.x70;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q0 extends LinearLayout {
    public final ImageView a;
    public final x70 b;
    public final x70 c;

    public q0(int i7, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), 0, org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), org.telegram.messenger.g0.L(i7 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i10 = org.telegram.ui.ActionBar.l6.G6;
        org.telegram.ui.ActionBar.s6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        x70 x70Var = new x70(context, null);
        this.b = x70Var;
        x70Var.setTypeface(org.telegram.messenger.g0.o());
        x70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var, i10, g6Var);
        int i11 = org.telegram.ui.ActionBar.l6.Uc;
        org.telegram.ui.ActionBar.s6.G(x70Var, i11, g6Var);
        linearLayout.addView(x70Var, c8.ha.t(-1, -2, 7, 0, 0, 0, 3));
        x70 x70Var2 = new x70(context, null);
        this.c = x70Var2;
        x70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(x70Var2, org.telegram.ui.ActionBar.l6.z6, g6Var);
        org.telegram.ui.ActionBar.s6.G(x70Var2, i11, g6Var);
        linearLayout.addView(x70Var2, c8.ha.r(-1, -2, 7));
        addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 55, 0, 0, 0, 0));
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
