package ai;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jx;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class s extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jx jxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = jxVar;
    }

    @Override // org.telegram.ui.ActionBar.m, le.k
    public final void c(le.l lVar) {
        switch (this.d) {
            case 0:
                super.c(lVar);
                ((jx) this.e).invalidate();
                break;
            default:
                super.c(lVar);
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
