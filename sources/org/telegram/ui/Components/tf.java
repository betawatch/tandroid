package org.telegram.ui.Components;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class tf extends org.telegram.ui.qn {
    public boolean Mc;
    public final /* synthetic */ TLRPC.User Nc;
    public final /* synthetic */ TLRPC.User Oc;
    public final /* synthetic */ long Pc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tf(Bundle bundle, TLRPC.User user, TLRPC.User user2, long j10) {
        super(bundle);
        this.Nc = user;
        this.Oc = user2;
        this.Pc = j10;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.o2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Mc) {
            return;
        }
        this.Mc = true;
        oc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Nc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Oc)), new bg.i2(this, this.Pc, 22)), R.raw.contact_check).j();
    }
}
