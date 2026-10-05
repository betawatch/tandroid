package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class kl extends ViewOutlineProvider {
    public final /* synthetic */ yn a;

    public kl(yn ynVar) {
        this.a = ynVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            yn ynVar = this.a;
            outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(ynVar.B9()), AndroidUtilities.roundPlayingMessageSize(ynVar.B9()));
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
