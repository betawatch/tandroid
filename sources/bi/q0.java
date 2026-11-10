package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class q0 extends LinearLayout {
    public final ImageView a;
    public final w70 b;
    public final w70 c;

    public q0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), 0, org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), org.telegram.messenger.g0.L(i7 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        w70 w70Var = new w70(context, null);
        this.b = w70Var;
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var, i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Uc;
        org.telegram.ui.ActionBar.t6.G(w70Var, i11, h6Var);
        linearLayout.addView(w70Var, c8.ha.t(-1, -2, 7, 0, 0, 0, 3));
        w70 w70Var2 = new w70(context, null);
        this.c = w70Var2;
        w70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(w70Var2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        org.telegram.ui.ActionBar.t6.G(w70Var2, i11, h6Var);
        linearLayout.addView(w70Var2, c8.ha.r(-1, -2, 7));
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
