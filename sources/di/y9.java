package di;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.qp;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.pj0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class y9 {
    public static final y9[] f = new y9[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final x9 e;

    public y9(int i7) {
        new ArrayList();
        this.e = new x9(this);
        this.a = i7;
    }

    public final void a(pj0 pj0Var) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i7 = 0; i7 < pj0Var.getChildCount(); i7++) {
            View childAt = pj0Var.getChildAt(i7);
            long dialogId = childAt instanceof org.telegram.ui.Cells.t2 ? ((org.telegram.ui.Cells.t2) childAt).getDialogId() : childAt instanceof pa ? ((pa) childAt).getDialogId() : 0L;
            int i10 = this.a;
            LongSparseLongArray longSparseLongArray = this.b;
            if (dialogId > 0) {
                TLRPC.User a22 = qp.s1(i10).a2(Long.valueOf(dialogId));
                if (a22 != null && !a22.bot && !a22.self && !a22.contact && (userStatus = a22.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat M0 = qp.s1(i10).M0(Long.valueOf(-dialogId));
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
        x9 x9Var = this.e;
        org.telegram.messenger.g0.r(x9Var);
        org.telegram.messenger.g0.i3(x9Var, 300L);
    }
}
