package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.g51;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class m0 extends dq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.dq
    public final int a() {
        switch (this.h) {
            case 0:
                return ((w0) this.i).c.b.o0;
            case 1:
                return j6.v0(j6.Je, ((wy) this.i).D.W1);
            case 2:
                return j6.v0(j6.Q5, ((en0) this.i).f);
            case 3:
                return j6.v0(j6.Je, ((g51) this.i).y.W0);
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
    public m0(g51 g51Var) {
        super(1.25f);
        this.h = 3;
        this.i = g51Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
