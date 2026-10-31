package org.telegram.messenger;

import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.support.LongSparseLongArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o2 extends f1 {
    public static volatile o2[] b = new o2[4];
    public final LongSparseLongArray a;

    public o2(int i10) {
        super(i10);
        this.a = new LongSparseLongArray();
    }

    public static o2 b(int i10) {
        o2 o2Var;
        o2 o2Var2 = b[i10];
        if (o2Var2 != null) {
            return o2Var2;
        }
        synchronized (j2.class) {
            try {
                o2Var = b[i10];
                if (o2Var == null) {
                    o2[] o2VarArr = b;
                    o2 o2Var3 = new o2(i10);
                    o2VarArr[i10] = o2Var3;
                    o2Var = o2Var3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o2Var;
    }

    public final void a(long j10, long j11, TLRPC.JoinChatBotResult joinChatBotResult) {
        this.a.get(j11, 0L);
        getNotificationCenter().k(zs.Q5, new n2(j10, joinChatBotResult));
        HashSet hashSet = xh.m2.a1;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xh.m2 m2Var = (xh.m2) it.next();
                xh.s3 s3Var = m2Var.w0;
                if (s3Var != null && s3Var.g == 5) {
                    long j12 = s3Var.b;
                    if (j12 == j10 || j12 == 0) {
                        TLObject tLObject = s3Var.q;
                        if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j11) {
                            m2Var.o(false);
                            return;
                        }
                    }
                }
            }
        }
    }

    public final void c(long j10, long j11, long j12, boolean z10) {
        org.telegram.ui.ActionBar.k2 Q;
        if (LaunchActivity.I1 == null || (Q = LaunchActivity.Q()) == null) {
            return;
        }
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j11));
        if (!z10) {
            if (js.h(this.currentAccount, j11) || getMessagesController().X6.contains(Long.valueOf(j11))) {
                c(j10, j11, j12, true);
                return;
            } else {
                org.telegram.ui.Components.s4.n(Q, Z1, new m2(this, j10, j11, j12, 0), new ag.f3(13));
                return;
            }
        }
        this.a.put(j12, j11);
        org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
        xh.s3 b10 = xh.s3.b(this.currentAccount, j10, j11, null, null, 5, 0, 0L, null, false, null, null, 0, false, false);
        b10.d = j12;
        xh.m2 m2Var = new xh.m2(LaunchActivity.I1, null);
        m2Var.B(false);
        m2Var.B0 = true;
        m2Var.l0 = LaunchActivity.I1;
        m2Var.x(Q2, b10);
        m2Var.show();
    }
}
