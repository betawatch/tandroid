package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r70 extends ey0 {
    public final /* synthetic */ int K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r70(int i10, int i11, Context context, View view, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, view, i10, u6Var);
        this.K = i11;
    }

    @Override // org.telegram.ui.Components.ey0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.ey0, android.view.View
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
