package org.telegram.ui.Components;

import android.content.DialogInterface;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d1 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b5 b;

    public /* synthetic */ d1(int i7, b5 b5Var) {
        this.a = i7;
        this.b = b5Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                b5 b5Var = this.b;
                b5Var.requestFocus();
                org.telegram.messenger.g0.I3(b5Var);
                break;
            case 1:
                b5 b5Var2 = this.b;
                b5Var2.requestFocus();
                org.telegram.messenger.g0.I3(b5Var2);
                break;
            default:
                org.telegram.messenger.g0.g3(new og(this.b, 2));
                break;
        }
    }
}
