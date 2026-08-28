package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ lv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                dy dyVar = this.b;
                dyVar.K1 = (Long) obj;
                dyVar.U4();
                break;
            default:
                dy.b0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
