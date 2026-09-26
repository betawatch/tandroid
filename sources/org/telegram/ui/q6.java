package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class q6 extends FrameLayout {
    public org.telegram.ui.Components.p6 a;
    public p6 b;

    public final void a(float f7) {
        org.telegram.ui.Components.p6 p6Var = this.a;
        p6Var.a();
        p6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(w7.q.a(f7, 0.0f, 1.0f) * 100.0f))), !LocaleController.isRTL, true);
        p6 p6Var2 = this.b;
        p6Var2.d = f7;
        p6Var2.invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(350.0f), TLObject.FLAG_30));
    }
}
