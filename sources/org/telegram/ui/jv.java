package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class jv extends FragmentContextView {
    public final /* synthetic */ int X0;
    public final /* synthetic */ yw Y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(yw ywVar, Context context, yw ywVar2, int i7) {
        super(context, ywVar2, true);
        this.X0 = i7;
        switch (i7) {
            case 1:
                this.Y0 = ywVar;
                super(context, ywVar2, false);
                break;
            default:
                this.Y0 = ywVar;
                break;
        }
    }

    @Override // org.telegram.ui.Components.FragmentContextView, android.view.View
    public final void setVisibility(int i7) {
        switch (this.X0) {
            case 0:
                yw ywVar = this.Y0;
                ywVar.K1.i(ywVar.H1, i7 == 0, true);
                break;
            default:
                yw ywVar2 = this.Y0;
                ywVar2.K1.i(ywVar2.J1, i7 == 0, true);
                break;
        }
    }
}
