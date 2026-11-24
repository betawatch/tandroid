// default package

import android.util.LongSparseArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ny6 extends pf0 {
    public static final ny6[] b = new ny6[4];
    public final LongSparseArray a;

    public ny6(int i) {
        super(i);
        this.a = new LongSparseArray();
    }

    public static ny6 a(int i) {
        ny6 ny6Var;
        ny6[] ny6VarArr = b;
        ny6 ny6Var2 = ny6VarArr[i];
        if (ny6Var2 != null) {
            return ny6Var2;
        }
        synchronized (ny6.class) {
            ny6Var = ny6VarArr[i];
            if (ny6Var == null) {
                ny6Var = new ny6(i);
                ny6VarArr[i] = ny6Var;
            }
        }
        return ny6Var;
    }

    public final void b(TL_update.TL_updatePendingJoinRequests tL_updatePendingJoinRequests) {
        long j = -k27.B1(tL_updatePendingJoinRequests.peer);
        this.a.put(j, null);
        TLRPC.ChatFull L0 = getMessagesController().L0(j);
        if (L0 != null) {
            L0.requests_pending = tL_updatePendingJoinRequests.requests_pending;
            L0.recent_requesters = tL_updatePendingJoinRequests.recent_requesters;
            L0.flags |= 131072;
            getMessagesStorage().K1(L0, false);
            kk7 notificationCenter = getNotificationCenter();
            Boolean bool = Boolean.FALSE;
            notificationCenter.k(kk7.S, L0, 0, bool, bool);
        }
    }
}
