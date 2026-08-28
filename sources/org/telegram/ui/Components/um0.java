package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class um0 extends gw0 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.mx H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ um0(org.telegram.ui.mx mxVar, Context context, e00 e00Var, int i9) {
        super(context, e00Var, 1, null);
        this.G = i9;
        this.H = mxVar;
    }

    @Override // org.telegram.ui.Components.gw0, android.view.View
    public final void setVisibility(int i9) {
        switch (this.G) {
            case 0:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i9);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i9);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i9);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.H.I0.getTag() == null) {
                    super.setVisibility(i9);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
