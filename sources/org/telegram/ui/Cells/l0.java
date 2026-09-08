package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.zc;
import org.telegram.ui.m11;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l0 extends zc {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(t1 t1Var, t1 t1Var2, int i10) {
        super(t1Var);
        this.j = i10;
        this.k = t1Var2;
    }

    @Override // org.telegram.ui.Components.zc
    public final void b() {
        switch (this.j) {
            case 0:
                ((t1) this.k).a3();
                break;
            case 1:
                ((t1) this.k).a3();
                break;
            default:
                ((m11) this.k).invalidateSelf();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(m11 m11Var) {
        super((View) null);
        this.j = 2;
        this.k = m11Var;
    }
}
