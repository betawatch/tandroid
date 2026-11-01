package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lw extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ zx Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lw(zx zxVar, Context context, zx zxVar2, int i10) {
        super(context, zxVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = zxVar;
                super(context, zxVar2, false);
                break;
            default:
                this.Y0 = zxVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                zx zxVar = this.Y0;
                zxVar.J1.i(zxVar.G1, i10 == 0, true);
                break;
            default:
                zx zxVar2 = this.Y0;
                zxVar2.J1.i(zxVar2.I1, i10 == 0, true);
                break;
        }
    }
}
