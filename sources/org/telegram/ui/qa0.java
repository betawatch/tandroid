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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qa0 extends u50 {
    public qa0(ta0 ta0Var, Bundle bundle) {
        super(bundle);
    }

    public static void z0(qa0 qa0Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i10 = 0;
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    ta0.d().f0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.wp.r1(qa0Var.currentAccount).V3(groupcall.users, false);
            org.telegram.messenger.wp.r1(qa0Var.currentAccount).P3(groupcall.chats, false);
            if (LaunchActivity.I1 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, qa0Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        org.telegram.messenger.wp.r1(qa0Var.currentAccount).V3(updates.users, false);
        org.telegram.messenger.wp.r1(qa0Var.currentAccount).P3(updates.chats, false);
        ArrayList z02 = org.telegram.messenger.wp.z0(updates, TL_update.TL_updateGroupCall.class);
        int size = z02.size();
        TLRPC.GroupCall groupCall2 = null;
        while (i10 < size) {
            Object obj = z02.get(i10);
            i10++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (LaunchActivity.I1 == null || groupCall2 == null) {
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        org.telegram.ui.Components.voip.n1.g(LaunchActivity.I1, qa0Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
    }

    @Override // org.telegram.ui.u50
    public final void s0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User Z1 = getMessagesController().Z1((Long) hashSet.iterator().next());
            TLRPC.UserFull a2 = getMessagesController().a2(Z1.id);
            if (a2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = getMessagesController().n1(Z1.id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new org.telegram.ui.Components.t20(19, this, Z1));
                return;
            }
            org.telegram.ui.Components.voip.n1.m(Z1, false, a2.video_calls_available, getParentActivity(), a2, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new org.telegram.ui.Components.t20(20, this, hashSet));
        }
        finishFragment();
    }
}
