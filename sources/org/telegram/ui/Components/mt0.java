package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class mt0 extends org.telegram.ui.Cells.s1 {
    public final /* synthetic */ int Be = 1;

    public /* synthetic */ mt0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.s1
    public int getParentWidth() {
        int i10;
        int dp;
        switch (this.Be) {
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
        switch (this.Be) {
        }
        return false;
    }

    public /* synthetic */ mt0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, z10, chatMessageSharedResources, c6Var);
    }
}
