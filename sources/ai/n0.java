package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.x90;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class n0 extends LinearLayout {
    public final ImageView a;
    public final x90 b;
    public final x90 c;

    public n0(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i11, false), PorterDuff.Mode.SRC_IN));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        x90 x90Var = new x90(context, null);
        this.b = x90Var;
        x90Var.setTypeface(AndroidUtilities.bold());
        x90Var.setTextSize(1, 14.0f);
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, d6Var));
        int i12 = org.telegram.ui.ActionBar.h6.gc;
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        linearLayout.addView(x90Var, w7.z5.t(-1, -2, 7, 0, 0, 0, 3));
        x90 x90Var2 = new x90(context, null);
        this.c = x90Var2;
        x90Var2.setTextSize(1, 14.0f);
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.z6, d6Var));
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        linearLayout.addView(x90Var2, w7.z5.q(-1, -2, 7));
        addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 55, 0, 0, 0, 0));
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
