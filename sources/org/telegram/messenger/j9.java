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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class j9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ j9(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i7) {
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
                u9 u9Var = (u9) this.d;
                bi.n nVar = (bi.n) this.e;
                long j3 = this.b;
                bi.x xVar = (bi.x) this.f;
                long j10 = this.c;
                if (di.y8.y(u9Var.currentAccount, false).e) {
                    u9Var.k(j3, xVar, j10, nVar);
                    return;
                } else {
                    nVar.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                }
            case 1:
                d00 d00Var = (d00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j11 = this.b;
                long j12 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    d00Var.getMessagesStorage().f2(j11, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && d00Var.getMessagesController().E2(j11)) {
                        tr messagesStorage = d00Var.getMessagesStorage();
                        messagesStorage.a.c(new np(1, j11, j12, messagesStorage));
                        d00Var.s(-j11, j12);
                    }
                    ks.f(d00Var.currentAccount).k(ks.t5, Long.valueOf(-j11), Boolean.TRUE);
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
                ne neVar = (ne) this.e;
                long j15 = this.b;
                long j16 = this.c;
                org.telegram.ui.Components.ng ngVar = (org.telegram.ui.Components.ng) this.f;
                if (MediaController.cropOpusFile(mediaController.k1.getAbsolutePath(), neVar.getAbsolutePath(), j15, j16)) {
                    File file = mediaController.k1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.k1 = neVar;
                    mediaController.l1 = j16 - j15;
                    g0.g3(ngVar);
                    return;
                }
                return;
            case 4:
                ((ri) this.d).getNotificationCenter().k(73, Long.valueOf(this.b), (ArrayList) this.e, (ArrayList) this.f, Long.valueOf(this.c));
                return;
            case 5:
                tr trVar = (tr) this.d;
                long j17 = this.b;
                long j18 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                trVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = trVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j17 + " AND mid = " + j18 + " LIMIT 1", new Object[0]);
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
                    trVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((tr) this.d).S1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                d00 d00Var2 = (d00) this.d;
                long j19 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                long j20 = this.c;
                d3.e0 e0Var = (d3.e0) this.f;
                d00Var2.getClass();
                if (s2.a) {
                    i5.c.t(arrayList != null ? arrayList.size() : 0, a8.p0.t(j19, "loaded from cache ", " topics_count="));
                }
                d00Var2.u(j19, arrayList, null, true, 0, -1);
                d00Var2.y(j19, true);
                if (d00Var2.f(j19, j20) != null) {
                    e0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j20;
                d00Var2.v(j19, arrayList2, e0Var);
                return;
        }
    }

    public /* synthetic */ j9(u9 u9Var, bi.n nVar, long j3, bi.x xVar, long j10) {
        this.a = 0;
        this.d = u9Var;
        this.e = nVar;
        this.b = j3;
        this.f = xVar;
        this.c = j10;
    }

    public /* synthetic */ j9(ri riVar, long j3, ArrayList arrayList, ArrayList arrayList2, long j10) {
        this.a = 4;
        this.d = riVar;
        this.b = j3;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = j10;
    }

    public /* synthetic */ j9(tr trVar, long j3, long j10, Serializable serializable, Object obj, int i7) {
        this.a = i7;
        this.d = trVar;
        this.b = j3;
        this.c = j10;
        this.e = serializable;
        this.f = obj;
    }

    public /* synthetic */ j9(d00 d00Var, long j3, ArrayList arrayList, long j10, d3.e0 e0Var) {
        this.a = 7;
        this.d = d00Var;
        this.b = j3;
        this.e = arrayList;
        this.c = j10;
        this.f = e0Var;
    }

    public /* synthetic */ j9(d00 d00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        this.a = 1;
        this.d = d00Var;
        this.e = tLObject;
        this.f = tL_forumTopic;
        this.b = j3;
        this.c = j10;
    }
}
