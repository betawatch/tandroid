package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class e50 extends org.telegram.ui.Cells.x3 {
    @Override // org.telegram.ui.Cells.x3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i9)), TLObject.FLAG_30), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }
}
