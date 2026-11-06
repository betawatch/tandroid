package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v1 implements org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ v1(Activity activity, Intent intent, int i7) {
        this.a = i7;
        this.b = activity;
        this.c = intent;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
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
