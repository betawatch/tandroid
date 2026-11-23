package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx b;

    public /* synthetic */ mu(bx bxVar, int i7) {
        this.a = i7;
        this.b = bxVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                bx bxVar = this.b;
                if (bxVar.W3 != null) {
                    bxVar.getMessagesController().s4(0L, bxVar.W3);
                    bxVar.W3 = null;
                    bxVar.f5();
                    break;
                }
                break;
            case 1:
                this.b.p4(true);
                break;
            case 2:
                this.b.p4(true);
                break;
            default:
                bx.h0(this.b);
                break;
        }
    }
}
