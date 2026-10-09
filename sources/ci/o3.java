package ci;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.dq;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class o3 extends dq {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, 21, e6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((q3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.s2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(q3 q3Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 24, e6Var);
        this.d = 0;
        this.e = q3Var;
    }
}
