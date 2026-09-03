package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class e9 extends z60 {
    public final /* synthetic */ int s0;
    public final /* synthetic */ org.telegram.ui.ActionBar.p2 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(Bundle bundle, int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        super(bundle);
        this.s0 = i10;
        this.t0 = p2Var;
    }

    @Override // org.telegram.ui.z60
    public final void n0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.s0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(i10).getInputUser(user.id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new hg.l0(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.g2.m(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new hg.l0(i10, hashSet, this.t0));
        }
        finishFragment();
    }
}
