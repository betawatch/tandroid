package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class p6 extends org.telegram.ui.ActionBar.v2 {
    public static final /* synthetic */ int j1 = 0;
    public final /* synthetic */ int i1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(int i7, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(i7, context, f6Var, z9);
        this.i1 = 2;
    }

    @Override // org.telegram.ui.ActionBar.v2
    public boolean H() {
        switch (this.i1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public void s0() {
        switch (this.i1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.h5, this.I0);
                    if (this.G0 != w02) {
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
    public /* synthetic */ p6(int i7, Context context, boolean z9) {
        super(context, z9);
        this.i1 = i7;
    }
}
