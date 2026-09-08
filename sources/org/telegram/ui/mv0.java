package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class mv0 extends ViewOutlineProvider {
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
