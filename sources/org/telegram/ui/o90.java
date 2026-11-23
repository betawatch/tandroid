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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class o90 extends y40 {
    public o90(r90 r90Var, Bundle bundle) {
        super(bundle);
    }

    public static void z0(o90 o90Var, TLObject tLObject, HashSet hashSet, TLRPC.TL_error tL_error) {
        int i7 = 0;
        if (!(tLObject instanceof TLRPC.Updates)) {
            if (!(tLObject instanceof TL_phone.groupCall)) {
                if (tL_error != null) {
                    r90.d().g0(tL_error, false);
                    return;
                }
                return;
            }
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            org.telegram.messenger.mp.u1(o90Var.currentAccount).f4(groupcall.users, false);
            org.telegram.messenger.mp.u1(o90Var.currentAccount).Z3(groupcall.chats, false);
            if (LaunchActivity.H1 == null) {
                return;
            }
            TLRPC.TL_inputGroupCall tL_inputGroupCall = new TLRPC.TL_inputGroupCall();
            TLRPC.GroupCall groupCall = groupcall.call;
            tL_inputGroupCall.id = groupCall.id;
            tL_inputGroupCall.access_hash = groupCall.access_hash;
            org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, o90Var.currentAccount, tL_inputGroupCall, false, groupCall, hashSet);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        org.telegram.messenger.mp.u1(o90Var.currentAccount).f4(updates.users, false);
        org.telegram.messenger.mp.u1(o90Var.currentAccount).Z3(updates.chats, false);
        ArrayList B0 = org.telegram.messenger.mp.B0(updates, TL_update.TL_updateGroupCall.class);
        int size = B0.size();
        TLRPC.GroupCall groupCall2 = null;
        while (i7 < size) {
            Object obj = B0.get(i7);
            i7++;
            groupCall2 = ((TL_update.TL_updateGroupCall) obj).call;
        }
        if (LaunchActivity.H1 == null || groupCall2 == null) {
            return;
        }
        TLRPC.TL_inputGroupCall tL_inputGroupCall2 = new TLRPC.TL_inputGroupCall();
        tL_inputGroupCall2.id = groupCall2.id;
        tL_inputGroupCall2.access_hash = groupCall2.access_hash;
        org.telegram.ui.Components.voip.c2.g(LaunchActivity.H1, o90Var.currentAccount, tL_inputGroupCall2, false, groupCall2, hashSet);
    }

    @Override // org.telegram.ui.y40
    public final void s0(HashSet hashSet) {
        if (hashSet.size() == 1) {
            TLRPC.User c22 = getMessagesController().c2((Long) hashSet.iterator().next());
            TLRPC.UserFull d2 = getMessagesController().d2(c22.id);
            if (d2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = getMessagesController().q1(c22.id);
                getConnectionsManager().sendRequest(tL_users_getFullUser, new d00(7, this, c22));
                return;
            }
            org.telegram.ui.Components.voip.c2.m(c22, false, d2.video_calls_available, getParentActivity(), d2, getAccountInstance());
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(createconferencecall, new d00(8, this, hashSet));
        }
        finishFragment();
    }
}
