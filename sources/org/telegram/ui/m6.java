package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class m6 extends x7 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(vu vuVar, Context context, c7 c7Var) {
        super(context, c7Var, null, null);
        this.H = vuVar;
    }

    public void f(boolean z10) {
        org.telegram.ui.ActionBar.r5 r5Var;
        org.telegram.ui.ActionBar.r5 r5Var2;
        c7 c7Var = (c7) this.H;
        if (!z10) {
            r5Var = ((org.telegram.ui.ActionBar.r2) c7Var).simpleActionBar;
            r5Var.n();
            return;
        }
        oe.b bVar = c7Var.S;
        if (bVar != null) {
            bVar.a(true, true);
        }
        r5Var2 = ((org.telegram.ui.ActionBar.r2) c7Var).simpleActionBar;
        r5Var2.x();
    }

    @Override // org.telegram.ui.x7, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.G) {
            case 1:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((vu) this.H).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(c7 c7Var, Context context, c7 c7Var2, oi.q qVar, org.telegram.ui.Components.lw0 lw0Var) {
        super(context, c7Var2, qVar, lw0Var);
        this.H = c7Var;
    }
}
