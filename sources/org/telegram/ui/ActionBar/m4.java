package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ w4 b;

    public /* synthetic */ m4(w4 w4Var, int i10) {
        this.a = i10;
        this.b = w4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
