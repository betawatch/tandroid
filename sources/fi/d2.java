package fi;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.rq;
import org.telegram.ui.w41;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Q5, ((eo0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Je, ((w41) this.i).F.Z0);
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
    public d2(w41 w41Var) {
        super(1.25f);
        this.h = 4;
        this.i = w41Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
