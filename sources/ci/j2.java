package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.y51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class j2 extends fq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ j2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.fq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, (org.telegram.ui.ActionBar.e6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((xy) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Q5, ((wm0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Je, ((y51) this.i).y.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(xy xyVar) {
        super(1.25f);
        this.h = 2;
        this.i = xyVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.i = e6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(y51 y51Var) {
        super(1.25f);
        this.h = 4;
        this.i = y51Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
