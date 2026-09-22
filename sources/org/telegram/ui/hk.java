package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class hk extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ bo Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk(bo boVar, Context context, bo boVar2, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        super(context, boVar2, null, true, e6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = boVar;
                super(context, boVar2, null, false, e6Var);
                break;
            default:
                this.Q0 = boVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i10) {
        switch (this.P0) {
            case 0:
                bo boVar = this.Q0;
                boVar.M0.i(boVar.a2, i10 == 0, true);
                break;
            default:
                bo boVar2 = this.Q0;
                boVar2.M0.i(boVar2.Y1, i10 == 0, true);
                break;
        }
    }
}
