package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class qn0 extends zw0 {
    public final /* synthetic */ int H;
    public final /* synthetic */ org.telegram.ui.yx I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qn0(org.telegram.ui.yx yxVar, Context context, u00 u00Var, int i10) {
        super(context, u00Var, 1, null);
        this.H = i10;
        this.I = yxVar;
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
