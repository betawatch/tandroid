package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if0 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ mf0 b;

    public /* synthetic */ if0(mf0 mf0Var, int i10) {
        this.a = i10;
        this.b = mf0Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.o0.finishFragment();
                break;
            default:
                this.b.o0.finishFragment();
                break;
        }
    }
}
