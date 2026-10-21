package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ iv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                cy cyVar = this.b;
                cyVar.O1 = (Long) obj;
                cyVar.S4();
                break;
            default:
                cy.a0(this.b, (TL_account.TL_birthday) obj);
                break;
        }
    }
}
