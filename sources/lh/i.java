package lh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xw;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class i extends org.telegram.ui.ActionBar.n {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xw xwVar, Context context, ab.m mVar) {
        super(context, null, mVar);
        this.e = xwVar;
    }

    @Override // org.telegram.ui.ActionBar.n, vd.j
    public final void b(vd.k kVar) {
        switch (this.d) {
            case 0:
                super.b(kVar);
                ((xw) this.e).invalidate();
                break;
            default:
                super.b(kVar);
                float totalVisibility = getTotalVisibility();
                bh.d dVar = ((org.telegram.ui.ActionBar.l) this.e).B0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.ui.ActionBar.l lVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, ab.m mVar) {
        super(context, c6Var, mVar);
        this.e = lVar;
    }
}
