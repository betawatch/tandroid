package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class hs0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int ld = 1;

    public /* synthetic */ hs0(Context context, int i7) {
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

    public /* synthetic */ hs0(Context context, int i7, boolean z9, h6.m mVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i7, z9, mVar, g6Var);
    }
}
