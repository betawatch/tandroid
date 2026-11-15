package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ s4 b;

    public /* synthetic */ r0(int i7, s4 s4Var) {
        this.a = i7;
        this.b = s4Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s4 s4Var = this.b;
                s4Var.requestFocus();
                org.telegram.messenger.g0.J3(s4Var);
                break;
            case 1:
                s4 s4Var2 = this.b;
                s4Var2.requestFocus();
                org.telegram.messenger.g0.J3(s4Var2);
                break;
            default:
                org.telegram.messenger.g0.h3(new dg(this.b, 2));
                break;
        }
    }
}
