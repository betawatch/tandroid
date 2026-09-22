package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bg extends org.telegram.ui.bo {
    public boolean Pc;
    public final /* synthetic */ TLRPC.User Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ long Sc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.Qc = user;
        this.Rc = user2;
        this.Sc = j3;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Pc) {
            return;
        }
        this.Pc = true;
        vc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Qc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Rc)), new ai.j(this, this.Sc, 20)), R.raw.contact_check).j();
    }
}
