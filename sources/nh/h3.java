package nh;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.hp;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class h3 extends hp {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, 21, c6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((j3) this.e).invalidate();
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
    public h3(j3 j3Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 24, c6Var);
        this.d = 0;
        this.e = j3Var;
    }
}
