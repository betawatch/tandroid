package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class l3 extends gi.e4 {
    public boolean c0;
    public final /* synthetic */ o3 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(o3 o3Var, Context context) {
        super(context);
        this.d0 = o3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.c0 = true;
        setOffsetY(View.MeasureSpec.getSize(i11) * 0.4f);
        this.c0 = false;
        int size = View.MeasureSpec.getSize(i11);
        x3 x3Var = this.d0.K.K;
        if (x3Var != null) {
            x3Var.getClass();
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((size - AndroidUtilities.dp(56.0f)) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c0) {
            return;
        }
        super.requestLayout();
    }
}
