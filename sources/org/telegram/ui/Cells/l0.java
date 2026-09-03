package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.rc;
import org.telegram.ui.y01;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l0 extends rc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(s1 s1Var, s1 s1Var2, int i10) {
        super(s1Var);
        this.j = i10;
        this.k = s1Var2;
    }

    @Override // org.telegram.ui.Components.rc
    public final void b() {
        switch (this.j) {
            case 0:
                ((s1) this.k).a3();
                break;
            case 1:
                ((s1) this.k).a3();
                break;
            default:
                ((y01) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(y01 y01Var) {
        super((View) null);
        this.j = 2;
        this.k = y01Var;
    }
}
