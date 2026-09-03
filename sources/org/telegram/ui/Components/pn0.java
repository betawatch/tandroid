package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pn0 extends zw0 {
    public final /* synthetic */ int H;
    public final /* synthetic */ org.telegram.ui.zx I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pn0(org.telegram.ui.zx zxVar, Context context, u00 u00Var, int i10) {
        super(context, u00Var, 1, null);
        this.H = i10;
        this.I = zxVar;
    }

    @Override // org.telegram.ui.Components.zw0, android.view.View
    public final void setVisibility(int i10) {
        switch (this.H) {
            case 0:
                if (this.I.J0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.I.J0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.I.J0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.I.J0.getTag() == null) {
                    super.setVisibility(i10);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
