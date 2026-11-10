package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class gs0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int ld = 1;

    public /* synthetic */ gs0(Context context, int i7) {
        super(context, i7);
    }

    @Override // org.telegram.ui.Cells.q1
    public int getParentWidth() {
        int i7;
        int L;
        switch (this.ld) {
            case 1:
                if (getMeasuredWidth() != 0) {
                    i7 = getMeasuredWidth();
                    L = org.telegram.messenger.g0.L(24.0f);
                } else {
                    i7 = org.telegram.messenger.g0.q.x;
                    L = org.telegram.messenger.g0.L(24.0f);
                }
                return i7 - L;
            default:
                return super.getParentWidth();
        }
    }

    @Override // android.view.View
    public final boolean isPressed() {
        switch (this.ld) {
        }
        return false;
    }

    public /* synthetic */ gs0(Context context, int i7, boolean z9, h6.m mVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, z9, mVar, h6Var);
    }
}
