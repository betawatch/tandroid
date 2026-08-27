package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class i60 extends iw0 {
    public final /* synthetic */ int G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i60(Context context, View view, int i10, org.telegram.ui.ActionBar.c6 c6Var, int i11) {
        super(context, view, i10, c6Var);
        this.G = i11;
    }

    @Override // org.telegram.ui.Components.iw0, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.G) {
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

    @Override // org.telegram.ui.Components.iw0, android.view.View
    public void setVisibility(int i10) {
        switch (this.G) {
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
