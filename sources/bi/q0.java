package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class q0 extends LinearLayout {
    public final ImageView a;
    public final w70 b;
    public final w70 c;

    public q0(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), 0, org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), org.telegram.messenger.g0.L(i7 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ha.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        w70 w70Var = new w70(context, null);
        this.b = w70Var;
        w70Var.setTypeface(org.telegram.messenger.g0.o());
        w70Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var, i10, f6Var);
        int i11 = org.telegram.ui.ActionBar.k6.Uc;
        org.telegram.ui.ActionBar.r6.H(w70Var, i11, f6Var);
        linearLayout.addView(w70Var, c8.ha.t(-1, -2, 7, 0, 0, 0, 3));
        w70 w70Var2 = new w70(context, null);
        this.c = w70Var2;
        w70Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(w70Var2, org.telegram.ui.ActionBar.k6.z6, f6Var);
        org.telegram.ui.ActionBar.r6.H(w70Var2, i11, f6Var);
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
