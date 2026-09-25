package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c2 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ c2(Activity activity, Intent intent, int i10) {
        this.a = i10;
        this.b = activity;
        this.c = intent;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
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
