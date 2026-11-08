package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p50 extends av0 {
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p50(Context context, View view, int i7, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, view, i7, f6Var);
        this.K = i10;
    }

    @Override // org.telegram.ui.Components.av0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.av0, android.view.View
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
