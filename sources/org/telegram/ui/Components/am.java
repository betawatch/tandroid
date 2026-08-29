package org.telegram.ui.Components;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class am extends ViewOutlineProvider {
    public final /* synthetic */ cm a;

    public am(cm cmVar) {
        this.a = cmVar;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
        if (r5Var.getTag() == null) {
            return;
        }
        int intValue = ((Integer) r5Var.getTag()).intValue();
        cm cmVar = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = cmVar.v;
        if (cmVar.d && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0 && !chatAttachAlertPhotoLayout.K0) {
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
