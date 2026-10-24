package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
