package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class jj extends org.telegram.ui.Components.i40 {
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj(int i10, int i11, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
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
