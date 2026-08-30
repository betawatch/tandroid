package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class v60 extends zw0 {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v60(Context context, View view, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, view, i10, f6Var);
        this.H = i11;
    }

    @Override // org.telegram.ui.Components.zw0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.H) {
            case 0:
                super.onAttachedToWindow();
                this.b.getImageReceiver().startAnimation();
                break;
            case 1:
                super.onAttachedToWindow();
                this.b.getImageReceiver().startAnimation();
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // org.telegram.ui.Components.zw0, android.view.View
    public void setVisibility(int i10) {
        switch (this.H) {
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
