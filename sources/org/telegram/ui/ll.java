package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ll extends ViewOutlineProvider {
    public final /* synthetic */ zn a;

    public ll(zn znVar) {
        this.a = znVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            zn znVar = this.a;
            outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(znVar.C9()), AndroidUtilities.roundPlayingMessageSize(znVar.C9()));
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
