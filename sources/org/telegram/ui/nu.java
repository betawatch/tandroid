package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
