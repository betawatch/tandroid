package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class dp0 extends gp0 {
    public int G;
    public final /* synthetic */ bq0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp0(bq0 bq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = bq0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.gp0
    public final void a() {
        bq0 bq0Var = this.H;
        if (bq0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(bq0Var.getParentActivity(), bq0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = bq0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = bq0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        bq0Var.G0();
        bq0Var.A0();
    }
}
