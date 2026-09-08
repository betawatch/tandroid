package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class d40 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final d61 e;
    public final v51 f;
    public Utilities.Callback h;

    public d40(int i10, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.a = i10;
        this.b = f6Var;
        d61 d61Var = new d61(activity, i10, 0, false, new d(this, 15), new c40(this), new c40(this), f6Var);
        this.e = d61Var;
        d61Var.setClipToPadding(false);
        v51 v51Var = (v51) d61Var.getAdapter();
        this.f = v51Var;
        v51Var.r = false;
        addView(d61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.j6.m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.x5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
        org.telegram.messenger.wl.k(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.x5.e(210, -2, 17));
        d61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
