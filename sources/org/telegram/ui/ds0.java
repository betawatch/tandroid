package org.telegram.ui;

import android.view.View;
import android.widget.RelativeLayout;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class ds0 extends RelativeLayout {
    public final /* synthetic */ PopupNotificationActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ds0(PopupNotificationActivity popupNotificationActivity, PopupNotificationActivity popupNotificationActivity2) {
        super(popupNotificationActivity2);
        this.a = popupNotificationActivity;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getTag() instanceof String) {
                int left = childAt.getLeft();
                PopupNotificationActivity popupNotificationActivity = this.a;
                childAt.layout(left, org.telegram.messenger.g0.L(3.0f) + popupNotificationActivity.b.getTop(), childAt.getRight(), popupNotificationActivity.b.getBottom());
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        PopupNotificationActivity popupNotificationActivity = this.a;
        int measuredWidth = popupNotificationActivity.b.getMeasuredWidth();
        int measuredHeight = popupNotificationActivity.b.getMeasuredHeight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getTag() instanceof String) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(measuredHeight - org.telegram.messenger.g0.L(3.0f), TLObject.FLAG_30));
            }
        }
    }
}
