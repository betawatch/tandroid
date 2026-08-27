package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ol extends lh.w3 {
    public final /* synthetic */ rn H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ol(rn rnVar, Activity activity) {
        super(activity, 3);
        this.H0 = rnVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.H0.y1);
    }
}
