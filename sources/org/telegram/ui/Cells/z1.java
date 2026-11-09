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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class z1 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final org.telegram.ui.ActionBar.g6 d;
    public int e;

    public z1(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.d = g6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i7 = org.telegram.ui.ActionBar.l6.uf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.s6.x(frameLayout, background, i7, g6Var, mode);
        addView(frameLayout, c8.ha.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.l6.sf), mode));
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        frameLayout.addView(imageView, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(1.0f));
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.s6.U(textView, org.telegram.ui.ActionBar.l6.i1(g6Var) ? org.telegram.ui.ActionBar.l6.Fa : org.telegram.ui.ActionBar.l6.tf, g6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (org.telegram.ui.ActionBar.l6.i1(g6Var)) {
            int i10 = org.telegram.ui.ActionBar.l6.Ea;
            org.telegram.ui.ActionBar.s6.B(frameLayout, org.telegram.ui.ActionBar.l6.d0(0, a(i10)), org.telegram.ui.ActionBar.s6.M(i10), g6Var);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i7) {
        org.telegram.ui.ActionBar.g6 g6Var = this.d;
        Integer valueOf = g6Var != null ? Integer.valueOf(g6Var.h(i7)) : null;
        return valueOf != null ? valueOf.intValue() : org.telegram.ui.ActionBar.l6.x0(null, i7, false);
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
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(40.0f), TLObject.FLAG_30));
    }

    public void setText(String str) {
        this.a.setText(str);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            int a10 = a(org.telegram.ui.ActionBar.l6.sf);
            ImageView imageView = this.b;
            if (imageView != null && a10 != this.e) {
                this.e = a10;
                imageView.setColorFilter(new PorterDuffColorFilter(a10, PorterDuff.Mode.MULTIPLY));
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
