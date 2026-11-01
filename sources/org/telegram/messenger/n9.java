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
import org.telegram.ui.z70;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class n9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n9(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
        this.a = i10;
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
                y9 y9Var = (y9) this.d;
                z70 z70Var = (z70) this.e;
                long j10 = this.b;
                ph.l lVar = (ph.l) this.f;
                long j11 = this.c;
                if (rh.e6.y(y9Var.currentAccount, false).e) {
                    y9Var.k(j10, lVar, j11, z70Var);
                    return;
                } else {
                    z70Var.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                }
            case 1:
                y00 y00Var = (y00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j12 = this.b;
                long j13 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    y00Var.getMessagesStorage().f2(j12, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && y00Var.getMessagesController().x2(j12)) {
                        is messagesStorage = y00Var.getMessagesStorage();
                        messagesStorage.a.c(new bq(1, j12, j13, messagesStorage));
                        y00Var.s(-j12, j13);
                    }
                    at.f(y00Var.currentAccount).k(at.q5, Long.valueOf(-j12), Boolean.TRUE);
                    return;
                }
                return;
            case 2:
                m7 m7Var = (m7) this.d;
                long[] jArr = (long[]) this.e;
                long j14 = this.b;
                long j15 = this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.f;
                try {
                    jArr[0] = m7Var.h(j14, j15, m7Var.M);
                } catch (Throwable th2) {
                    f8.g(th2, true);
                    jArr[0] = 0;
                }
                if (m7Var.Y == 3) {
                    jArr[1] = 1;
                }
                countDownLatch.countDown();
                return;
            case 3:
                MediaController mediaController = (MediaController) this.d;
                qe qeVar = (qe) this.e;
                long j16 = this.b;
                long j17 = this.c;
                org.telegram.ui.Components.tf tfVar = (org.telegram.ui.Components.tf) this.f;
                if (MediaController.cropOpusFile(mediaController.i1.getAbsolutePath(), qeVar.getAbsolutePath(), j16, j17)) {
                    File file = mediaController.i1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.i1 = qeVar;
                    mediaController.j1 = j17 - j16;
                    i0.g3(tfVar);
                    return;
                }
                return;
            case 4:
                is isVar = (is) this.d;
                long j18 = this.b;
                long j19 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                isVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = isVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j18 + " AND mid = " + j19 + " LIMIT 1", new Object[0]);
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
                } catch (Exception e) {
                    isVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 5:
                ((is) this.d).S1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                y00 y00Var2 = (y00) this.d;
                long j20 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                long j21 = this.c;
                a3.h0 h0Var = (a3.h0) this.f;
                y00Var2.getClass();
                if (v2.a) {
                    i0.a.p(arrayList != null ? arrayList.size() : 0, a1.g.s(j20, "loaded from cache ", " topics_count="));
                }
                y00Var2.u(j20, arrayList, null, true, 0, -1);
                y00Var2.y(j20, true);
                if (y00Var2.f(j20, j21) != null) {
                    h0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j21;
                y00Var2.v(j20, arrayList2, h0Var);
                return;
        }
    }

    public /* synthetic */ n9(y9 y9Var, z70 z70Var, long j10, ph.l lVar, long j11) {
        this.a = 0;
        this.d = y9Var;
        this.e = z70Var;
        this.b = j10;
        this.f = lVar;
        this.c = j11;
    }

    public /* synthetic */ n9(is isVar, long j10, long j11, Serializable serializable, Object obj, int i10) {
        this.a = i10;
        this.d = isVar;
        this.b = j10;
        this.c = j11;
        this.e = serializable;
        this.f = obj;
    }

    public /* synthetic */ n9(y00 y00Var, long j10, ArrayList arrayList, long j11, a3.h0 h0Var) {
        this.a = 6;
        this.d = y00Var;
        this.b = j10;
        this.e = arrayList;
        this.c = j11;
        this.f = h0Var;
    }

    public /* synthetic */ n9(y00 y00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11) {
        this.a = 1;
        this.d = y00Var;
        this.e = tLObject;
        this.f = tL_forumTopic;
        this.b = j10;
        this.c = j11;
    }
}
