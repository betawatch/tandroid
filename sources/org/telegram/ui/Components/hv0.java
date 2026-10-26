package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hv0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ int He = 1;

    public /* synthetic */ hv0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.s1
    public int getParentWidth() {
        int i10;
        int dp;
        switch (this.He) {
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
        switch (this.He) {
        }
        return false;
    }

    public /* synthetic */ hv0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, z10, chatMessageSharedResources, u6Var);
    }
}
