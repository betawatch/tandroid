package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements org.telegram.ui.ActionBar.a2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ z1(Activity activity, Intent intent, int i10) {
        this.a = i10;
        this.b = activity;
        this.c = intent;
    }

    @Override // org.telegram.ui.ActionBar.a2
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
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
