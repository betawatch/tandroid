package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class fm extends ViewOutlineProvider {
    public final /* synthetic */ hm a;

    public fm(hm hmVar) {
        this.a = hmVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
        if (s5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) s5Var.getTag()).intValue();
        hm hmVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = hmVar.v;
        if (hmVar.d && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0 && !chatAttachAlertPhotoLayout.O0) {
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
