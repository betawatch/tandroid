package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z1 extends FrameLayout implements org.telegram.ui.ActionBar.k6 {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final org.telegram.ui.ActionBar.p6 d;
    public int e;

    public z1(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.d = p6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i10 = org.telegram.ui.ActionBar.t6.uf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.a7.y(frameLayout, background, i10, p6Var, mode);
        addView(frameLayout, w7.b6.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.t6.sf), mode));
        imageView.setPadding(0, org.telegram.messenger.i0.L(2.0f), 0, 0);
        frameLayout.addView(imageView, w7.b6.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, org.telegram.messenger.i0.L(1.0f));
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.i1(p6Var) ? org.telegram.ui.ActionBar.t6.Fa : org.telegram.ui.ActionBar.t6.tf, p6Var);
        textView.setTypeface(org.telegram.messenger.i0.o());
        addView(textView, w7.b6.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (org.telegram.ui.ActionBar.t6.i1(p6Var)) {
            int i11 = org.telegram.ui.ActionBar.t6.Ea;
            org.telegram.ui.ActionBar.a7.C(frameLayout, org.telegram.ui.ActionBar.t6.d0(0, a(i11)), org.telegram.ui.ActionBar.a7.N(i11), p6Var);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i10) {
        org.telegram.ui.ActionBar.p6 p6Var = this.d;
        Integer valueOf = p6Var != null ? Integer.valueOf(p6Var.h(i10)) : null;
        return valueOf != null ? valueOf.intValue() : org.telegram.ui.ActionBar.t6.x0(null, i10, false);
    }

    public FrameLayout getBackgroundLayout() {
        return this.c;
    }

    public ImageView getImageView() {
        return this.b;
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), TLObject.FLAG_30));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            int a2 = a(org.telegram.ui.ActionBar.t6.sf);
            ImageView imageView = this.b;
            if (imageView != null && a2 != this.e) {
                this.e = a2;
                imageView.setColorFilter(new PorterDuffColorFilter(a2, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
