package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class cc0 extends yn {
    public boolean Kc;
    public final /* synthetic */ TLRPC.User Lc;
    public final /* synthetic */ TLRPC.User[] Mc;
    public final /* synthetic */ long Nc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j3) {
        super(bundle);
        this.Lc = user;
        this.Mc = userArr;
        this.Nc = j3;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Kc) {
            return;
        }
        this.Kc = true;
        org.telegram.ui.Components.yc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Lc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Mc[0])), new ai.j(this, this.Nc, 25)), R.raw.contact_check).j();
    }
}
