package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final /* synthetic */ class sf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ri b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ sf(ri riVar, boolean z10, int i7, int i10) {
        this.a = i10;
        this.b = riVar;
        this.c = z10;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                ri riVar = this.b;
                boolean[] zArr = riVar.x0;
                boolean z10 = this.c;
                zArr[z10 ? 1 : 0] = false;
                riVar.y0[z10 ? 1 : 0] = true;
                riVar.r0[z10 ? 1 : 0] = this.d;
                break;
            case 1:
                this.b.r0[this.c ? 1 : 0] = this.d;
                break;
            default:
                ri riVar2 = this.b;
                boolean z11 = this.c;
                int i10 = this.d;
                if (z11) {
                    i7 = 2;
                } else {
                    i7 = 3;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            i7 = 4;
                        } else if (i10 == 3) {
                            i7 = 6;
                        } else {
                            i7 = 7;
                            if (i10 != 5) {
                                i7 = i10 == 7 ? 8 : 5;
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = riVar2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i7 + " ORDER BY date DESC", new Object[0]);
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
                    g0.g3(new vf(riVar2, z11, arrayList, i10));
                    break;
                } catch (Throwable th2) {
                    riVar2.getMessagesStorage().o(th2, true);
                }
                break;
        }
    }
}
