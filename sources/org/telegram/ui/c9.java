package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c9 extends w40 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ org.telegram.ui.ActionBar.e2 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Bundle bundle, int i7, org.telegram.ui.ActionBar.e2 e2Var) {
        super(bundle);
        this.w0 = i7;
        this.x0 = e2Var;
    }

    @Override // org.telegram.ui.w40
    public final void s0(HashSet hashSet) {
        int size = hashSet.size();
        int i7 = this.w0;
        if (size == 1) {
            TLRPC.User a22 = org.telegram.messenger.np.s1(i7).a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = org.telegram.messenger.np.s1(i7).b2(a22.id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = org.telegram.messenger.np.s1(i7).o1(a22.id);
                ConnectionsManager.getInstance(i7).sendRequest(tL_users_getFullUser, new jg.u(this, i7, a22, 3));
                return;
            }
            org.telegram.ui.Components.voip.c2.m(a22, false, b22.video_calls_available, getParentActivity(), b22, org.telegram.messenger.c.a(i7));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i7).sendRequest(createconferencecall, new jg.u(i7, hashSet, this.x0));
        }
        finishFragment();
    }
}
