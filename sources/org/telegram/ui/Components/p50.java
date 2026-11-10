package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class p50 extends bv0 {
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p50(Context context, View view, int i7, org.telegram.ui.ActionBar.h6 h6Var, int i10) {
        super(context, view, i7, h6Var);
        this.K = i10;
    }

    @Override // org.telegram.ui.Components.bv0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.bv0, android.view.View
    public void setVisibility(int i7) {
        switch (this.K) {
            case 2:
                super.setVisibility(i7);
                if (i7 != 0) {
                    e(false, false);
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
                break;
        }
    }
}
