package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l91 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;

    public /* synthetic */ l91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = i10;
        this.b = context;
        this.c = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new yh.l7(this.b, this.c).show();
                break;
            case 1:
                new yh.l7(this.b, this.c).show();
                break;
            default:
                new yh.l7(this.b, this.c).show();
                break;
        }
    }
}
