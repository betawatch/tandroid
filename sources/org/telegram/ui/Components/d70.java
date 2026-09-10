package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d70 extends jx0 {
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d70(Context context, View view, int i10, org.telegram.ui.ActionBar.f6 f6Var, int i11) {
        super(context, view, i10, f6Var);
        this.K = i11;
    }

    @Override // org.telegram.ui.Components.jx0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.K) {
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

    @Override // org.telegram.ui.Components.jx0, android.view.View
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
