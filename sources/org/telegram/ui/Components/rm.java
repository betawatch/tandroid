package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class rm extends ViewOutlineProvider {
    public final /* synthetic */ tm a;

    public rm(tm tmVar) {
        this.a = tmVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
        if (x5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) x5Var.getTag()).intValue();
        tm tmVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tmVar.v;
        if (tmVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && !chatAttachAlertPhotoLayout.O0) {
            intValue++;
        }
        if (chatAttachAlertPhotoLayout.g1) {
            intValue++;
        }
        if (intValue == 0) {
            int dp = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(0, 0, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
        } else if (intValue != chatAttachAlertPhotoLayout.M0 - 1) {
            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(-dp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + dp2, dp2);
        }
    }
}
