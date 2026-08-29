package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class gn0 extends qw0 {
    public final /* synthetic */ int G;
    public final /* synthetic */ org.telegram.ui.ox H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gn0(org.telegram.ui.ox oxVar, Context context, p00 p00Var, int i10) {
        super(context, p00Var, 1, null);
        this.G = i10;
        this.H = oxVar;
    }

    @Override // org.telegram.ui.Components.qw0, android.view.View
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
