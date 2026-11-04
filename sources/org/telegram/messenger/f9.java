package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class f9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f9(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i3) {
        this.a = i3;
        this.d = obj;
        this.e = serializable;
        this.b = j10;
        this.c = j11;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q9 q9Var = (q9) this.d;
                ai.r rVar = (ai.r) this.e;
                long j10 = this.b;
                ai.d0 d0Var = (ai.d0) this.f;
                long j11 = this.c;
                if (ci.e9.y(q9Var.currentAccount, false).e) {
                    q9Var.k(j10, d0Var, j11, rVar);
                    return;
                } else {
                    rVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                }
            case 1:
                c00 c00Var = (c00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j12 = this.b;
                long j13 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    c00Var.getMessagesStorage().f2(j12, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && c00Var.getMessagesController().y2(j12)) {
                        qr messagesStorage = c00Var.getMessagesStorage();
                        messagesStorage.a.c(new mp(1, j12, j13, messagesStorage));
                        c00Var.s(-j12, j13);
                    }
                    hs.f(c00Var.currentAccount).k(hs.q5, Long.valueOf(-j12), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                i7 i7Var = (i7) this.d;
                long[] jArr = (long[]) this.e;
                long j14 = this.b;
                long j15 = this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                try {
                    jArr[0] = i7Var.h(j14, j15, i7Var.M);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                    jArr[0] = 0;
                }
                if (i7Var.Y == 3) {
                    jArr[1] = 1;
                }
                countDownLatch.countDown();
                return;
            case 3:
                MediaController mediaController = (MediaController) this.d;
                je jeVar = (je) this.e;
                long j16 = this.b;
                long j17 = this.c;
                org.telegram.ui.Components.vf vfVar = (org.telegram.ui.Components.vf) this.f;
                if (MediaController.cropOpusFile(mediaController.k1.getAbsolutePath(), jeVar.getAbsolutePath(), j16, j17)) {
                    File file = mediaController.k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.k1 = jeVar;
                    mediaController.l1 = j17 - j16;
                    g0.h3(vfVar);
                    return;
                }
                return;
            case 4:
                ((li) this.d).getNotificationCenter().k(73, Long.valueOf(this.b), (ArrayList) this.e, (ArrayList) this.f, Long.valueOf(this.c));
                return;
            case 5:
                qr qrVar = (qr) this.d;
                long j18 = this.b;
                long j19 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                qrVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = qrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j18 + " AND mid = " + j19 + " LIMIT 1", new Object[0]);
                        while (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                                byteBufferValue.reuse();
                                atomicReference.set(TLdeserialize);
                            }
                        }
                        sQLiteCursor.dispose();
                    } catch (Throwable th3) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        countDownLatch2.countDown();
                        throw th3;
                    }
                } catch (Exception e10) {
                    qrVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((qr) this.d).S1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                c00 c00Var2 = (c00) this.d;
                long j20 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                long j21 = this.c;
                c3.f0 f0Var = (c3.f0) this.f;
                c00Var2.getClass();
                if (r2.a) {
                    k2.p1.q(arrayList != null ? arrayList.size() : 0, a1.g.t(j20, "loaded from cache ", " topics_count="));
                }
                c00Var2.u(j20, arrayList, null, true, 0, -1);
                c00Var2.y(j20, true);
                if (c00Var2.f(j20, j21) != null) {
                    f0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j21;
                c00Var2.v(j20, arrayList2, f0Var);
                return;
        }
    }

    public /* synthetic */ f9(q9 q9Var, ai.r rVar, long j10, ai.d0 d0Var, long j11) {
        this.a = 0;
        this.d = q9Var;
        this.e = rVar;
        this.b = j10;
        this.f = d0Var;
        this.c = j11;
    }

    public /* synthetic */ f9(li liVar, long j10, ArrayList arrayList, ArrayList arrayList2, long j11) {
        this.a = 4;
        this.d = liVar;
        this.b = j10;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = j11;
    }

    public /* synthetic */ f9(qr qrVar, long j10, long j11, Serializable serializable, Object obj, int i3) {
        this.a = i3;
        this.d = qrVar;
        this.b = j10;
        this.c = j11;
        this.e = serializable;
        this.f = obj;
    }

    public /* synthetic */ f9(c00 c00Var, long j10, ArrayList arrayList, long j11, c3.f0 f0Var) {
        this.a = 7;
        this.d = c00Var;
        this.b = j10;
        this.e = arrayList;
        this.c = j11;
        this.f = f0Var;
    }

    public /* synthetic */ f9(c00 c00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11) {
        this.a = 1;
        this.d = c00Var;
        this.e = tLObject;
        this.f = tL_forumTopic;
        this.b = j10;
        this.c = j11;
    }
}
