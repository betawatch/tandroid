package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class es0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int kd = 1;

    public /* synthetic */ es0(Context context, int i3) {
        super(context, i3);
    }

    @Override // org.telegram.ui.Cells.q1
    public int getParentWidth() {
        int i3;
        int L;
        switch (this.kd) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i3 = getMeasuredWidth();
                    L = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i3 = org.telegram.messenger.g0.q.x;
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                return i3 - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override // android.view.View
    public final boolean isPressed() {
        switch (this.kd) {
        }
        return false;
    }

    public /* synthetic */ es0(Context context, int i3, boolean z10, k4.j jVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, z10, jVar, e6Var);
    }
}
