package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ij extends org.telegram.ui.Components.i40 {
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ij(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(i10, context, f6Var, z10);
        this.I = i11;
    }

    @Override // org.telegram.ui.Components.i40
    public int c() {
        switch (this.I) {
            case 0:
                return AndroidUtilities.dp(56.0f) / 2;
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
            case 3:
                super.setVisibility(i10);
                if (i10 != 0) {
                    try {
                        ((ViewGroup) getParent()).removeView(this);
                        break;
                    } catch (Exception unused3) {
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
