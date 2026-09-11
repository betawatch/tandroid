package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class ep0 extends hp0 {
    public int G;
    public final /* synthetic */ bq0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep0(bq0 bq0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.H = bq0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.hp0
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
