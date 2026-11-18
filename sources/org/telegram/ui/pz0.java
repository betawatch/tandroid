package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
