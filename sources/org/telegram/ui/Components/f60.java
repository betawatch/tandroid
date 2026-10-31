package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f60 extends dw0 {
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f60(Context context, View view, int i10, org.telegram.ui.ActionBar.p6 p6Var, int i11) {
        super(context, view, i10, p6Var);
        this.K = i11;
    }

    @Override // org.telegram.ui.Components.dw0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.K) {
            case 0:
                super.onAttachedToWindow();
                this.b.getImageReceiver().P0(false);
                break;
            case 1:
                super.onAttachedToWindow();
                this.b.getImageReceiver().P0(false);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.dw0, android.view.View
    public void setVisibility(int i10) {
        switch (this.K) {
            case 2:
                super.setVisibility(i10);
                if (i10 != 0) {
                    e(false, false);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }
}
