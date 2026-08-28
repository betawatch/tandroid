package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ a2(Activity activity, Intent intent, int i9) {
        this.a = i9;
        this.b = activity;
        this.c = intent;
    }

    @Override // org.telegram.ui.ActionBar.b2
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
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
