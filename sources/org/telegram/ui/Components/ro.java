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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ro extends FrameLayout implements org.telegram.ui.ActionBar.x5 {
    public final org.telegram.ui.ActionBar.d6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.h5 c;
    public final org.telegram.ui.ActionBar.h5 d;
    public final org.telegram.ui.ActionBar.h5 e;
    public final org.telegram.ui.il f;
    public boolean h;
    public boolean n;

    public ro(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.a = d6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.y5.e(52, 46, 51));
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
        this.c = h5Var;
        h5Var.setTextSize(14);
        h5Var.setTypeface(AndroidUtilities.bold());
        addView(h5Var, w7.y5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
        this.d = h5Var2;
        h5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(h5Var2);
        addView(h5Var2, w7.y5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
        this.e = h5Var3;
        h5Var3.setTextSize(14);
        h5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        h5Var3.setAlpha(0.0f);
        addView(h5Var3, w7.y5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.il ilVar = new org.telegram.ui.il(this, context, new vh.g());
        this.f = ilVar;
        ilVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(ilVar, w7.y5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.h6.te;
        org.telegram.ui.ActionBar.d6 d6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, d6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ve, d6Var));
        int i11 = org.telegram.ui.ActionBar.h6.Xk;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i11, d6Var);
        org.telegram.ui.ActionBar.h5 h5Var = this.d;
        h5Var.setTextColor(v02);
        h5Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
