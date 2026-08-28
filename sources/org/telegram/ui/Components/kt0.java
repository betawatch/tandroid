package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kt0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Be = 1;

    public /* synthetic */ kt0(Context context, int i9) {
        super(context, i9);
    }

    @Override // org.telegram.ui.Cells.t1
    public int getParentWidth() {
        int i9;
        int dp;
        switch (this.Be) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i9 = getMeasuredWidth();
                    dp = AndroidUtilities.dp(24.0f);
                } else {
                    i9 = AndroidUtilities.displaySize.x;
                    dp = AndroidUtilities.dp(24.0f);
                }
                return i9 - dp;
            default:
                return super.getParentWidth();
        }
    }

    @Override // android.view.View
    public final boolean isPressed() {
        switch (this.Be) {
        }
        return false;
    }

    public /* synthetic */ kt0(Context context, int i9, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, z10, chatMessageSharedResources, b6Var);
    }
}
