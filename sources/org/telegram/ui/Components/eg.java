package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class eg extends org.telegram.ui.yn {
    public boolean Kc;
    public final /* synthetic */ TLRPC.User Lc;
    public final /* synthetic */ TLRPC.User Mc;
    public final /* synthetic */ long Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j3) {
        super(bundle);
        this.Lc = user;
        this.Mc = user2;
        this.Nc = j3;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Kc) {
            return;
        }
        this.Kc = true;
        yc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Lc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Mc)), new ai.j(this, this.Nc, 20)), R.raw.contact_check).j();
    }
}
