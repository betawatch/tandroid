package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class l81 extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final org.telegram.ui.Components.rb0 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final TextView h;
    public boolean n;

    public l81(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        org.telegram.ui.Components.rb0 rb0Var = new org.telegram.ui.Components.rb0(1);
        this.b = rb0Var;
        frameLayout.setBackground(rb0Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, k7.b6.e(24, 24, 17));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView j10 = yh.j(f10, textView, k7.b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = j10;
        j10.setTextSize(1, 13.0f);
        TextView j11 = yh.j(f10, j10, k7.b6.k(0.0f, 4.0f, 0.0f, 0.0f, -1, -2), context);
        this.h = j11;
        j11.setTextSize(1, 16.0f);
        if (LocaleController.isRTL) {
            addView(j11, k7.b6.t(-2, -2, 16, 20, 0, 0, 0));
            addView(f10, k7.b6.p(0, -2, 1.0f, 23, 20, 0, 18, 0));
            addView(frameLayout, k7.b6.t(28, 28, 21, 0, 0, 18, 0));
        } else {
            addView(frameLayout, k7.b6.t(28, 28, 19, 18, 0, 0, 0));
            addView(f10, k7.b6.p(0, -2, 1.0f, 23, 18, 0, 20, 0));
            addView(j11, k7.b6.t(-2, -2, 16, 0, 0, 20, 0));
        }
        e();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        this.f.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.y6, f6Var));
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.n6, f6Var));
        this.b.b = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(this.n ? 60.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setValue(CharSequence charSequence) {
        int i10 = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.h;
        textView.setVisibility(i10);
        textView.setText(charSequence);
    }
}
