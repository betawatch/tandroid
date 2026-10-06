package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class f91 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;

    public /* synthetic */ f91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = i10;
        this.b = context;
        this.c = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new yh.p7(this.b, this.c).show();
                break;
            case 1:
                new yh.p7(this.b, this.c).show();
                break;
            default:
                new yh.p7(this.b, this.c).show();
                break;
        }
    }
}
