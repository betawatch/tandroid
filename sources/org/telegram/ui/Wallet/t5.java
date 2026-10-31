package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.z20;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t5 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final org.telegram.ui.ActionBar.p6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public t5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.a = p6Var;
        setPadding(org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, w7.b6.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.b6.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        sc.e.t(textView, 1, 14.0f);
        TextView f7 = z20.f(linearLayout, textView, w7.b6.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f7;
        f7.setTextSize(1, 14.0f);
        linearLayout.addView(f7, w7.b6.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i10, CharSequence charSequence, CharSequence charSequence2) {
        this.b.setImageResource(i10);
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.z6));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.p6 p6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.w0(i10, p6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.z6, p6Var));
    }
}
