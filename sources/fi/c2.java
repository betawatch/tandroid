package fi;

import android.widget.FrameLayout;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.tx;
import org.telegram.ui.l01;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c2 extends op {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ c2(int i7, FrameLayout frameLayout) {
        this.h = i7;
        this.i = frameLayout;
    }

    @Override // org.telegram.ui.Components.op
    public final int a() {
        switch (this.h) {
            case 0:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yf, (org.telegram.ui.ActionBar.h6) this.i);
            case 1:
                return ((org.telegram.ui.ActionBar.r0) this.i).c.b.r0;
            case 2:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yf, ((tx) this.i).G.Z1);
            case 3:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Q5, ((el0) this.i).e);
            default:
                return org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.yf, ((l01) this.i).F.Z0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(tx txVar) {
        super(1.25f);
        this.h = 2;
        this.i = txVar;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(org.telegram.ui.ActionBar.h6 h6Var) {
        super(1.25f);
        this.h = 0;
        this.i = h6Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(l01 l01Var) {
        super(1.25f);
        this.h = 4;
        this.i = l01Var;
        this.f = org.telegram.messenger.g0.L(7.0f);
    }
}
