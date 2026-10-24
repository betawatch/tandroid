package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nw extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ ey Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw(ey eyVar, Context context, ey eyVar2, int i10) {
        super(context, eyVar2, true);
        this.X0 = i10;
        switch (i10) {
            case 1:
                this.Y0 = eyVar;
                super(context, eyVar2, false);
                break;
            default:
                this.Y0 = eyVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.X0) {
            case 0:
                ey eyVar = this.Y0;
                eyVar.J1.i(eyVar.G1, i10 == 0, true);
                break;
            default:
                ey eyVar2 = this.Y0;
                eyVar2.J1.i(eyVar2.I1, i10 == 0, true);
                break;
        }
    }
}
