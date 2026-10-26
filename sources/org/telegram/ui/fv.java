package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ fv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                cyVar.O1 = (Long) obj;
                cyVar.c5();
                break;
            default:
                cy.b0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
