package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.o10;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class g6 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.h6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public g6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        this.a = h6Var;
        setPadding(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, c8.ma.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ma.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        i5.c.x(textView, 1, 14.0f);
        TextView f10 = o10.f(linearLayout, textView, c8.ma.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ma.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.b.setImageResource(i7);
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.z6));
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.h6 h6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(i7, h6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.z6, h6Var));
    }
}
