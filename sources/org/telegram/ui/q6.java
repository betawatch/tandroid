package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q6 extends org.telegram.ui.ActionBar.t2 {
    public static final /* synthetic */ int k1 = 0;
    public final /* synthetic */ int j1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6(int i3, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(i3, context, e6Var, z10);
        this.j1 = 2;
    }

    @Override // org.telegram.ui.ActionBar.t2
    public boolean H() {
        switch (this.j1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override // org.telegram.ui.ActionBar.t2
    public void s0() {
        switch (this.j1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.J0);
                    if (this.H0 != w02) {
                        O(w02);
                        break;
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
                break;
            default:
                super.s0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q6(int i3, Context context, boolean z10) {
        super(context, z10);
        this.j1 = i3;
    }
}
