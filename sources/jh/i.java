package jh;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class i extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(yw ywVar, Context context, com.google.firebase.messaging.l lVar) {
        super(context, null, lVar);
        this.e = ywVar;
    }

    @Override // org.telegram.ui.ActionBar.m, ud.i
    public final void c(ud.j jVar) {
        switch (this.d) {
            case 0:
                super.c(jVar);
                ((yw) this.e).invalidate();
                break;
            default:
                super.c(jVar);
                float totalVisibility = getTotalVisibility();
                ag.d dVar = ((org.telegram.ui.ActionBar.k) this.e).B0;
                if (dVar != null) {
                    dVar.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.ui.ActionBar.k kVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, com.google.firebase.messaging.l lVar) {
        super(context, c6Var, lVar);
        this.e = kVar;
    }
}
