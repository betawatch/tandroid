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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k9(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i7) {
        this.a = i7;
        this.d = obj;
        this.e = serializable;
        this.b = j3;
        this.c = j10;
        this.f = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v9 v9Var = (v9) this.d;
                bi.n nVar = (bi.n) this.e;
                long j3 = this.b;
                bi.x xVar = (bi.x) this.f;
                long j10 = this.c;
                if (di.y8.y(v9Var.currentAccount, false).e) {
                    v9Var.k(j3, xVar, j10, nVar);
                    return;
                } else {
                    nVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                }
            case 1:
                f00 f00Var = (f00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j11 = this.b;
                long j12 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    f00Var.getMessagesStorage().f2(j11, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && f00Var.getMessagesController().E2(j11)) {
                        ur messagesStorage = f00Var.getMessagesStorage();
                        messagesStorage.a.c(new op(1, j11, j12, messagesStorage));
                        f00Var.s(-j11, j12);
                    }
                    ls.f(f00Var.currentAccount).k(ls.t5, Long.valueOf(-j11), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                i7 i7Var = (i7) this.d;
                long[] jArr = (long[]) this.e;
                long j13 = this.b;
                long j14 = this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                try {
                    jArr[0] = i7Var.h(j13, j14, i7Var.M);
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
                oe oeVar = (oe) this.e;
                long j15 = this.b;
                long j16 = this.c;
                org.telegram.ui.Components.og ogVar = (org.telegram.ui.Components.og) this.f;
                if (MediaController.cropOpusFile(mediaController.k1.getAbsolutePath(), oeVar.getAbsolutePath(), j15, j16)) {
                    File file = mediaController.k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.k1 = oeVar;
                    mediaController.l1 = j16 - j15;
                    g0.g3(ogVar);
                    return;
                }
                return;
            case 4:
                ((si) this.d).getNotificationCenter().k(73, Long.valueOf(this.b), (ArrayList) this.e, (ArrayList) this.f, Long.valueOf(this.c));
                return;
            case 5:
                ur urVar = (ur) this.d;
                long j17 = this.b;
                long j18 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                urVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = urVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j17 + " AND mid = " + j18 + " LIMIT 1", new Object[0]);
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
                    urVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((ur) this.d).S1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                f00 f00Var2 = (f00) this.d;
                long j19 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                long j20 = this.c;
                d3.e0 e0Var = (d3.e0) this.f;
                f00Var2.getClass();
                if (s2.a) {
                    i5.c.t(arrayList != null ? arrayList.size() : 0, a8.p0.t(j19, "loaded from cache ", " topics_count="));
                }
                f00Var2.u(j19, arrayList, null, true, 0, -1);
                f00Var2.y(j19, true);
                if (f00Var2.f(j19, j20) != null) {
                    e0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j20;
                f00Var2.v(j19, arrayList2, e0Var);
                return;
        }
    }

    public /* synthetic */ k9(v9 v9Var, bi.n nVar, long j3, bi.x xVar, long j10) {
        this.a = 0;
        this.d = v9Var;
        this.e = nVar;
        this.b = j3;
        this.f = xVar;
        this.c = j10;
    }

    public /* synthetic */ k9(si siVar, long j3, ArrayList arrayList, ArrayList arrayList2, long j10) {
        this.a = 4;
        this.d = siVar;
        this.b = j3;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = j10;
    }

    public /* synthetic */ k9(ur urVar, long j3, long j10, Serializable serializable, Object obj, int i7) {
        this.a = i7;
        this.d = urVar;
        this.b = j3;
        this.c = j10;
        this.e = serializable;
        this.f = obj;
    }

    public /* synthetic */ k9(f00 f00Var, long j3, ArrayList arrayList, long j10, d3.e0 e0Var) {
        this.a = 7;
        this.d = f00Var;
        this.b = j3;
        this.e = arrayList;
        this.c = j10;
        this.f = e0Var;
    }

    public /* synthetic */ k9(f00 f00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        this.a = 1;
        this.d = f00Var;
        this.e = tLObject;
        this.f = tL_forumTopic;
        this.b = j3;
        this.c = j10;
    }
}
