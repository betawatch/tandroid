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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class l9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l9(Object obj, Serializable serializable, long j3, long j10, Object obj2, int i7) {
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
                w9 w9Var = (w9) this.d;
                ii.g0 g0Var = (ii.g0) this.e;
                long j3 = this.b;
                zh.l lVar = (zh.l) this.f;
                long j10 = this.c;
                if (bi.ea.y(w9Var.currentAccount, false).e) {
                    w9Var.k(j3, lVar, j10, g0Var);
                    return;
                } else {
                    g0Var.a(Boolean.FALSE, "NO_BALANCE");
                    return;
                }
            case 1:
                k00 k00Var = (k00) this.d;
                TLObject tLObject = (TLObject) this.e;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.f;
                long j11 = this.b;
                long j12 = this.c;
                if (tLObject != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    tL_forumTopic.totalMessagesCount = messages_messages.count;
                    k00Var.getMessagesStorage().f2(j11, tL_forumTopic, 16);
                    if (messages_messages.count == 0 && k00Var.getMessagesController().y2(j11)) {
                        yr messagesStorage = k00Var.getMessagesStorage();
                        messagesStorage.a.c(new vp(1, j11, j12, messagesStorage));
                        k00Var.s(-j11, j12);
                    }
                    qs.f(k00Var.currentAccount).k(qs.q5, Long.valueOf(-j11), Boolean.TRUE);
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
                pe peVar = (pe) this.e;
                long j15 = this.b;
                long j16 = this.c;
                org.telegram.ui.Components.xf xfVar = (org.telegram.ui.Components.xf) this.f;
                if (MediaController.cropOpusFile(mediaController.j1.getAbsolutePath(), peVar.getAbsolutePath(), j15, j16)) {
                    File file = mediaController.j1;
                    if (file != null) {
                        file.delete();
                    }
                    mediaController.j1 = peVar;
                    mediaController.k1 = j16 - j15;
                    g0.h3(xfVar);
                    return;
                }
                return;
            case 4:
                ((ui) this.d).getNotificationCenter().k(73, Long.valueOf(this.b), (ArrayList) this.e, (ArrayList) this.f, Long.valueOf(this.c));
                return;
            case 5:
                yr yrVar = (yr) this.d;
                long j17 = this.b;
                long j18 = this.c;
                AtomicReference atomicReference = (AtomicReference) this.e;
                CountDownLatch countDownLatch2 = (CountDownLatch) this.f;
                yrVar.getClass();
                SQLiteCursor sQLiteCursor = null;
                try {
                    try {
                        sQLiteCursor = yrVar.b.queryFinalized("SELECT data FROM messages_v2 WHERE uid = " + j17 + " AND mid = " + j18 + " LIMIT 1", new Object[0]);
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
                    yrVar.o(e10, true);
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                }
                countDownLatch2.countDown();
                return;
            case 6:
                ((yr) this.d).S1(this.b, this.c, (ArrayList) this.e, (ArrayList) this.f);
                return;
            default:
                k00 k00Var2 = (k00) this.d;
                long j19 = this.b;
                ArrayList arrayList = (ArrayList) this.e;
                long j20 = this.c;
                bi.h4 h4Var = (bi.h4) this.f;
                k00Var2.getClass();
                if (r2.a) {
                    jg.g.s(arrayList != null ? arrayList.size() : 0, a8.p0.t(j19, "loaded from cache ", " topics_count="));
                }
                k00Var2.u(j19, arrayList, null, true, 0, -1);
                k00Var2.y(j19, true);
                if (k00Var2.f(j19, j20) != null) {
                    h4Var.run();
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                new TLRPC.TL_forumTopic().id = (int) j20;
                k00Var2.v(j19, arrayList2, h4Var);
                return;
        }
    }

    public /* synthetic */ l9(w9 w9Var, ii.g0 g0Var, long j3, zh.l lVar, long j10) {
        this.a = 0;
        this.d = w9Var;
        this.e = g0Var;
        this.b = j3;
        this.f = lVar;
        this.c = j10;
    }

    public /* synthetic */ l9(ui uiVar, long j3, ArrayList arrayList, ArrayList arrayList2, long j10) {
        this.a = 4;
        this.d = uiVar;
        this.b = j3;
        this.e = arrayList;
        this.f = arrayList2;
        this.c = j10;
    }

    public /* synthetic */ l9(yr yrVar, long j3, long j10, Serializable serializable, Object obj, int i7) {
        this.a = i7;
        this.d = yrVar;
        this.b = j3;
        this.c = j10;
        this.e = serializable;
        this.f = obj;
    }

    public /* synthetic */ l9(k00 k00Var, long j3, ArrayList arrayList, long j10, bi.h4 h4Var) {
        this.a = 7;
        this.d = k00Var;
        this.b = j3;
        this.e = arrayList;
        this.c = j10;
        this.f = h4Var;
    }

    public /* synthetic */ l9(k00 k00Var, TLObject tLObject, TLRPC.TL_forumTopic tL_forumTopic, long j3, long j10) {
        this.a = 1;
        this.d = k00Var;
        this.e = tLObject;
        this.f = tL_forumTopic;
        this.b = j3;
        this.c = j10;
    }
}
