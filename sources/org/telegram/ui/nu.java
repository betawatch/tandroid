package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
