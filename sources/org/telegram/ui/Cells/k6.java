package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.vn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class k6 extends fi.e7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(sa saVar) {
        super(null, false);
        this.T = saVar;
    }

    @Override // fi.e7
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((m6) this.T).b(j3);
                break;
            case 1:
                sa saVar = (sa) this.T;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(saVar.getContext(), j3, fi.y6.a((ek0) saVar.getParent()));
                    break;
                }
                break;
            default:
                vn vnVar = (vn) this.T;
                vnVar.I.getOrCreateStoryViewer().J(vnVar.getContext(), j3, new org.telegram.ui.Components.b0(this, 24));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(m6 m6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i6Var, false);
        this.T = m6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(vn vnVar) {
        super(null, true);
        this.T = vnVar;
    }
}
