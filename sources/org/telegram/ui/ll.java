package org.telegram.ui;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ll extends ViewOutlineProvider {
    public final /* synthetic */ xn a;

    public ll(xn xnVar) {
        this.a = xnVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        ImageReceiver imageReceiver = (ImageReceiver) view.getTag(R.id.parent_tag);
        if (imageReceiver == null) {
            xn xnVar = this.a;
            outline.setOval(0, 0, AndroidUtilities.roundPlayingMessageSize(xnVar.C9()), AndroidUtilities.roundPlayingMessageSize(xnVar.C9()));
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
