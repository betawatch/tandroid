package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b9 extends k60 {
    public final /* synthetic */ int r0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b9(Bundle bundle, int i9, org.telegram.ui.ActionBar.o2 o2Var) {
        super(bundle);
        this.r0 = i9;
        this.s0 = o2Var;
    }

    @Override // org.telegram.ui.k60
    public final void m0(HashSet hashSet) {
        int size = hashSet.size();
        int i9 = this.r0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i9).getUserFull(user.id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(i9).getInputUser(user.id);
                ConnectionsManager.getInstance(i9).sendRequest(tL_users_getFullUser, new bg.q0(this, i9, user, 4));
                return;
            }
            org.telegram.ui.Components.voip.e2.n(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i9));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i9).sendRequest(createconferencecall, new bg.q0(i9, hashSet, this.s0));
        }
        finishFragment();
    }
}
