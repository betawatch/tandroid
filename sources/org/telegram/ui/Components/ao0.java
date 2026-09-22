package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class ao0 extends lx0 {
    public final /* synthetic */ int K;
    public final /* synthetic */ org.telegram.ui.ey L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ao0(org.telegram.ui.ey eyVar, Context context, t00 t00Var, int i10) {
        super(context, t00Var, 1, null);
        this.K = i10;
        this.L = eyVar;
    }

    @Override // org.telegram.ui.Components.lx0, android.view.View
    public final void setVisibility(int i10) {
        switch (this.K) {
            case 0:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.L.N0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
