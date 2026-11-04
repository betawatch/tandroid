package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class p20 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final l41 e;
    public final f41 f;
    public org.telegram.messenger.u10 h;

    public p20(int i3, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.a = i3;
        this.b = e6Var;
        l41 l41Var = new l41(activity, i3, 0, false, new e(this, 15), new o20(this), new o20(this), e6Var);
        this.e = l41Var;
        l41Var.setClipToPadding(false);
        f41 f41Var = (f41) l41Var.getAdapter();
        this.f = f41Var;
        f41Var.r = false;
        addView(l41Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.k6.m6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, e6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, b8.mf.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView, i10, e6Var);
        textView.setText(org.telegram.messenger.bd.M0(2131749361, null));
        textView.setGravity(17);
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, b8.mf.e(org.telegram.messenger.hs.n3, -2, 17));
        l41Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.u10 u10Var) {
        this.h = u10Var;
    }

    public void setOnScrollListener(u4.t0 t0Var) {
        this.e.j(t0Var);
    }
}
