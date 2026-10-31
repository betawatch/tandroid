package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d9 extends v50 {
    public final /* synthetic */ int v0;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(Bundle bundle, int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        super(bundle);
        this.v0 = i10;
        this.w0 = k2Var;
    }

    @Override // org.telegram.ui.v50
    public final void r0(HashSet hashSet) {
        int size = hashSet.size();
        int i10 = this.v0;
        if (size == 1) {
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1((Long) hashSet.iterator().next());
            TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i10).a2(Z1.id);
            if (a2 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = org.telegram.messenger.vp.r1(i10).n1(Z1.id);
                ConnectionsManager.getInstance(i10).sendRequest(tL_users_getFullUser, new mg.w(this, i10, Z1, 3));
                return;
            }
            org.telegram.ui.Components.voip.m1.m(Z1, false, a2.video_calls_available, getParentActivity(), a2, org.telegram.messenger.c.a(i10));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i10).sendRequest(createconferencecall, new mg.w(i10, hashSet, this.w0));
        }
        finishFragment();
    }
}
