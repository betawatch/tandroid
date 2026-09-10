package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d9 extends e70 {
    public final /* synthetic */ int v0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(Bundle bundle, int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(bundle);
        this.v0 = i10;
        this.w0 = p2Var;
    }

    @Override // org.telegram.ui.e70
    public final void n0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.v0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(i10).getInputUser(user.id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new fg.t(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.e2.m(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new fg.t(i10, hashSet, this.w0));
        }
        finishFragment();
    }
}
