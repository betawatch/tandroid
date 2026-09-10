package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.nx;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j extends n {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(nx nxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = nxVar;
    }

    @Override // org.telegram.ui.ActionBar.n, le.k
    public final void e(le.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                bi.l4 l4Var = ((l) this.e).F0;
                if (l4Var != null) {
                    l4Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
            default:
                super.e(lVar);
                ((nx) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Context context, f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context, f6Var, mVar);
        this.e = lVar;
    }
}
