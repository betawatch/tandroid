package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class lv extends FragmentContextView {
    public final /* synthetic */ int Y0;
    public final /* synthetic */ cx Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(cx cxVar, Context context, cx cxVar2, int i7) {
        super(context, cxVar2, true);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = cxVar;
                super(context, cxVar2, false);
                break;
            default:
                this.Z0 = cxVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                cx cxVar = this.Z0;
                cxVar.L1.j(cxVar.I1, i7 == 0, true);
                break;
            default:
                cx cxVar2 = this.Z0;
                cxVar2.L1.j(cxVar2.K1, i7 == 0, true);
                break;
        }
    }
}
