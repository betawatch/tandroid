package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ik extends FragmentContextView {
    public final /* synthetic */ int P0;
    public final /* synthetic */ bo Q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik(bo boVar, Context context, bo boVar2, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        super(context, boVar2, null, true, f6Var);
        this.P0 = i10;
        switch (i10) {
            case 1:
                this.Q0 = boVar;
                super(context, boVar2, null, false, f6Var);
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
