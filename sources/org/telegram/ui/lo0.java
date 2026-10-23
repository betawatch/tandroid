package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class lo0 extends oo0 {
    public int G;
    public final /* synthetic */ ip0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo0(ip0 ip0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, d6Var);
        this.H = ip0Var;
        this.G = 0;
    }

    @Override // org.telegram.ui.oo0
    public final void a() {
        ip0 ip0Var = this.H;
        if (ip0Var.getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(ip0Var.getParentActivity(), ip0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.G != actionBarButtonColor) {
            ImageView imageView = ip0Var.J;
            if (imageView != null) {
                this.G = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = ip0Var.K;
            if (imageView2 != null) {
                this.G = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        ip0Var.G0();
        ip0Var.A0();
    }
}
