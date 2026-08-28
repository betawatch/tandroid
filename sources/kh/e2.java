package kh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.vp;
import org.telegram.ui.s41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class e2 extends vp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ e2(int i9, FrameLayout frameLayout) {
        this.h = i9;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.vp
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Je, (org.telegram.ui.ActionBar.b6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.w0) this.i).c.b.n0;
            case 2:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Je, ((jy) this.i).C.V1);
            case 3:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Q5, ((hm0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Je, ((s41) this.i).y.V0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(jy jyVar) {
        super(1.25f);
        this.h = 2;
        this.i = jyVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(org.telegram.ui.ActionBar.b6 b6Var) {
        super(1.25f);
        this.h = 0;
        this.i = b6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(s41 s41Var) {
        super(1.25f);
        this.h = 4;
        this.i = s41Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
