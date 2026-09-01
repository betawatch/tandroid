package org.telegram.ui.ActionBar;

import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.yy;
import org.telegram.ui.i51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                return k6.v0(k6.Q5, ((fn0) this.i).f);
            case 3:
                return k6.v0(k6.Je, ((i51) this.i).y.W0);
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
    public m0(i51 i51Var) {
        super(1.25f);
        this.h = 3;
        this.i = i51Var;
        this.f = AndroidUtilities.dp(7.0f);
    }
}
