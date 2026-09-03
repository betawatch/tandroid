package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;

    public /* synthetic */ h0(g1 g1Var, int i10) {
        this.a = i10;
        this.b = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.b();
                break;
            default:
                this.b.b();
                break;
        }
    }
}
