package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class eg extends org.telegram.ui.fo {
    public boolean Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ TLRPC.User Sc;
    public final /* synthetic */ long Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.Rc = user;
        this.Sc = user2;
        this.Tc = j10;
    }

    @Override // org.telegram.ui.fo, org.telegram.ui.ActionBar.m2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc) {
            return;
        }
        this.Qc = true;
        zc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc)), new bi.g(this, this.Tc, 21)), R.raw.contact_check).j();
    }
}
