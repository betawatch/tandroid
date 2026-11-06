package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class t20 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.f6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final q41 e;
    public final l41 f;
    public org.telegram.messenger.c20 h;

    public t20(int i7, Activity activity, org.telegram.ui.ActionBar.f6 f6Var) {
        super(activity);
        this.a = i7;
        this.b = f6Var;
        q41 q41Var = new q41(activity, i7, 0, false, new d(this, 15), new s20(this), new s20(this), f6Var);
        this.e = q41Var;
        q41Var.setClipToPadding(false);
        l41 l41Var = (l41) q41Var.getAdapter();
        this.f = l41Var;
        l41Var.r = false;
        addView(q41Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.k6.m6;
        org.telegram.ui.ActionBar.r6.t(imageView, i10, f6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, c8.ha.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.r6.V(textView, i10, f6Var);
        textView.setText(org.telegram.messenger.hd.M0(2131749352, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ha.e(org.telegram.messenger.qs.n3, -2, 17));
        q41Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.c20 c20Var) {
        this.h = c20Var;
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
