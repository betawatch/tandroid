package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class to extends FrameLayout implements org.telegram.ui.ActionBar.y5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.i5 c;
    public final org.telegram.ui.ActionBar.i5 d;
    public final org.telegram.ui.ActionBar.i5 e;
    public final org.telegram.ui.il f;
    public boolean h;
    public boolean n;

    public to(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = d6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(52, 46, 51));
        org.telegram.ui.ActionBar.i5 i5Var = new org.telegram.ui.ActionBar.i5(context);
        this.c = i5Var;
        i5Var.setTextSize(14);
        i5Var.setTypeface(AndroidUtilities.bold());
        addView(i5Var, w7.z5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var2 = new org.telegram.ui.ActionBar.i5(context);
        this.d = i5Var2;
        i5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(i5Var2);
        addView(i5Var2, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.i5 i5Var3 = new org.telegram.ui.ActionBar.i5(context);
        this.e = i5Var3;
        i5Var3.setTextSize(14);
        i5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        i5Var3.setAlpha(0.0f);
        addView(i5Var3, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, context, new vh.g());
        this.f = ilVar;
        ilVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(ilVar, w7.z5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.y5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.te;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ve, d6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Xk;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, d6Var);
        org.telegram.ui.ActionBar.i5 i5Var = this.d;
        i5Var.setTextColor(v02);
        i5Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
