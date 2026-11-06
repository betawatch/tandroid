package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final /* synthetic */ class tg implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ c1 n;
    public final /* synthetic */ Object r;

    public /* synthetic */ tg(ui uiVar, int i7, ArrayList arrayList, boolean z9, long j3, int i10, int i11, long j10) {
        this.n = uiVar;
        this.b = i7;
        this.r = arrayList;
        this.h = z9;
        this.c = j3;
        this.e = i10;
        this.f = i11;
        this.d = j10;
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
        long j3;
        long j10;
        int size;
        int i7;
        int i10;
        ui uiVar;
        int i11;
        switch (this.a) {
            case 0:
                ui uiVar2 = (ui) this.n;
                ArrayList arrayList = (ArrayList) this.r;
                int i12 = this.b;
                boolean z9 = this.h;
                long j11 = this.c;
                int i13 = this.e;
                int i14 = this.f;
                long j12 = this.d;
                if (i12 == 0) {
                    try {
                        if (!arrayList.isEmpty()) {
                            if (z9) {
                            }
                        }
                        uiVar2.getMessagesStorage().F(j11, j12, i13, i14);
                        j3 = j11;
                        j10 = j12;
                        i14 = i14;
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        uiVar2.getMessagesStorage().b.beginTransaction();
                        SQLitePreparedStatement executeFast = j10 == 0 ? uiVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : uiVar2.getMessagesStorage().b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                        size = arrayList.size();
                        i7 = 0;
                        while (i7 < size) {
                            Object obj = arrayList.get(i7);
                            i7++;
                            TLRPC.Message message = (TLRPC.Message) obj;
                            if (ui.r(message)) {
                                executeFast.requery();
                                ij.r5(message);
                                uiVar = uiVar2;
                                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                                message.serializeToStream(nativeByteBuffer);
                                i11 = i12;
                                executeFast.bindInteger(1, message.id);
                                executeFast.bindLong(2, j3);
                                int i15 = 3;
                                if (j10 != 0) {
                                    executeFast.bindLong(3, j10);
                                    i15 = 4;
                                }
                                executeFast.bindInteger(i15, message.date);
                                executeFast.bindInteger(i15 + 1, i14);
                                executeFast.bindByteBuffer(i15 + 2, nativeByteBuffer);
                                executeFast.step();
                                nativeByteBuffer.reuse();
                            } else {
                                uiVar = uiVar2;
                                i11 = i12;
                            }
                            uiVar2 = uiVar;
                            i12 = i11;
                        }
                        ui uiVar3 = uiVar2;
                        i10 = i12;
                        executeFast.dispose();
                        if (z9 || i13 != 0 || i10 != 0) {
                            int i16 = (z9 || i10 != 0) ? ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id : 1;
                            if (i10 == 0) {
                                uiVar3.getMessagesStorage().t(i16, j3, j10, ((TLRPC.Message) arrayList.get(0)).id, i14);
                            } else {
                                long j13 = j10;
                                int i17 = i16;
                                if (i13 != 0) {
                                    uiVar3.getMessagesStorage().t(i17, j3, j13, i13, i14);
                                } else {
                                    uiVar3.getMessagesStorage().t(i17, j3, j13, ConnectionsManager.DEFAULT_DATACENTER_ID, i14);
                                }
                            }
                        }
                        uiVar3.getMessagesStorage().b.commitTransaction();
                        break;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return;
                    }
                }
                j3 = j11;
                j10 = j12;
                uiVar2.getMessagesStorage().b.beginTransaction();
                if (j10 == 0) {
                }
                size = arrayList.size();
                i7 = 0;
                while (i7 < size) {
                }
                ui uiVar32 = uiVar2;
                i10 = i12;
                executeFast.dispose();
                if (z9) {
                }
                if (z9) {
                }
                if (i10 == 0) {
                }
                uiVar32.getMessagesStorage().b.commitTransaction();
            default:
                ((yr) this.n).E0(this.b, this.e, this.f, this.c, this.d, (TLRPC.messages_Messages) this.r, this.h);
                break;
        }
    }

    public /* synthetic */ tg(yr yrVar, int i7, TLRPC.messages_Messages messages_messages, long j3, long j10, int i10, int i11, boolean z9) {
        this.n = yrVar;
        this.b = i7;
        this.r = messages_messages;
        this.c = j3;
        this.d = j10;
        this.e = i10;
        this.f = i11;
        this.h = z9;
    }
}
