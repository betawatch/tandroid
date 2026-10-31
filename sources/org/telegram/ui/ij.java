package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Components.q30 {
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij(int i10, int i11, Context context, org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        super(i10, context, p6Var, z10);
        this.I = i11;
    }

    @Override // org.telegram.ui.Components.q30
    public int c() {
        switch (this.I) {
            case 0:
                return org.telegram.messenger.i0.L(56.0f) / 2;
            default:
                return super.c();
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.I) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 2:
                super.setVisibility(i10);
                if (i10 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
