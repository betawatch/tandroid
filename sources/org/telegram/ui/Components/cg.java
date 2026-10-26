package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class cg extends org.telegram.ui.un {
    public boolean kd;
    public final /* synthetic */ TLRPC.User ld;
    public final /* synthetic */ TLRPC.User md;
    public final /* synthetic */ long nd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.ld = user;
        this.md = user2;
        this.nd = j10;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.r2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.kd) {
            return;
        }
        this.kd = true;
        wc.b0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.ld)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.md)), new bi.r3(this, this.nd, 23)), R.raw.contact_check).j();
    }
}
