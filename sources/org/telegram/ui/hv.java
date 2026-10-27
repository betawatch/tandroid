package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ hv(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                ey eyVar = this.b;
                eyVar.O1 = (Long) obj;
                eyVar.c5();
                break;
            default:
                ey.b0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
