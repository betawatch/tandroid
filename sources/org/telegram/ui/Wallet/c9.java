package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class c9 extends LinearLayout implements org.telegram.ui.ActionBar.c6 {
    public final org.telegram.ui.ActionBar.i6 a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public c9(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        setOrientation(0);
        this.a = i6Var;
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        LinearLayout g10 = org.telegram.messenger.f3.g(context, 1);
        g10.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(g10, c8.ma.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        TextView f10 = n10.f(g10, textView, c8.ma.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.c = f10;
        f10.setTextSize(1, 14.0f);
        g10.addView(f10, c8.ma.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, c8.ma.t(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.z6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.i6 i6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.n6.w0(i7, i6Var));
        int i10 = org.telegram.ui.ActionBar.n6.z6;
        this.c.setTextColor(org.telegram.ui.ActionBar.n6.w0(i10, i6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(i10, i6Var), PorterDuff.Mode.SRC_IN));
    }
}
