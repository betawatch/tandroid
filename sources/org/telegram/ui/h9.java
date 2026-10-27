package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h9 extends t60 {
    public final /* synthetic */ int v0;
    public final /* synthetic */ o9 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h9(Bundle bundle, int i10, o9 o9Var) {
        super(bundle);
        this.v0 = i10;
        this.w0 = o9Var;
    }

    @Override // org.telegram.ui.t60
    public final void o0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.v0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(i10).getInputUser(user.id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new ig.u(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.g2.m(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new ig.u(i10, hashSet, this.w0));
        }
        finishFragment();
    }
}
