package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class wm0 extends iw0 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.px H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wm0(org.telegram.ui.px pxVar, Context context, h00 h00Var, int i10) {
        super(context, h00Var, 1, null);
        this.G = i10;
        this.H = pxVar;
    }

    @Override // org.telegram.ui.Components.iw0, android.view.View
    public final void setVisibility(int i10) {
        switch (this.G) {
            case 0:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
