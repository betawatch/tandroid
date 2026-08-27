package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class el extends ViewOutlineProvider {
    public final /* synthetic */ rn a;

    public el(rn rnVar) {
        this.a = rnVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            rn rnVar = this.a;
            outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(rnVar.C9()), AndroidUtilities.roundPlayingMessageSize(rnVar.C9()));
            return;
        }
        int[] roundRadius = imageReceiver.getRoundRadius();
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            i10 = Math.max(i10, roundRadius[i11]);
        }
        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), i10);
    }
}
