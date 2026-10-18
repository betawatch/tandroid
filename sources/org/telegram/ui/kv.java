package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ kv(ey eyVar, int i10) {
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
