package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class dv0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Ge = 1;

    public /* synthetic */ dv0(Context context, int i10) {
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

    public /* synthetic */ dv0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, z10, chatMessageSharedResources, g6Var);
    }
}
