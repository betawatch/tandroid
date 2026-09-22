package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class eu0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Ge = 1;

    public /* synthetic */ eu0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.t1
    public int getParentWidth() {
        int i10;
        int dp;
        switch (this.Ge) {
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
        switch (this.Ge) {
        }
        return false;
    }

    public /* synthetic */ eu0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, z10, chatMessageSharedResources, e6Var);
    }
}
