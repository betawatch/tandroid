package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class pz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tz0 b;

    public /* synthetic */ pz0(tz0 tz0Var, int i7) {
        this.a = i7;
        this.b = tz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                tz0 tz0Var = this.b;
                if (tz0Var.Z == null) {
                    tz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
