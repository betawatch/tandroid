package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class lj extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ an Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(an anVar, Context context, an anVar2, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, anVar2, null, true, f6Var);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = anVar;
                super(context, anVar2, null, false, f6Var);
                break;
            default:
                this.Y0 = anVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.X0) {
            case 0:
                an anVar = this.Y0;
                anVar.a1.i(anVar.o2, i7 == 0, true);
                break;
            default:
                an anVar2 = this.Y0;
                anVar2.a1.i(anVar2.m2, i7 == 0, true);
                break;
        }
    }
}
