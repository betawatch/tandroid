package bi;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.px;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class n extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(px pxVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = pxVar;
    }

    @Override // org.telegram.ui.ActionBar.m, ne.k
    public final void e(ne.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                ((px) this.e).invalidate();
                break;
            default:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                i5 i5Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (i5Var != null) {
                    i5Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, c2.b bVar) {
        super(context, c6Var, bVar);
        this.e = kVar;
    }
}
