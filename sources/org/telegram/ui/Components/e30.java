package org.telegram.ui.Components;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e30 extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.i6 b;
    public ArrayList c;
    public final FrameLayout d;
    public final e51 e;
    public final z41 f;
    public org.telegram.messenger.x10 h;

    public e30(int i7, Activity activity, org.telegram.ui.ActionBar.i6 i6Var) {
        super(activity);
        this.a = i7;
        this.b = i6Var;
        e51 e51Var = new e51(activity, i7, 0, false, new d(this, 16), new d30(this), new d30(this), i6Var);
        this.e = e51Var;
        e51Var.setClipToPadding(false);
        z41 z41Var = (z41) e51Var.getAdapter();
        this.f = z41Var;
        z41Var.r = false;
        addView(e51Var, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i10 = org.telegram.ui.ActionBar.n6.m6;
        org.telegram.ui.ActionBar.u6.s(imageView, i10, i6Var, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, c8.ma.e(56, 56, 49));
        TextView textView = new TextView(activity);
        org.telegram.ui.ActionBar.u6.U(textView, i10, i6Var);
        textView.setText(org.telegram.messenger.gd.M0(2131749161, null));
        textView.setGravity(17);
        frameLayout.addView(textView, c8.ma.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, c8.ma.e(210, -2, 17));
        e51Var.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(org.telegram.messenger.x10 x10Var) {
        this.h = x10Var;
    }

    public void setOnScrollListener(v4.u0 u0Var) {
        this.e.j(u0Var);
    }
}
