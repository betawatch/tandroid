package org.telegram.ui;

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class c9 extends w40 {
    public final /* synthetic */ int v0;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(Bundle bundle, int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        super(bundle);
        this.v0 = i7;
        this.w0 = f2Var;
    }

    @Override // org.telegram.ui.w40
    public final void s0(HashSet hashSet) {
        int size = hashSet.size();
        int i7 = this.v0;
        if (size == 1) {
            TLRPC.User a22 = org.telegram.messenger.qp.s1(i7).a2((Long) hashSet.iterator().next());
            TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i7).b2(a22.id);
            if (b22 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = org.telegram.messenger.qp.s1(i7).o1(a22.id);
                ConnectionsManager.getInstance(i7).sendRequest(tL_users_getFullUser, new jg.v(this, i7, a22, 3));
                return;
            }
            org.telegram.ui.Components.voip.y1.m(a22, false, b22.video_calls_available, getParentActivity(), b22, org.telegram.messenger.c.a(i7));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i7).sendRequest(createconferencecall, new jg.v(i7, hashSet, this.w0));
        }
        finishFragment();
    }
}
