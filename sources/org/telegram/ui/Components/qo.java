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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class qo extends FrameLayout implements org.telegram.ui.ActionBar.a6 {
    public final org.telegram.ui.ActionBar.f6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.k5 c;
    public final org.telegram.ui.ActionBar.k5 d;
    public final org.telegram.ui.ActionBar.k5 e;
    public final org.telegram.ui.ml f;
    public boolean h;
    public boolean n;

    public qo(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.a = f6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(52, 46, 51));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.c = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTypeface(AndroidUtilities.bold());
        addView(k5Var, w7.x5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
        this.d = k5Var2;
        k5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(k5Var2);
        addView(k5Var2, w7.x5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
        this.e = k5Var3;
        k5Var3.setTextSize(14);
        k5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        k5Var3.setAlpha(0.0f);
        addView(k5Var3, w7.x5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ml mlVar = new org.telegram.ui.ml(this, context, new vh.h());
        this.f = mlVar;
        mlVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(mlVar, w7.x5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.j6.te;
        org.telegram.ui.ActionBar.f6 f6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, f6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ve, f6Var));
        int i11 = org.telegram.ui.ActionBar.j6.Xk;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i11, f6Var);
        org.telegram.ui.ActionBar.k5 k5Var = this.d;
        k5Var.setTextColor(v02);
        k5Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
