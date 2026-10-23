package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class l6 extends ci.y7 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(n6 n6Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(d6Var, false);
        this.T = n6Var;
    }

    @Override // ci.y7
    public final void f(long j10) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j10);
                break;
            case 1:
                va vaVar = (va) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(vaVar.getContext(), j10, ci.r7.a((jm0) vaVar.getParent()));
                    break;
                }
                break;
            default:
                ko koVar = (ko) this.T;
                koVar.H.getOrCreateStoryViewer().D(koVar.getContext(), j10, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(va vaVar) {
        super(null, false);
        this.T = vaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(ko koVar) {
        super(null, true);
        this.T = koVar;
    }
}
