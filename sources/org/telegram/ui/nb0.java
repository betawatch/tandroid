package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class nb0 extends wn {
    public boolean od;
    public final /* synthetic */ TLRPC.User pd;
    public final /* synthetic */ TLRPC.User[] qd;
    public final /* synthetic */ long rd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.pd = user;
        this.qd = userArr;
        this.rd = j10;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.od) {
            return;
        }
        this.od = true;
        org.telegram.ui.Components.wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.pd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.qd[0])), new bi.r3(this, this.rd, 29)), R.raw.contact_check).j();
    }
}
