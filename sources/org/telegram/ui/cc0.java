package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class cc0 extends f70 {
    public cc0(fc0 fc0Var, Bundle bundle) {
        super(bundle);
    }

    public static void t0(cc0 cc0Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i10 = 0;
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    fc0.b().d0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(cc0Var.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(cc0Var.currentAccount).putChats(groupcall.chats, false);
            if (LaunchActivity.G1 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, cc0Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        MessagesController.getInstance(cc0Var.currentAccount).putUsers(updates.users, false);
        MessagesController.getInstance(cc0Var.currentAccount).putChats(updates.chats, false);
        ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateGroupCall.class);
        int size = findUpdatesAndRemove.size();
        TLRPC.GroupCall groupCall2 = null;
        while (i10 < size) {
            Object obj = findUpdatesAndRemove.get(i10);
            i10++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (LaunchActivity.G1 == null || groupCall2 == null) {
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        org.telegram.ui.Components.voip.d2.g(LaunchActivity.G1, cc0Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
    }

    @Override // org.telegram.ui.f70
    public final void n0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User user = getMessagesController().getUser((Long) hashSet.iterator().next());
            TLRPC.UserFull userFull = getMessagesController().getUserFull(user.id);
            if (userFull == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = getMessagesController().getInputUser(user.id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new ro(29, this, user));
                return;
            }
            org.telegram.ui.Components.voip.d2.m(user, false, userFull.video_calls_available, getParentActivity(), userFull, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.random.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new bc0(0, this, hashSet));
        }
        finishFragment();
    }
}
