package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ jv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                eyVar.O1 = (Long) obj;
                eyVar.S4();
                break;
            default:
                ey.a0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
