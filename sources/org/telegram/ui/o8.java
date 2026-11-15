package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i9 b;
    public final /* synthetic */ int c;

    public /* synthetic */ o8(i9 i9Var, int i7, int i10) {
        this.a = i10;
        this.b = i9Var;
        this.c = i7;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
            default:
                this.b.getConnectionsManager().cancelRequest(this.c, true);
                break;
        }
    }
}
