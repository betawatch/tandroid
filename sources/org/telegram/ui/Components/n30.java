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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class n30 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.b6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final i51 e;
    public final z41 f;
    public Utilities.Callback h;

    public n30(int i9, Activity activity, org.telegram.ui.ActionBar.b6 b6Var) {
        super(activity);
        this.a = i9;
        this.b = b6Var;
        i51 i51Var = new i51(activity, i9, 0, false, new d(this, 15), new m30(this), new m30(this), b6Var);
        this.e = i51Var;
        i51Var.setClipToPadding(false);
        z41 z41Var = (z41) i51Var.getAdapter();
        this.f = z41Var;
        z41Var.r = false;
        addView(i51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.f6.m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i10, b6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, g7.e6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
        org.telegram.messenger.ll.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, g7.e6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, g7.e6.e(210, -2, 17));
        i51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.d1 d1Var) {
        this.e.j(d1Var);
    }
}
