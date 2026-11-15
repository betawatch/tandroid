package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class lj extends FragmentContextView {
    public final /* synthetic */ int Y0;
    public final /* synthetic */ an Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(an anVar, Context context, an anVar2, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, anVar2, null, true, e6Var);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = anVar;
                super(context, anVar2, null, false, e6Var);
                break;
            default:
                this.Z0 = anVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                an anVar = this.Z0;
                anVar.b1.i(anVar.p2, i7 == 0, true);
                break;
            default:
                an anVar2 = this.Z0;
                anVar2.b1.i(anVar2.n2, i7 == 0, true);
                break;
        }
    }
}
