// default package

import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class fq6 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ pg0 n;
    public final /* synthetic */ Object r;

    public /* synthetic */ fq6(hs6 hs6Var, int i, ArrayList arrayList, boolean z, long j, int i2, int i3, long j2) {
        this.n = hs6Var;
        this.b = i;
        this.r = arrayList;
        this.h = z;
        this.c = j;
        this.e = i2;
        this.f = i3;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        byte b = this.a;
        Object obj = this.r;
        pg0 pg0Var = this.n;
        switch (b) {
            case 0:
                hs6 hs6Var = (hs6) pg0Var;
                ArrayList arrayList = (ArrayList) obj;
                int i3 = this.b;
                boolean z = this.h;
                long j = this.c;
                int i4 = this.e;
                int i5 = this.f;
                long j2 = this.d;
                if (i3 == 0) {
                    try {
                        if (arrayList.isEmpty() || z) {
                            hs6Var.getMessagesStorage().E(i4, i5, j, j2);
                            j2 = j2;
                            i5 = i5;
                            i4 = i4;
                            j = j;
                            if (arrayList.isEmpty()) {
                            }
                        }
                    } catch (Exception e) {
                        fc4.g(e, true);
                        return;
                    }
                }
                hs6Var.getMessagesStorage().b.beginTransaction();
                int i6 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
                SQLitePreparedStatement executeFast = i6 != 0 ? hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_topics VALUES(?, ?, ?, ?, ?, ?)") : hs6Var.getMessagesStorage().b.executeFast("REPLACE INTO media_v4 VALUES(?, ?, ?, ?, ?)");
                int size = arrayList.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj2 = arrayList.get(i7);
                    i7++;
                    TLRPC.Message message = (TLRPC.Message) obj2;
                    if (hs6.t(message)) {
                        executeFast.requery();
                        k47.p5(message);
                        i = i6;
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(message.getObjectSize());
                        message.serializeToStream(nativeByteBuffer);
                        i2 = i3;
                        executeFast.bindInteger(1, message.id);
                        executeFast.bindLong(2, j);
                        int i8 = 3;
                        if (i != 0) {
                            executeFast.bindLong(3, j2);
                            i8 = 4;
                        }
                        executeFast.bindInteger(i8, message.date);
                        executeFast.bindInteger(i8 + 1, i5);
                        executeFast.bindByteBuffer(i8 + 2, nativeByteBuffer);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                    } else {
                        i = i6;
                        i2 = i3;
                    }
                    i6 = i;
                    i3 = i2;
                }
                int i9 = i3;
                executeFast.dispose();
                if (!z || i4 != 0 || i9 != 0) {
                    int i10 = (z && i9 == 0) ? 1 : ((TLRPC.Message) arrayList.get(arrayList.size() - 1)).id;
                    if (i9 != 0) {
                        hs6Var.getMessagesStorage().s(j, i10, ((TLRPC.Message) arrayList.get(0)).id, i5, j2);
                    } else if (i4 != 0) {
                        hs6Var.getMessagesStorage().s(j, i10, i4, i5, j2);
                    } else {
                        hs6Var.getMessagesStorage().s(j, i10, ConnectionsManager.DEFAULT_DATACENTER_ID, i5, j2);
                    }
                }
                hs6Var.getMessagesStorage().b.commitTransaction();
                break;
            default:
                ((cf7) pg0Var).B0(this.b, this.e, this.f, this.c, this.d, (TLRPC.messages_Messages) obj, this.h);
                break;
        }
    }

    public /* synthetic */ fq6(cf7 cf7Var, int i, TLRPC.messages_Messages messages_messages, long j, long j2, int i2, int i3, boolean z) {
        this.n = cf7Var;
        this.b = i;
        this.r = messages_messages;
        this.c = j;
        this.d = j2;
        this.e = i2;
        this.f = i3;
        this.h = z;
    }
}
