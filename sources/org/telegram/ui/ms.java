package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ms implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ us b;

    public /* synthetic */ ms(us usVar, int i10) {
        this.a = i10;
        this.b = usVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                us usVar = this.b;
                if (usVar.J) {
                    usVar.d.b.requestFocus();
                    AndroidUtilities.showKeyboard(usVar.d.b);
                    break;
                }
                break;
            case 1:
                us.Z(this.b);
                break;
            default:
                us usVar2 = this.b;
                usVar2.presentFragment(bo.R9(usVar2.H), true);
                break;
        }
    }
}
