package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sz0 b;

    public /* synthetic */ oz0(sz0 sz0Var, int i7) {
        this.a = i7;
        this.b = sz0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                sz0 sz0Var = this.b;
                if (sz0Var.Z == null) {
                    sz0Var.dismiss();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
