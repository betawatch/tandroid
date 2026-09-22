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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class qo extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final org.telegram.ui.ActionBar.e6 a;
    public final ImageView b;
    public final org.telegram.ui.ActionBar.j5 c;
    public final org.telegram.ui.ActionBar.j5 d;
    public final org.telegram.ui.ActionBar.j5 e;
    public final org.telegram.ui.ml f;
    public boolean h;
    public boolean n;

    public qo(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.a = e6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.e(52, 46, 51));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.c = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTypeface(AndroidUtilities.bold());
        addView(j5Var, w7.x5.d(-1, 18.0f, 51, 52.0f, 6.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
        this.d = j5Var2;
        j5Var2.setTextSize(14);
        NotificationCenter.listenEmojiLoading(j5Var2);
        addView(j5Var2, w7.x5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
        org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
        this.e = j5Var3;
        j5Var3.setTextSize(14);
        j5Var3.l(LocaleController.getString(R.string.TapForForwardingOptions), false);
        j5Var3.setAlpha(0.0f);
        addView(j5Var3, w7.x5.d(-1, 18.0f, 51, 52.0f, 24.0f, 0.0f, 0.0f));
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

    @Override // org.telegram.ui.ActionBar.z5
    public final void e() {
        int i10 = org.telegram.ui.ActionBar.i6.te;
        org.telegram.ui.ActionBar.e6 e6Var = this.a;
        this.b.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, e6Var), PorterDuff.Mode.MULTIPLY));
        this.c.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ve, e6Var));
        int i11 = org.telegram.ui.ActionBar.i6.Xk;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i11, e6Var);
        org.telegram.ui.ActionBar.j5 j5Var = this.d;
        j5Var.setTextColor(v02);
        j5Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        this.e.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, e6Var));
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }
}
