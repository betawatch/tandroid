// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class i7c {
    public static final i7c[] f = new i7c[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final h7c e = new h7c(this);

    public i7c(int i) {
        this.a = i;
    }

    public final void a(o39 o39Var) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i = 0; i < o39Var.getChildCount(); i++) {
            View childAt = o39Var.getChildAt(i);
            long dialogId = childAt instanceof ue3 ? ((ue3) childAt).getDialogId() : childAt instanceof v6c ? ((v6c) childAt).getDialogId() : 0L;
            LongSparseLongArray longSparseLongArray = this.b;
            int i2 = this.a;
            if (dialogId > 0) {
                TLRPC.User V1 = na7.q1(i2).V1(Long.valueOf(dialogId));
                if (V1 != null && !V1.bot && !V1.self && !V1.contact && (userStatus = V1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat K0 = na7.q1(i2).K0(Long.valueOf(-dialogId));
                if (hc2.T(K0) && !hc2.p0(K0) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        h7c h7cVar = this.e;
        gl.r(h7cVar);
        gl.e3(h7cVar, 300L);
    }
}
