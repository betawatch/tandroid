package org.telegram.ui.Components;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatMessageSharedResources;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class du0 extends org.telegram.ui.Cells.t1 {
    public final /* synthetic */ int Fe = 1;

    public /* synthetic */ du0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.t1
    public int getParentWidth() {
        int i10;
        int dp;
        switch (this.Fe) {
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
        switch (this.Fe) {
        }
        return false;
    }

    public /* synthetic */ du0(Context context, int i10, boolean z10, ChatMessageSharedResources chatMessageSharedResources, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, z10, chatMessageSharedResources, f6Var);
    }
}
