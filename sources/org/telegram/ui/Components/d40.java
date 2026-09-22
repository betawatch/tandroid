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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class d40 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.e6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final e61 e;
    public final w51 f;
    public Utilities.Callback h;

    public d40(int i10, Activity activity, org.telegram.ui.ActionBar.e6 e6Var) {
        super(activity);
        this.a = i10;
        this.b = e6Var;
        e61 e61Var = new e61(activity, i10, 0, false, new d(this, 15), new c40(this), new c40(this), e6Var);
        this.e = e61Var;
        e61Var.setClipToPadding(false);
        w51 w51Var = (w51) e61Var.getAdapter();
        this.f = w51Var;
        w51Var.r = false;
        addView(e61Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i11 = org.telegram.ui.ActionBar.i6.m6;
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i11, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, w7.x5.e(56, 56, 49));
        TextView textView = new TextView(activity);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
        org.telegram.messenger.vl.l(R.string.HashtagSearchPlaceholder, textView, 17);
        frameLayout.addView(textView, w7.x5.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, w7.x5.e(210, -2, 17));
        e61Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(Utilities.Callback<String> callback) {
        this.h = callback;
    }

    public void setOnScrollListener(s4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
