package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class mj extends FragmentContextView {
    public final /* synthetic */ int Y0;
    public final /* synthetic */ bn Z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj(bn bnVar, Context context, bn bnVar2, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, bnVar2, null, true, i6Var);
        this.Y0 = i7;
        switch (i7) {
            case 1:
                this.Z0 = bnVar;
                super(context, bnVar2, null, false, i6Var);
                break;
            default:
                this.Z0 = bnVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.Y0) {
            case 0:
                bn bnVar = this.Z0;
                bnVar.b1.j(bnVar.p2, i7 == 0, true);
                break;
            default:
                bn bnVar2 = this.Z0;
                bnVar2.b1.j(bnVar2.n2, i7 == 0, true);
                break;
        }
    }
}
