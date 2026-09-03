package oh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.hx;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hx hxVar, Context context, cb.m mVar) {
        super(context, null, mVar);
        this.e = hxVar;
    }

    @Override // org.telegram.ui.ActionBar.m, xd.i
    public final void e(xd.j jVar) {
        switch (this.d) {
            case 0:
                super.e(jVar);
                ((hx) this.e).invalidate();
                break;
            default:
                super.e(jVar);
                float totalVisibility = getTotalVisibility();
                eh.d dVar = ((org.telegram.ui.ActionBar.k) this.e).C0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, cb.m mVar) {
        super(context, g6Var, mVar);
        this.e = kVar;
    }
}
