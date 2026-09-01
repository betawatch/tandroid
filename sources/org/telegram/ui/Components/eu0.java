package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class eu0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Ce = 1;

    public /* synthetic */ eu0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.t1
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

    public /* synthetic */ eu0(Context context, int i10, boolean z4, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, z4, chatMessageSharedResources, g6Var);
    }
}
