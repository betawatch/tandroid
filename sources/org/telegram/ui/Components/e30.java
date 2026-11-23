package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class e30 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final g51 e;
    public final b51 f;
    public org.telegram.messenger.w10 h;

    public e30(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.a = i7;
        this.b = i6Var;
        g51 g51Var = new g51(activity, i7, 0, false, new d(this, 16), new d30(this), new d30(this), i6Var);
        this.e = g51Var;
        g51Var.setClipToPadding(false);
        b51 b51Var = (b51) g51Var.getAdapter();
        this.f = b51Var;
        b51Var.r = false;
        addView(g51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.n6.m6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, c8.na.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setText(org.telegram.messenger.gd.N0(2131749160, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.na.e(210, -2, 17));
        g51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.w10 w10Var) {
        this.h = w10Var;
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.e.j(u0Var);
    }
}
