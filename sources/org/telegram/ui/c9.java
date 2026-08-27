package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c9 extends o60 {
    public final /* synthetic */ int r0;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Bundle bundle, int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        super(bundle);
        this.r0 = i10;
        this.s0 = n2Var;
    }

    @Override // org.telegram.ui.o60
    public final void n0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.r0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(i10).getInputUser(user.id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new cg.m0(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.e2.n(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new cg.m0(i10, hashSet, this.s0));
        }
        finishFragment();
    }
}
