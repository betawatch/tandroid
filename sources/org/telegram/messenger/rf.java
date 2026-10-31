package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ui b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;

    public /* synthetic */ rf(ui uiVar, boolean z10, int i10, int i11) {
        this.a = i11;
        this.b = uiVar;
        this.c = z10;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        NativeByteBuffer byteBufferValue;
        switch (this.a) {
            case 0:
                ui uiVar = this.b;
                boolean[] zArr = uiVar.w0;
                boolean z10 = this.c;
                zArr[z10 ? 1 : 0] = false;
                uiVar.x0[z10 ? 1 : 0] = true;
                uiVar.q0[z10 ? 1 : 0] = this.d;
                break;
            case 1:
                this.b.q0[this.c ? 1 : 0] = this.d;
                break;
            default:
                ui uiVar2 = this.b;
                boolean z11 = this.c;
                int i11 = this.d;
                if (z11) {
                    i10 = 2;
                } else {
                    i10 = 3;
                    if (i11 != 0) {
                        if (i11 == 1) {
                            i10 = 4;
                        } else if (i11 == 3) {
                            i10 = 6;
                        } else {
                            i10 = 7;
                            if (i11 != 5) {
                                i10 = i11 == 7 ? 8 : 5;
                            }
                        }
                    }
                }
                try {
                    SQLiteCursor queryFinalized = uiVar2.getMessagesStorage().b.queryFinalized("SELECT document FROM web_recent_v3 WHERE type = " + i10 + " ORDER BY date DESC", new Object[0]);
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
                    i0.g3(new uf(uiVar2, z11, arrayList, i11));
                    break;
                } catch (Throwable th2) {
                    uiVar2.getMessagesStorage().o(th2, true);
                }
                break;
        }
    }
}
