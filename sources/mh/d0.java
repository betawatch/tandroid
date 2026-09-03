package mh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.g90;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class d0 extends LinearLayout {
    public final ImageView a;
    public final g90 b;
    public final g90 c;

    public d0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.c6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        g90 g90Var = new g90(context, null);
        this.b = g90Var;
        g90Var.setTypeface(AndroidUtilities.bold());
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        int i12 = org.telegram.ui.ActionBar.k6.gc;
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        linearLayout.addView(g90Var, k7.c6.t(-1, -2, 7, 0, 0, 0, 3));
        g90 g90Var2 = new g90(context, null);
        this.c = g90Var2;
        g90Var2.setTextSize(1, 14.0f);
        g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.z6, g6Var));
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        linearLayout.addView(g90Var2, k7.c6.q(-1, -2, 7));
        addView(linearLayout, k7.c6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.a.setImageResource(i10);
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
