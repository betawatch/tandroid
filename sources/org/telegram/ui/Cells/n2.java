package org.telegram.ui.Cells;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.ep;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class n2 extends ep {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.p6 p6Var, int i10) {
        super(21, context, p6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((v2) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.web.g) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((vh.h2) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(vh.h2 h2Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(24, context, p6Var);
        this.d = 2;
        this.e = h2Var;
    }
}
