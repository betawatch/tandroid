package bi;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i5 extends k7 {
    public final /* synthetic */ int w3 = 0;
    public final /* synthetic */ org.telegram.ui.Components.ma x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(zh.g1 g1Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, j3, h6Var, null);
        this.x3 = g1Var;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public int Q() {
        switch (this.w3) {
            case 0:
                return ((k7) this.x3).Q();
            default:
                return super.Q();
        }
    }

    @Override // bi.k7, org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.b2
    public org.telegram.ui.Components.gc k() {
        switch (this.w3) {
            case 1:
                zh.g1 g1Var = (zh.g1) this.x3;
                return new org.telegram.ui.Components.gc(g1Var.c, g1Var.I0);
            default:
                return super.k();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(k7 k7Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, View view) {
        super(context, i7, j3, h6Var, view);
        this.x3 = k7Var;
    }
}
