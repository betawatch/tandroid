package nh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.um0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.u41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class b2 extends zp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ b2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.zp
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, (org.telegram.ui.ActionBar.c6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.i).c.b.n0;
            case 2:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((ry) this.i).C.V1);
            case 3:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Q5, ((um0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((u41) this.i).y.V0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(ry ryVar) {
        super(1.25f);
        this.h = 2;
        this.i = ryVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(org.telegram.ui.ActionBar.c6 c6Var) {
        super(1.25f);
        this.h = 0;
        this.i = c6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(u41 u41Var) {
        super(1.25f);
        this.h = 4;
        this.i = u41Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
