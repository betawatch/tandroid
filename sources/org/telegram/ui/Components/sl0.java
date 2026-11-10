package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class sl0 extends bv0 {
    public final /* synthetic */ int K;
    public final /* synthetic */ org.telegram.ui.iw L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sl0(org.telegram.ui.iw iwVar, Context context, lz lzVar, int i7) {
        super(context, lzVar, 1, null);
        this.K = i7;
        this.L = iwVar;
    }

    @Override // org.telegram.ui.Components.bv0, android.view.View
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
