package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class iv0 extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            int i10 = AndroidUtilities.roundMessageSize;
            outline.setOval(0, 0, i10, i10);
            return;
        }
        int[] roundRadius = imageReceiver.getRoundRadius(true);
        int i11 = 0;
        for (int i12 = 0; i12 < 4; i12++) {
            i11 = Math.max(i11, roundRadius[i12]);
        }
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i11);
    }
}
