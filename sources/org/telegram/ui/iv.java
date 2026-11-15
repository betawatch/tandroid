package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class iv extends FragmentContextView {
    public final /* synthetic */ int Y0;
    public final /* synthetic */ yw Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(yw ywVar, Context context, yw ywVar2, int i7) {
        super(context, ywVar2, true);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = ywVar;
                super(context, ywVar2, false);
                break;
            default:
                this.Z0 = ywVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                yw ywVar = this.Z0;
                ywVar.L1.i(ywVar.I1, i7 == 0, true);
                break;
            default:
                yw ywVar2 = this.Z0;
                ywVar2.L1.i(ywVar2.K1, i7 == 0, true);
                break;
        }
    }
}
