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
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class o8 extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public o8(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        setOrientation(0);
        this.a = e6Var;
        setPadding(org.telegram.messenger.g0.L(20.0f), 0, org.telegram.messenger.g0.L(13.0f), 0);
        LinearLayout f10 = org.telegram.messenger.k5.f(context, 1);
        f10.setPadding(0, org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f));
        addView(f10, c8.ja.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.g0.o1("fonts/rmono.ttf"));
        TextView f11 = i20.f(f10, textView, c8.ja.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.c = f11;
        f11.setTextSize(1, 14.0f);
        f10.addView(f11, c8.ja.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, c8.ja.t(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.z6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), i10);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        int i7 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(i7, e6Var));
        int i10 = org.telegram.ui.ActionBar.j6.z6;
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
        this.d.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(i10, e6Var), PorterDuff.Mode.SRC_IN));
    }
}
