package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x60 extends ax0 {
    public final /* synthetic */ int H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x60(Context context, View view, int i10, org.telegram.ui.ActionBar.g6 g6Var, int i11) {
        super(context, view, i10, g6Var);
        this.H = i11;
    }

    @Override // org.telegram.ui.Components.ax0, android.view.ViewGroup, android.view.View
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

    @Override // org.telegram.ui.Components.ax0, android.view.View
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
