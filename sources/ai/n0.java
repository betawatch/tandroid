package ai;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.y90;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class n0 extends LinearLayout {
    public final ImageView a;
    public final y90 b;
    public final y90 c;

    public n0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.t(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        y90 y90Var = new y90(context, null);
        this.b = y90Var;
        y90Var.setTypeface(AndroidUtilities.bold());
        y90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var, i11, g6Var);
        int i12 = org.telegram.ui.ActionBar.k6.gc;
        org.telegram.ui.ActionBar.r6.I(y90Var, i12, g6Var);
        linearLayout.addView(y90Var, w7.z5.t(-1, -2, 7, 0, 0, 0, 3));
        y90 y90Var2 = new y90(context, null);
        this.c = y90Var2;
        y90Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.W(y90Var2, org.telegram.ui.ActionBar.k6.z6, g6Var);
        org.telegram.ui.ActionBar.r6.I(y90Var2, i12, g6Var);
        linearLayout.addView(y90Var2, w7.z5.q(-1, -2, 7));
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
