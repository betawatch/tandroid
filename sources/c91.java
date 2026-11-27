// default package

import android.os.Bundle;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class c91 extends rc5 {
    public final /* synthetic */ int w0;
    public final /* synthetic */ e x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(Bundle bundle, int i, e eVar) {
        super(bundle);
        this.w0 = i;
        this.x0 = eVar;
    }

    @Override // rc5
    public final void q0(HashSet hashSet) {
        int size = hashSet.size();
        int i = this.w0;
        if (size == 1) {
            TLRPC.User X1 = uc7.s1(i).X1((Long) hashSet.iterator().next());
            TLRPC.UserFull Y1 = uc7.s1(i).Y1(X1.id);
            if (Y1 == null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.id = uc7.s1(i).o1(X1.id);
                ConnectionsManager.getInstance(i).sendRequest(tL_users_getFullUser, new hb7((Object) this, i, (Object) X1, (byte) 2));
                return;
            }
            xkc.m(X1, false, Y1.video_calls_available, getParentActivity(), Y1, k5.a(i));
        } else {
            TL_phone.createConferenceCall createconferencecall = new TL_phone.createConferenceCall();
            createconferencecall.random_id = Utilities.b.nextInt();
            ConnectionsManager.getInstance(i).sendRequest(createconferencecall, new hb7(i, (Object) hashSet, (Object) this.x0, (byte) 3));
        }
        finishFragment();
    }
}
