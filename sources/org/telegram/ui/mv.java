package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ mv(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                fy fyVar = this.b;
                fyVar.K1 = (Long) obj;
                fyVar.U4();
                break;
            default:
                fy.c0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
