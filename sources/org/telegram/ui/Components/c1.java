package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class c1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ c1(int i7, a5 a5Var) {
        this.a = i7;
        this.b = a5Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                a5 a5Var = this.b;
                a5Var.requestFocus();
                org.telegram.messenger.g0.I3(a5Var);
                break;
            case 1:
                a5 a5Var2 = this.b;
                a5Var2.requestFocus();
                org.telegram.messenger.g0.I3(a5Var2);
                break;
            default:
                org.telegram.messenger.g0.g3(new lg(this.b, 2));
                break;
        }
    }
}
