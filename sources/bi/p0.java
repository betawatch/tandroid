package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.z90;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class p0 extends LinearLayout {
    public final ImageView a;
    public final z90 b;
    public final z90 c;

    public p0(Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        setOrientation(0);
        setPadding(AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), 0, AndroidUtilities.dp(i10 == 1 ? 11.0f : 32.0f), AndroidUtilities.dp(i10 == 1 ? 8.0f : 12.0f));
        ImageView imageView = new ImageView(context);
        this.a = imageView;
        int i11 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.f7.t(imageView, i11, null, PorterDuff.Mode.SRC_IN);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, gb1.x(24, 24, 51, 0, 6, 16, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        z90 z90Var = new z90(context, null);
        this.b = z90Var;
        z90Var.setTypeface(AndroidUtilities.bold());
        z90Var.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var, i11, u6Var);
        int i12 = org.telegram.ui.ActionBar.y6.gc;
        org.telegram.ui.ActionBar.f7.H(z90Var, i12, u6Var);
        linearLayout.addView(z90Var, gb1.x(-1, -2, 7, 0, 0, 0, 3));
        z90 z90Var2 = new z90(context, null);
        this.c = z90Var2;
        z90Var2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(z90Var2, org.telegram.ui.ActionBar.y6.z6, u6Var);
        org.telegram.ui.ActionBar.f7.H(z90Var2, i12, u6Var);
        linearLayout.addView(z90Var2, gb1.u(-1, -2, 7));
        addView(linearLayout, gb1.t(-1, -2, 1.0f, 55, 0, 0, 0, 0));
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
