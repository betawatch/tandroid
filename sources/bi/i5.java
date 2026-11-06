package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class i5 extends k7 {
    public final /* synthetic */ int t3 = 0;
    public final /* synthetic */ org.telegram.ui.Components.na u3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(zh.h1 h1Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, j3, f6Var, null);
        this.u3 = h1Var;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public int Q() {
        switch (this.t3) {
            case 0:
                return ((k7) this.u3).Q();
            default:
                return super.Q();
        }
    }

    @Override // bi.k7, org.telegram.ui.ActionBar.v2, org.telegram.ui.ActionBar.b2
    public org.telegram.ui.Components.hc k() {
        switch (this.t3) {
            case 1:
                zh.h1 h1Var = (zh.h1) this.u3;
                return new org.telegram.ui.Components.hc(h1Var.c, h1Var.I0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(k7 k7Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, View view) {
        super(context, i7, j3, f6Var, view);
        this.u3 = k7Var;
    }
}
