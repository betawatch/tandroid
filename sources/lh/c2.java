package lh;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.tp;
import org.telegram.ui.r41;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class c2 extends tp {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c2(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.tp
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, (org.telegram.ui.ActionBar.c6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.v0) this.i).c.b.n0;
            case 2:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((ky) this.i).C.V1);
            case 3:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Q5, ((km0) this.i).f);
            default:
                return org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Je, ((r41) this.i).y.V0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(ky kyVar) {
        super(1.25f);
        this.h = 2;
        this.i = kyVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.telegram.ui.ActionBar.c6 c6Var) {
        super(1.25f);
        this.h = 0;
        this.i = c6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(r41 r41Var) {
        super(1.25f);
        this.h = 4;
        this.i = r41Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
