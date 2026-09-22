package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                new yh.n7(this.b, this.c).show();
                break;
            case 1:
                new yh.n7(this.b, this.c).show();
                break;
            default:
                new yh.n7(this.b, this.c).show();
                break;
        }
    }
}
