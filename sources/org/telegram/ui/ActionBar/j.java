package org.telegram.ui.ActionBar;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j extends n {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ FrameLayout e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(uw uwVar, Context context, ac.a aVar) {
        super(context, null, aVar);
        this.e = uwVar;
    }

    @Override // org.telegram.ui.ActionBar.n, fe.l
    public final void b(fe.m mVar) {
        switch (this.d) {
            case 0:
                super.b(mVar);
                float totalVisibility = getTotalVisibility();
                org.telegram.ui.Cells.a5 a5Var = ((kg.g1) this.e).F0;
                if (a5Var != null) {
                    a5Var.setTranslationY(totalVisibility * org.telegram.messenger.i0.L(-11.0f));
                    break;
                }
                break;
            default:
                super.b(mVar);
                ((uw) this.e).invalidate();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kg.g1 g1Var, Context context, p6 p6Var, ac.a aVar) {
        super(context, p6Var, aVar);
        this.e = g1Var;
    }
}
