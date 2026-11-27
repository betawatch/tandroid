// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ibc {
    public static final ibc[] f = new ibc[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final hbc e = new hbc(this);

    public ibc(int i) {
        this.a = i;
    }

    public final void a(d79 d79Var) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i = 0; i < d79Var.getChildCount(); i++) {
            View childAt = d79Var.getChildAt(i);
            long dialogId = childAt instanceof of3 ? ((of3) childAt).getDialogId() : childAt instanceof vac ? ((vac) childAt).getDialogId() : 0L;
            LongSparseLongArray longSparseLongArray = this.b;
            int i2 = this.a;
            if (dialogId > 0) {
                TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(dialogId));
                if (X1 != null && !X1.bot && !X1.self && !X1.contact && (userStatus = X1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-dialogId));
                if (xc2.T(M0) && !xc2.p0(M0) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        hbc hbcVar = this.e;
        hl.r(hbcVar);
        hl.d3(hbcVar, 300L);
    }
}
