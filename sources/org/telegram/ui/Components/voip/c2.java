package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c2 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ c2(Activity activity, Intent intent, int i10) {
        this.a = i10;
        this.b = activity;
        this.c = intent;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
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
