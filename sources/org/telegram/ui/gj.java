package org.telegram.ui;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class gj extends org.telegram.ui.Components.m40 {
    public final /* synthetic */ int I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj(int i10, int i11, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(i10, context, d6Var, z10);
        this.I = i11;
    }

    @Override // org.telegram.ui.Components.m40
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
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
