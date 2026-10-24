package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nb0 extends sn {
    public boolean ed;
    public final /* synthetic */ TLRPC.User fd;
    public final /* synthetic */ TLRPC.User[] gd;
    public final /* synthetic */ long hd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.fd = user;
        this.gd = userArr;
        this.hd = j10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.ed) {
            return;
        }
        this.ed = true;
        org.telegram.ui.Components.xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.fd)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.gd[0])), new ai.v3(this, this.hd, 29)), R.raw.contact_check).j();
    }
}
