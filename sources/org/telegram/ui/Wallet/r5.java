package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class r5 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public r5(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setPadding(org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(8.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        addView(imageView, c8.ha.d(28, 28.0f, 51, 0.0f, 2.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 55, 42.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        com.google.android.recaptcha.internal.a.q(textView, 1, 14.0f);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.d = f10;
        f10.setTextSize(1, 14.0f);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 55, 0, 0, 0, 2));
        updateColors();
    }

    public final void a(int i7, CharSequence charSequence, CharSequence charSequence2) {
        this.b.setImageResource(i7);
        this.c.setText(charSequence);
        this.d.setText(charSequence2);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.z6));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i7, f6Var), PorterDuff.Mode.SRC_IN));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.z6, f6Var));
    }
}
