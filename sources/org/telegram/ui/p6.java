package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p6 extends org.telegram.ui.ActionBar.z2 {
    public static final /* synthetic */ int j1 = 0;
    public final /* synthetic */ int i1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(int i10, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(i10, context, p6Var, z10);
        this.i1 = 2;
    }

    @Override // org.telegram.ui.ActionBar.z2
    public boolean I() {
        switch (this.i1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public void s0() {
        switch (this.i1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.h5, this.I0);
                    if (this.G0 != w02) {
                        P(w02);
                        break;
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
                break;
            default:
                super.s0();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(int i10, Context context, boolean z10) {
        super(context, z10);
        this.i1 = i10;
    }
}
