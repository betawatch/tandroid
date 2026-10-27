package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ pe(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                dk dkVar = this.b.j2;
                if (dkVar != null) {
                    dkVar.c(false);
                    break;
                }
                break;
            case 1:
                wn.D0(this.b);
                break;
            case 2:
                this.b.p8(false, true, 0.0f);
                break;
            case 3:
                this.b.p8(false, true, 0.0f);
                break;
            case 4:
                this.b.p8(false, true, 0.0f);
                break;
            case 5:
                this.b.p8(false, true, 0.0f);
                break;
            case 6:
                this.b.p8(false, true, 0.0f);
                break;
            case 7:
                this.b.p8(false, true, 0.0f);
                break;
            default:
                this.b.gc = null;
                break;
        }
    }
}
