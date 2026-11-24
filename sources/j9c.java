// default package

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class j9c {
    public static final j9c[] f = new j9c[4];
    public final int a;
    public final LongSparseLongArray b = new LongSparseLongArray();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final i9c e = new i9c(this);

    public j9c(int i) {
        this.a = i;
    }

    public final void a(r59 r59Var) {
        TLRPC.UserStatus userStatus;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = this.c;
        arrayList.clear();
        for (int i = 0; i < r59Var.getChildCount(); i++) {
            View childAt = r59Var.getChildAt(i);
            long dialogId = childAt instanceof hg3 ? ((hg3) childAt).getDialogId() : childAt instanceof w8c ? ((w8c) childAt).getDialogId() : 0L;
            LongSparseLongArray longSparseLongArray = this.b;
            int i2 = this.a;
            if (dialogId > 0) {
                TLRPC.User W1 = oc7.r1(i2).W1(Long.valueOf(dialogId));
                if (W1 != null && !W1.bot && !W1.self && !W1.contact && (userStatus = W1.status) != null && !(userStatus instanceof TLRPC.TL_userStatusEmpty) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            } else {
                TLRPC.Chat L0 = oc7.r1(i2).L0(Long.valueOf(-dialogId));
                if (sd2.T(L0) && !sd2.p0(L0) && currentTimeMillis - longSparseLongArray.get(dialogId, 0L) > 3600000) {
                    longSparseLongArray.put(dialogId, currentTimeMillis);
                    arrayList.add(Long.valueOf(dialogId));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.d.addAll(arrayList);
        i9c i9cVar = this.e;
        gm.r(i9cVar);
        gm.d3(i9cVar, 300L);
    }
}
