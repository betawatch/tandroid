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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z1 extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final TextView a;
    public final ImageView b;
    public final FrameLayout c;
    public final org.telegram.ui.ActionBar.f6 d;
    public int e;

    public z1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.d = f6Var;
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        frameLayout.setBackgroundResource(R.drawable.newmsg_divider);
        Drawable background = frameLayout.getBackground();
        int i7 = org.telegram.ui.ActionBar.k6.uf;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.y(frameLayout, background, i7, f6Var, mode);
        addView(frameLayout, c8.ha.d(-1, 27.0f, 51, 0.0f, 7.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_ab_new);
        imageView.setColorFilter(new PorterDuffColorFilter(a(org.telegram.ui.ActionBar.k6.sf), mode));
        imageView.setPadding(0, org.telegram.messenger.g0.L(2.0f), 0, 0);
        frameLayout.addView(imageView, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
        TextView textView = new TextView(context);
        this.a = textView;
        textView.setPadding(0, 0, 0, org.telegram.messenger.g0.L(1.0f));
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.i1(f6Var) ? org.telegram.ui.ActionBar.k6.Fa : org.telegram.ui.ActionBar.k6.tf, f6Var);
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ha.d(-2, -2.0f, 17, 32.0f, 0.0f, 32.0f, 0.0f));
        if (org.telegram.ui.ActionBar.k6.i1(f6Var)) {
            int i10 = org.telegram.ui.ActionBar.k6.Ea;
            org.telegram.ui.ActionBar.r6.C(frameLayout, org.telegram.ui.ActionBar.k6.d0(0, a(i10)), org.telegram.ui.ActionBar.r6.N(i10), f6Var);
            imageView.setVisibility(8);
        }
    }

    public final int a(int i7) {
        org.telegram.ui.ActionBar.f6 f6Var = this.d;
        Integer valueOf = f6Var != null ? Integer.valueOf(f6Var.h(i7)) : null;
        return valueOf != null ? valueOf.intValue() : org.telegram.ui.ActionBar.k6.x0(null, i7, false);
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

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            int a10 = a(org.telegram.ui.ActionBar.k6.sf);
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

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
