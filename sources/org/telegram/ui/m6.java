package org.telegram.ui;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class m6 extends x7 {
    public final /* synthetic */ int G = 0;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(xu xuVar, Context context, c7 c7Var) {
        super(context, c7Var, null, null);
        this.H = xuVar;
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
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((((xu) this.H).h - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(c7 c7Var, Context context, c7 c7Var2, oi.q qVar, org.telegram.ui.Components.mw0 mw0Var) {
        super(context, c7Var2, qVar, mw0Var);
        this.H = c7Var;
    }
}
