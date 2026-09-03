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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class h40 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.g6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final h61 e;
    public final w51 f;
    public Utilities.Callback h;

    public h40(int i10, Activity activity, org.telegram.ui.ActionBar.g6 g6Var) {
        super(activity);
        this.a = i10;
        this.b = g6Var;
        h61 h61Var = new h61(activity, i10, 0, false, new d(this, 15), new g40(this), new g40(this), g6Var);
        this.e = h61Var;
        h61Var.setClipToPadding(false);
        w51 w51Var = (w51) h61Var.getAdapter();
        this.f = w51Var;
        w51Var.r = false;
        addView(h61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.k6.m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i11, g6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, k7.c6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, g6Var));
        org.telegram.messenger.y3.r(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, k7.c6.e(210, -2, 17));
        h61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.e.j(a1Var);
    }
}
