package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class rs0 extends org.telegram.ui.Cells.r1 {
    public final /* synthetic */ int zd = 1;

    public /* synthetic */ rs0(Context context, int i7) {
        super(context, i7);
    }

    @Override // org.telegram.ui.Cells.r1
    public int getParentWidth() {
        int i7;
        int L;
        switch (this.zd) {
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
        switch (this.zd) {
        }
        return false;
    }

    public /* synthetic */ rs0(Context context, int i7, boolean z10, h6.m mVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, z10, mVar, h6Var);
    }
}
