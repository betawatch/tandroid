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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class b40 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final u51 e;
    public final k51 f;
    public Utilities.Callback h;

    public b40(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.a = i10;
        this.b = c6Var;
        u51 u51Var = new u51(activity, i10, 0, false, new d(this, 15), new a40(this), new a40(this), c6Var);
        this.e = u51Var;
        u51Var.setClipToPadding(false);
        k51 k51Var = (k51) u51Var.getAdapter();
        this.f = k51Var;
        k51Var.r = false;
        addView(u51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.g6.m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, i7.f6.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        org.telegram.ui.b.i(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, i7.f6.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, i7.f6.e(210, -2, 17));
        u51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.a1 a1Var) {
        this.e.j(a1Var);
    }
}
