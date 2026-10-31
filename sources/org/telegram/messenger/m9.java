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
import org.telegram.ui.a80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class m9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m9(Object obj, Serializable serializable, long j10, long j11, Object obj2, int i10) {
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
                x9 x9Var = (x9) this.d;
                a80 a80Var = (a80) this.e;
                long j10 = this.b;
                ph.l lVar = (ph.l) this.f;
                long j11 = this.c;
                if (rh.e6.y(x9Var.currentAccount, false).e) {
                    x9Var.k(j10, lVar, j11, a80Var);
                    return;
                } else {
                    a80Var.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                }
            case 1:
                x00 x00Var = (x00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j12 = this.b;
                long j13 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    x00Var.getMessagesStorage().f2(j12, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && x00Var.getMessagesController().x2(j12)) {
                        hs messagesStorage = x00Var.getMessagesStorage();
                        messagesStorage.a.c(new aq(1, j12, j13, messagesStorage));
                        x00Var.s(-j12, j13);
                    }
                    zs.f(x00Var.currentAccount).k(zs.q5, Long.valueOf(-j12), Boolean.TRUE);
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
                pe peVar = (pe) this.e;
                long j16 = this.b;
                long j17 = this.c;
                org.telegram.ui.Components.tf tfVar = (org.telegram.ui.Components.tf) this.f;
                if (MediaController.cropOpusFile(mediaController.i1.getAbsolutePath(), peVar.getAbsolutePath(), j16, j17)) {
                    File file = mediaController.i1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.i1 = peVar;
                    mediaController.j1 = j17 - j16;
                    i0.g3(tfVar);
                    return;
                }
                return;
            case 4:
                hs hsVar = (hs) this.d;
                long j18 = this.b;
                long j19 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                hsVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = hsVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j18 + " AND mid = " + j19 + " LIMIT 1", new Object[0]);
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
                    hsVar.o(e, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 5:
                ((hs) this.d).S1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                x00 x00Var2 = (x00) this.d;
                long j20 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                long j21 = this.c;
                a3.h0 h0Var = (a3.h0) this.f;
                x00Var2.getClass();
                if (v2.a) {
                    i0.a.p(arrayList != null ? arrayList.size() : 0, a1.g.s(j20, "loaded from cache ", " topics_count="));
                }
                x00Var2.u(j20, arrayList, null, true, 0, -1);
                x00Var2.y(j20, true);
                if (x00Var2.f(j20, j21) != null) {
                    h0Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j21;
                x00Var2.v(j20, arrayList2, h0Var);
                return;
        }
    }

    public /* synthetic */ m9(x9 x9Var, a80 a80Var, long j10, ph.l lVar, long j11) {
        this.a = 0;
        this.d = x9Var;
        this.e = a80Var;
        this.b = j10;
        this.f = lVar;
        this.c = j11;
    }

    public /* synthetic */ m9(hs hsVar, long j10, long j11, Serializable serializable, Object obj, int i10) {
        this.a = i10;
        this.d = hsVar;
        this.b = j10;
        this.c = j11;
        this.e = serializable;
        this.f = obj;
    }

    public /* synthetic */ m9(x00 x00Var, long j10, ArrayList arrayList, long j11, a3.h0 h0Var) {
        this.a = 6;
        this.d = x00Var;
        this.b = j10;
        this.e = arrayList;
        this.c = j11;
        this.f = h0Var;
    }

    public /* synthetic */ m9(x00 x00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j10, long j11) {
        this.a = 1;
        this.d = x00Var;
        this.e = tLObject;
        this.f = tL_forumTopic;
        this.b = j10;
        this.c = j11;
    }
}
