package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class lf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ lf(li liVar, boolean z10, int i3, int i10) {
        this.a = i10;
        this.b = liVar;
        this.c = z10;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                li liVar = this.b;
                boolean[] zArr = liVar.x0;
                boolean z10 = this.c;
                zArr[z10 ? 1 : 0] = false;
                liVar.y0[z10 ? 1 : 0] = true;
                liVar.r0[z10 ? 1 : 0] = this.d;
                break;
            case 1:
                this.b.r0[this.c ? 1 : 0] = this.d;
                break;
            default:
                li liVar2 = this.b;
                boolean z11 = this.c;
                int i10 = this.d;
                if (z11) {
                    i3 = 2;
                } else {
                    i3 = 3;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            i3 = 4;
                        } else if (i10 == 3) {
                            i3 = 6;
                        } else {
                            i3 = 7;
                            if (i10 != 5) {
                                i3 = i10 == 7 ? 8 : 5;
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = liVar2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i3 + " ORDER BY date DESC", new Object[0]);
                    ArrayList arrayList = new ArrayList();
                    while (queryFinalized.next()) {
                        if (!queryFinalized.isNull(0) && (byteBufferValue = queryFinalized.byteBufferValue(0)) != null) {
                            TLRPC.Document TLdeserialize = TLRPC.Document.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                            if (TLdeserialize != null) {
                                arrayList.add(TLdeserialize);
                            }
                            byteBufferValue.reuse();
                        }
                    }
                    queryFinalized.dispose();
                    g0.h3(new of(liVar2, z11, arrayList, i10));
                    break;
                } catch (Throwable th2) {
                    liVar2.getMessagesStorage().o(th2, true);
                }
                break;
        }
    }
}
