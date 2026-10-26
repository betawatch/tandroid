package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class hw extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ cy Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(cy cyVar, Context context, cy cyVar2, int i10) {
        super(context, cyVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = cyVar;
                super(context, cyVar2, false);
                break;
            default:
                this.Y0 = cyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                cy cyVar = this.Y0;
                cyVar.J1.i(cyVar.G1, i10 == 0, true);
                break;
            default:
                cy cyVar2 = this.Y0;
                cyVar2.J1.i(cyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
