package org.telegram.ui.Cells;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.np;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k2 extends np {
    public final /* synthetic */ int d;
    public final /* synthetic */ ViewGroup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(ViewGroup viewGroup, Context context, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        super(context, 21, g6Var);
        this.d = i10;
        this.e = viewGroup;
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.d) {
            case 0:
                super.invalidate();
                ((r2) this.e).invalidate();
                break;
            case 1:
                super.invalidate();
                ((org.telegram.ui.web.h) this.e).invalidate();
                break;
            default:
                super.invalidate();
                ((qh.w2) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(qh.w2 w2Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 24, g6Var);
        this.d = 2;
        this.e = w2Var;
    }
}
