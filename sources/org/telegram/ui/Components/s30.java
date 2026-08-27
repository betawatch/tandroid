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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s30 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final k51 e;
    public final b51 f;
    public Utilities.Callback h;

    public s30(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.a = i10;
        this.b = c6Var;
        k51 k51Var = new k51(activity, i10, 0, false, new d(this, 15), new r30(this), new r30(this), c6Var);
        this.e = k51Var;
        k51Var.setClipToPadding(false);
        b51 b51Var = (b51) k51Var.getAdapter();
        this.f = b51Var;
        b51Var.r = false;
        addView(k51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.g6.m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i11, c6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, h7.z5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        org.telegram.messenger.rl.i(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, h7.z5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, h7.z5.e(210, -2, 17));
        k51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(f2.b1 b1Var) {
        this.e.j(b1Var);
    }
}
