// default package

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ca1 extends oc5 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ d x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca1(Bundle bundle, int i, d dVar) {
        super(bundle);
        this.w0 = i;
        this.x0 = dVar;
    }

    @Override // oc5
    public final void r0(HashSet hashSet) {
        int size = hashSet.size();
        int i = this.w0;
        if (size == 1) {
            TLRPC.User W1 = oc7.r1(i).W1((Long) hashSet.iterator().next());
            TLRPC.UserFull X1 = oc7.r1(i).X1(W1.id);
            if (X1 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = oc7.r1(i).n1(W1.id);
                ConnectionsManager.getInstance(i).sendRequest(tL_users_getFullUser, new cb7((Object) this, i, (Object) W1, (byte) 2));
                return;
            }
            sic.m(W1, false, X1.video_calls_available, getParentActivity(), X1, j5.a(i));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new cb7(i, (Object) hashSet, (Object) this.x0, (byte) 3));
        }
        finishFragment();
    }
}
