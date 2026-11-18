package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class os0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int zd = 1;

    public /* synthetic */ os0(Context context, int i7) {
        super(context, i7);
    }

    @Override // org.telegram.ui.Cells.q1
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

    public /* synthetic */ os0(Context context, int i7, boolean z10, h6.m mVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, z10, mVar, i6Var);
    }
}
