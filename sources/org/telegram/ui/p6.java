package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p6 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int m1 = 0;
    public final /* synthetic */ int l1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p6(int i7, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z9) {
        super(i7, context, h6Var, z9);
        this.l1 = 2;
    }

    @Override // org.telegram.ui.ActionBar.w2
    public boolean H() {
        switch (this.l1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public void s0() {
        switch (this.l1) {
            case 2:
                super.s0();
                try {
                    int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.I0);
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
        this.l1 = i7;
    }
}
