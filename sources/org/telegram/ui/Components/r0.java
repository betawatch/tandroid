package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
