package ci;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.vq;
import org.telegram.ui.b61;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class i2 extends vq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ i2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.vq
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Je, (org.telegram.ui.ActionBar.e6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Je, ((mz) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Q5, ((co0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Je, ((b61) this.i).y.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(mz mzVar) {
        super(1.25f);
        this.h = 2;
        this.i = mzVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(org.telegram.ui.ActionBar.e6 e6Var) {
        super(1.25f);
        this.h = 0;
        this.i = e6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(b61 b61Var) {
        super(1.25f);
        this.h = 4;
        this.i = b61Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
