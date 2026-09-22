package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class xx extends FrameLayout {
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + AndroidUtilities.dp(44.0f), TLObject.FLAG_30));
    }
}
