package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gq;
import org.telegram.ui.Components.jn0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.r51;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final class j2 extends gq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.gq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, (org.telegram.ui.ActionBar.d6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.u0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, ((yy) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Q5, ((jn0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Je, ((r51) this.i).y.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(yy yyVar) {
        super(1.25f);
        this.h = 2;
        this.i = yyVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(org.telegram.ui.ActionBar.d6 d6Var) {
        super(1.25f);
        this.h = 0;
        this.i = d6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(r51 r51Var) {
        super(1.25f);
        this.h = 4;
        this.i = r51Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
