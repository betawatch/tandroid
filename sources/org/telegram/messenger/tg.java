package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class tg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ f1 n;
    public final /* synthetic */ Object r;

    public /* synthetic */ tg(vi viVar, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.n = viVar;
        this.b = i10;
        this.r = arrayList;
        this.h = z10;
        this.c = j10;
        this.e = i11;
        this.f = i12;
        this.d = j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:48:0x0038, B:52:0x0047, B:9:0x0061, B:11:0x0070, B:12:0x0089, B:14:0x0090, B:16:0x00a0, B:18:0x00c3, B:19:0x00c7, B:25:0x00e8, B:29:0x0137, B:40:0x010d, B:43:0x0125, B:44:0x012d, B:45:0x00fb, B:46:0x007d), top: B:47:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0090 A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:48:0x0038, B:52:0x0047, B:9:0x0061, B:11:0x0070, B:12:0x0089, B:14:0x0090, B:16:0x00a0, B:18:0x00c3, B:19:0x00c7, B:25:0x00e8, B:29:0x0137, B:40:0x010d, B:43:0x0125, B:44:0x012d, B:45:0x00fb, B:46:0x007d), top: B:47:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010d A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:48:0x0038, B:52:0x0047, B:9:0x0061, B:11:0x0070, B:12:0x0089, B:14:0x0090, B:16:0x00a0, B:18:0x00c3, B:19:0x00c7, B:25:0x00e8, B:29:0x0137, B:40:0x010d, B:43:0x0125, B:44:0x012d, B:45:0x00fb, B:46:0x007d), top: B:47:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d A[Catch: Exception -> 0x005d, TryCatch #0 {Exception -> 0x005d, blocks: (B:48:0x0038, B:52:0x0047, B:9:0x0061, B:11:0x0070, B:12:0x0089, B:14:0x0090, B:16:0x00a0, B:18:0x00c3, B:19:0x00c7, B:25:0x00e8, B:29:0x0137, B:40:0x010d, B:43:0x0125, B:44:0x012d, B:45:0x00fb, B:46:0x007d), top: B:47:0x0038 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long j10;
        long j11;
        int size;
        int i10;
        int i11;
        vi viVar;
        int i12;
        switch (this.a) {
            case 0:
                vi viVar2 = (vi) this.n;
                ArrayList arrayList = (ArrayList) this.r;
                int i13 = this.b;
                boolean z10 = this.h;
                long j12 = this.c;
                int i14 = this.e;
                int i15 = this.f;
                long j13 = this.d;
                if (i13 == 0) {
                    try {
                        if (!arrayList.isEmpty()) {
                            if (z10) {
                            }
                        }
                        viVar2.getMessagesStorage().F(j12, j13, i14, i15);
                        j10 = j12;
                        j11 = j13;
                        i15 = i15;
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        viVar2.getMessagesStorage().b.beginTransaction();
                        SQLitePreparedStatement executeFast = j11 == 0 ? viVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : viVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                        size = arrayList.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TLRPC.Message message = (TLRPC.Message) obj;
                            if (vi.r(message)) {
                                executeFast.requery();
                                kj.q5(message);
                                viVar = viVar2;
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                message.serializeToStream(nativeByteBuffer);
                                i12 = i13;
                                executeFast.bindInteger(1, message.id);
                                executeFast.bindLong(2, j10);
                                int i16 = 3;
                                if (j11 != 0) {
                                    executeFast.bindLong(3, j11);
                                    i16 = 4;
                                }
                                executeFast.bindInteger(i16, message.date);
                                executeFast.bindInteger(i16 + 1, i15);
                                executeFast.bindByteBuffer(i16 + 2, nativeByteBuffer);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                            } else {
                                viVar = viVar2;
                                i12 = i13;
                            }
                            viVar2 = viVar;
                            i13 = i12;
                        }
                        vi viVar3 = viVar2;
                        i11 = i13;
                        executeFast.dispose();
                        if (z10 || i14 != 0 || i11 != 0) {
                            int i17 = (z10 || i11 != 0) ? ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id : 1;
                            if (i11 == 0) {
                                viVar3.getMessagesStorage().t(i17, j10, j11, ((TLRPC.Message) arrayList.get(0)).id, i15);
                            } else {
                                long j14 = j11;
                                int i18 = i17;
                                if (i14 != 0) {
                                    viVar3.getMessagesStorage().t(i18, j10, j14, i14, i15);
                                } else {
                                    viVar3.getMessagesStorage().t(i18, j10, j14, ConnectionsManager.DEFAULT_DATACENTER_ID, i15);
                                }
                            }
                        }
                        viVar3.getMessagesStorage().b.commitTransaction();
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                j10 = j12;
                j11 = j13;
                viVar2.getMessagesStorage().b.beginTransaction();
                if (j11 == 0) {
                }
                size = arrayList.size();
                i10 = 0;
                while (i10 < size) {
                }
                vi viVar32 = viVar2;
                i11 = i13;
                executeFast.dispose();
                if (z10) {
                }
                if (z10) {
                }
                if (i11 == 0) {
                }
                viVar32.getMessagesStorage().b.commitTransaction();
            default:
                ((is) this.n).E0(this.b, this.e, this.f, this.c, this.d, (TLRPC.messages_Messages) this.r, this.h);
                break;
        }
    }

    public /* synthetic */ tg(is isVar, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.n = isVar;
        this.b = i10;
        this.r = messages_messages;
        this.c = j10;
        this.d = j11;
        this.e = i11;
        this.f = i12;
        this.h = z10;
    }
}
