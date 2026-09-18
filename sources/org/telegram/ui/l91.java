package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
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
