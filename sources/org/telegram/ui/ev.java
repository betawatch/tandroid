package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ev extends FragmentContextView {
    public final /* synthetic */ int Y0;
    public final /* synthetic */ uw Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev(uw uwVar, Context context, uw uwVar2, int i3) {
        super(context, uwVar2, true);
        this.Y0 = i3;
        switch (i3) {
            case 1:
                this.Z0 = uwVar;
                super(context, uwVar2, false);
                break;
            default:
                this.Z0 = uwVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i3) {
        switch (this.Y0) {
            case 0:
                uw uwVar = this.Z0;
                uwVar.K1.i(uwVar.H1, i3 == 0, true);
                break;
            default:
                uw uwVar2 = this.Z0;
                uwVar2.K1.i(uwVar2.J1, i3 == 0, true);
                break;
        }
    }
}
