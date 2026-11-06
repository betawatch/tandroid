package org.telegram.ui;

import android.content.Context;
import java.util.HashSet;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class b61 extends org.telegram.ui.Cells.i0 implements org.telegram.ui.ActionBar.a6 {
    public int e;
    public final /* synthetic */ f61 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b61(f61 f61Var, Context context) {
        super(context);
        this.f = f61Var;
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jj));
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.Cells.h0 h0Var = this.d;
        if (h0Var == null) {
            return;
        }
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Jj, false);
            if (x02 != this.e) {
                this.e = x02;
                h0Var.setOuterColor(x02);
                h0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
