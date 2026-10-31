package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ft0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int hd = 1;

    public /* synthetic */ ft0(Context context, int i10) {
        super(context, i10);
    }

    @Override // org.telegram.ui.Cells.q1
    public int getParentWidth() {
        int i10;
        int L;
        switch (this.hd) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i10 = getMeasuredWidth();
                    L = org.telegram.messenger.i0.L(24.0f);
                } else {
                    i10 = org.telegram.messenger.i0.q.x;
                    L = org.telegram.messenger.i0.L(24.0f);
                }
                return i10 - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override // android.view.View
    public final boolean isPressed() {
        switch (this.hd) {
        }
        return false;
    }

    public /* synthetic */ ft0(Context context, int i10, boolean z10, li.k kVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, z10, kVar, p6Var);
    }
}
