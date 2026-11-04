package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ k1(Activity activity, Intent intent, int i3) {
        this.a = i3;
        this.b = activity;
        this.c = intent;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.a) {
            case 0:
                this.b.startActivity(this.c);
                break;
            default:
                this.b.startActivity(this.c);
                break;
        }
    }
}
