package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class o91 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 c;

    public /* synthetic */ o91(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = i10;
        this.b = context;
        this.c = f6Var;
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
