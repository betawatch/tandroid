package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class sl0 extends av0 {
    public final /* synthetic */ int K;
    public final /* synthetic */ org.telegram.ui.fw L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl0(org.telegram.ui.fw fwVar, Context context, lz lzVar, int i7) {
        super(context, lzVar, 1, null);
        this.K = i7;
        this.L = fwVar;
    }

    @Override // org.telegram.ui.Components.av0, android.view.View
    public final void setVisibility(int i7) {
        switch (this.K) {
            case 0:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 1:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            case 2:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
            default:
                if (this.L.O0.getTag() == null) {
                    super.setVisibility(i7);
                    break;
                } else {
                    super.setVisibility(8);
                    break;
                }
        }
    }
}
