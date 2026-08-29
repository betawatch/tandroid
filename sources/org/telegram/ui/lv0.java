package org.telegram.ui;

import android.view.View;
import android.widget.RelativeLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class lv0 extends RelativeLayout {
    public final /* synthetic */ PopupNotificationActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv0(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.a = popupNotificationActivity;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.a;
                childAt.layout(left, AndroidUtilities.dp(3.0f) + popupNotificationActivity.b.getTop(), childAt.getRight(), popupNotificationActivity.b.getBottom());
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        PopupNotificationActivity popupNotificationActivity = this.a;
        int measuredWidth = popupNotificationActivity.b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.b.getMeasuredHeight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight - AndroidUtilities.dp(3.0f), TLObject.FLAG_30));
            }
        }
    }
}
