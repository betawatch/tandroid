package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class o6 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int n1 = 0;
    public final /* synthetic */ int m1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(i7, context, h6Var, z10);
        this.m1 = 2;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public boolean I() {
        switch (this.m1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public void s0() {
        switch (this.m1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0);
                    if (this.H0 != w02) {
                        P(w02);
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
    public /* synthetic */ o6(int i7, Context context, boolean z10) {
        super(context, z10);
        this.m1 = i7;
    }
}
