package fi;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.mp;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ra;
import org.telegram.ui.Components.ck0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class n9 {
    public static final n9[] f = new n9[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final m9 e;

    public n9(int i7) {
        new ArrayList();
        this.e = new m9(this);
        this.a = i7;
    }

    public final void a(ck0 ck0Var) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i7 = 0; i7 < ck0Var.getChildCount(); i7++) {
            View childAt = ck0Var.getChildAt(i7);
            long dialogId = childAt instanceof org.telegram.ui.Cells.u2 ? ((org.telegram.ui.Cells.u2) childAt).getDialogId() : childAt instanceof ra ? ((ra) childAt).getDialogId() : 0L;
            int i10 = this.a;
            LongSparseLongArray longSparseLongArray = this.b;
            if (dialogId > 0) {
                TLRPC.User c22 = mp.u1(i10).c2(Long.valueOf(dialogId));
                if (c22 != null && !c22.bot && !c22.self && !c22.contact && (userStatus = c22.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat O0 = mp.u1(i10).O0(Long.valueOf(-dialogId));
                if (org.telegram.messenger.v3.T(O0) && !org.telegram.messenger.v3.p0(O0) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        m9 m9Var = this.e;
        org.telegram.messenger.g0.r(m9Var);
        org.telegram.messenger.g0.h3(m9Var, 300L);
    }
}
