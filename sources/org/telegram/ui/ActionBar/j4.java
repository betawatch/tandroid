package org.telegram.ui.ActionBar;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j4 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ t4 b;

    public /* synthetic */ j4(t4 t4Var, int i10) {
        this.a = i10;
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
