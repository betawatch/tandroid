package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ c1 n;
    public final /* synthetic */ Object r;

    public /* synthetic */ lg(li liVar, int i3, ArrayList arrayList, boolean z10, long j10, int i10, int i11, long j11) {
        this.n = liVar;
        this.b = i3;
        this.r = arrayList;
        this.h = z10;
        this.c = j10;
        this.e = i10;
        this.f = i11;
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
        int i3;
        int i10;
        li liVar;
        int i11;
        switch (this.a) {
            case 0:
                li liVar2 = (li) this.n;
                ArrayList arrayList = (ArrayList) this.r;
                int i12 = this.b;
                boolean z10 = this.h;
                long j12 = this.c;
                int i13 = this.e;
                int i14 = this.f;
                long j13 = this.d;
                if (i12 == 0) {
                    try {
                        if (!arrayList.isEmpty()) {
                            if (z10) {
                            }
                        }
                        liVar2.getMessagesStorage().F(j12, j13, i13, i14);
                        j10 = j12;
                        j11 = j13;
                        i14 = i14;
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        liVar2.getMessagesStorage().b.beginTransaction();
                        SQLitePreparedStatement executeFast = j11 == 0 ? liVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : liVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                        size = arrayList.size();
                        i3 = 0;
                        while (i3 < size) {
                            Object obj = arrayList.get(i3);
                            i3++;
                            TLRPC.Message message = (TLRPC.Message) obj;
                            if (li.r(message)) {
                                executeFast.requery();
                                zi.r5(message);
                                liVar = liVar2;
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                message.serializeToStream(nativeByteBuffer);
                                i11 = i12;
                                executeFast.bindInteger(1, message.id);
                                executeFast.bindLong(2, j10);
                                int i15 = 3;
                                if (j11 != 0) {
                                    executeFast.bindLong(3, j11);
                                    i15 = 4;
                                }
                                executeFast.bindInteger(i15, message.date);
                                executeFast.bindInteger(i15 + 1, i14);
                                executeFast.bindByteBuffer(i15 + 2, nativeByteBuffer);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                            } else {
                                liVar = liVar2;
                                i11 = i12;
                            }
                            liVar2 = liVar;
                            i12 = i11;
                        }
                        li liVar3 = liVar2;
                        i10 = i12;
                        executeFast.dispose();
                        if (z10 || i13 != 0 || i10 != 0) {
                            int i16 = (z10 || i10 != 0) ? ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id : 1;
                            if (i10 == 0) {
                                liVar3.getMessagesStorage().t(i16, j10, j11, ((TLRPC.Message) arrayList.get(0)).id, i14);
                            } else {
                                long j14 = j11;
                                int i17 = i16;
                                if (i13 != 0) {
                                    liVar3.getMessagesStorage().t(i17, j10, j14, i13, i14);
                                } else {
                                    liVar3.getMessagesStorage().t(i17, j10, j14, ConnectionsManager.DEFAULT_DATACENTER_ID, i14);
                                }
                            }
                        }
                        liVar3.getMessagesStorage().b.commitTransaction();
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                j10 = j12;
                j11 = j13;
                liVar2.getMessagesStorage().b.beginTransaction();
                if (j11 == 0) {
                }
                size = arrayList.size();
                i3 = 0;
                while (i3 < size) {
                }
                li liVar32 = liVar2;
                i10 = i12;
                executeFast.dispose();
                if (z10) {
                }
                if (z10) {
                }
                if (i10 == 0) {
                }
                liVar32.getMessagesStorage().b.commitTransaction();
            default:
                ((qr) this.n).E0(this.b, this.e, this.f, this.c, this.d, (TLRPC.messages_Messages) this.r, this.h);
                break;
        }
    }

    public /* synthetic */ lg(qr qrVar, int i3, TLRPC.messages_Messages messages_messages, long j10, long j11, int i10, int i11, boolean z10) {
        this.n = qrVar;
        this.b = i3;
        this.r = messages_messages;
        this.c = j10;
        this.d = j11;
        this.e = i10;
        this.f = i11;
        this.h = z10;
    }
}
