package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class n6 extends zh.x5 {
    public final /* synthetic */ int S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(p6 p6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
        this.T = p6Var;
    }

    @Override // zh.x5
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((p6) this.T).b(j3);
                break;
            case 1:
                bb bbVar = (bb) this.T;
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(bbVar.getContext(), j3, zh.s5.a((vl0) bbVar.getParent()));
                    break;
                }
                break;
            default:
                fo foVar = (fo) this.T;
                foVar.H.getOrCreateStoryViewer().D(foVar.getContext(), j3, new org.telegram.ui.Components.t(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(bb bbVar) {
        super(null, false);
        this.T = bbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(fo foVar) {
        super(null, true);
        this.T = foVar;
    }
}
