package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class cg extends org.telegram.ui.sn {
    public boolean Rc;
    public final /* synthetic */ TLRPC.User Sc;
    public final /* synthetic */ TLRPC.User Tc;
    public final /* synthetic */ long Uc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.Sc = user;
        this.Tc = user2;
        this.Uc = j10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Rc) {
            return;
        }
        this.Rc = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Sc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc)), new ai.t3(this, this.Uc, 23)), R.raw.contact_check).j();
    }
}
