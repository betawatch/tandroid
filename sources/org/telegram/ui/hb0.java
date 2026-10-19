package org.telegram.ui;

import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class hb0 extends qn {
    public boolean Rc;
    public final /* synthetic */ TLRPC.User Sc;
    public final /* synthetic */ TLRPC.User[] Tc;
    public final /* synthetic */ long Uc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hb0(Bundle bundle, TLRPC.User user, TLRPC.User[] userArr, long j10) {
        super(bundle);
        this.Sc = user;
        this.Tc = userArr;
        this.Uc = j10;
    }

    @Override // org.telegram.ui.qn, org.telegram.ui.ActionBar.n2
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.Rc) {
            return;
        }
        this.Rc = true;
        org.telegram.ui.Components.xc.a0(this).M(LocaleController.formatString(R.string.CreateManagedBotCreatedTitle, UserObject.getUserName(this.Sc)), AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.CreateManagedBotCreatedText, UserObject.getUserName(this.Tc[0])), new ai.v3(this, this.Uc, 29)), R.raw.contact_check).j();
    }
}
