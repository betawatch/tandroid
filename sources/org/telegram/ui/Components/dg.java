package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class dg extends org.telegram.ui.wn {
    public boolean Pc;
    public final /* synthetic */ TLRPC.User Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ long Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.Qc = user;
        this.Rc = user2;
        this.Sc = j3;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Rc)), new ai.j(this, this.Sc, 20)), R.raw.contact_check).j();
    }
}
