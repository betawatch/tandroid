package org.telegram.ui.Cells;

import android.view.View;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.zn;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class n6 extends ai.ca {
    public final /* synthetic */ int S = 1;
    public final /* synthetic */ View T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(p6 p6Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(f6Var, false);
        this.T = p6Var;
    }

    @Override // ai.ca
    public final void f(long j3) {
        switch (this.S) {
            case 0:
                ((p6) this.T).b(j3);
                break;
            case 1:
                ab abVar = (ab) this.T;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R != null) {
                    R.getOrCreateStoryViewer().getClass();
                    R.getOrCreateStoryViewer().D(abVar.getContext(), j3, ai.u9.a((vl0) abVar.getParent()));
                    break;
                }
                break;
            default:
                zn znVar = (zn) this.T;
                znVar.H.getOrCreateStoryViewer().D(znVar.getContext(), j3, new org.telegram.ui.Components.s(this, 25));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(ab abVar) {
        super(null, false);
        this.T = abVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(zn znVar) {
        super(null, true);
        this.T = znVar;
    }
}
