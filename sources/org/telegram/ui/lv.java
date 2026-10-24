package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ lv(ey eyVar, int i10) {
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
