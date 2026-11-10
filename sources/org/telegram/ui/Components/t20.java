package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t20 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.h6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final r41 e;
    public final m41 f;
    public org.telegram.messenger.c20 h;

    public t20(int i7, Activity activity, org.telegram.ui.ActionBar.h6 h6Var) {
        super(activity);
        this.a = i7;
        this.b = h6Var;
        r41 r41Var = new r41(activity, i7, 0, false, new d(this, 15), new s20(this), new s20(this), h6Var);
        this.e = r41Var;
        r41Var.setClipToPadding(false);
        m41 m41Var = (m41) r41Var.getAdapter();
        this.f = m41Var;
        m41Var.r = false;
        addView(r41Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.m6.m6;
        org.telegram.ui.ActionBar.t6.s(imageView, i10, h6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, c8.ha.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.t6.U(textView, i10, h6Var);
        textView.setText(org.telegram.messenger.id.M0(2131749353, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ha.e(org.telegram.messenger.qs.n3, -2, 17));
        r41Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.c20 c20Var) {
        this.h = c20Var;
    }

    public void setOnScrollListener(v4.s0 s0Var) {
        this.e.j(s0Var);
    }
}
