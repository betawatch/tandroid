package nh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gx;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class j extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(gx gxVar, Context context, cb.m mVar) {
        super(context, null, mVar);
        this.e = gxVar;
    }

    @Override // org.telegram.ui.ActionBar.m, xd.i
    public final void e(xd.j jVar) {
        switch (this.d) {
            case 0:
                super.e(jVar);
                ((gx) this.e).invalidate();
                break;
            default:
                super.e(jVar);
                float totalVisibility = getTotalVisibility();
                dh.d dVar = ((org.telegram.ui.ActionBar.k) this.e).C0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, cb.m mVar) {
        super(context, f6Var, mVar);
        this.e = kVar;
    }
}
