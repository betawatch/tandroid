package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class gl extends ViewOutlineProvider {
    public final /* synthetic */ qn a;

    public gl(qn qnVar) {
        this.a = qnVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            qn qnVar = this.a;
            outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(qnVar.H9()), AndroidUtilities.roundPlayingMessageSize(qnVar.H9()));
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
