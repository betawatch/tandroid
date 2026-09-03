package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.n51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class m0 extends cq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.cq
    public final int a() {
        switch (this.h) {
            case 0:
                return ((w0) this.i).c.b.o0;
            case 1:
                return j6.v0(j6.Je, ((wy) this.i).D.W1);
            case 2:
                return j6.v0(j6.Q5, ((dn0) this.i).f);
            case 3:
                return j6.v0(j6.Je, ((n51) this.i).y.W0);
            default:
                return j6.v0(j6.Je, (f6) this.i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(wy wyVar) {
        super(1.25f);
        this.h = 1;
        this.i = wyVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(f6 f6Var) {
        super(1.25f);
        this.h = 4;
        this.i = f6Var;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n51 n51Var) {
        super(1.25f);
        this.h = 3;
        this.i = n51Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
