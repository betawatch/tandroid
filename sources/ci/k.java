package ci;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(tw twVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = twVar;
    }

    @Override // org.telegram.ui.ActionBar.m, ne.k
    public final void e(ne.l lVar) {
        switch (this.d) {
            case 0:
                super.e(lVar);
                ((tw) this.e).invalidate();
                break;
            default:
                super.e(lVar);
                float totalVisibility = getTotalVisibility();
                i4 i4Var = ((org.telegram.ui.ActionBar.k) this.e).F0;
                if (i4Var != null) {
                    i4Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
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
