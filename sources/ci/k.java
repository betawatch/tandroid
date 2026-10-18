package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vw vwVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = vwVar;
    }

    @Override // org.telegram.ui.ActionBar.m, ne.k
    public final void e(ne.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                ((vw) this.e).invalidate();
                break;
            default:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                h4 h4Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (h4Var != null) {
                    h4Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.d6 d6Var, c2.b bVar) {
        super(context, d6Var, bVar);
        this.e = kVar;
    }
}
