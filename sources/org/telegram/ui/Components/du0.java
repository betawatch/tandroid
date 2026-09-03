package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class du0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ int Ce = 1;

    public /* synthetic */ du0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.s1
    public int getParentWidth() {
        int i10;
        int dp;
        switch (this.Ce) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i10 = getMeasuredWidth();
                    dp = AndroidUtilities.dp(24.0f);
                } else {
                    i10 = AndroidUtilities.displaySize.x;
                    dp = AndroidUtilities.dp(24.0f);
                }
                return i10 - dp;
            default:
                return super.getParentWidth();
        }
    }

    @Override // android.view.View
    public final boolean isPressed() {
        switch (this.Ce) {
        }
        return false;
    }

    public /* synthetic */ du0(Context context, int i10, boolean z4, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, z4, chatMessageSharedResources, f6Var);
    }
}
