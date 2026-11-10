package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class kv extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ zw Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(zw zwVar, Context context, zw zwVar2, int i7) {
        super(context, zwVar2, true);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = zwVar;
                super(context, zwVar2, false);
                break;
            default:
                this.Y0 = zwVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.X0) {
            case 0:
                zw zwVar = this.Y0;
                zwVar.K1.i(zwVar.H1, i7 == 0, true);
                break;
            default:
                zw zwVar2 = this.Y0;
                zwVar2.K1.i(zwVar2.J1, i7 == 0, true);
                break;
        }
    }
}
