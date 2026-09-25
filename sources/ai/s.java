package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class s extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(hx hxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = hxVar;
    }

    @Override // org.telegram.ui.ActionBar.m, le.l
    public final void c(le.m mVar) {
        switch (this.d) {
            case 0:
                super.c(mVar);
                ((hx) this.e).invalidate();
                break;
            default:
                super.c(mVar);
                float totalVisibility = getTotalVisibility();
                w5 w5Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (w5Var != null) {
                    w5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, com.google.firebase.messaging.m mVar) {
        super(context, d6Var, mVar);
        this.e = kVar;
    }
}
