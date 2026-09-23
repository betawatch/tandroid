package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class kq0 extends FrameLayout {
    public final LinearLayout a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.i5 c;
    public final org.telegram.ui.ActionBar.i5 d;
    public final org.telegram.ui.ActionBar.i5 e;
    public final FrameLayout f;
    public final w9[] h;
    public final w9 n;
    public final ImageView r;
    public final /* synthetic */ mq0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq0(mq0 mq0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.s = mq0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.a0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, d6Var), 20, 20, 6, 6));
        w7.z5.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, w7.x5.d(-1, -1.0f, 119, 4.0f, 4.0f, 4.0f, 4.0f));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.te, d6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, w7.x5.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        linearLayout.addView(frameLayout, w7.x5.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new w9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new w9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f.addView(this.h[i10], w7.x5.d(i11, i11, 19, i10 * 12, 0.0f, 0.0f, 0.0f));
        }
        w9 w9Var = new w9(context);
        this.n = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        w9Var.setVisibility(8);
        this.a.addView(w9Var, w7.x5.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a.addView(frameLayout2, w7.x5.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.c = i5Var;
        i5Var.setTextSize(14);
        i5Var.setTypeface(AndroidUtilities.bold());
        i5Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ve, d6Var));
        frameLayout2.addView(i5Var, w7.x5.d(-1, 18.0f, 51, 8.0f, 2.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.d = i5Var2;
        i5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.h6.Xk;
        i5Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        frameLayout2.addView(i5Var2, w7.x5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var3 = new org.telegram.ui.ActionBar.i5(context);
        this.e = i5Var3;
        i5Var3.setTextSize(14);
        i5Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        i5Var3.setAlpha(0.0f);
        frameLayout2.addView(i5Var3, w7.x5.d(-1, 18.0f, 51, 8.0f, 20.0f, 8.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Wk, d6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.setBackground(org.telegram.ui.ActionBar.h6.f0(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, d6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new y70(this, 15));
        this.a.addView(imageView2, w7.x5.t(36, 36, 21, 0, 0, 4, 0));
    }
}
