package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;

    public /* synthetic */ j4(t4 t4Var, int i9) {
        this.a = i9;
        this.b = t4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            case 1:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }
}
