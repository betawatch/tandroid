package di;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.ui.Components.m80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h0 extends LinearLayout {
    public final ImageView a;
    public final m80 b;
    public final m80 c;

    public h0(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        setOrientation(0);
        setPadding(org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), 0, org.telegram.messenger.g0.L(i7 == 1 ? 11.0f : 32.0f), org.telegram.messenger.g0.L(i7 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, c8.ma.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        m80 m80Var = new m80(context, null);
        this.b = m80Var;
        m80Var.setTypeface(org.telegram.messenger.g0.o());
        m80Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var, i10, h6Var);
        int i11 = org.telegram.ui.ActionBar.m6.Xc;
        org.telegram.ui.ActionBar.t6.G(m80Var, i11, h6Var);
        linearLayout.addView(m80Var, c8.ma.t(-1, -2, 7, 0, 0, 0, 3));
        m80 m80Var2 = new m80(context, null);
        this.c = m80Var2;
        m80Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.t6.U(m80Var2, org.telegram.ui.ActionBar.m6.z6, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var2, i11, h6Var);
        linearLayout.addView(m80Var2, c8.ma.r(-1, -2, 7));
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
