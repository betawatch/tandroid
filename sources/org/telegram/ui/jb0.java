package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class jb0 extends sn {
    public boolean Qc;
    public final /* synthetic */ TLRPC.User Rc;
    public final /* synthetic */ TLRPC.User[] Sc;
    public final /* synthetic */ long Tc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.Rc = user;
        this.Sc = userArr;
        this.Tc = j10;
    }

    @Override // org.telegram.ui.sn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Qc) {
            return;
        }
        this.Qc = true;
        org.telegram.ui.Components.xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Rc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Sc[0])), new ai.r3(this, this.Tc, 29)), R.raw.contact_check).j();
    }
}
