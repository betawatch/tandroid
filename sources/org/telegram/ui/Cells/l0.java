package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.nc;
import org.telegram.ui.h01;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class l0 extends nc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.j = i10;
        this.k = s1Var2;
    }

    @Override // org.telegram.ui.Components.nc
    public final void b() {
        switch (this.j) {
            case 0:
                ((s1) this.k).Z2();
                break;
            case 1:
                ((s1) this.k).Z2();
                break;
            default:
                ((h01) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h01 h01Var) {
        super((View) null);
        this.j = 2;
        this.k = h01Var;
    }
}
