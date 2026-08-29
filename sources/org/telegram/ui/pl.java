package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pl extends nh.t3 {
    public final /* synthetic */ tn H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pl(tn tnVar, Activity activity) {
        super(activity, 3);
        this.H0 = tnVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.H0.y1);
    }
}
