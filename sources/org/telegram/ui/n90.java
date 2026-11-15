package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class n90 extends w40 {
    public n90(q90 q90Var, Bundle bundle) {
        super(bundle);
    }

    public static void z0(n90 n90Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i7 = 0;
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    q90.d().f0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.np.s1(n90Var.currentAccount).Y3(groupcall.users, false);
            org.telegram.messenger.np.s1(n90Var.currentAccount).S3(groupcall.chats, false);
            if (LaunchActivity.H1 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, n90Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        org.telegram.messenger.np.s1(n90Var.currentAccount).Y3(updates.users, false);
        org.telegram.messenger.np.s1(n90Var.currentAccount).S3(updates.chats, false);
        ArrayList z02 = org.telegram.messenger.np.z0(updates, TL_update.TL_updateGroupCall.class);
        int size = z02.size();
        TLRPC.GroupCall groupCall2 = null;
        while (i7 < size) {
            Object obj = z02.get(i7);
            i7++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (LaunchActivity.H1 == null || groupCall2 == null) {
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, n90Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
    }

    @Override // org.telegram.ui.w40
    public final void s0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User a22 = getMessagesController().a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = getMessagesController().b2(a22.id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = getMessagesController().o1(a22.id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new b00(7, this, a22));
                return;
            }
            org.telegram.ui.Components.voip.c2.m(a22, false, b22.video_calls_available, getParentActivity(), b22, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new b00(8, this, hashSet));
        }
        finishFragment();
    }
}
