package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class ap extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.ActionBar.g6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.n5 c;
    public final org.telegram.ui.ActionBar.n5 d;
    public final org.telegram.ui.ActionBar.n5 e;
    public final org.telegram.ui.fl f;
    public boolean h;
    public boolean n;

    public ap(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.a = g6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.e(52, 46, 51));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.c = n5Var;
        n5Var.setTextSize(14);
        n5Var.setTypeface(AndroidUtilities.bold());
        addView(n5Var, w7.z5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(context);
        this.d = n5Var2;
        n5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(n5Var2);
        addView(n5Var2, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.n5 n5Var3 = new org.telegram.ui.ActionBar.n5(context);
        this.e = n5Var3;
        n5Var3.setTextSize(14);
        n5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        n5Var3.setAlpha(0.0f);
        addView(n5Var3, w7.z5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.fl flVar = new org.telegram.ui.fl(this, context, new wh.g());
        this.f = flVar;
        flVar.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(flVar, w7.z5.d(34, 34.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.gc));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.n) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        int i10 = org.telegram.ui.ActionBar.k6.te;
        org.telegram.ui.ActionBar.g6 g6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(i10, g6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ve, g6Var));
        int i11 = org.telegram.ui.ActionBar.k6.Xk;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i11, g6Var);
        org.telegram.ui.ActionBar.n5 n5Var = this.d;
        n5Var.setTextColor(w02);
        n5Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.gc, g6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.k6.w0(i11, g6Var));
    }
}
