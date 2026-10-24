package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.sl;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f5 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public f5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        setPadding(AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, w7.z5.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        com.google.android.gms.internal.play_billing.k3.m(14.0f, 1, textView);
        TextView f7 = sl.f(linearLayout, textView, w7.z5.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f7;
        f7.setTextSize(1, 14.0f);
        linearLayout.addView(f7, w7.z5.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, int i10) {
        this.b.setImageResource(i10);
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, g6Var));
    }
}
