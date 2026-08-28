package ih;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.vw;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(vw vwVar, Context context, com.google.firebase.messaging.l lVar) {
        super(context, null, lVar);
        this.e = vwVar;
    }

    @Override // org.telegram.ui.ActionBar.m, td.i
    public final void c(td.j jVar) {
        switch (this.d) {
            case 0:
                super.c(jVar);
                ((vw) this.e).invalidate();
                break;
            default:
                super.c(jVar);
                float totalVisibility = getTotalVisibility();
                dh.g gVar = ((org.telegram.ui.ActionBar.k) this.e).B0;
                if (gVar != null) {
                    gVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.b6 b6Var, com.google.firebase.messaging.l lVar) {
        super(context, b6Var, lVar);
        this.e = kVar;
    }
}
