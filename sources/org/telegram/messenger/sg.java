package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class sg implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ f1 n;
    public final /* synthetic */ Object r;

    public /* synthetic */ sg(ui uiVar, int i10, ArrayList arrayList, boolean z10, long j10, int i11, int i12, long j11) {
        this.n = uiVar;
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
        ui uiVar;
        int i12;
        switch (this.a) {
            case 0:
                ui uiVar2 = (ui) this.n;
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
                        uiVar2.getMessagesStorage().F(j12, j13, i14, i15);
                        j10 = j12;
                        j11 = j13;
                        i15 = i15;
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        uiVar2.getMessagesStorage().b.beginTransaction();
                        SQLitePreparedStatement executeFast = j11 == 0 ? uiVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : uiVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                        size = arrayList.size();
                        i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TLRPC.Message message = (TLRPC.Message) obj;
                            if (ui.r(message)) {
                                executeFast.requery();
                                jj.q5(message);
                                uiVar = uiVar2;
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
                                uiVar = uiVar2;
                                i12 = i13;
                            }
                            uiVar2 = uiVar;
                            i13 = i12;
                        }
                        ui uiVar3 = uiVar2;
                        i11 = i13;
                        executeFast.dispose();
                        if (z10 || i14 != 0 || i11 != 0) {
                            int i17 = (z10 || i11 != 0) ? ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id : 1;
                            if (i11 == 0) {
                                uiVar3.getMessagesStorage().t(i17, j10, j11, ((TLRPC.Message) arrayList.get(0)).id, i15);
                            } else {
                                long j14 = j11;
                                int i18 = i17;
                                if (i14 != 0) {
                                    uiVar3.getMessagesStorage().t(i18, j10, j14, i14, i15);
                                } else {
                                    uiVar3.getMessagesStorage().t(i18, j10, j14, ConnectionsManager.DEFAULT_DATACENTER_ID, i15);
                                }
                            }
                        }
                        uiVar3.getMessagesStorage().b.commitTransaction();
                        break;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return;
                    }
                }
                j10 = j12;
                j11 = j13;
                uiVar2.getMessagesStorage().b.beginTransaction();
                if (j11 == 0) {
                }
                size = arrayList.size();
                i10 = 0;
                while (i10 < size) {
                }
                ui uiVar32 = uiVar2;
                i11 = i13;
                executeFast.dispose();
                if (z10) {
                }
                if (z10) {
                }
                if (i11 == 0) {
                }
                uiVar32.getMessagesStorage().b.commitTransaction();
            default:
                ((hs) this.n).E0(this.b, this.e, this.f, this.c, this.d, (TLRPC.messages_Messages) this.r, this.h);
                break;
        }
    }

    public /* synthetic */ sg(hs hsVar, int i10, TLRPC.messages_Messages messages_messages, long j10, long j11, int i11, int i12, boolean z10) {
        this.n = hsVar;
        this.b = i10;
        this.r = messages_messages;
        this.c = j10;
        this.d = j11;
        this.e = i11;
        this.f = i12;
        this.h = z10;
    }
}
