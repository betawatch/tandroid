package di;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.qw;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class k extends org.telegram.ui.ActionBar.m {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(qw qwVar, Context context, c2.b bVar) {
        super(context, null, bVar);
        this.e = qwVar;
    }

    @Override // org.telegram.ui.ActionBar.m, oe.k
    public final void b(oe.l lVar) {
        switch (this.d) {
            case 0:
                super.b(lVar);
                ((qw) this.e).invalidate();
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
