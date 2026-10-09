package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class pr0 extends FrameLayout {
    public final LinearLayout a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final FrameLayout f;
    public final y9[] h;
    public final y9 n;
    public final ImageView r;
    public final /* synthetic */ rr0 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr0(rr0 rr0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.s = rr0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 20, 20, 6, 6));
        w7.z5.b(linearLayout, 0.02f, 1.2f);
        addView(linearLayout, w7.x5.a(-1.0f, 4.0f, 4.0f, 4.0f, 4.0f, -1, 119));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.te, e6Var), PorterDuff.Mode.MULTIPLY));
        linearLayout.addView(imageView, w7.x5.q(40, 38, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        linearLayout.addView(frameLayout, w7.x5.t(-2, -1, 115, 6, 0, 0, 0));
        this.h = new y9[3];
        for (int i10 = 2; i10 >= 0; i10--) {
            this.h[i10] = new y9(context);
            this.h[i10].setRoundRadius(AndroidUtilities.dp(6.0f));
            this.h[i10].setVisibility(8);
            int i11 = 32 - (i10 * 4);
            this.f.addView(this.h[i10], w7.x5.a(i11, i10 * 12, 0.0f, 0.0f, 0.0f, i11, 19));
        }
        y9 y9Var = new y9(context);
        this.n = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        y9Var.setVisibility(8);
        this.a.addView(y9Var, w7.x5.t(34, 34, 19, 6, 0, 0, 0));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.a.addView(frameLayout2, w7.x5.o(0, -1, 1.0f, 119));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        j5Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ve, e6Var));
        frameLayout2.addView(j5Var, w7.x5.a(18.0f, 8.0f, 2.0f, 8.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        int i12 = org.telegram.ui.ActionBar.i6.Xk;
        j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        frameLayout2.addView(j5Var2, w7.x5.a(18.0f, 8.0f, 20.0f, 8.0f, 0.0f, -1, 51));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.setTextColor(org.telegram.ui.ActionBar.i6.w0(i12, e6Var));
        j5Var3.setAlpha(0.0f);
        frameLayout2.addView(j5Var3, w7.x5.a(18.0f, 8.0f, 20.0f, 8.0f, 0.0f, -1, 51));
        ImageView imageView2 = new ImageView(context);
        this.r = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.input_clear);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Wk, e6Var), PorterDuff.Mode.MULTIPLY));
        imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.i6, e6Var), 1, AndroidUtilities.dp(18.0f)));
        imageView2.setVisibility(8);
        imageView2.setOnClickListener(new b90(this, 14));
        this.a.addView(imageView2, w7.x5.t(36, 36, 21, 0, 0, 4, 0));
    }
}
