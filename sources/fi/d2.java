package fi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.rq;
import org.telegram.ui.t41;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d2 extends rq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ d2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.rq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, (org.telegram.ui.ActionBar.u6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, ((fz) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Q5, ((do0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, ((t41) this.i).F.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(fz fzVar) {
        super(1.25f);
        this.h = 2;
        this.i = fzVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(org.telegram.ui.ActionBar.u6 u6Var) {
        super(1.25f);
        this.h = 0;
        this.i = u6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(t41 t41Var) {
        super(1.25f);
        this.h = 4;
        this.i = t41Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
