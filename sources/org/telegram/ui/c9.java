package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c9 extends z40 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ org.telegram.ui.ActionBar.h2 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Bundle bundle, int i7, org.telegram.ui.ActionBar.h2 h2Var) {
        super(bundle);
        this.w0 = i7;
        this.x0 = h2Var;
    }

    @Override // org.telegram.ui.z40
    public final void s0(HashSet hashSet) {
        int size = hashSet.size();
        int i7 = this.w0;
        if (size == 1) {
            TLRPC.User c22 = org.telegram.messenger.mp.u1(i7).c2((Long) hashSet.iterator().next());
            TLRPC.UserFull d2 = org.telegram.messenger.mp.u1(i7).d2(c22.id);
            if (d2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = org.telegram.messenger.mp.u1(i7).q1(c22.id);
                ConnectionsManager.getInstance(i7).sendRequest(tL_users_getFullUser, new jg.u(this, i7, c22, 3));
                return;
            }
            org.telegram.ui.Components.voip.b2.m(c22, false, d2.video_calls_available, getParentActivity(), d2, org.telegram.messenger.c.a(i7));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i7).sendRequest(createconferencecall, new jg.u(i7, hashSet, this.x0));
        }
        finishFragment();
    }
}
