package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ wy b;

    public /* synthetic */ aw(wy wyVar, int i10) {
        this.a = i10;
        this.b = wyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                wy wyVar = this.b;
                wyVar.O1 = (Long) obj;
                wyVar.U4();
                break;
            default:
                wy.d0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
