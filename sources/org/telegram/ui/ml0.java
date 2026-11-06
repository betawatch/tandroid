package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ml0 extends ol0 {
    public int G;
    public final /* synthetic */ hm0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml0(hm0 hm0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = hm0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.ol0
    public final void a() {
        hm0 hm0Var = this.H;
        if (hm0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.p3(hm0Var.getParentActivity(), hm0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = hm0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = hm0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        hm0Var.K0();
        hm0Var.F0();
    }
}
