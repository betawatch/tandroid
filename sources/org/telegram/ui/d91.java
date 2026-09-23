package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class d91 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;

    public /* synthetic */ d91(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = i10;
        this.b = context;
        this.c = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new yh.m7(this.b, this.c).show();
                break;
            case 1:
                new yh.m7(this.b, this.c).show();
                break;
            default:
                new yh.m7(this.b, this.c).show();
                break;
        }
    }
}
