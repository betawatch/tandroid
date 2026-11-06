package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class fs0 extends org.telegram.ui.Cells.q1 {
    public final /* synthetic */ int kd = 1;

    public /* synthetic */ fs0(Context context, int i7) {
        super(context, i7);
    }

    @Override // org.telegram.ui.Cells.q1
    public int getParentWidth() {
        int i7;
        int L;
        switch (this.kd) {
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
        switch (this.kd) {
        }
        return false;
    }

    public /* synthetic */ fs0(Context context, int i7, boolean z9, h6.m mVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, z9, mVar, f6Var);
    }
}
