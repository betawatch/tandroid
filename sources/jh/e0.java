package jh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y80;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class e0 extends LinearLayout {
    public final ImageView a;
    public final y80 b;
    public final y80 c;

    public e0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, i7.f6.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y80 y80Var = new y80(context, null);
        this.b = y80Var;
        y80Var.setTypeface(AndroidUtilities.bold());
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        int i12 = org.telegram.ui.ActionBar.g6.gc;
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(y80Var, i7.f6.t(-1, -2, 7, 0, 0, 0, 3));
        y80 y80Var2 = new y80(context, null);
        this.c = y80Var2;
        y80Var2.setTextSize(1, 14.0f);
        y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.z6, c6Var));
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        linearLayout.addView(y80Var2, i7.f6.q(-1, -2, 7));
        addView(linearLayout, i7.f6.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
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
