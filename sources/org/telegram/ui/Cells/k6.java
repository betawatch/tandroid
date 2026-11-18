package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.wn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class k6 extends fi.e7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(qa qaVar) {
        super(null, false);
        this.T = qaVar;
    }

    @Override // fi.e7
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((m6) this.T).b(j3);
                break;
            case 1:
                qa qaVar = (qa) this.T;
                org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(qaVar.getContext(), j3, fi.y6.a((ck0) qaVar.getParent()));
                    break;
                }
                break;
            default:
                wn wnVar = (wn) this.T;
                wnVar.I.getOrCreateStoryViewer().J(wnVar.getContext(), j3, new org.telegram.ui.Components.b0(this, 24));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(m6 m6Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i6Var, false);
        this.T = m6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(wn wnVar) {
        super(null, true);
        this.T = wnVar;
    }
}
