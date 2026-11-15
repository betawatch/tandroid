package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.on;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j6 extends fi.h7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(pa paVar) {
        super(null, false);
        this.T = paVar;
    }

    @Override // fi.h7
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((l6) this.T).b(j3);
                break;
            case 1:
                pa paVar = (pa) this.T;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != null) {
                    Q.getOrCreateStoryViewer().getClass();
                    Q.getOrCreateStoryViewer().J(paVar.getContext(), j3, fi.b7.a((uj0) paVar.getParent()));
                    break;
                }
                break;
            default:
                on onVar = (on) this.T;
                onVar.I.getOrCreateStoryViewer().J(onVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(l6 l6Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(e6Var, false);
        this.T = l6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(on onVar) {
        super(null, true);
        this.T = onVar;
    }
}
