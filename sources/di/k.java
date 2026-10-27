package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.sw;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sw swVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = swVar;
    }

    @Override // org.telegram.ui.ActionBar.m, oe.k
    public final void b(oe.l lVar) {
        switch (this.d) {
            case 0:
                super.b(lVar);
                ((sw) this.e).invalidate();
                break;
            default:
                super.b(lVar);
                float totalVisibility = getTotalVisibility();
                i4 i4Var = ((org.telegram.ui.Components.b8) this.e).F0;
                if (i4Var != null) {
                    i4Var.setTranslationY(totalVisibility * AndroidUtilities.dp(-11.0f));
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(org.telegram.ui.Components.b8 b8Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, c2.b bVar) {
        super(context, u6Var, bVar);
        this.e = b8Var;
    }
}
