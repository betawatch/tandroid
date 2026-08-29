package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a9 extends m60 {
    public final /* synthetic */ int r0;
    public final /* synthetic */ org.telegram.ui.ActionBar.o2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(Bundle bundle, int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        super(bundle);
        this.r0 = i10;
        this.s0 = o2Var;
    }

    @Override // org.telegram.ui.m60
    public final void n0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.r0;
        if (size == 1) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(user.id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = MessagesController.getInstance(i10).getInputUser(user.id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new eg.m0(this, i10, user, 3));
                return;
            }
            org.telegram.ui.Components.voip.h2.n(user, false, userFull.video_calls_available, getParentActivity(), userFull, AccountInstance.getInstance(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new eg.m0(i10, hashSet, this.s0));
        }
        finishFragment();
    }
}
