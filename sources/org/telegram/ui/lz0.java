package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ pz0 b;

    public /* synthetic */ lz0(pz0 pz0Var, int i7) {
        this.a = i7;
        this.b = pz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                pz0 pz0Var = this.b;
                if (pz0Var.Z == null) {
                    pz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
