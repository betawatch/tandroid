package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.en0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.yy;
import org.telegram.ui.n51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class m0 extends fq {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ m0(int i10, FrameLayout frameLayout) {
        this.h = i10;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.fq
    public final int a() {
        switch (this.h) {
            case 0:
                return ((w0) this.i).c.b.o0;
            case 1:
                return k6.v0(k6.Je, ((yy) this.i).D.W1);
            case 2:
                return k6.v0(k6.Q5, ((en0) this.i).f);
            case 3:
                return k6.v0(k6.Je, ((n51) this.i).y.W0);
            default:
                return k6.v0(k6.Je, (g6) this.i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(yy yyVar) {
        super(1.25f);
        this.h = 1;
        this.i = yyVar;
        this.f = AndroidUtilities.dp(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(g6 g6Var) {
        super(1.25f);
        this.h = 4;
        this.i = g6Var;
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
