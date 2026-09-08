package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                new zh.l7(this.b, this.c).show();
                break;
            case 1:
                new zh.l7(this.b, this.c).show();
                break;
            default:
                new zh.l7(this.b, this.c).show();
                break;
        }
    }
}
