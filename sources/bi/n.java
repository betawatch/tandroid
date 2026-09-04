package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.lx;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class n extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(lx lxVar, Context context, com.google.firebase.messaging.m mVar) {
        super(context, null, mVar);
        this.e = lxVar;
    }

    @Override // org.telegram.ui.ActionBar.m, le.k
    public final void e(le.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                ((lx) this.e).invalidate();
                break;
            default:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                g5 g5Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (g5Var != null) {
                    g5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, com.google.firebase.messaging.m mVar) {
        super(context, f6Var, mVar);
        this.e = kVar;
    }
}
