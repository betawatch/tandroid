package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class ol0 extends ql0 {
    public int H;
    public final /* synthetic */ jm0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol0(jm0 jm0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.I = jm0Var;
        this.H = 0;
    }

    @Override // org.telegram.ui.ql0
    public final void a() {
        jm0 jm0Var = this.I;
        if (jm0Var.getParentActivity() != null) {
            org.telegram.messenger.g0.o3(jm0Var.getParentActivity(), jm0Var.isLightStatusBar());
        }
        int actionBarButtonColor = getActionBarButtonColor();
        if (this.H != actionBarButtonColor) {
            ImageView imageView = jm0Var.K;
            if (imageView != null) {
                this.H = actionBarButtonColor;
                imageView.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
            ImageView imageView2 = jm0Var.L;
            if (imageView2 != null) {
                this.H = actionBarButtonColor;
                imageView2.setColorFilter(new PorterDuffColorFilter(actionBarButtonColor, PorterDuff.Mode.SRC_IN));
            }
        }
        jm0Var.K0();
        jm0Var.F0();
    }
}
