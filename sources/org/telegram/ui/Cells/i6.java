package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.nn;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i6 extends jh.h7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(k6 k6Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(c6Var, false);
        this.T = k6Var;
    }

    @Override // jh.h7
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((k6) this.T).b(j10);
                break;
            case 1:
                sa saVar = (sa) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(saVar.getContext(), j10, jh.b7.a((zk0) saVar.getParent()));
                    break;
                }
                break;
            default:
                nn nnVar = (nn) this.T;
                nnVar.D.getOrCreateStoryViewer().D(nnVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(sa saVar) {
        super(null, false);
        this.T = saVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(nn nnVar) {
        super(null, true);
        this.T = nnVar;
    }
}
