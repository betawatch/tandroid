package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class d20 extends FrameLayout {
    public org.telegram.ui.ActionBar.k5 a;
    public ImageView b;

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        ImageView imageView = this.b;
        int i14 = i12 - i10;
        org.telegram.ui.ActionBar.k5 k5Var = this.a;
        int textHeight = ((i13 - i11) - k5Var.getTextHeight()) / 2;
        if (LocaleController.isRTL) {
            dp = (getMeasuredWidth() - k5Var.getMeasuredWidth()) - AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        } else {
            dp = AndroidUtilities.dp(imageView.getVisibility() == 0 ? 64.0f : 23.0f);
        }
        k5Var.layout(dp, textHeight, k5Var.getMeasuredWidth() + dp, k5Var.getMeasuredHeight() + textHeight);
        int dp2 = !LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : (i14 - imageView.getMeasuredWidth()) - AndroidUtilities.dp(20.0f);
        imageView.layout(dp2, 0, imageView.getMeasuredWidth() + dp2, imageView.getMeasuredHeight());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        AndroidUtilities.dp(48.0f);
        this.a.measure(b.d(94.0f, size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(20.0f), TLObject.FLAG_30));
        this.b.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_31), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, AndroidUtilities.dp(50.0f));
    }
}
