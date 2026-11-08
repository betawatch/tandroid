package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class fs0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int ld = 1;

    public /* synthetic */ fs0(Context context, int i7) {
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

    public /* synthetic */ fs0(Context context, int i7, boolean z9, h6.m mVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, z9, mVar, f6Var);
    }
}
