package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.yn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class l6 extends bi.j9 {
    public final /* synthetic */ int S = 0;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(n6 n6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
        this.T = n6Var;
    }

    @Override // bi.j9
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((n6) this.T).b(j3);
                break;
            case 1:
                za zaVar = (za) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(zaVar.getContext(), j3, bi.d9.a((ll0) zaVar.getParent()));
                    break;
                }
                break;
            default:
                yn ynVar = (yn) this.T;
                ynVar.H.getOrCreateStoryViewer().D(ynVar.getContext(), j3, new org.telegram.ui.Components.t(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(za zaVar) {
        super(null, false);
        this.T = zaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(yn ynVar) {
        super(null, true);
        this.T = ynVar;
    }
}
