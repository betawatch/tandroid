package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ru0 extends org.telegram.ui.Cells.u1 {
    public final /* synthetic */ int Ge = 1;

    public /* synthetic */ ru0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.u1
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

    public /* synthetic */ ru0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, z10, chatMessageSharedResources, f6Var);
    }
}
