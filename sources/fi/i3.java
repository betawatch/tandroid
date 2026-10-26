package fi;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.zp;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class i3 extends zp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        super(context, 21, u6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((k3) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.Cells.p2) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((org.telegram.ui.web.i) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(k3 k3Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 24, u6Var);
        this.d = 0;
        this.e = k3Var;
    }
}
