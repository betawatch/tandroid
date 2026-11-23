package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nu implements DialogInterface.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ cx b;

    public /* synthetic */ nu(cx cxVar, int i7) {
        this.a = i7;
        this.b = cxVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                cx cxVar = this.b;
                if (cxVar.W3 != null) {
                    cxVar.getMessagesController().s4(0L, cxVar.W3);
                    cxVar.W3 = null;
                    cxVar.f5();
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
                cx.h0(this.b);
                break;
        }
    }
}
