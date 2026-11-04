package ei;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hp;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z9 {
    public static final z9[] f = new z9[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final y9 e;

    public z9(int i3) {
        new ArrayList();
        this.e = new y9(this);
        this.a = i3;
    }

    public final void a(tj0 tj0Var) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i3 = 0; i3 < tj0Var.getChildCount(); i3++) {
            View childAt = tj0Var.getChildAt(i3);
            long dialogId = childAt instanceof org.telegram.ui.Cells.t2 ? ((org.telegram.ui.Cells.t2) childAt).getDialogId() : childAt instanceof pa ? ((pa) childAt).getDialogId() : 0L;
            int i10 = this.a;
            LongSparseLongArray longSparseLongArray = this.b;
            if (dialogId > 0) {
                TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(dialogId));
                if (a22 != null && !a22.bot && !a22.self && !a22.contact && (userStatus = a22.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat M0 = hp.s1(i10).M0(Long.valueOf(-dialogId));
                if (org.telegram.messenger.t3.T(M0) && !org.telegram.messenger.t3.p0(M0) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        y9 y9Var = this.e;
        org.telegram.messenger.g0.r(y9Var);
        org.telegram.messenger.g0.i3(y9Var, 300L);
    }
}
