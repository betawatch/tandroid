package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class tf extends org.telegram.ui.zn {
    public boolean Nc;
    public final /* synthetic */ TLRPC.User Oc;
    public final /* synthetic */ TLRPC.User Pc;
    public final /* synthetic */ long Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.Oc = user;
        this.Pc = user2;
        this.Qc = j10;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.p2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Nc) {
            return;
        }
        this.Nc = true;
        qc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Oc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Pc)), new gg.y1(this, this.Qc, 16)), R.raw.contact_check).j();
    }
}
