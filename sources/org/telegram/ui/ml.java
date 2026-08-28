package org.telegram.ui;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ml extends kh.x3 {
    public final /* synthetic */ qn H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(qn qnVar, Activity activity) {
        super(activity, 3);
        this.H0 = qnVar;
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        setTranslationY(((-getTop()) - AndroidUtilities.dp(120.0f)) + this.H0.y1);
    }
}
