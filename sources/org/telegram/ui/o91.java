package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o91 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.e6 c;

    public /* synthetic */ o91(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = i10;
        this.b = context;
        this.c = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new yh.f7(this.b, this.c).show();
                break;
            case 1:
                new yh.f7(this.b, this.c).show();
                break;
            default:
                new yh.f7(this.b, this.c).show();
                break;
        }
    }
}
