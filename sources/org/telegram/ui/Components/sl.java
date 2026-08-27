package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class sl extends ViewOutlineProvider {
    public final /* synthetic */ ul a;

    public sl(ul ulVar) {
        this.a = ulVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
        if (q5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) q5Var.getTag()).intValue();
        ul ulVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ulVar.v;
        if (ulVar.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.K0) {
            intValue++;
        }
        if (chatAttachAlertPhotoLayout.c1) {
            intValue++;
        }
        if (intValue == 0) {
            int dp = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(0, 0, view.getMeasuredWidth() + dp, view.getMeasuredHeight() + dp, dp);
        } else if (intValue != chatAttachAlertPhotoLayout.I0 - 1) {
            outline.setRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        } else {
            int dp2 = AndroidUtilities.dp(16.0f);
            outline.setRoundRect(-dp2, 0, view.getMeasuredWidth(), view.getMeasuredHeight() + dp2, dp2);
        }
    }
}
