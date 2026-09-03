package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l6 extends oh.i7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(n6 n6Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(g6Var, false);
        this.T = n6Var;
    }

    @Override // oh.i7
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j10);
                break;
            case 1:
                va vaVar = (va) this.T;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(vaVar.getContext(), j10, oh.c7.a((sl0) vaVar.getParent()));
                    break;
                }
                break;
            default:
                wn wnVar = (wn) this.T;
                wnVar.E.getOrCreateStoryViewer().D(wnVar.getContext(), j10, new org.telegram.ui.Components.t(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(va vaVar) {
        super(null, false);
        this.T = vaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(wn wnVar) {
        super(null, true);
        this.T = wnVar;
    }
}
