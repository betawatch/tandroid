package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class cl extends ViewOutlineProvider {
    public final /* synthetic */ qn a;

    public cl(qn qnVar) {
        this.a = qnVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            qn qnVar = this.a;
            outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(qnVar.C9()), AndroidUtilities.roundPlayingMessageSize(qnVar.C9()));
            return;
        }
        int[] roundRadius = imageReceiver.getRoundRadius();
        int i9 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            i9 = Math.max(i9, roundRadius[i10]);
        }
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i9);
    }
}
