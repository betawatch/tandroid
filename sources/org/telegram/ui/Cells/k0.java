package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.xc;
import org.telegram.ui.v01;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class k0 extends xc {
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.k = i10;
        this.l = s1Var2;
    }

    @Override // org.telegram.ui.Components.xc
    public final void b() {
        switch (this.k) {
            case 0:
                ((s1) this.l).a3();
                break;
            case 1:
                ((s1) this.l).a3();
                break;
            default:
                ((v01) this.l).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(v01 v01Var) {
        super((View) null);
        this.k = 2;
        this.l = v01Var;
    }
}
