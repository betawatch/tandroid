package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class m50 extends zu0 {
    public final /* synthetic */ int L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m50(Context context, View view, int i3, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, view, i3, e6Var);
        this.L = i10;
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.L) {
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

    @Override // org.telegram.ui.Components.zu0, android.view.View
    public void setVisibility(int i3) {
        switch (this.L) {
            case 2:
                super.setVisibility(i3);
                if (i3 != 0) {
                    e(false, false);
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }
}
