package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ax extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ ry Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(ry ryVar, Context context, ry ryVar2, int i10) {
        super(context, ryVar2, true);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = ryVar;
                super(context, ryVar2, false);
                break;
            default:
                this.Q0 = ryVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                ry ryVar = this.Q0;
                ryVar.J1.i(ryVar.G1, i10 == 0, true);
                break;
            default:
                ry ryVar2 = this.Q0;
                ryVar2.J1.i(ryVar2.I1, i10 == 0, true);
                break;
        }
    }
}
